package Models;

import Observer.Interface.TaskObserver;

public class TextBasedUI implements TaskObserver {
  private TaskStorage taskStorage;

  public TextBasedUI(TaskStorage taskStorage) {
    this.taskStorage = taskStorage;
    this.taskStorage.registerObserver(this);
  }
  @Override
  public void update() {
    displayTasks();
  }

  private void displayTasks() {
    System.out.println("Current tasks: ");
    for(Task task : taskStorage.getAllTasks()) {
      System.out.println(task.toString());
    }
  }
}
