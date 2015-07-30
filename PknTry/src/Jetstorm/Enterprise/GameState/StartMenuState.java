package Jetstorm.Enterprise.GameState;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import Jetstorm.Enterprise.Audio.JukeBox;
import Jetstorm.Enterprise.Handlers.Animation;
import Jetstorm.Enterprise.Handlers.ImageLoader;
import Jetstorm.Enterprise.Handlers.Keys;
import Jetstorm.Enterprise.Handlers.PokemonImageLoader;
import Jetstorm.Enterprise.Handlers.Font.FontLoader;

public class StartMenuState extends GameState {

	private int textBlinkCount = 0;
	private int textCount = 0;

	private ArrayList<Animation> pokemon;

	private int tempTry = 1;
	
	public StartMenuState(GameStateManager gsm) {
		super(gsm);
		init();
	}

	public void init() {

		gsm.generatePlayer();

		pokemon = new ArrayList<Animation>();

		Animation temp = new Animation();
		temp.setFrames(PokemonImageLoader.loadPokemonFrontAnimation(3));
		temp.setDelay(360);
		pokemon.add(temp);
		temp = new Animation();
		temp.setFrames(PokemonImageLoader.loadPokemonFrontAnimation(6));
		temp.setDelay(360);
		pokemon.add(temp);
		temp = new Animation();
		temp.setFrames(PokemonImageLoader.loadPokemonFrontAnimation(9));
		temp.setDelay(360);
		pokemon.add(temp);

		JukeBox.play("titlemusic");

	}

	public void update() {

		textBlinkCount++;
		handleInput();

		if (textBlinkCount % 60 == 0)
			tempTry++;
		if (tempTry > 100)
			tempTry = 1;

		for (int i = 0; i < pokemon.size(); i++) {
			pokemon.get(i).update();
		}
		

	}

	public void draw(Graphics2D g) {

		g.drawImage(ImageLoader.TITLESCREEN, 0, 0, null);
		for (int i = 0; i < pokemon.size(); i++) {
			g.drawImage(pokemon.get(i).getImage(), 0 + (i * 80), 50, null);
		}
		g.drawImage(ImageLoader.POKEMONTITLE, 33, 5, null);

		if (textBlinkCount % 180 == 0 && textCount == 0) {
			textCount++;
		} else if (textCount >= 1) {
			textCount++;
			if (textCount >= 60)
				textCount = 0;
		} else {
			g.drawImage(ImageLoader.STARTTEXT, 80, 110, null);
		}

	}

	public void handleInput() {

		if (Keys.isPressed(Keys.ENTER)) {
			JukeBox.stop("titlemusic");
			JukeBox.play("menuclick");
			//gsm.setState(GameStateManager.TESTFIGHT);
			// gsm.setState(GameStateManager.TESTLEVELSTATE);
			gsm.setState(GameStateManager.POKEMONSUPERCENTER);
			// gsm.setState(GameStateManager.INTROTEXTSCREENSTATE);
		}

	}

}
