/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part1_registrationandlogin;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author lab_services_student
 */
public class Part1_RegistrationAndLogIn {
    
    public static void main(String[] args) {
        //Instantiate the Scanner object
        Scanner input = new Scanner(System.in);

        
        //Call the Login and Registration back-end classes into the front-end
        LogIn loginDetails = new LogIn();
        Registration regDetails = new Registration();
        Tasks tasksDetails = new Tasks();
        
        //Declare the variables
        String username, password, firstName, lastName;
        String taskName="", taskDescription="", developerFirstName="", developerLastName = "", taskStatus="", taskID="" ;
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
                String loginStatus = loginDetails.returnLoginStatus(username, password);
                //Display the back-end information
                JOptionPane.showMessageDialog(null, loginStatus);
                
                JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
                while (taskInput < 4) {
                   taskInput = Integer.parseInt(JOptionPane.showInputDialog("Choose an option:\n" + "1) Add tasks\n" + "2) Show report\n" + "3) Quit"));
                    
                   if (taskInput == 1){
                       numTasks = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you wish to enter?"));
                       for ( taskNumber = 0; taskNumber < numTasks; taskNumber++) {
                            taskName = JOptionPane.showInputDialog("Please enter the task name:");
                            taskDescription = JOptionPane.showInputDialog(null, "Please enter the task description:");
                            JOptionPane.showMessageDialog(null, tasksDetails.DisplayDescription(taskDescription));
                            
                            developerFirstName = JOptionPane.showInputDialog(null, "Please enter the Developer's FirstName:");
                            developerLastName = JOptionPane.showInputDialog(null, "Please enter the Developer's LastName:");
                            taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Please enter the task duration in hours:"));
                            taskStatus = JOptionPane.showInputDialog(null, "Please enter Task Status: (To Do/ Done/ Doing):");
                            taskID = taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developerFirstName.substring(developerFirstName.length() - 3).toUpperCase();    
                            JOptionPane.showMessageDialog(null, tasksDetails.createTaskID(taskID));
                       }
                       JOptionPane.showMessageDialog(null, tasksDetails.printTaskDetails(taskStatus, developerFirstName, developerLastName, taskNumber, taskName, taskDescription, taskID, taskDuration));
                   }else if (taskInput == 2) {
                        JOptionPane.showMessageDialog(null, "Coming Soon");
                    } else if (taskInput == 3) {
                        break;
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
                String RegUser = regDetails.registerUser(username, password);
                //Display the back-end information
                JOptionPane.showMessageDialog(null, RegUser);
                
                JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
                while (taskInput < 4) {
                    taskInput = Integer.parseInt(JOptionPane.showInputDialog("Choose an option:\n" + "1) Add tasks\n" + "2) Show report\n" + "3) Quit"));
                    
                   if (taskInput == 1){
                       numTasks = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you wish to enter?"));
                       for (taskNumber = 0; taskNumber < numTasks; taskNumber++) {
                            taskName = JOptionPane.showInputDialog("Please enter the task name:");
                            taskDescription = JOptionPane.showInputDialog(null, "Please enter the task description:");
                            JOptionPane.showMessageDialog(null, tasksDetails.DisplayDescription(taskDescription));
                            
                            developerFirstName = JOptionPane.showInputDialog(null, "Please enter the Developer's FirstName:");
                            developerLastName = JOptionPane.showInputDialog(null, "Please eneter the Developer's LastName:");
                            taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Please enter the task duration in hours:"));
                            taskStatus = JOptionPane.showInputDialog(null, "Please enter the Task Status: (To Do/ Done/ Doing):");
                            JOptionPane.showMessageDialog(null, tasksDetails.createTaskID(taskID));
                       }
                       JOptionPane.showMessageDialog(null, tasksDetails.printTaskDetails(taskStatus, developerFirstName, developerLastName, taskNumber, taskName, taskDescription, taskID, taskDuration));
                   }else if (taskInput == 2) {
                        JOptionPane.showMessageDialog(null, "Coming Soon");
                    } else if (taskInput == 3) {
                        break;
                    }
                } 
                break;
                
            default:
                //When neither 1 or 2 is prompted an error message will display
                System.out.println("Please enter either the number 1 or 2"); 
                break;
        }    
    
}
}
//Reference List:
/* Farrell, J. 2018. Java Programming. Ninth Edition. Boston: Cengage Learning */
