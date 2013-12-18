package siren.AIFramework.interfaces;

import java.util.ArrayList;

import siren.AIFramework.game.GameObject;

public interface GameState {
	
	public ArrayList<GameObject> getGameObjects();
	
	public abstract boolean addGameObject(GameObject object);
	
	public abstract boolean removeGameObject(GameObject object);
}
