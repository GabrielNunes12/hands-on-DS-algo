package Commands;

import Intefaces.TaskCommand;
import Models.Task;
import Models.TaskStorage;

public class AddTaskCommand  implements TaskCommand {
  private Task task;
  public AddTaskCommand(Task task) {
    this.task = task;
  }
  @Override
  public void execute() {
    TaskStorage.getInstance().addTasks(this.task);
  }
}
