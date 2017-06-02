package Model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Mobile implements IMobile {
private int speed;
private boolean isWeapon;
private Color color;
private Dimension dimension;
private Position position;
private Direction direction;
private String image;


public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) 
{
	;
}

public Direction getDirection()
{
	return this.direction;	
}

public void setDirection(Direction direction)
{
	
}

public Dimension getDimension()
{
	return this.dimension;
}

public int getSpeed()
{
	return 1;
}

public int getWidth()
{
	return 1;
}

public int getHeight()
{
	return 1;
}

public void move()
{
	
}

public void placeInArea(IArea area)
{
	
}

public boolean isPlayer(int player)
{
	return this.isPlayer(player);
}

private void moveUp()
{
	
}

private void moveRight(){
	
}

private void moveDown(){
	
}

private void moveLeft(){
	
}

public Color getColor()
{
	return this.color;
}

public void setDogfightModel(IDogfightModel dogfightModel)
{
	
}

public boolean isWeapon()
{
return this.isWeapon;
}


public Point getPosition() 
{
	return Position;
}


public Image getImage() 
{
	BufferedImage img = null;
	try {
	    img = ImageIO.read(new File(image));
	} catch (IOException e) 
	{
	}
	
	return img;
	
}


public void setDogfightModel(DogfightModel dogfightModel) 
{
	
	
}

public boolean hit() {
	
	return ;
}
}

