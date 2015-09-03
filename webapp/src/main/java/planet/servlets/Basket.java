package planet.servlets;

import java.util.ArrayList;
import java.util.List;

public class Basket {
	private List<BasketItem> basket;
	public Basket() {
		basket = new ArrayList<>();
	}
	public List<BasketItem> getBasket() {
		return basket;
	}

	public void setBasket(List<BasketItem> basket) {
		this.basket = basket;
	}
}
