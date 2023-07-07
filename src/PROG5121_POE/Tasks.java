/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG5121_POE;

/**
 *
 * @author lab_services_student
 */
//Declaration of variables that will be used 
public class Tasks {
    private String taskName, taskDescription, developerFirstName, developerLastName, taskStatus, taskID;
    private  int taskNumber;
    private int taskDuration;
    //constructor for variables above
    public Tasks() { //(Farrell, 2017)
        taskName = "";
        taskNumber = taskNumber++;
        taskDescription = taskDescription;
        developerFirstName = developerFirstName;
        developerLastName = developerLastName;
        taskDuration = taskDuration;
        taskID = taskID;
        taskStatus = "";
}

    //boolean method to ensure that the taskDescription characters are under 50
    public boolean checkTaskDescription(String taskDescription) {
        return taskDescription.length() <= 50;
    }
    //String method that will display messages for method above
    public String DisplayDescription(String taskDescription) {
        if (!checkTaskDescription(taskDescription)){
            return "Please enter a task description of less than 50 characters";
        } else {
            return "Task successfully captured";
        }
    }
    
    //String method that will create the TaskID according how it was asked
    public String createTaskID(String taskID) {
        if (taskName.length() >= 2){
        taskID = taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developerFirstName.substring(developerFirstName.length() - 3).toUpperCase();
        //(Cruijssen, 2016 & gowtham, 2023)
        }
        return taskID;    
    }
    
    //String method that will display all details written by the user in the specific order given
    public String printTaskDetails(String taskStatus, String developerFirstName, String developerLastName, int taskNumber, String taskName, String taskDescription, String taskID, int taskDuration) {
        return "Task Status: " + taskStatus + "\nDeveloper Details: " + developerFirstName + " " + developerLastName +
        "\nTask Number: " + taskNumber + "\nTask Name: " + taskName + "\nTask Description: " + taskDescription +
        "\nTask ID: " + createTaskID(taskID) + "\nTask Duration: " + taskDuration + " hours"; //(baeldung, 2023)
    }
    
    //Integer method that will return the duration entered by the user
    public int returnTotalHours(int taskDuration) { //(Farrell, 2017)
        return taskDuration;
    }


}

/* Reference List:
   Baeldung. 2023. Adding a Newline Character to a String in Java. [Online]. Available at: https://www.baeldung.com/java-string-newline#:~:text=Adding%20a%20new%20line%20in,the%20end%20of%20our%20string. [Accessed 06 June 2023].
   Cruijssen, K. 2016. get 2 characters from string. [Online]. Available at: https://stackoverflow.com/questions/38632600/get-2-characters-from-a-string [Accessed 07 June 2023].
   Farrell, J. 2017. Java Programming. Ninth Edition. Boston: Cengage Learning.
   gowtham, S. 2023. How to get last n characters of a string in Java. [Online]. Available at: https://reactgo.com/java-get-last-n-characters-string/ [Accessed 06 June 2023].
*/