package decorator;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Burger> basicBurger = new ArrayList<Burger>();
		
		for(short i = 0; i < 3; i++)
			basicBurger.add(new BasicBurger());
		
		Burger classicBurger = new ToppingClassic(basicBurger.get(0));
		classicBurger.order();
		
		Burger cheeseBurger = new ToppingCheese(basicBurger.get(1));
		cheeseBurger.order();
		
		Burger eggBurger = new ToppingEgg(basicBurger.get(2));
		eggBurger.order();

	}

}
