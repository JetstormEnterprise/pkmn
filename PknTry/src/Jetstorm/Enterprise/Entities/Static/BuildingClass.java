package Jetstorm.Enterprise.Entities.Static;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import Jetstorm.Enterprise.Entities.MapObject;
import Jetstorm.Enterprise.Entities.interactable.Door;
import Jetstorm.Enterprise.Handlers.Animation;
import Jetstorm.Enterprise.TileMap.TileMap;

public class BuildingClass extends MapObject {

	private BufferedImage[] image;
	private BufferedImage hollow;
	private Door door;
	private String type;

	public BuildingClass(TileMap tm, String buildingType) {
		super(tm);
		type = buildingType;
		init();
	}

	private void init() {

		try {

			image = new BufferedImage[1];
			if (type.equalsIgnoreCase("pokemoncenter1")) {
				image[0] = ImageIO.read(getClass().getResourceAsStream("/buildings/pokemoncenter1.png")).getSubimage(0,
						0, 80, 80);
				hollow = ImageIO.read(getClass().getResourceAsStream("/buildings/pokemoncenter1.png")).getSubimage(0,
						0, 80, 16);
				door = new Door(tileMap);
				door.setPosition(originX + (16 * 9), originY - (16 * 5));
			} else if (type.equalsIgnoreCase("corperate1")) {
				image[0] = ImageIO.read(getClass().getResourceAsStream("/buildings/corperate1.png")).getSubimage(0, 0,
						112, 240);
				hollow = ImageIO.read(getClass().getResourceAsStream("/buildings/corperate1.png")).getSubimage(0, 0,
						112, 144);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		animation = new Animation();
		animation.setFrames(image);
		animation.setDelay(100);

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

	public void update() {

		if (tileMap.movedDirection("up"))
			moveUp();
		else if (tileMap.movedDirection("down"))
			moveDown();
		else if (tileMap.movedDirection("left"))
			moveLeft();
		else if (tileMap.movedDirection("right"))
			moveRight();

		animation.update();
		if (type.equalsIgnoreCase("pokemoncenter1")) {
			door.update();
		}

	}

	public void drawVoid(Graphics2D g) {
		g.drawImage(hollow, (int) (x + xmap - width / 2), (int) (y + ymap - height / 2), null);
	}

	public void draw(Graphics2D g) {

		super.draw(g);
		if (type.equalsIgnoreCase("pokemoncenter1")) {
			door.draw(g);
		}

	}

}
