package leap.avoidgame;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;


public class Main
{
	public static void main(String[] args) throws SlickException
	{
		// Creates a new game
		AppGameContainer app = new AppGameContainer(new Avoid("Avoid Game",
				false, false));
		// set the dimensions of the game
		app.setDisplayMode(1280, 768, false);
		// don't show the diagnostic FPS
		app.setShowFPS(false);
		// launch the game
		app.start();
	}
}
