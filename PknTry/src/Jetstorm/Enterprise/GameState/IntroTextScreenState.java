package Jetstorm.Enterprise.GameState;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import Jetstorm.Enterprise.Audio.JukeBox;
import Jetstorm.Enterprise.Entities.TextBoxClass;
import Jetstorm.Enterprise.Handlers.Animation;
import Jetstorm.Enterprise.Handlers.ImageLoader;
import Jetstorm.Enterprise.Handlers.Keys;

public class IntroTextScreenState extends GameState {

	private int currentText = 0;

	private Animation anim;
	private BufferedImage[] sprites;

	private TextBoxClass textBox;

	public IntroTextScreenState(GameStateManager gsm) {
		super(gsm);
		init();
	}

	public void init() {

		textBox = new TextBoxClass("textbox", 0, 112, 240, 48);

		try {

			sprites = new BufferedImage[2];
			sprites[0] = ImageIO.read(getClass().getResourceAsStream("/backgrounds/pikachuintro.png")).getSubimage(0,
					0, 29, 32);
			sprites[1] = ImageIO.read(getClass().getResourceAsStream("/backgrounds/pikachuintro.png")).getSubimage(34,
					0, 29, 32);

		} catch (Exception e) {
			e.printStackTrace();
		}

		anim = new Animation();
		anim.setFrames(sprites);
		anim.setDelay(300);

	}

	public void update() {

		handleInput();
		anim.update();

	}

	public void draw(Graphics2D g) {

		if (currentText < 4) {
			g.drawImage(ImageLoader.INTROTEXTSCREEN, 0, 0, null);
			g.drawImage(anim.getImage(), 5, 2, null);
		} else if (currentText >= 4) {
			g.drawImage(ImageLoader.INTROTALKINGSCREENPROF, 0, 0, null);
			g.drawImage(ImageLoader.INTROTALKINGSCREENPROFOAK, 88, 30, null);
			textBox.draw(g);
		}

	}

	public void handleInput() {

		if (Keys.isPressed(Keys.ENTER)) {
			JukeBox.play("textclick");
			currentText++;
			if (currentText == 10)
				gsm.setState(GameStateManager.TESTFIGHT);
		}

	}

}
