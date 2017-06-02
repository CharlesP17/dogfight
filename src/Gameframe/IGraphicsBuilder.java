package Gameframe;

import java.awt.Graphics;
import java.awt.image.*;

public interface IGraphicsBuilder {
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer);
	public int getGloablWidth();
	public int getGlobalHeight();
	
}
