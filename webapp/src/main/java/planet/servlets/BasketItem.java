package planet.servlets;

public class BasketItem {
	private Long id;
	private int q_ty = 1;
	private double cost;
	public BasketItem(Long id,double cost) {
		this.id = id;
		this.cost = cost;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getQ_ty() {
		return q_ty;
	}
	public void setQ_ty(int q_ty) {
		this.q_ty = q_ty;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

}
