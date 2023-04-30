/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package part1_registrationandlogin;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class RegistrationTest {
    Registration registration = new Registration() ;

    @Test
    public void testRegisterUser() {
        String expected = "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
       String actual = registration.registerUser("kyle!!!!!!!", "Ch&&sec@ke99!");
        assertEquals(expected, actual); 
        
        String expected2 = "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        String actual2 = registration.registerUser("kyl_1", "Password");
        assertEquals(expected2, actual2);
        
        String expected3 = "Username and Password successfully captured";
        String actual3 = registration.registerUser("kyl_1", "Ch&&sec@ke99!");
        assertEquals(expected3, actual3);
    }
    
}
