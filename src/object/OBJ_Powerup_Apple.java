package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Powerup_Apple extends SuperObject{
	
	public OBJ_Powerup_Apple() {
		
		
		name = "Powerup Apple";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/powerup_apple.png"));
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}