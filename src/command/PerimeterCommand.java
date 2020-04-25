package command;

public class PerimeterCommand implements Command {

	private Rectangle rect;
	
	PerimeterCommand(Rectangle rect){
		this.rect = rect;
	}
	
	@Override
	public void exec() {
		System.out.println("Perimeter: " + this.rect.GetPerimeter());
		this.rect.GetPerimeter();
	}
}
