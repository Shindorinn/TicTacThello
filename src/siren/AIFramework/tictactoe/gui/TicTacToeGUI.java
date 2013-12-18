package siren.AIFramework.tictactoe.gui;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import siren.AIFramework.tictactoe.game.TicTacToeGamePiece;
import siren.AIFramework.tictactoe.utility.TPoint;

public class TicTacToeGUI extends JPanel {

	private JFrame frame = new JFrame();
	
	private static final String FILE_PATH_IMAGE_X = "res/X.png";
	private static final String FILE_PATH_IMAGE_O = "res/O.png";
	private static final String FILE_PATH_IMAGE_PLAYFIELD = "res/playfield.png";
	
	private static final TPoint SQUARE_1 = new TPoint(160,195);
	private static final TPoint SQUARE_2 = new TPoint(360,195);
	private static final TPoint SQUARE_3 = new TPoint(560,195);
	
	private static final TPoint SQUARE_4 = new TPoint(160,395);
	private static final TPoint SQUARE_5 = new TPoint(360,395);
	private static final TPoint SQUARE_6 = new TPoint(560,395);
	
	private static final TPoint SQUARE_7 = new TPoint(160,595);
	private static final TPoint SQUARE_8 = new TPoint(360,595);
	private static final TPoint SQUARE_9 = new TPoint(560,595);
	
	
	private ImageIcon image_x;
	private ImageIcon image_o;
	
	private ImageIcon image_playfield;
	
	public TicTacToeGUI(){
		this.initializeGUI();
		this.initializingMouseMotionListener();
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		
		g.drawImage(this.image_playfield.getImage(), 0, 0, image_playfield.getIconWidth(), image_playfield.getIconHeight(), null);
		
//		g.drawImage(this.image_x.getImage(), 160, 195, image_x.getIconWidth(), image_x.getIconHeight(), null);
//		g.drawImage(this.image_o.getImage(), 360, 195, image_o.getIconWidth(), image_o.getIconHeight(), null);
//		g.drawImage(this.image_x.getImage(), 560, 195, image_x.getIconWidth(), image_x.getIconHeight(), null);
//		
//		g.drawImage(this.image_x.getImage(), 160, 395, image_x.getIconWidth(), image_x.getIconHeight(), null);
//		g.drawImage(this.image_o.getImage(), 360, 395, image_o.getIconWidth(), image_o.getIconHeight(), null);
//		g.drawImage(this.image_x.getImage(), 560, 395, image_x.getIconWidth(), image_x.getIconHeight(), null);
//		
//		g.drawImage(this.image_x.getImage(), 160, 595, image_x.getIconWidth(), image_x.getIconHeight(), null);
//		g.drawImage(this.image_o.getImage(), 360, 595, image_o.getIconWidth(), image_o.getIconHeight(), null);
//		g.drawImage(this.image_x.getImage(), 560, 595, image_x.getIconWidth(), image_x.getIconHeight(), null);
	}
	
	public void updateGameBoard(ArrayList<TicTacToeGamePiece> gamePieces){
		
	}
	
	private void initializingMouseMotionListener(){
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent event) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent event) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent event) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent event) {
				Point point = event.getLocationOnScreen();
				
				if ((point.getX() >= SQUARE_1.getX() && point.getX() <= (SQUARE_1.getX()+image_o.getIconWidth())) && 
					(point.getY() >= SQUARE_1.getY() && point.getY() <= (SQUARE_1.getY()+image_o.getIconHeight()))){
					getGraphics().drawImage(image_x.getImage(), SQUARE_1.getX(), SQUARE_1.getY(), image_x.getIconWidth(), image_x.getIconHeight(), null);
				} 
			
				else if ((point.getX() >= SQUARE_2.getX() && point.getX() <= (SQUARE_2.getX()+image_o.getIconWidth())) && 
					(point.getY() >= SQUARE_2.getY() && point.getY() <= (SQUARE_2.getY()+image_o.getIconHeight()))){
					getGraphics().drawImage(image_x.getImage(), SQUARE_2.getX(), SQUARE_2.getY(), image_x.getIconWidth(), image_x.getIconHeight(), null);
				}
				
				else if ((point.getX() >= SQUARE_3.getX() && point.getX() <= (SQUARE_3.getX()+image_o.getIconWidth())) && 
						(point.getY() >= SQUARE_3.getY() && point.getY() <= (SQUARE_3.getY()+image_o.getIconHeight()))){
					getGraphics().drawImage(image_x.getImage(), SQUARE_3.getX(), SQUARE_3.getY(), image_x.getIconWidth(), image_x.getIconHeight(), null);
				}
				
				else if ((point.getX() >= SQUARE_4.getX() && point.getX() <= (SQUARE_4.getX()+image_o.getIconWidth())) && 
						(point.getY() >= SQUARE_4.getY() && point.getY() <= (SQUARE_4.getY()+image_o.getIconHeight()))){
					getGraphics().drawImage(image_x.getImage(), SQUARE_4.getX(), SQUARE_4.getY(), image_x.getIconWidth(), image_x.getIconHeight(), null);
				}
				
				else if ((point.getX() >= SQUARE_5.getX() && point.getX() <= (SQUARE_5.getX()+image_o.getIconWidth())) && 
						(point.getY() >= SQUARE_5.getY() && point.getY() <= (SQUARE_5.getY()+image_o.getIconHeight()))){
					getGraphics().drawImage(image_x.getImage(), SQUARE_5.getX(), SQUARE_5.getY(), image_x.getIconWidth(), image_x.getIconHeight(), null);
				}
				
				else if ((point.getX() >= SQUARE_6.getX() && point.getX() <= (SQUARE_6.getX()+image_o.getIconWidth())) && 
						(point.getY() >= SQUARE_6.getY() && point.getY() <= (SQUARE_6.getY()+image_o.getIconHeight()))){
					getGraphics().drawImage(image_x.getImage(), SQUARE_6.getX(), SQUARE_6.getY(), image_x.getIconWidth(), image_x.getIconHeight(), null);
				}
				
				else if ((point.getX() >= SQUARE_7.getX() && point.getX() <= (SQUARE_7.getX()+image_o.getIconWidth())) && 
						(point.getY() >= SQUARE_7.getY() && point.getY() <= (SQUARE_7.getY()+image_o.getIconHeight()))){
					getGraphics().drawImage(image_x.getImage(), SQUARE_7.getX(), SQUARE_7.getY(), image_x.getIconWidth(), image_x.getIconHeight(), null);
				}
				
				else if ((point.getX() >= SQUARE_8.getX() && point.getX() <= (SQUARE_8.getX()+image_o.getIconWidth())) && 
						(point.getY() >= SQUARE_8.getY() && point.getY() <= (SQUARE_8.getY()+image_o.getIconHeight()))){
					getGraphics().drawImage(image_x.getImage(), SQUARE_8.getX(), SQUARE_8.getY(), image_x.getIconWidth(), image_x.getIconHeight(), null);
				}
				
				else if ((point.getX() >= SQUARE_9.getX() && point.getX() <= (SQUARE_9.getX()+image_o.getIconWidth())) && 
						(point.getY() >= SQUARE_9.getY() && point.getY() <= (SQUARE_9.getY()+image_o.getIconHeight()))){
					getGraphics().drawImage(image_x.getImage(), SQUARE_9.getX(), SQUARE_9.getY(), image_x.getIconWidth(), image_x.getIconHeight(), null);
				}
				
				
			}

			@Override
			public void mouseReleased(MouseEvent event) {
				// TODO Auto-generated method stub
				
			}
			
		});
			
	}
	
	private void initializeGUI(){
		this.loadImages();
		frame.setSize(image_playfield.getIconWidth(), image_playfield.getIconHeight());
		frame.add(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void loadImages(){
		this.image_x = new ImageIcon(TicTacToeGUI.FILE_PATH_IMAGE_X);
		this.image_o = new ImageIcon(TicTacToeGUI.FILE_PATH_IMAGE_O);
		this.image_playfield = new ImageIcon(TicTacToeGUI.FILE_PATH_IMAGE_PLAYFIELD);
	}
	//135, 175
}
