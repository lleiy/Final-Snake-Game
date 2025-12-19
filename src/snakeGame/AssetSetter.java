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
		
		/*

	    // ----- Normal apples (3x, main goals in harder spots) -----

	    // 1) Top-left room, a bit off-center
	    gp.obj[0] = new OBJ_Apple();
	    gp.obj[0].worldX = 10 * gp.tileSize;   // col 10
	    gp.obj[0].worldY = 26 * gp.tileSize;   // row 3

	    // 2) Center room, narrow approach
	    gp.obj[1] = new OBJ_Apple();
	    gp.obj[1].worldX = 24 * gp.tileSize;   // col 24
	    gp.obj[1].worldY = 18 * gp.tileSize;   // row 18

	    // 3) Bottom-right room
	    gp.obj[2] = new OBJ_Apple();
	    gp.obj[2].worldX = 39 * gp.tileSize;   // col 39
	    gp.obj[2].worldY = 32 * gp.tileSize;   // row 32


	    // ----- Poison apples (4x, tempting / risky positions) -----

	    // Left corridor near middle
	    gp.obj[3] = new OBJ_Poison_Apple();
	    gp.obj[3].worldX = 6  * gp.tileSize;   // col 6
	    gp.obj[3].worldY = 18 * gp.tileSize;   // row 18

	    // Right corridor near middle
	    gp.obj[4] = new OBJ_Poison_Apple();
	    gp.obj[4].worldX = 42 * gp.tileSize;   // col 42
	    gp.obj[4].worldY = 18 * gp.tileSize;   // row 18

	    // Lower-left side path
	    gp.obj[5] = new OBJ_Poison_Apple();
	    gp.obj[5].worldX = 10 * gp.tileSize;   // col 10
	    gp.obj[5].worldY = 30 * gp.tileSize;   // row 30

	    // Lower-right side path
	    gp.obj[6] = new OBJ_Poison_Apple();
	    gp.obj[6].worldX = 39 * gp.tileSize;   // col 39
	    gp.obj[6].worldY = 30 * gp.tileSize;   // row 30


	    // ----- Power‑up apples (3x, rewards deeper in rooms) -----

	    // Deep in top-left room
	    gp.obj[7] = new OBJ_Powerup_Apple();
	    gp.obj[7].worldX = 7  * gp.tileSize;   // col 7
	    gp.obj[7].worldY = 35  * gp.tileSize;   // row 5

	    // Deep in top-right room
	    gp.obj[8] = new OBJ_Powerup_Apple();
	    gp.obj[8].worldX = 42 * gp.tileSize;   // col 42
	    gp.obj[8].worldY = 5  * gp.tileSize;   // row 5

	    // Reward inside central room
	    gp.obj[9] = new OBJ_Powerup_Apple();
	    gp.obj[9].worldX = 24 * gp.tileSize;   // col 24
	    gp.obj[9].worldY = 21 * gp.tileSize;   // row 21
	    
	    */
		
		gp.obj[0] = new OBJ_Apple();
	    gp.obj[0].worldX = 23 * gp.tileSize;   
	    gp.obj[0].worldY = 7 * gp.tileSize;
	    
	    gp.obj[1] = new OBJ_Apple();
	    gp.obj[1].worldX = 10 * gp.tileSize;   
	    gp.obj[1].worldY = 9 * gp.tileSize;
	    
	    gp.obj[2] = new OBJ_Apple();
	    gp.obj[2].worldX = 11 * gp.tileSize;   
	    gp.obj[2].worldY = 33 * gp.tileSize;
	    
	    gp.obj[3] = new OBJ_Apple();
	    gp.obj[3].worldX = 32 * gp.tileSize;   
	    gp.obj[3].worldY = 41 * gp.tileSize;
	    
	    gp.obj[4] = new OBJ_Apple();
	    gp.obj[4].worldX = 38 * gp.tileSize;   
	    gp.obj[4].worldY = 9 * gp.tileSize;
	    
	    gp.obj[5] = new OBJ_Poison_Apple();
	    gp.obj[5].worldX = 16 * gp.tileSize;   
	    gp.obj[5].worldY = 10 * gp.tileSize;
	    
	    gp.obj[6] = new OBJ_Poison_Apple();
	    gp.obj[6].worldX = 23 * gp.tileSize;   
	    gp.obj[6].worldY = 34 * gp.tileSize;
	    
	    gp.obj[7] = new OBJ_Poison_Apple();
	    gp.obj[7].worldX = 36 * gp.tileSize;   
	    gp.obj[7].worldY = 34 * gp.tileSize;
		
	    gp.obj[8] = new OBJ_Powerup_Apple();
	    gp.obj[8].worldX = 15 * gp.tileSize;   
	    gp.obj[8].worldY = 16  * gp.tileSize;
	    
	    gp.obj[9] = new OBJ_Powerup_Apple();
	    gp.obj[9].worldX = 11 * gp.tileSize;   
	    gp.obj[9].worldY = 21  * gp.tileSize;
	    
	    gp.obj[10] = new OBJ_Powerup_Apple();
	    gp.obj[10].worldX = 35 * gp.tileSize;   
	    gp.obj[10].worldY = 20  * gp.tileSize;
	}

}
