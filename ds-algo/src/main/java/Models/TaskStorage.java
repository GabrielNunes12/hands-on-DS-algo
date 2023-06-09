package Models;

import Observer.Interface.TaskObserver;

import java.util.ArrayList;
import java.util.List;

public class TaskStorage {
  private static TaskStorage instance;
  private static List<Task> tasks;
  private static List<TaskObserver> observers;

  public TaskStorage() {
    tasks = new ArrayList<>();
    observers = new ArrayList<>();
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

  public void registerObserver(TaskObserver observer) {
    observers.add(observer);
  }

  public void removeObserver(TaskObserver observer) {
    observers.remove(observer);
  }

  public void notifyObservers() {
    for (TaskObserver observer : observers) {
      observer.update();
    }
  }

  private boolean hasTask(Task task) {
    return task.getId() != null;
  }

  public List<Task> getAllTasks() {
    return tasks;
  }
  public Task updateTask(Task task, long id) {
    for(Task taskUpdate : tasks) {
      if(taskUpdate.getId().equals(id)) {
        taskUpdate.setId(id);
        taskUpdate.setTitle(task.getTitle());
        taskUpdate.setDescription(task.getDescription());
        taskUpdate.setEnumPriority(task.getEnumPriority());
        taskUpdate.setEnumStatus(task.getEnumStatus());
        return taskUpdate;
      }
    }
    notifyObservers();
    return null;
  }

  public List<Task> deleteTask(Long index) {
    List<Task> tasksModified = tasks;
    tasksModified.remove(index);
    notifyObservers();
    return tasksModified;
  }

  public void addTasks(Task task) {
    tasks.add(task);
    notifyObservers();
  }
}
