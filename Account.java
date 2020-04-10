import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

// All console output can be deleted or replaced with GUI later on.

public class Account {
    private String username;
    private String password;
    private String full_name;
    private String email;
    private int total_cash = 50;
    private int total_winnings = 0;

    private String sourceName = "user_info.txt";


    // The constructor used to create a new account.
    public Account(String username, String password, String full_name, String email)
    {
        File tempFile = new File(sourceName);

        //Creates the user_info.txt file for storing account details if it doesn't already exist.
        try
        {
            if (tempFile.createNewFile())
                System.out.println("User info file created."); //to be deleted
            else
                System.out.println("User info file already exists."); //to be deleted
        }
        catch(IOException e)
        {
            System.out.println("Error checking for file creation.");
        }

        this.username = username;
        this.password = password;
        this.full_name = full_name;
        this.email = email;

        /* Lines 43-56 store the new account information into a text file.
           Only total cash and total winnings can be modified after account creation.
        */
        try
        {
            FileWriter filewriter = new FileWriter(sourceName);

            filewriter.write(username + ", " + password + ", " + full_name + ", " + email
                    + ", " + total_cash + ", " + total_winnings + "\n");

            filewriter.close();
        }
        catch(IOException e)
        {
            System.out.println("Error storing account information into text file.");
        }
    }


    public Account()
    {
    }

                                        /*--------------- Anchors ----------------*/


    // Anchor for the GUI to display Profile information.
    public String toString()
    {
        return("Username: " + username + "\nName: " + full_name +
                "\nTotal cash: " + total_cash + "\nTotal winnings: " + total_winnings);
    }


    // Anchor to display username to other players at the table
    public String getUsername() {
        return username;
    }


    // Anchor for checking if a player has sufficient funds
    public int getTotal_cash() {
        return total_cash;
    }


    // Anchor for modifying a player's total cash.
    public void setTotal_cash(int total_cash_change) {  //this can be increased/decreased depending on if the
        this.total_cash += total_cash_change;           //total_cash_change is positive or negative

        if (this.total_cash < 0)    //ensures a player's total_cash can't go below 0
            this.total_cash = 0;
    }


    // Anchor for updating a player's total winnings.
    public void setTotal_winnings(int total_winnings_change) {  //this can only be increased
        this.total_winnings += total_winnings;
    }


    /* Anchor for verifying if a user logged in to their account.

    The method type can be changed, my thought process is that depending on the number returned,
    the GUI can display a message detailing whether sign in was successful or not.
    A return value of 0 would mean the user signed in successfully.
    A return value of 1 would mean no account information exists on this computer.
    A return value of 2 would mean the username doesn't exist.
    A return value of 3 would mean the password was incorrect.
    A return value of 4 would would be an exception error.
     */
    public int accountValidation(String tempUsername, String tempPassword)
    {
        String nLine;
        int i = 0;    // i is used incase there are multiple accounts on one computer
                      // increasing i by 6 means we're checking the next account on the computer

        //  Currently multiple accounts on one computer is Not Supported but this can be added later on.

        File tempFile = new File(sourceName);
        boolean t = tempFile.exists();

        if(!t)  // if file doesn't exist yet
        {
            return 1;
        }

        try (Scanner txtData = new Scanner(Paths.get(sourceName)))
        {
            try
            {
                while (txtData.hasNextLine())
                {
                    nLine = txtData.nextLine();
                    String[] tempArray = nLine.split(", ");

                    if(tempArray[0+i].equals(tempUsername))
                    {
                        if(tempArray[1+i].equals(tempPassword))
                            return 0;   // username and password are correct, login accepted
                        else
                            return 3;
                    }
                    else
                        i+=6;
                }
                return 2;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Error in while loop.");
                return 4;
            }
        }
        catch(IOException e)
        {
            System.out.println("Error reading in user data into temp array.");
            return 4;
        }
    }


    /*
    Add a method to open a credit line?
     */
}
