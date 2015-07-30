package Jetstorm.Enterprise.Entities.Pokemon.Moves;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import Jetstorm.Enterprise.Handlers.Animation;
import Jetstorm.Enterprise.Handlers.BattleDamage;

public class Move {

	protected String name;
	protected String description;
	protected int type;
	protected int power;
	protected int powerPoints;
	protected int currentPowerPoints;
	protected int accuracy;
	protected int attackType;

	protected String[] pokemonList;

	protected Animation animation;
	protected boolean playAnim = false;
	protected String fileLocation;
	protected int frames;
	protected int width;
	protected int height;
	protected int widthOffset;
	protected int heightOffset;

	public Move() {

	}

	public void init() {

		BufferedImage[] temp = new BufferedImage[frames];

		try {

			BufferedImage image = ImageIO.read(getClass().getResourceAsStream(fileLocation));

			for (int i = 0; i < frames; i++) {
				temp[i] = image.getSubimage(0 + (width * i), 0, width, height);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		animation = new Animation();
		animation.setFrames(temp);
		animation.setDelay(180);

	}

	public void playAnimation() {
		animation.setFrame(0);
		playAnim = true;
	}

	public int getType() {
		return type;
	}

	public String getTypeString() {

		return BattleDamage.typeList[type];

	}

	public int getPower() {
		return power;
	}

	public String getName() {
		return name;
	}

	public int getPP() {
		return currentPowerPoints;
	}

	public int getMaxPP() {
		return powerPoints;
	}

	public void setPP(int points) {
		currentPowerPoints = points;
	}

	public int getAttackType() {
		return attackType;
	}

	public void update() {

		if (playAnim) {
			if (animation.hasPlayedOnce()) {
				playAnim = false;
				animation.resetAnim();
			}
			animation.update();
		}

	}

	public void draw(Graphics2D g) {

		if (playAnim) {
			g.drawImage(animation.getImage(), 144 + widthOffset, 22 + heightOffset, null);
		}

	}

}
