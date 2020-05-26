package decorator;

public class BurgerTopping implements Burger {

	protected Burger burger;
	
	public BurgerTopping(Burger burger) {
		this.burger = burger;
	}
	
	@Override
	public void order() {
		// TODO Auto-generated method stub
		this.burger.order();
		
	}

}
