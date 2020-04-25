package command;

public class RemoteExec {
	private Command command;
	float result;

	public void SetCommand(Command command) {
		this.command = command;
	}
	
	public void Execute() {
		command.exec();
	}
	
}
