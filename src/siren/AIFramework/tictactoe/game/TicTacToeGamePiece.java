package siren.AIFramework.tictactoe.game;

import siren.AIFramework.game.GameLocation;
import siren.AIFramework.game.GameObject;

public class TicTacToeGamePiece extends GameObject{

	public static final char side_x = 'x';
	public static final char side_y = 'y';
	
	private char side;
		
	protected TicTacToeGamePiece(GameLocation location){
		super(location);
	}

	public TicTacToeGamePiece(GameLocation location, char side){
		this(location);
		this.side = side;
	}
	
	@Override
	public void updateLocation(int x_coordinate, int y_coordinate, int z_coordinate) {
		super.location.updateLocation(x_coordinate, y_coordinate, z_coordinate);
	}
	
}
