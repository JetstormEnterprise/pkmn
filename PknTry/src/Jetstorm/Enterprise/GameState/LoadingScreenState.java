package Jetstorm.Enterprise.GameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import Jetstorm.Enterprise.Handlers.Keys;
import Jetstorm.Enterprise.Handlers.Font.FontLoader;

public class LoadingScreenState extends GameState {

	private BufferedImage bg;
	private Font font;
	private int counter = 0;
	private boolean loaded = false;

	public LoadingScreenState(GameStateManager gsm) {
		super(gsm);
		init();
	}

	public void init() {

		try {
			font = new Font("Ariel", Font.PLAIN, 11);
			bg = ImageIO.read(getClass().getResourceAsStream("/backgrounds/bgfox.jpg"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void update() {

		counter++;
		if (counter > 60 && !loaded) {
			FontLoader.init();
			loaded = true;
		}
		
		handleInput();

	}

	public void draw(Graphics2D g) {

		g.drawImage(bg, 0, 0, null);
		g.setFont(font);
		g.setColor(Color.BLACK);
		if (!loaded)
			g.drawString("Loading....", 5, 155);

	}

	public void handleInput() {

		if (loaded) {
			if (Keys.isPressed(Keys.ENTER) || counter > 180) {
				gsm.setState(GameStateManager.STARTMENUSTATE);
			}
		}

	}

}
