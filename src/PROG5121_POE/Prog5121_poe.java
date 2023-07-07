/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PROG5121_POE;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author lab_services_student
 */
public class Prog5121_poe {
 
        
    public static void main(String[] args) {
        //Instantiate the Scanner object
        Scanner input = new Scanner(System.in);
        String[] developers = {"Mike Smith", "Edward Harrison","Samantha Paulson", "Glenda Oberholzer"};
        String[] taskNames = {"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
        int[] taskDurations = {5, 8, 2, 11};
        String[] taskIDs = new String[4]; 
        String[] taskStatuses = {"To Do", "Doing", "Done", "To Do"};
        String taskNameSearch = null, developerSearch = null, taskNameDelete = null;
        //Call the Login Registration and Tasks back-end classes into the front-end
        LogIn loginDetails = new LogIn(); //(Farrell, 2017 & user8994147, 2017)
        Registration regDetails = new Registration(); //(Farrell, 2017 & user8994147, 2017)
        Tasks tasksDetails = new Tasks(); //(Farrell, 2017 & user8994147, 2017)
        
        //Declare the variables
        String username, password, firstName, lastName;
        String taskName="", taskDescription="", developerFirstName="",developerLastName="", taskStatus="", taskID="" ;
        int taskNumber = 0, taskDuration = 0, numTasks;
        int RegOrLogin;
        int choice = 0, taskCount = 0, totalHours = 0;
        int taskInput = 0;
       
        //Ask the user whther they would like to Login or Register and let them prompt the option
        //System.out.println("Would you like to Login or Register? \nEnter 1 to LogIn or 2 to Register");
        RegOrLogin = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like to Login or Register? \nEnter 1 to LogIn or 2 to Register"));
       
        //A switch to display the output from either choosing 1 for Login or 2 for Register
        switch (RegOrLogin) {
            
            case 1: //When the user enters 1 the following will happen: 
                //Prompt the user input for the users Username
                username = JOptionPane.showInputDialog("Please enter your username");
                //Prompt the user input for the users Password
                password = JOptionPane.showInputDialog("Please enter your password");
                //Call the information from the back-end method 'returnLogInStatus'
                String loginStatus = loginDetails.returnLoginStatus(username, password); //(user8994147, 2017)
                //Display the back-end information
                JOptionPane.showMessageDialog(null, loginStatus);
                //Welcome message for when successfully logged in
             if (loginDetails.loginUser(username, password)) {
                JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
                while (taskInput < 4) {//While loop to enter what the user would like to do
                   taskInput = Integer.parseInt(JOptionPane.showInputDialog("Choose an option:\n" + "1) Add tasks\n" + "2) Show report\n" + "3) Quit"));
                    
                   if (taskInput == 1){//If statement for each option they have chosen
                       numTasks = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you wish to enter?"));
                       for ( taskNumber = 0; taskNumber < numTasks; taskNumber++) {//For loop to get and display all the users details
                            taskName = JOptionPane.showInputDialog("Please enter the task name:");
                            taskDescription = JOptionPane.showInputDialog(null, "Please enter the task description:");
                            JOptionPane.showMessageDialog(null, tasksDetails.DisplayDescription(taskDescription));
                            
                            developerFirstName = JOptionPane.showInputDialog(null, "Please enter the Developer's FirstName:");
                            developerLastName = JOptionPane.showInputDialog(null, "Please enter the Developer's LastName:");
                            taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Please enter the task duration in hours:"));
                            taskStatus = JOptionPane.showInputDialog(null, "Please enter Task Status: (To Do/ Done/ Doing):");
                            taskID = taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developerFirstName.substring(developerFirstName.length() - 3).toUpperCase();    
                            JOptionPane.showMessageDialog(null, tasksDetails.createTaskID(taskID)); //(user8994147, 2017)
                       
                            
                       }
                       JOptionPane.showMessageDialog(null, tasksDetails.printTaskDetails(taskStatus, developerFirstName, developerLastName, taskNumber, taskName, taskDescription, taskID, taskDuration));
                   }else if (taskInput == 2) {
                        TasksWithStatusDone(developers, taskNames, taskDurations, taskStatuses);   
                        ClassWithLongestDuration(taskDurations, developers);
                        TaskNameSearch(taskNameSearch, taskNames,taskDurations, taskStatuses); 
                        DeveloperSearch(developerSearch, developers,taskStatuses);
                        TaskNameDelete(taskNameDelete, taskNames);
                        displayTaskReport(taskNames, developers, taskDurations, taskID, taskStatuses);
                    } else if (taskInput == 3) {
                        break;
                    }
                }
                
             } 
             
             break;
                
            case 2: //When the users enters 2 the following will happen:
                
                //Prompt the user input for the users First Name
                firstName = JOptionPane.showInputDialog("Please enter your First Name:");
                //Prompt the user input for the users Last Name
                lastName = JOptionPane.showInputDialog("Please enter your Last Name");
                //Prompt the user input for the users Username
                username =  JOptionPane.showInputDialog("Please enter your username");
                //Prompt the user input for the users Password
                password = JOptionPane.showInputDialog("Please enter your password");
                //Call the information from the back-end method 'registerUser'
                String RegUser = regDetails.registerUser(username, password); //(user8994147, 2017)
                //Display the back-end information
                JOptionPane.showMessageDialog(null, RegUser);
                
             if (regDetails.CheckUserName(username) && regDetails.CheckPasswordComplexity(password)){
                //Welcome message for when successfully registered
                JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
                //While loop to enter what the user would like to do
                while (taskInput < 4) { //(Farrell, 2017)
                    taskInput = Integer.parseInt(JOptionPane.showInputDialog("Choose an option:\n" + "1) Add tasks\n" + "2) Show report\n" + "3) Quit"));//(baeldung, 2023)
                   //If statement for each option they have chosen 
                   if (taskInput == 1){ //(Farrell, 2017)
                       numTasks = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you wish to enter?"));
                       //For loop to get and display all the users details
                       for (taskNumber = 0; taskNumber < numTasks; taskNumber++) { //(Farrell, 2017)
                            taskName = JOptionPane.showInputDialog("Please enter the task name:");
                            taskDescription = JOptionPane.showInputDialog(null, "Please enter the task description:");
                            JOptionPane.showMessageDialog(null, tasksDetails.DisplayDescription(taskDescription)); //(user8994147, 2017)
                            
                            developerFirstName = JOptionPane.showInputDialog(null, "Please enter the Developer's FirstName:");
                            developerLastName = JOptionPane.showInputDialog(null, "Please enter the Developer's LastName:");
                            taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Please enter the task duration in hours:"));
                            taskStatus = JOptionPane.showInputDialog(null, "Please enter the Task Status: (To Do/ Done/ Doing):");
                            JOptionPane.showMessageDialog(null, tasksDetails.createTaskID(taskID)); //(user8994147, 2017)
                       
                            
                       }
                       JOptionPane.showMessageDialog(null, tasksDetails.printTaskDetails(taskStatus, developerFirstName, developerLastName, taskNumber, taskName, taskDescription, taskID, taskDuration));
                   }else if (taskInput == 2) {
                       TasksWithStatusDone(developers, taskNames, taskDurations, taskStatuses);   
                        ClassWithLongestDuration(taskDurations, developers);
                        TaskNameSearch(taskNameSearch, taskNames,taskDurations, taskStatuses); 
                        DeveloperSearch(developerSearch, developers,taskStatuses);
                        TaskNameDelete(taskNameDelete, taskNames);
                        displayTaskReport(taskNames, developers, taskDurations, taskID, taskStatuses);      
        
                    } else if (taskInput == 3) {
                        break;
                    }
                }
             }
             break;
                
            default:
                //When neither 1 or 2 is prompted an error message will display
                System.out.println("Please enter either the number 1 or 2"); 
                break;
        }    
    
}
    
    public static void TasksWithStatusDone(String[] developers, String[] taskNames, int[] taskDurations, String[] taskStatuses) { 
      boolean tasksFound = false;
        for (int count = 0; count < taskStatuses.length; count++) {
            if (taskStatuses[count].equalsIgnoreCase("Done")) {
                JOptionPane.showMessageDialog(null, "Developer Details with TaskStatus: Done" + "\nDeveloper: " + developers[count] + "\nTask Name: " + taskNames[count] + "\nTask Duration: " + taskDurations[count]);
                tasksFound = true;
            } 
        }   
    }

    public static void ClassWithLongestDuration(int[] taskDurations, String[] developers) {
        int longestDuration = 0;
        int index = -1;

        for (int count = 0; count < taskDurations.length; count++) {
            if (taskDurations[count] > longestDuration) {
                longestDuration = taskDurations[count];
                index = count;
            }
        }

        if (index != -1) {
            JOptionPane.showMessageDialog(null,"Class with Longest Duration " + "\nDeveloper: " + developers[index] + "\nTask Duration: " + longestDuration);
        }
        
    }
    
    public static void TaskNameSearch(String taskNameSearch, String[] taskNames, int[] taskDurations, String[] taskStatuses) {
        boolean tasksFound = false;
        taskNameSearch = JOptionPane.showInputDialog(null, "Please search for a task using the developers First Name: ");
        for (int i = 0; i < taskNames.length; i++) {
            if (taskNames[i].equalsIgnoreCase(taskNameSearch)) {
                JOptionPane.showMessageDialog(null, "Task Name: " + taskNames[i] + "\nDeveloper: " + taskNameSearch + "\nTask Status: " + taskStatuses[i]);
                tasksFound = true;  
            } 
        }
    }
    
    public static void DeveloperSearch(String developerSearch, String[] developers, String[] taskStatuses) {
        boolean taskFound = false;
        developerSearch = JOptionPane.showInputDialog(null, "Please search for the devolopers details using the Tasks Name: ");
        
        for (int i = 0; i < developers.length; i++) {
            if (developers[i].equalsIgnoreCase(developerSearch)) {
                JOptionPane.showMessageDialog(null, "Task Name: " + developerSearch + "\nTask Status: " + taskStatuses);
                taskFound = true;
            } 
        }
        
    }
    
    public static void TaskNameDelete(String taskNameDelete, String[] taskNames) {
        boolean taskDeleted = false;
        taskNameDelete = JOptionPane.showInputDialog(null, "Please enter the name of the task of which you would like to delete: ");
        for (int i = 0; i < taskNames.length; i++) {
            if (taskNames[i].equalsIgnoreCase(taskNameDelete)) {
                
                taskDeleted = true;
                if (taskDeleted) {
                JOptionPane.showMessageDialog(null, "Task " + taskNameDelete + " has been deleted successfully.");
        } 
            }
        }
        
    }
    
    public static void displayTaskReport(String[] taskNames, String[] developers, int[] taskDurations, String taskID, String[] taskStatuses) {
       
        for (int i = 0; i < taskNames.length; i++) {
            JOptionPane.showMessageDialog(null, "Task Report: " + "\nTask Name: " + taskNames[i] + "\nDeveloper: " + developers[i] + "\nTask Duration: " + taskDurations[i] + "\nTask ID: " + taskID + "\nTask Status: " + taskStatuses[i]);
            
        }
    }

    
}
//Reference List:
/* Baeldung. 2023. Adding a Newline Character to a String in Java. [Online]. Available at: https://www.baeldung.com/java-string-newline#:~:text=Adding%20a%20new%20line%20in,the%20end%20of%20our%20string. [Accessed 06 June 2023].
   Farrell, J. 2017. Java Programming. Ninth Edition. Boston: Cengage Learning.
   user8994147. 2017. Connect front-end with backend. [Online]. Available at: https://stackoverflow.com/questions/47861742/connect-front-end-with-backend [Accessed 7 June 2023].
*/
