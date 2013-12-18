package siren.AIFramework.tictactoe.logic;

import siren.AIFramework.tictactoe.game.TicTacToeGameBoard;
import siren.AIFramework.tictactoe.game.TicTacToePlayer;
import siren.AIFramework.tictactoe.gui.TicTacToeGUI;

public class TicTacToeLogic implements Runnable{
	
	private TicTacToePlayer turn;
	
	private TicTacToePlayer playerOne;
	private TicTacToePlayer playerTwo;
	
	private TicTacToeGUI gui;
	private TicTacToeGameBoard gameBoard;
	
	private boolean gameOver;
	
	public TicTacToeLogic(){
		this.gameBoard = new TicTacToeGameBoard();
		this.gui = new TicTacToeGUI();
	}
	
	public void startGame(boolean humanPlayer, boolean humanOpponent){
		playerOne = new TicTacToePlayer(humanPlayer);
		playerTwo = new TicTacToePlayer(humanOpponent);
		
		turn = playerOne;
		
		
	}

	@Override
	public void run() {
		gameOver = false;
		
		while(!gameOver){
			
			//Wachten op move currentPlayer
			//Switch turn
			
			
			//gameOver = this.isAWin();
		}
		//Report winner
		
	}
	

}
