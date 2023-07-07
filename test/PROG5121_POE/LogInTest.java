/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package PROG5121_POE;
 
import PROG5121_POE.LogIn;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.Test;


/**
 *
 * @author lab_services_student
 */
public class LogInTest {
    LogIn login = new LogIn();
    public LogInTest() {}

    
    @Test 
    public void testloginUser() {
       boolean actual = login.loginUser("Kyle!!!!!!", "Ch&&sec@ke99!");
       assertFalse(actual,"Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
       assertFalse(actual,"False");
       
       boolean actual3 = login.loginUser("kyl_1", "Password");
       assertFalse(actual3, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
       assertFalse(actual3,"False");
    }
    @Test
    public void testReturnLoginStatus() {
       String expected = "Welcome Kyle Modise, it is great to see you again.";
       String actual = login.returnLoginStatus("kyl_1", "Ch&&sec@ke99!");
       assertEquals(expected,actual, "True"); 
  
    
    }
   
    
}
