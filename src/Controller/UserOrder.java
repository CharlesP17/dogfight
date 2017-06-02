package Controller;

public class UserOrder {
	
	//attributes
	private int player;
	
	
	//methods
	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}
	
	
	
	public UserOrder(int player, Order order) {
		
	}
	
	public Order getOrder() {
		return this.order;
	}

}
