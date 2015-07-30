package Jetstorm.Enterprise.Entities;

import java.awt.Rectangle;
import java.util.Random;

import Jetstorm.Enterprise.Handlers.Animation;
import Jetstorm.Enterprise.Main.WindowClass;
import Jetstorm.Enterprise.TileMap.Tile;
import Jetstorm.Enterprise.TileMap.TileMap;

public class MapObject {

	protected TileMap tileMap;
	protected int tileSize;
	protected double xmap;
	protected double ymap;

	protected double x;
	protected double y;
	protected double dx;
	protected double dy;
	protected double originX;
	protected double originY;

	protected int width;
	protected int height;
	protected int cwidth;
	protected int cheight;

	protected int currRow;
	protected int currCol;
	protected double xdest;
	protected double ydest;
	protected double xtemp;
	protected double ytemp;
	protected boolean topLeft;
	protected boolean topRight;
	protected boolean bottomLeft;
	protected boolean bottomRight;

	protected boolean left;
	protected boolean right;
	protected boolean up;
	protected boolean down;

	protected double moveWaitTime;
	protected double aiWaitTime;

	Random ran = new Random();
	protected Animation animation;
	protected int currentAction;
	protected int previouseAction;

	public MapObject(TileMap tm) {
		tileMap = tm;
		tileSize = tm.getTileSize();
		animation = new Animation();
	}

	public boolean intersects(MapObject o) {
		Rectangle r1 = getRectangle();
		Rectangle r2 = o.getRectangle();
		return r1.intersects(r2);
	}

	public boolean contains(MapObject o) {
		Rectangle r1 = getRectangle();
		Rectangle r2 = o.getRectangle();
		return r1.contains(r2);
	}

	public Rectangle getRectangle() {
		return new Rectangle((int) x - cwidth, (int) y - cheight, cwidth, cheight);
	}

	public void calculateCorners(double x, double y) {

		int leftTile = (int) (x - cwidth / 2) / tileSize;
		int rightTile = (int) (x + cwidth / 2 - 1) / tileSize;
		int topTile = (int) (y - cheight / 2) / tileSize;
		int bottomTile = (int) (y + cheight / 2 - 1) / tileSize;

		if (topTile < 0 || bottomTile >= tileMap.getNumRows() || leftTile < 0 || rightTile >= tileMap.getNumCols()) {
			topLeft = topRight = bottomLeft = bottomRight = false;
			return;
		}

		int tl = tileMap.getType(topTile, leftTile);
		int tr = tileMap.getType(topTile, rightTile);
		int bl = tileMap.getType(bottomTile, leftTile);
		int br = tileMap.getType(bottomTile, rightTile);

		topLeft = tl == Tile.BLOCKED;
		topRight = tr == Tile.BLOCKED;
		bottomLeft = bl == Tile.BLOCKED;
		bottomRight = br == Tile.BLOCKED;

	}

	public void checkTileMapCollision() {

		currCol = (int) x / tileSize;
		currRow = (int) y / tileSize;

		xdest = x + dx;
		ydest = y + dy;

		xtemp = x;
		ytemp = y;

		calculateCorners(x, ydest);
		if (dy < 0) {
			if (topLeft || topRight) {
				dy = 0;
				ytemp = currRow * tileSize + cheight / 2;
			} else {
				ytemp += dy;
			}
		}
		if (dy > 0) {
			if (bottomLeft || bottomRight) {
				dy = 0;
				ytemp = (currRow + 1) * tileSize - cheight / 2;
			} else {
				ytemp += dy;
			}
		}

		calculateCorners(xdest, y);
		if (dx < 0) {
			if (topLeft || bottomLeft) {
				dx = 0;
				xtemp = currCol * tileSize + cwidth / 2;
			} else {
				xtemp += dx;
			}
		}
		if (dx > 0) {
			if (topRight || bottomRight) {
				dx = 0;
				xtemp = (currCol + 1) * tileSize - cwidth / 2;
			} else {
				xtemp += dx;
			}
		}

	}

	public int getx() {
		return (int) x;
	}

	public int gety() {
		return (int) y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getCWidth() {
		return cwidth;
	}

	public int getCHeight() {
		return cheight;
	}

	public void setPosition(double x, double y) {
		originX = x;
		originY = y;
		this.x = x + (WindowClass.WIDTH / 2) - 7;
		this.y = y + (WindowClass.HEIGHT / 2) - 2;
	}

	public void setNPCPosition(double x, double y) {
		originX = x;
		originY = y;
		this.x = x + (WindowClass.WIDTH / 2);
		this.y = y + (WindowClass.HEIGHT / 2) - 6;
		createNPCArea();
	}

	public void setLeft(boolean b) {
		left = b;
	}

	public void setRight(boolean b) {
		right = b;
	}

	public void setUp(boolean b) {
		up = b;
	}

	public void setDown(boolean b) {
		down = b;
	}

	public void createSingleArea() {
		tileMap.createBlockedArea((int) (-originX - 16) + tileMap.getXOffSet() + 15,
				(int) -originY + tileMap.getYOffSet() + 2, 16, 16);
	}

	public void createNPCArea() {
		tileMap.createBlockedArea((int) (-originX - 16) + tileMap.getXOffSet() + 15,
				(int) -originY + tileMap.getYOffSet() + 2, 16, 16);
	}

	public void createBuildingArea(String type) {
		if (type.equalsIgnoreCase("pokemonCenter1")) {
			tileMap.createBlockedArea((int) (-originX - 16) + tileMap.getXOffSet() + 15,
					(int) -originY + tileMap.getYOffSet() + 2 - 16, 80, 48);
			tileMap.createBlockedArea((int) (-originX - 16) + tileMap.getXOffSet() + 15,
					(int) -originY + tileMap.getYOffSet() + 2 - 64, 32, 16);
			tileMap.createBlockedArea((int) (-originX - 16) + tileMap.getXOffSet() - 33,
					(int) -originY + tileMap.getYOffSet() + 2 - 64, 32, 16);
		} else if (type.equalsIgnoreCase("corperate1")) {
			tileMap.createBlockedArea((int) (-originX - 16) + tileMap.getXOffSet() + 15,
					(int) -originY + tileMap.getYOffSet() + 2 - 144, 112, 80);
			tileMap.createBlockedArea((int) (-originX - 16) + tileMap.getXOffSet() + 15,
					(int) -originY + tileMap.getYOffSet() + 2 - 224, 48, 16);
			tileMap.createBlockedArea((int) (-originX - 16) + tileMap.getXOffSet() - 49,
					(int) -originY + tileMap.getYOffSet() + 2 - 224, 48, 16);
		}
	}

	public void createDeskArea(String type) {
		if (type.equalsIgnoreCase("fooddesk")) {
			tileMap.createBlockedArea((int) (-originX - 16) + tileMap.getXOffSet() + 15,
					(int) -originY + tileMap.getYOffSet() + 2 + 8, 128, 96);
		} else if (type.equalsIgnoreCase("pokemoncenterdesk")) {
			tileMap.createBlockedArea((int) (-originX - 16) + tileMap.getXOffSet() + 15,
					(int) -originY + tileMap.getYOffSet() + 2 + 8, 128, 48);
		} else if (type.equalsIgnoreCase("pokemonmartdesk")) {

		} else if (type.equalsIgnoreCase("pokemonhelpdesk")) {
			tileMap.createBlockedArea((int) (-originX - 16) + tileMap.getXOffSet() + 15,
					(int) -originY + tileMap.getYOffSet() + 2 + 8, 160, 48);
		} else if (type.equalsIgnoreCase("pokemonbasedesk")) {
			tileMap.createBlockedArea((int) (-originX - 16) + tileMap.getXOffSet() + 15,
					(int) -originY + tileMap.getYOffSet() + 2 + 8, 128, 48);
		} else if (type.equalsIgnoreCase("pokemonmartdesk2")) {
			tileMap.createBlockedArea((int) (-originX - 16) + tileMap.getXOffSet() + 15,
					(int) -originY + tileMap.getYOffSet() + 2 - 4, 224, 32);
		}
	}

	public void draw(java.awt.Graphics2D g) {

		g.drawImage(animation.getImage(), (int) (x + xmap - width / 2), (int) (y + ymap - height / 2), null);

	}

}