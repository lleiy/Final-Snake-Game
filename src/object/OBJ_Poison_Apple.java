package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Poison_Apple extends SuperObject {
	
	public OBJ_Poison_Apple() {
		
		name = "Poison Apple";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/poison_apple.png"));
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	

}
