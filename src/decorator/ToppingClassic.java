package decorator;

public class ToppingClassic extends BurgerTopping {

	public ToppingClassic(Burger burger) {
		super(burger);
		// TODO Auto-generated constructor stub
	}
	
	public void order() {
		burger.order();
		AddTopping(burger);
	}
	
	private void AddTopping(Burger burger) {
		System.out.println("Adding classic topping to burger!");
	}
}
