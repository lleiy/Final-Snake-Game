package object;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import snakeGame.GamePanel;

public class SuperObject {
	
	public BufferedImage image;
	public String name;
	public boolean collision = false;
	public int worldX, worldY;
	public Rectangle solidArea = new Rectangle(0,0,48,48);
	public int solidAreaDefaultX = 0;
	public int solidAreaDefaultY = 0;
	
	public void draw(Graphics2D g2, GamePanel gp) {
		
		int screenX = worldX - gp.snake.worldX + gp.snake.screenX;
		int screenY = worldY - gp.snake.worldY + gp.snake.screenY;
		
		if (worldX + gp.tileSize > gp.snake.worldX - gp.snake.screenX && 
			worldX - gp.tileSize < gp.snake.worldX + gp.snake.screenX && 
			worldY + gp.tileSize > gp.snake.worldY - gp.snake.screenY && 
			worldY - gp.tileSize < gp.snake.worldY + gp.snake.screenY) {
		
			g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);	
		}
	}

}