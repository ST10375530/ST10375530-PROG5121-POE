/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part1_registrationandlogin;

/**
 *
 * @author lab_services_student
 */
//A back-end class for Logging in.
public class LogIn {
    //Declare the variables
    private String username, password;
    private String firstName, lastName;
    
    //A method that shows the strings that were already declared.
    public LogIn() {
        username = "kyl_1";
        password = "Ch&&sec@ke99!";
        firstName = "Kyle";
        lastName = "Modise";
    }
    
     public boolean loginUser(String LogInUsername, String LogInPassword) {
       boolean LoginDetails = username.equals(LogInUsername) && password.equals(LogInPassword);
       return LoginDetails;
     }
    //This method verifies that the login details entered matches the login details stored when the user registers.
    public String LoginUser(String LogInUsername) {
       boolean LoginDetails = username.equals(LogInUsername);
       if (LoginDetails) {
           return "Username successfully captured";  
       } else {
           return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
       }
       
    }
    
     public String LoginUser2(String LogInPassword) {
       boolean LoginDetails =password.equals(LogInPassword);
       if (LoginDetails) {
           return "Password successfully captured.";  
       } else {
           return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
       }
       
    }
    //This method returns the messaging for a successful message and a failed message.
    public String returnLoginStatus(String LogInUsername, String LogInPassword) {
        if (loginUser("kyl_1", "Ch&&sec@ke99!")) {
            return "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
        
    }
}
//Reference List:
/* Farrell, J. 2018. Java Programming. Ninth Edition. Boston: Cengage Learning */
