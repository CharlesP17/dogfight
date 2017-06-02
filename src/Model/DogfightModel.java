package Model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel
{
	private IArea IArea;
	private ArrayList<IMobile> IMobile;
	private Sky sky;
	private IMobile iMobile;

public void DogfightModel()

{
	//sky = new Sky();
}
public IArea getArea(){
	return IArea;
}

public void buildArea(Dimension dimension){
	
}

public void addMobile(IMobile Mobile){
	
}

public void removeMobile(IMobile mobile){
	
}

public ArrayList<IMobile> getMobiles(){
	return IMobile;
}

public IMobile getMobileByPlayer(int player){
	return null;
}

public void setMobilesHavesMoved(){
	
}
}