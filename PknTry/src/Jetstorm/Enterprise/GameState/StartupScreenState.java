package Jetstorm.Enterprise.GameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import Jetstorm.Enterprise.Handlers.ImageLoader;
import Jetstorm.Enterprise.Handlers.Keys;
import Jetstorm.Enterprise.Handlers.Mouse;
import Jetstorm.Enterprise.Main.MainClass;
import Jetstorm.Enterprise.Main.WindowClass;

public class StartupScreenState extends GameState {

	private Font font;

	private int alpha = 0;
	private int ticks = 0;

	private int x1Local;
	private int x2Local;

	private final int FADE_IN = 120;
	private final int NO_FADE = 180;
	private final int FADE_OUT = 120;

	public StartupScreenState(GameStateManager gsm) {
		super(gsm);
		init();
	}

	public void init() {

		MainClass.setCursor(MainClass.INVISIBLE);

		x1Local = WindowClass.WIDTH / 16;
		x2Local = WindowClass.WIDTH - (WindowClass.WIDTH / 2);

		try {

			font = new Font("Ariel", Font.BOLD, 12);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void update() {

		if (ticks % 10 == 0) {
			x1Local++;
			x2Local--;
		}

		ticks++;
		if (ticks < FADE_IN) {
			alpha = (int) (255 - 255 * (1.0 * ticks / FADE_IN));
			if (alpha < 0)
				alpha = 0;
		}
		if (ticks > FADE_IN + NO_FADE) {
			alpha = (int) (255 * (1.0 * ticks - FADE_IN - NO_FADE) / FADE_OUT);
			if (alpha > 255)
				alpha = 255;
		}
		if (ticks > FADE_IN + NO_FADE + FADE_OUT) {
			gsm.setState(GameStateManager.LOADINGSCREENSTATE);
		}

		handleInput();

	}

	public void draw(Graphics2D g) {

		g.drawImage(ImageLoader.DRAGONINTRO, 0, 0, null);
		g.setFont(font);
		g.setColor(Color.BLACK);
		g.drawString("J e t s t o r m", x1Local + 5, 55);
		g.setColor(Color.WHITE);
		g.drawString("J e t s t o r m", x1Local, 50);
		g.setColor(Color.BLACK);
		g.drawString("E n t e r p r i s e s", x2Local + 5, 130);
		g.setColor(Color.WHITE);
		g.drawString("E n t e r p r i s e s", x2Local, 125);
		g.setColor(new Color(255, 255, 255, alpha));
		g.fillRect(0, 0, WindowClass.WIDTH, WindowClass.HEIGHT);

	}

	public void select() {
		gsm.setState(GameStateManager.LOADINGSCREENSTATE);
	}

	public void handleInput() {

		if (Keys.isPressed(Keys.ENTER)) {
			gsm.setState(GameStateManager.LOADINGSCREENSTATE);
		}

		if (Mouse.isPressed()) {
			select();
		}

	}

}
