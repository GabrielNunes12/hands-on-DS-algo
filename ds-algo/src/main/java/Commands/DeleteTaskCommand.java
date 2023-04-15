package Commands;

import Intefaces.TaskCommand;
import Models.TaskStorage;

public class DeleteTaskCommand implements TaskCommand {
  private Long id;

  public DeleteTaskCommand(Long id) {
    this.id = id;
  }

  @Override
  public void execute() {
    TaskStorage.getInstance().deleteTask(id);
  }
}
