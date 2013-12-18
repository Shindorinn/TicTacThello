package siren.AIFramework.factory;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import siren.AIFramework.interfaces.GameState;

public class GameStateFactory {
	
	private static ArrayList<Class<?>> gameStateBluePrints = new ArrayList<Class<?>>();
	private static GameState instance = null;
	
	private GameStateFactory(){
	
	}
	
	public static void registerGameStateClass(Class<?> gameStateClass){
		GameStateFactory.gameStateBluePrints.add(gameStateClass);
	}
	
	
	public static GameState createGameState(Class<?> gameStateClass){
		GameState toReturn = null;
		if (gameStateClass != null){
			
			try {
				Class<?> [] parameters = new Class<?>[0];
				
				toReturn = (GameState) gameStateClass.getConstructor(parameters).newInstance(null);
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return toReturn;
	}

}
