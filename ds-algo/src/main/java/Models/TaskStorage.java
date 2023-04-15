package Models;

import java.util.ArrayList;
import java.util.List;

public class TaskStorage {
  private static TaskStorage instance;
  private static List<Task> tasks;

  public TaskStorage() {
    tasks = new ArrayList<>();
  }
  public static TaskStorage getInstance() {
    if(instance == null) {
      instance = new TaskStorage();
    }
    return instance;
  }
  public void addToTaskList(Task task) {
    if(hasTask(task)) {
      tasks.add(task);
    } else {
      throw new RuntimeException("Task does not have an ID");
    }
  }

  private boolean hasTask(Task task) {
    return task.getId() != null;
  }
}
