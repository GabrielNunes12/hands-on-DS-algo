package Commands;

import Intefaces.TaskCommand;
import Models.Task;
import Models.TaskStorage;

public class UpdateTaskCommand implements TaskCommand {
  private Task task;
  private Long id;

  public UpdateTaskCommand(Task task, long id) {
    this.task = task;
    this.id = id;
  }

  @Override
  public void execute() {
    TaskStorage.getInstance().updateTask(this.task, this.id);
  }
}
