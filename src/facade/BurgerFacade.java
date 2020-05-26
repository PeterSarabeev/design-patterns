package facade;

public class BurgerFacade {
	private Burger bClassic;
	private Burger bCheese;
	private Burger bEgg;
	
	public BurgerFacade(){
		this.bClassic = new ClassicB();
		this.bCheese = new CheeseB();
		this.bEgg = new EggB();
	}
	
	public void OrderClassicBurger() {
		this.bClassic.order();
	}
	
	public void OrderCheeseBurger() {
		this.bCheese.order();
	}
	
	public void OrderEggBurger() {
		this.bEgg.order();
	}
}
