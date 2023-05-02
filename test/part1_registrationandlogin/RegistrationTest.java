/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package part1_registrationandlogin;

import org.junit.Test;
import junit.framework.Assert;
import static org.junit.jupiter.api.Assertions.assertTrue; 
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author lab_services_student
 */
public class RegistrationTest {
    Registration registration = new Registration() ;

    @Test
    public void testCheckUserName() {
       boolean actual = registration.CheckUserName("Kyle!!!!!!");
       Assert.assertFalse("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.", actual);
       Assert.assertFalse("False", actual);   
    }
    
    @Test
    public void testCheckPasswordComplexity() {
       boolean actual2 = registration.CheckPasswordComplexity("Ch&&sec@ke99!");
       Assert.assertTrue("Password successfully captured", actual2);
       Assert.assertTrue("True", actual2);
       
       boolean actual3 = registration.CheckPasswordComplexity( "Password");
       Assert.assertFalse("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.", actual3);
       Assert.assertFalse("False", actual3); 
    }
    @Test
    public void testRegisterUser() {
        String expected = "Username and Password successfully captured";
        String actual = registration.registerUser("kyl_1", "Ch&&sec@ke99!");
        Assert.assertEquals("True", expected, actual);
    }
    
}
