package decorator;

public class ToppingCheese extends BurgerTopping {

	public ToppingCheese(Burger burger) {
		super(burger);
		// TODO Auto-generated constructor stub
	}
	
	public void order() {
		burger.order();
		AddTopping(burger);
	}
	
	private void AddTopping(Burger burger) {
		System.out.println("Adding cheese topping to burger!");
	}
}
