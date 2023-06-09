/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRLD5121_POE;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author lab_services_student
 */
public class Prld5121_poe {
    
    public static void main(String[] args) {
        //Instantiate the Scanner object
        Scanner input = new Scanner(System.in);

        
        //Call the Login and Registration back-end classes into the front-end
        LogIn loginDetails = new LogIn(); //(Farrell, 2017 & user8994147, 2017)
        Registration regDetails = new Registration(); //(Farrell, 2017 & user8994147, 2017)
        Tasks tasksDetails = new Tasks(); //(Farrell, 2017 & user8994147, 2017)
        
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
                String loginStatus = loginDetails.returnLoginStatus(username, password); //(user8994147, 2017)
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
                            JOptionPane.showMessageDialog(null, tasksDetails.createTaskID(taskID)); //(user8994147, 2017)
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
                String RegUser = regDetails.registerUser(username, password); //(user8994147, 2017)
                //Display the back-end information
                JOptionPane.showMessageDialog(null, RegUser);
                
                JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
                while (taskInput < 4) { //(Farrell, 2017)
                    taskInput = Integer.parseInt(JOptionPane.showInputDialog("Choose an option:\n" + "1) Add tasks\n" + "2) Show report\n" + "3) Quit"));//(baeldung, 2023)
                    
                   if (taskInput == 1){ //(Farrell, 2017)
                       numTasks = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you wish to enter?"));
                       for (taskNumber = 0; taskNumber < numTasks; taskNumber++) { //(Farrell, 2017)
                            taskName = JOptionPane.showInputDialog("Please enter the task name:");
                            taskDescription = JOptionPane.showInputDialog(null, "Please enter the task description:");
                            JOptionPane.showMessageDialog(null, tasksDetails.DisplayDescription(taskDescription)); //(user8994147, 2017)
                            
                            developerFirstName = JOptionPane.showInputDialog(null, "Please enter the Developer's FirstName:");
                            developerLastName = JOptionPane.showInputDialog(null, "Please eneter the Developer's LastName:");
                            taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Please enter the task duration in hours:"));
                            taskStatus = JOptionPane.showInputDialog(null, "Please enter the Task Status: (To Do/ Done/ Doing):");
                            JOptionPane.showMessageDialog(null, tasksDetails.createTaskID(taskID)); //(user8994147, 2017)
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
/* Baeldung. 2023. Adding a Newline Character to a String in Java. [Online]. Available at: https://www.baeldung.com/java-string-newline#:~:text=Adding%20a%20new%20line%20in,the%20end%20of%20our%20string. [Accessed 06 June 2023].
   Farrell, J. 2017. Java Programming. Ninth Edition. Boston: Cengage Learning.
   user8994147. 2017. Connect front-end with backend. [Online]. Available at: https://stackoverflow.com/questions/47861742/connect-front-end-with-backend [Accessed 7 June 2023].
*/
