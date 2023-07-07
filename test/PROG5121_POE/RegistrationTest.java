/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package PROG5121_POE;

import PROG5121_POE.Registration;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 *
 * @author lab_services_student
 */
public class RegistrationTest {
    Registration registration = new Registration() ;

    @Test
    public void testCheckUserName() {
       boolean actual = registration.CheckUserName("Kyle!!!!!!");
       assertFalse(actual,"Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
       assertFalse(actual,"False");   
    }
    
    @Test
    public void testCheckPasswordComplexity() {
       boolean actual3 = registration.CheckPasswordComplexity( "Password");
       assertFalse(actual3, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
       assertFalse(actual3,"False"); 
    }
    @Test
    public void testRegisterUser() {
        String expected = "Username and Password successfully captured";
        String actual = registration.registerUser("kyl_1", "Ch&&sec@ke99!");
        assertEquals(expected, actual, "True");
    }
    
}
