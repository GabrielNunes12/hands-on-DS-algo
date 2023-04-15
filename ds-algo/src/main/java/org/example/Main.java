package org.example;

import Commands.AddTaskCommand;
import Commands.GetAllTasksCommands;
import Commands.UpdateTaskCommand;
import Enums.EnumPriority;
import Enums.EnumStatus;
import Intefaces.TaskCommand;
import Models.Task;
import Models.TaskStorage;

import java.time.Instant;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    TaskStorage taskStorage = TaskStorage.getInstance();
    Task task = new Task.Builder()
            .id(1L)
            .title("Example Task")
            .description("This is an example task.")
            .dueDate(Instant.now())
            .enumPriority(EnumPriority.HIGH)
            .enumStatus(EnumStatus.PENDING)
            .build();
    //add all tasks
    TaskCommand addTaskCommand = new AddTaskCommand(task);
    addTaskCommand.execute();
    //Get All tasks
    GetAllTasksCommands getAllTasksCommands = new GetAllTasksCommands();
    getAllTasksCommands.execute();
    List<Task> tasks = getAllTasksCommands.getTasks();
    System.out.println("Tasks' list" + tasks);
    //Update task
    Task updatedTask = new Task.Builder(1L, "Updated task 1",  "Updated task 1",Instant.now(), EnumPriority.LOW, EnumStatus.PENDING).build();
    TaskCommand updateTask = new UpdateTaskCommand(updatedTask, 1L);
    updateTask.execute();
    System.out.println("Update task" + updateTask);
  }
}