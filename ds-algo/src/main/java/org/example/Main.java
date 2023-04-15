package org.example;

import Enums.EnumPriority;
import Enums.EnumStatus;
import Models.Task;
import Models.TaskStorage;

import java.time.Instant;

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
    taskStorage.addToTaskList(task);
  }
}