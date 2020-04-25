package command;

public class SurfaceCommand implements Command {

	private Rectangle rect;
	
	SurfaceCommand(Rectangle rect){
		this.rect = rect;
	}
	
	@Override
	public void exec() {
		System.out.println("Surface: " + this.rect.GetSurface());
		this.rect.GetSurface();
	}

}
