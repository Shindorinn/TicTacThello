package siren.AIFramework.game;

public abstract class GameObject {

	protected GameLocation location;
	
	protected GameObject(GameLocation location){
		this.location = location;
	}
	
	public abstract void updateLocation(int xCoordinate, int yCoordinate, int zCoordinate);
	
	public GameLocation getLocation(){
		return this.location;
	}
}
