/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part1_registrationandlogin;

/**
 *
 * @author lab_services_student
 */
public class Tasks {
    private String taskName, taskDescription, developerDetails, taskStatus, taskID;
    private  int taskNumber;
    private int taskDuration;
    
    public Tasks() {
        taskName = "";
        taskNumber = taskNumber++;
        taskDescription = taskDescription;
        developerDetails = developerDetails;
        taskDuration = taskDuration;
        taskID = createTaskID();
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
    
    public String createTaskID() {
        if (taskName.length() >= 2){
        taskID = taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developerDetails.substring(developerDetails.length() - 3).toUpperCase();
        }
        return taskID;    
    }
    
    public String printTaskDetails(String taskStatus, String developerDetails, int taskNumber, String taskName, String taskDescription, String taskID, int taskDuration) {
        return "Task Status: " + taskStatus + "\nDeveloper Details: " + developerDetails +
        "\nTask Number: " + taskNumber + "\nTask Name: " + taskName + "\nTask Description: " + taskDescription +
        "\nTask ID: " + createTaskID() + "\nTask Duration: " + taskDuration + " hours";
    }
    
    public int returnTotalHours() {
        return taskDuration;
    }


}
