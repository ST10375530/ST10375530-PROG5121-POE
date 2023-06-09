/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRLD5121_POE;

/**
 *
 * @author lab_services_student
 */
public class Tasks {
    private String taskName, taskDescription, developerFirstName, developerLastName, taskStatus, taskID;
    private  int taskNumber;
    private int taskDuration;
    
    public Tasks() {
        taskName = "";
        taskNumber = taskNumber++;
        taskDescription = taskDescription;
        developerFirstName = developerFirstName;
        developerLastName = developerLastName;
        taskDuration = taskDuration;
        taskID = taskID;
        taskStatus = "";
}

    
    public boolean checkTaskDescription(String taskDescription) {
        return taskDescription.length() <= 50;
    }
    
    public String DisplayDescription(String taskDescription) {
        if (!checkTaskDescription(taskDescription)){
            return "Please enter a task description of less than 50 characters";
        } else {
            return "Task successfully captured";
        }
    }
    
    public String createTaskID(String taskID) {
        if (taskName.length() >= 2){
        taskID = taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developerFirstName.substring(developerFirstName.length() - 3).toUpperCase();
        }
        return taskID;    
    }
    
    public String printTaskDetails(String taskStatus, String developerFirstName, String  developerLastName, int taskNumber, String taskName, String taskDescription, String taskID, int taskDuration) {
        return "Task Status: " + taskStatus + "\nDeveloper Details: " + developerFirstName + " " + developerLastName +
        "\nTask Number: " + taskNumber + "\nTask Name: " + taskName + "\nTask Description: " + taskDescription +
        "\nTask ID: " + createTaskID(taskID) + "\nTask Duration: " + taskDuration + " hours"; //(baeldung, 2023)
    }
    
    public int returnTotalHours(int taskDuration) {
        return taskDuration;
    }


}

/* Reference List:
   Baeldung. 2023. Adding a Newline Character to a String in Java. [Online]. Available at: https://www.baeldung.com/java-string-newline#:~:text=Adding%20a%20new%20line%20in,the%20end%20of%20our%20string. [Accessed 06 June 2023].
   Farrell, J. 2017. Java Programming. Ninth Edition. Boston: Cengage Learning.

*/