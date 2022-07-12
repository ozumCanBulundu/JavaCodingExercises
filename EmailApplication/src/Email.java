import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String company;
    private String password;
    private String email;
    private int mailboxCapacity;

    public Email(String firstName, String lastName){

        this.firstName= firstName.toLowerCase().replaceAll(" ","");
        this.lastName = lastName.toLowerCase().replaceAll(" ","");
        System.out.println(this.firstName + " " +this.lastName);


    }

    public void setDepartment() {
        System.out.println("Enter the department\n1 for Sales\n2 for Accounting\n3 for Development\n0 for none");
        Scanner keyboard = new Scanner(System.in);
        switch (keyboard.nextInt()){
            case 1:
                this.department = "Sales";
                break;

            case 2:
                this.department = "Accounting";
                break;

            case 3:
                this.department = "Development";
                break;

            case 0:
                this.department = "";
                break;
        }
        System.out.println(department);
    }

    public String randomPassword(int length){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] password = new char[length];
        for (int i = 0;i < length; i++){
             int random = (int)(Math.random() * alphabet.length);
             password[i] = alphabet[random];
         }
        return password.toString();

    }
}
