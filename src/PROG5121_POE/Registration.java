/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRLD5121_POE;

/**
 *
 * @author lab_services_student
 */
//A back-end class for the registration.
public class Registration {
   //Declare the variables
   private String username;
   private String password;
   private String firstName;
   private String lastName;
   
   public Registration() {
       username = "";
       password = "";    
   }
   //A method that ensures that the username meets its requirements. 
   public boolean CheckUserName(String RegUsername) {
       //This format makes sure that the Username has an underscore and is 5 letters long.
       return (RegUsername.contains("_") && RegUsername.length() <= 5);
   }
   
   //A method that ensures that  the Password meets its requirements and returns the password
   public boolean CheckPasswordComplexity(String RegPassword) {
         //This format makes sure that the Password ia atleast 8 letters long, has a capital letter, a number and a special character.
         return RegPassword.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}$"); //(sandhya6gczb, 2021)
   }
   
   //A method that will check if the Username and password is correctly formatted and if not display the error message.
   public String registerUser(String RegUsername, String RegPassword) {
        if (!CheckUserName(RegUsername)) { //If the username is correctly formatted the following message will be returned.
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        } else if (!CheckPasswordComplexity(RegPassword)) {//If the password is correctly formatted the following will be returned.
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        } else { //If both is correctly formatted the following message will be returned.
            return "Username and Password successfully captured";
        }
    }
}
//Reference List: 
/* Farrell, J. 2017. Java Programming. Ninth Edition. Boston: Cengage Learning.  
   sandhya6gczb.2021. How to use pattern to validate Password, Java. [Online]. Avaiable at: https://www.studytonight.com/html-faq/how-to-use-pattern-to-validate-password [Accessed 23 April 2023]
*/
