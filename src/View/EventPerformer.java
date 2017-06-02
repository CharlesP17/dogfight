package View;

import Controller.IOrderPerformer;
import Controller.UserOrder;
import Controller.Order;
import Gameframe.IEventPerformer;
import java.awt.event.*;

public class EventPerformer implements IEventPerformer
{
	public EventPerformer(IOrderPerformer orderPerformer)
	{
		
	}
	
	
	public void eventPerform(KeyEvent keyCode)
	{
		
	}
	
	private UserOrder keyCodeToUserOrder(int keyCode)
	{
		
		return new UserOrder(1,Order.DOWN);
	}
	
	
	
}
