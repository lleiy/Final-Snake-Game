package snakeGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import object.OBJ_Apple;

public class UI {
	
	GamePanel gp;
	Font arial_40;
	BufferedImage appleImage;
	public boolean messageOn = false;
	public String message = "";
	int messageCounter = 0; 
	public boolean gameFinished = false;
	
	public UI(GamePanel gp) {
		this.gp = gp;
	
		arial_40 = new Font("Arial", Font.PLAIN, 40);
		
		OBJ_Apple apple = new OBJ_Apple();
		appleImage = apple.image;
	}
	
	public void showMessage (String text) {
	    message = text;
	    messageOn = true;
	}
	
	public void showIntro() {
	    message =
	        "Welcome, brave player!\n" +
	        "Collect five apples across the map.\n" +
	        "Some will power you up,\n" +
	        "others may slow you down,\n" +
	        "so choose wisely!";
	    messageOn = true;
	    messageCounter = 0;
	}

	public void finishGame() {
	    gameFinished = true;
	    messageOn = false;        // hide normal messages
	    messageCounter = 0;
	}
	
	public void draw(Graphics2D g2) {

	    g2.setFont(arial_40);
	    g2.setColor(Color.white);
	    g2.drawImage(appleImage, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);
	    g2.drawString(" = " + gp.snake.hasApple, 74, 65);

	    // End screen
	    if (gameFinished) {
	        g2.setFont(g2.getFont().deriveFont(40F));
	        String line1 = "You have successfully";
	        String line2 = "completed the game!";
	        String line3 = "Thank you for playing!";

	        int x = gp.screenWidth / 2;
	        int y = gp.screenHeight / 2;

	        g2.drawString(line1, x - 200, y - 40);
	        g2.drawString(line2, x - 200, y);
	        g2.drawString(line3, x - 200, y + 40);
	        return; // skip normal message drawing
	    }

	    // Normal temporary messages
	    if (messageOn == true) {
	        g2.setFont(g2.getFont().deriveFont(30F));

	        String[] lines = message.split("\n");
	        int x = gp.tileSize / 2;
	        int y = gp.tileSize * 4;              // starting Y position
	        int lineHeight = g2.getFontMetrics().getHeight();

	        for (String line : lines) {
	            g2.drawString(line, x, y);
	            y += lineHeight;                  // move down for next line
	        }

	        messageCounter++;

	        if (messageCounter > 420) {
	            messageCounter = 0;
	            messageOn = false;
	        }
	    }
	}
	
}
