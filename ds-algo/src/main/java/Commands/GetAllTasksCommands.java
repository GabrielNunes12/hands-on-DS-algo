package Commands;

import Intefaces.TaskCommand;
import Models.Task;
import Models.TaskStorage;

import java.util.List;

public class GetAllTasksCommands implements TaskCommand {
  private List<Task> tasks;

  public GetAllTasksCommands() {
  }

  @Override
  public void execute() {
    tasks = TaskStorage.getInstance().getAllTasks();
  }
  public List<Task> getTasks() {
    return tasks;
  }
}
