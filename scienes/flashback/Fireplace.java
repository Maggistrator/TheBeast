package flashback;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import it.marteEngine.entity.Entity;

public class Fireplace extends Entity {
	
	public Fireplace(float x, float y) {
		super(x, y);
		setHitBox(0, 20, 50, 30);
		try {
			setGraphic(new Image("textures/fireplace.png"));
			addType(SOLID);
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}