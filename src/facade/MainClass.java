package facade;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BurgerFacade burger = new BurgerFacade();
		
		burger.OrderClassicBurger();
		burger.OrderCheeseBurger();
		burger.OrderEggBurger();
	}

}
