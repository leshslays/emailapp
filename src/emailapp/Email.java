package emailapp;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private int defaultPasswordLength =10;
    private String companySuffix = "riv.com";

    //Const to acquire first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        //Call method to ask for department
        this.department = setDepartmnent();

        //call method that returns generated pass
        this.password = randomPass(defaultPasswordLength);
        System.out.println("Your password is: "+ this.password);

        //combine elements to generate email
        email = firstName.toLowerCase() + "." +lastName.toLowerCase() + "@" + department +"."+ companySuffix;
    }
    //Ask for department
    private String setDepartmnent() {
        System.out.println("New Employee: " + firstName + " " + "\nDEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter department code: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if (departmentChoice == 1) {return "sales";}
        else if (departmentChoice == 2) {return "development";}
        else if (departmentChoice == 3) {return "accounting";}
        else {return "";}
    }


    //Pass generator
    private String randomPass(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i= 0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String (password);
    }

    //Mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;

    }
    //Set alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }
    //Change pass
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {return mailboxCapacity;}
    public String getAlternateEmail() {return alternateEmail;}
    public String getPassword() {return password;}

    public String showInfo() {
        return "DISPLAY NAME: "+ firstName + " " + lastName  +
                "\nCOMPANY EMAIL: "+ email + "\nMAILBOX CAPACITY: " +
                mailboxCapacity + "mb";
    }

}
