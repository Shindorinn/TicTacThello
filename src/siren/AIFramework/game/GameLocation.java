package siren.AIFramework.game;

public class GameLocation {

	private int x_coordinate;
	private int y_coordinate;
	private int z_coordinate;
		
	public GameLocation(int x_coordinate, int y_coordinate, int z_coordinate){
		this.x_coordinate = x_coordinate;
		this.y_coordinate = y_coordinate;
		this.z_coordinate = z_coordinate;
	}
	
	public boolean updateLocation(int x_coordinate, int y_coordinate, int z_coordinate){
		
		
		this.x_coordinate = x_coordinate;
		this.y_coordinate = y_coordinate;
		this.z_coordinate = z_coordinate;
		
		return true;
	}
	
	public int getXCoordinate(){
		return this.x_coordinate;
	}
	
	public int getYCoordinate(){
		return this.y_coordinate;
	}
	
	public int getZCoordinate(){
		return this.z_coordinate;
	}
}
