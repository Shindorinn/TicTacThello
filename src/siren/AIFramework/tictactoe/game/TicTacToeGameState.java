package siren.AIFramework.tictactoe.game;

import java.util.ArrayList;

import siren.AIFramework.factory.GameStateFactory;
import siren.AIFramework.game.GameObject;
import siren.AIFramework.interfaces.GameState;

public class TicTacToeGameState implements GameState {

	static{
		GameStateFactory.registerGameStateClass(TicTacToeGameState.class);
	}
	
	private ArrayList<GameObject> gameObjects;
	
	
	public TicTacToeGameState(){
		this.gameObjects = new ArrayList<GameObject>();
	}
	
	@Override
	public ArrayList<GameObject> getGameObjects() {
		return this.gameObjects;
	}

	@Override
	public boolean addGameObject(GameObject object) {
		return this.gameObjects.add(object);
	}

	@Override
	public boolean removeGameObject(GameObject object) {
		return this.gameObjects.remove(object);
	}

	
	
}
