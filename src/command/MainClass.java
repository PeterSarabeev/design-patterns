package command;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoteExec remoteExec = new RemoteExec();
		Rectangle rect = new Rectangle(5,10);
		
		Command getSurface = new SurfaceCommand(rect);
		Command getPerimeter = new PerimeterCommand(rect);
			
		remoteExec.SetCommand(getSurface);
		remoteExec.Execute();
		
		remoteExec.SetCommand(getPerimeter);
		remoteExec.Execute();
		
	}
}
