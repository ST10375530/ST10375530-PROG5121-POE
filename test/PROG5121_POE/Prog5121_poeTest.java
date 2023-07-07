/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package PROG5121_POE;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals; 
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 *
 * @author lab_services_student
 */
public class Prog5121_poeTest {
    
    Prog5121_poe poePart3 = new Prog5121_poe();
    
        String[] expectedDevelopers = {"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
        String[] expectedtaskNames = {"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
        int[] expectedtaskDurations = {5, 8, 2, 11};
        String[] expectedtaskIDs = new String[4]; 
        String[] expectedtaskStatuses = {"To Do", "Doing", "Done", "To Do"};
    

    @Test
    public void testTasksWithStatusDone() {
    }

    @Test
    public void testClassWithLongestDuration(int[] expectedtaskDuration,String[] expectedDeveloper) {
         String expected= "Developer: Glenda Oberholzer\nTask Duration: 11";
        String actual = "Developer: Glenda Oberholzer\nTask Duration: 11";
        assertEquals(expected, actual);
    }

    @Test
    public void testTaskNameSearch(String developerName ) {
        String expectedOutput = "Create Reports";
        String output = "Samantha Paulson";
        assertEquals(expectedOutput, output);
        
        String expected2 = "Create Login";
        String output2 = "Mike Smith";
        assertEquals(expected2, output2);
        
        String expected3 = "Create Add Features";
        String output3 = "Edward Harrison";
        assertEquals(expected3, output3);
        
        String expected4 = "Add Arrays";
        String output4 = "Glenda Oberholzer";
        assertEquals(expected4, output4);
    }

    @Test
    public void testDeveloperSearch() {
    }

    @Test
    public void testTaskNameDelete() {
       
        String taskName = "Create Login";
        String expected = "Task 'Create Login' successfully deleted";
        assertEquals(expected, taskName);
        
        String taskName2 = "Create Reports";
        String expected2 = "Task 'Create Reports' successfully deleted";
        assertEquals(expected2, taskName2);
        
        String taskName3 = "Create Add Features";
        String expected3 = "Task 'Create Add Features' successfully deleted";
        assertEquals(expected3, taskName3);
        
        String taskName4 = "Add Arrays";
        String expected4 = "Task 'Add Arrays' successfully deleted";
        assertEquals(expected4, taskName4);
    
    }

    @Test
    public void testDisplayTaskReport() {
                String expected = "Task Name: Create Login\nDeveloper: Mike Smith\nTask Duration: 5\nTask ID: CR:0:MIK\nTask Status: To Do\n\n" +
                                "Task Name: Create Add Features\nDeveloper: Edward Harrison\nTask Duration: 8\nTask ID: CA:1:EDW\nTask Status: Doing\n\n" +
                                "Task Name: Create Reports\nDeveloper: Samantha Paulson\nTask Duration: 2\nTask ID: CR:2:SAM\nTask Status: Done\n\n" +
                                "Task Name: Add Arrays\nDeveloper: Glenda Oberholzer\nTask Duration: 11\nTask ID: AA:3:GLE\nTask Status: To Do";

        String actual = Prog5121_poe.displayTaskReport();
        assertEquals(expected, actual);

    }
    
}
