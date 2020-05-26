package decorator;

public class ToppingEgg extends BurgerTopping {

	public ToppingEgg(Burger burger) {
		super(burger);
		// TODO Auto-generated constructor stub
	}
	
	public void order() {
		burger.order();
		AddTopping(burger);
	}
	
	private void AddTopping(Burger burger) {
		System.out.println("Adding egg to burger!");
	}

}
