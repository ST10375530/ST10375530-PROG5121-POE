/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package part1_registrationandlogin;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

/**
 *
 * @author lab_services_student
 */
public class LogInTest {
    LogIn login = new LogIn();
    public LogInTest() {}

    

    @Test
    public void testReturnLoginStatus() {
       String expected = "Welcome Kyle Modise, it is great to see you again.";
       String actual = login.returnLoginStatus("kyl_1", "Ch&&sec@ke99!");
       assertEquals(expected, actual); 
    }
    
    @Test
    public void testUsernameIncorrectlyFormatted() {
       String expected = "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
       String actual = login.LoginUser("kyle!!!!!!!");
        assertEquals(expected, actual);   
    }
    
    @Test
    public void testPasswordCorrectlyFormatted() {
        String expected = "Password successfully captured.";
        String actual = login.LoginUser2("Ch&&sec@ke99!");
        assertEquals(expected, actual);
    }
    
    public void testPasswordIncorrectlyFormatted() {
        String expected = "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        String actual = login.LoginUser2("Password");
        assertEquals(expected, actual);
    }
    
    
}
