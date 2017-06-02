package Model;

public class Cloud extends Mobile {
private static int SPEED = 1;
private static int WIDTH = 30;
private static int HEIGHT = 10;
private static String IMAGE;
	
	public Cloud(Direction direction, Dimension dimension) {
		super(direction, new Position (0,0,0,0), dimension, SPEED, IMAGE);
	}

}