/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package PRLD5121_POE;


import PRLD5121_POE.Tasks;
import static org.junit.jupiter.api.Assertions.assertEquals; 
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author lab_services_student
 */
public class TasksTest {
    Tasks tasks = new Tasks();
    
    @Test
    public void testCheckTaskDescription() {
        boolean actual = (tasks.checkTaskDescription("Create Login to authenticate users"));
        if (!actual) {
            assertFalse(actual, "Please enter a task description of less than 50 characters");
        } else {
            assertTrue(actual, "Task Successfully captured");
        }
        
        boolean actual2 = tasks.checkTaskDescription("Create Add Task Feature to add task users");
        if (!actual2) {
            assertFalse(actual2, "Please enter a task description of less than 50 characters");
        } else {
            assertTrue(actual2, "Task Successfully captured");
        }
    }

    @Test
    public void testCreateTaskID() {
        String expected = "LO:1:BYN";
        String actual = tasks.createTaskID(expected);
        assertEquals(expected, actual);
        
        String expected2 = "AD:1:IKE";
        String actual2 =  tasks.createTaskID(expected);
        assertEquals(expected, actual);
    }

    @Test
    public void testReturnTotalHours() {
        int expected = 8;
        int actual = tasks.returnTotalHours(8);
        assertEquals(expected, actual, "Total hours incorrectly accumulated");
        
        int expected2 = 10;
        int actual2 = tasks.returnTotalHours(10);
        assertEquals(expected2, actual2, "Total hours incorrectly accumulated");
        }
    }
    

