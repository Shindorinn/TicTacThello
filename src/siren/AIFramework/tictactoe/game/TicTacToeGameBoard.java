package siren.AIFramework.tictactoe.game;

import siren.AIFramework.game.GameLocation;
import siren.AIFramework.game.GameObject;
import siren.AIFramework.interfaces.GameState;

public class TicTacToeGameBoard {

	private GameState gameState;
	
	public TicTacToeGameBoard(){
		this.gameState = new TicTacToeGameState();
	}
	
	public boolean addGamePiece(GameLocation location){
		boolean success = false;
		
		if(boardLocationAvailable(location)){
			TicTacToeGamePiece piece = new TicTacToeGamePiece(location);
			this.gameState.addGameObject(piece);
			success = true;
		}
		
		
		return success;
		
		
	}
	
	private boolean boardLocationAvailable(GameLocation location) {
		for(GameObject gamePiece : this.gameState.getGameObjects() ){
			if(gamePiece.getLocation().equals(location)){
				return false;
			}
		}
		return true;
	}
	
	
}
