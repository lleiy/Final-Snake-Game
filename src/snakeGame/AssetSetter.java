package snakeGame;

import object.OBJ_Apple;
import object.OBJ_Poison_Apple;
import object.OBJ_Powerup_Apple;

public class AssetSetter {
	
	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	
	public void setObject() {
		
		gp.obj[0] = new OBJ_Apple();
		gp.obj[0].worldX = 23 * gp.tileSize;
		gp.obj[0].worldY = 7 *  gp.tileSize;
		
		gp.obj[1] = new OBJ_Apple();
		gp.obj[1].worldX = 23 * gp.tileSize;
		gp.obj[1].worldY = 40 * gp.tileSize;
		
		gp.obj[2] = new OBJ_Apple();
		gp.obj[2].worldX = 24 * gp.tileSize;
		gp.obj[2].worldY = 40 * gp.tileSize;
		
		gp.obj[3] = new OBJ_Apple();
		gp.obj[3].worldX = 37 * gp.tileSize;
		gp.obj[3].worldY = 7 * gp.tileSize;
		
		gp.obj[4] = new OBJ_Apple();
		gp.obj[4].worldX = 13 * gp.tileSize;
		gp.obj[4].worldY = 41 * gp.tileSize;
		
		gp.obj[5] = new OBJ_Poison_Apple();
		gp.obj[5].worldX = 8 * gp.tileSize;
		gp.obj[5].worldY = 28 * gp.tileSize;
		
		gp.obj[6] = new OBJ_Powerup_Apple();
		gp.obj[6].worldX = 12 * gp.tileSize;
		gp.obj[6].worldY = 22 * gp.tileSize;
	}

}

