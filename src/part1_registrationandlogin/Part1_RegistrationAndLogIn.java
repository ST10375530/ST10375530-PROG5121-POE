/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part1_registrationandlogin;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Part1_RegistrationAndLogIn {
    
    public static void main(String[] args) {
        //Instantiate the Scanner object
        Scanner input = new Scanner(System.in);
        
        //Call the Login and Registration back-end classes into the front-end
        LogIn loginDetails = new LogIn();
        Registration regDetails = new Registration();
        
        //Declare the variables
        String username, password, firstName, lastName;
        int RegOrLogin;
       
        //Ask the user whther they would like to Login or Register and let them prompt the option
        System.out.println("Would you like to Login or Register? \nEnter 1 to LogIn or 2 to Register");
        RegOrLogin = input.nextInt();
       
        //A switch to display the output from either choosing 1 for Login or 2 for Register
        switch (RegOrLogin) {
            
            case 1: //When the user enters 1 the following will happen: 
                //Prompt the user input for the users Username
                System.out.println("Please enter your username");
                username =  input.next();
                //Prompt the user input for the users Password
                System.out.println("Please enter your password");
                password = input.next();
                //Call the information from the back-end method 'returnLogInStatus'
                String loginStatus = loginDetails.returnLoginStatus(username, password);
                //Display the back-end information
                System.out.println(loginStatus);
                break;
                
            case 2: //When the users enters 2 the following will happen:
                
                //Prompt the user input for the users First Name 
                System.out.println("Please enter your First Name");
                firstName = input.next();
                //Prompt the user input for the users Last Name
                System.out.println("Please enter your Last Name");
                lastName = input .next();
                //Prompt the user input for the users Username
                System.out.println("Please enter your username");
                username =  input.next();
                //Prompt the user input for the users Password
                System.out.println("Please enter your password");
                password = input.next();
                //Call the information from the back-end method 'registerUser'
                String RegUser = regDetails.registerUser(username, password);
                //Display the back-end information
                System.out.println(RegUser);
                break;
                
            default:
                //When neither 1 or 2 is prompted an error message will display
                System.out.println("Please enter either the number 1 or 2"); 
                break;
        }    
    }  
}
//Reference List:
/* Farrell, J. 2018. Java Programming. Ninth Edition. Boston: Cengage Learning */
