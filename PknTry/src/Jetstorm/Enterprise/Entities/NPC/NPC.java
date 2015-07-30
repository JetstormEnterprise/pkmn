package Jetstorm.Enterprise.Entities.NPC;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import Jetstorm.Enterprise.Audio.JukeBox;
import Jetstorm.Enterprise.Entities.MapObject;
import Jetstorm.Enterprise.Entities.Player;
import Jetstorm.Enterprise.Entities.TextBoxClass;
import Jetstorm.Enterprise.Handlers.Animation;
import Jetstorm.Enterprise.Handlers.Keys;
import Jetstorm.Enterprise.Handlers.Font.FontLoader;
import Jetstorm.Enterprise.TileMap.TileMap;

public class NPC extends MapObject {

	protected BufferedImage[] image;
	protected boolean left = false, right = false, up = false, down = false;
	protected Player player;

	protected int width, height;
	protected int xOffset = 0, yOffset = 0;
	protected int hollowHeight;
	protected String fileLocation;
	protected boolean moving = false;
	protected String direction = "Down";

	protected Animation hollowAnim;
	protected ArrayList<BufferedImage[]> sprites;
	protected ArrayList<BufferedImage[]> hollowSprites;
	protected int[] numFrames = { 1, 1, 1, 1, 2, 2, 2, 2 };

	protected final int IDLEDOWN = 0;
	protected final int IDLEUP = 1;
	protected final int IDLELEFT = 2;
	protected final int IDLERIGHT = 3;
	protected final int MOVINGDOWN = 4;
	protected final int MOVINGUP = 5;
	protected final int MOVINGLEFT = 6;
	protected final int MOVINGRIGHT = 7;

	protected String line1, line2;
	protected int conversation;
	protected int currentTextSpot, maxTextSpot;
	protected TextBoxClass box;
	protected BufferedImage[] topText, botText;
	protected boolean talking;
	protected boolean startWait;
	protected int waitTime = 0;

	public NPC(TileMap tm, Player player) {
		super(tm);
		this.player = player;
		box = new TextBoxClass("textbox", 0, 112, 240, 48);
	}

	protected void init() {

		try {

			BufferedImage image = ImageIO.read(getClass().getResourceAsStream(fileLocation));
			sprites = new ArrayList<BufferedImage[]>();
			hollowSprites = new ArrayList<BufferedImage[]>();

			// int tempWidth = (width - 16) / 2;
			hollowHeight = (height - 16);

			for (int i = 0; i < 8; i++) {

				BufferedImage[] bi = new BufferedImage[numFrames[i]];
				BufferedImage[] hs = new BufferedImage[numFrames[i]];

				if (i == 0) {
					bi[0] = image.getSubimage(0, hollowHeight, 16, 16);
					sprites.add(bi);
					hs[0] = image.getSubimage(0, 0, 16, hollowHeight);
					hollowSprites.add(hs);
				} else if (i == 1) {
					bi[0] = image.getSubimage(width, hollowHeight, 16, 16);
					sprites.add(bi);
					hs[0] = image.getSubimage(width, 0, 16, hollowHeight);
					hollowSprites.add(hs);
				} else if (i == 2) {
					bi[0] = image.getSubimage(width * 2, hollowHeight, 16, 16);
					sprites.add(bi);
					hs[0] = image.getSubimage(width * 2, 0, 16, hollowHeight);
					hollowSprites.add(hs);
				} else if (i == 3) {
					bi[0] = image.getSubimage(width * 2, hollowHeight, 16, 16);
					sprites.add(bi);
					hs[0] = image.getSubimage(width * 2, 0, 16, hollowHeight);
					hollowSprites.add(hs);
				} else if (i == 4) {
					bi[0] = image.getSubimage(width * 3, hollowHeight, 16, 16);
					bi[1] = image.getSubimage(width * 3, hollowHeight, 16, 16);
					sprites.add(bi);
					hs[0] = image.getSubimage(width * 3, 0, 16, hollowHeight);
					hs[1] = image.getSubimage(width * 3, 0, 16, hollowHeight);
					hollowSprites.add(hs);
				} else if (i == 5) {
					bi[0] = image.getSubimage(width * 4, hollowHeight, 16, 16);
					bi[1] = image.getSubimage(width * 4, hollowHeight, 16, 16);
					sprites.add(bi);
					hs[0] = image.getSubimage(width * 4, 0, 16, hollowHeight);
					hs[1] = image.getSubimage(width * 4, 0, 16, hollowHeight);
					hollowSprites.add(hs);
				} else if (i == 6 || i == 7) {
					bi[0] = image.getSubimage(width * 5, hollowHeight, 16, 16);
					bi[1] = image.getSubimage(width * 5, hollowHeight, 16, 16);
					sprites.add(bi);
					hs[0] = image.getSubimage(width * 5, 0, 16, hollowHeight);
					hs[1] = image.getSubimage(width * 5, 0, 16, hollowHeight);
					hollowSprites.add(hs);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		animation = new Animation();
		hollowAnim = new Animation();
		if (direction.equalsIgnoreCase("Down")) {
			animation.setFrames(sprites.get(IDLEDOWN));
			hollowAnim.setFrames(hollowSprites.get(IDLEDOWN));
		} else if (direction.equalsIgnoreCase("Up")) {
			animation.setFrames(sprites.get(IDLEUP));
			hollowAnim.setFrames(hollowSprites.get(IDLEUP));
		} else if (direction.equalsIgnoreCase("Left")) {
			animation.setFrames(sprites.get(IDLELEFT));
			hollowAnim.setFrames(hollowSprites.get(IDLELEFT));
		} else if (direction.equalsIgnoreCase("Right")) {
			animation.setFrames(sprites.get(IDLERIGHT));
			hollowAnim.setFrames(hollowSprites.get(IDLERIGHT));
		}
		animation.setDelay(180);
		hollowAnim.setDelay(180);

	}

	public void moveDown() {
		y = y - 1;
	}

	public void moveUp() {
		y = y + 1;
	}

	public void moveRight() {
		x = x - 1;
	}

	public void moveLeft() {
		x = x + 1;
	}

	public boolean isTalking() {
		return talking;
	}

	public void setConversation(int conversation) {
		this.conversation = conversation;
	}

	public void faceLeft() {
		left = true;
		right = down = up = false;
	}

	public void faceRight() {
		right = true;
		left = down = up = false;
	}

	public void faceDown() {
		down = true;
		left = right = up = false;
	}

	public void faceUp() {
		up = true;
		left = right = down = false;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public void update() {

		if (startWait) {
			waitTime++;
			if (waitTime >= 180) {
				waitTime = 0;
				startWait = false;
			}
		}

		if (tileMap.movedDirection("up"))
			moveUp();
		else if (tileMap.movedDirection("down"))
			moveDown();
		else if (tileMap.movedDirection("left"))
			moveLeft();
		else if (tileMap.movedDirection("right"))
			moveRight();

		if (player.getInteract()) {
			if (player.getDirection().equalsIgnoreCase("Up")) {
				if (player.getx() == x && player.gety() - 16 == y) {
					if (!player.isBusy() && !startWait) {

					}
				}
			} else if (player.getDirection().equalsIgnoreCase("Down")) {
				if (player.getx() == x && player.gety() + 16 == y) {
					if (!player.isBusy() && !startWait) {

					}
				}
			} else if (player.getDirection().equalsIgnoreCase("Left")) {
				if (player.getx() - 16 == x && player.gety() == y) {
					if (!player.isBusy() && !startWait) {

					}
				}
			} else if (player.getDirection().equalsIgnoreCase("Right")) {
				if (player.getx() + 16 == x && player.gety() == y) {
					if (!player.isBusy() && !startWait) {

					}
				}
			}
		}

		animation.update();
		handleInput();

	}

	public void drawText(Graphics2D g) {

		box.draw(g);
		for (int i = 0; i < topText.length; i++) {
			g.drawImage(topText[i], 10 + (6 * i), 125, null);
		}
		for (int i = 0; i < botText.length; i++) {
			g.drawImage(botText[i], 10 + (6 * i), 140, null);
		}

	}

	public void drawVoid(Graphics2D g) {
		hollowAnim.update();
		if (!moving) {
			if (direction.equalsIgnoreCase("Right")) {
				g.drawImage(hollowAnim.getImage(), (int) (x + xmap - width / 2) + 16 + xOffset,
						(int) (y + ymap - height / 2) + 9 + yOffset
						- hollowHeight, -width, hollowHeight, null);
			} else {
				g.drawImage(hollowAnim.getImage(), (int) (x + xmap - width / 2) + xOffset,
						(int) (y + ymap - height / 2) + 9 + yOffset
						- hollowHeight, null);
			}
		} else if (moving) {
			if (direction.equalsIgnoreCase("Down")) {
				if (hollowAnim.getFrame() == 1) {
					g.drawImage(hollowAnim.getImage(), (int) (x + xmap - width / 2) + 16 + xOffset,
							(int) (y + ymap - height / 2) + 9 + yOffset
 - hollowHeight, -width, hollowHeight, null);
				} else {
					g.drawImage(hollowAnim.getImage(), (int) (x + xmap - width / 2) + xOffset,
							(int) (y + ymap - height / 2) + 9 + yOffset
							- hollowHeight, null);
				}
			} else if (direction.equalsIgnoreCase("Up")) {
				if (hollowAnim.getFrame() == 1) {
					g.drawImage(hollowAnim.getImage(), (int) (x + xmap - width / 2) + 16 + xOffset,
							(int) (y + ymap - height / 2) + 9 + yOffset
 - hollowHeight, -width, hollowHeight, null);
				} else {
					g.drawImage(hollowAnim.getImage(), (int) (x + xmap - width / 2) + xOffset,
							(int) (y + ymap - height / 2) + 9 + yOffset
							- hollowHeight, null);
				}
			} else if (direction.equalsIgnoreCase("Right")) {
				g.drawImage(hollowAnim.getImage(), (int) (x + xmap - width / 2) + 16 + xOffset,
						(int) (y + ymap - height / 2) + 9 + yOffset
						- hollowHeight, -width, hollowHeight, null);
			} else if (direction.equalsIgnoreCase("Left")) {
				g.drawImage(hollowAnim.getImage(), (int) (x + xmap - width / 2) + xOffset,
						(int) (y + ymap - height / 2) + 9 + yOffset
						- hollowHeight, null);
			}

		}
	}

	public void draw(Graphics2D g) {

		if (!moving) {
			if (direction.equalsIgnoreCase("Right")) {
				g.drawImage(animation.getImage(), (int) (x + xmap - width / 2) + 16 + xOffset,
						(int) (y + ymap - height / 2) + 9 + yOffset,
						-width,
 height - hollowHeight, null);
			} else {
				g.drawImage(animation.getImage(), (int) (x + xmap - width / 2) + xOffset, (int) (y + ymap - height / 2)
						+ 9 + yOffset,
						null);
			}
		} else if (moving) {
			if (direction.equalsIgnoreCase("Down")) {
				if (animation.getFrame() == 1) {
					g.drawImage(animation.getImage(), (int) (x + xmap - width / 2) + 16 + xOffset,
							(int) (y + ymap - height / 2) + 9 + yOffset,
 -width, height - hollowHeight, null);
				} else {
					g.drawImage(animation.getImage(), (int) (x + xmap - width / 2) + xOffset,
							(int) (y + ymap - height / 2) + 9 + yOffset,
							null);
				}
			} else if (direction.equalsIgnoreCase("Up")) {
				if (animation.getFrame() == 1) {
					g.drawImage(animation.getImage(), (int) (x + xmap - width / 2) + 16 + xOffset,
							(int) (y + ymap - height / 2) + 9 + yOffset,
 -width, height - hollowHeight, null);
				} else {
					g.drawImage(animation.getImage(), (int) (x + xmap - width / 2) + xOffset,
							(int) (y + ymap - height / 2) + 9 + yOffset,
							null);
				}
			} else if (direction.equalsIgnoreCase("Right")) {
				g.drawImage(animation.getImage(), (int) (x + xmap - width / 2) + 16 + xOffset,
						(int) (y + ymap - height / 2) + 9 + yOffset,
						-width,
 height - hollowHeight, null);
			} else if (direction.equalsIgnoreCase("Left")) {
				g.drawImage(animation.getImage(), (int) (x + xmap - width / 2) + xOffset, (int) (y + ymap - height / 2)
						+ 9 + yOffset,
						null);
			}

		}

	}

	public void handleInput() {

		if (talking) {
			if (Keys.isPressed(Keys.PLAYER_A)) {
				if (currentTextSpot < maxTextSpot) {
					JukeBox.play("textclick");
					topText = FontLoader.getDarkTranslation(line1);
					botText = FontLoader.getDarkTranslation(line2);
					currentTextSpot = currentTextSpot + 1;
				} else if (currentTextSpot >= maxTextSpot) {
					JukeBox.play("textclick");
					talking = false;
					player.setBusy(false);
					player.setInteract(false);
					startWait = true;
				}
			}
		}

	}

}
