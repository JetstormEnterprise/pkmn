package Jetstorm.Enterprise.TileMap;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import Jetstorm.Enterprise.Main.WindowClass;

public class TileMap {

	// position
	private double x;
	private double y;
	private double tempX;
	private double tempY;
	private int count = 0;
	private int xOffSet;
	private int yOffSet;

	// bounds
	private int xmin;
	private int ymin;
	private int xmax;
	private int ymax;

	private double tween;

	// map
	private int[][] map;
	private int tileSize;
	private int numRows;
	private int numCols;
	private int width;
	private int height;

	// tileset
	private BufferedImage tileset;
	private int numTilesAcross;
	private Tile[][] tiles;

	// drawing
	private int rowOffset;
	private int colOffset;
	private int numRowsToDraw;
	private int numColsToDraw;

	// effects
	private boolean shaking;
	private int intensity;

	// alters
	private boolean moveDown;
	private boolean moveUp;
	private boolean moveRight;
	private boolean moveLeft;
	private ArrayList<Rectangle> blocks;

	public TileMap(int tileSize) {
		this.tileSize = tileSize;
		numRowsToDraw = WindowClass.HEIGHT / tileSize + 2;
		numColsToDraw = WindowClass.WIDTH / tileSize + 2;
		tween = 0.07;
		blocks = new ArrayList<Rectangle>();
	}

	public void loadTiles(String s) {

		try {

			tileset = ImageIO.read(getClass().getResourceAsStream(s));
			numTilesAcross = tileset.getWidth() / tileSize;
			tiles = new Tile[2][numTilesAcross];

			BufferedImage subimage;
			for (int col = 0; col < numTilesAcross; col++) {
				subimage = tileset.getSubimage(col * tileSize, 0, tileSize, tileSize);
				tiles[0][col] = new Tile(subimage, Tile.NORMAL);
				subimage = tileset.getSubimage(col * tileSize, tileSize, tileSize, tileSize);
				tiles[1][col] = new Tile(subimage, Tile.BLOCKED);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void loadMap(String s) {

		try {

			InputStream in = getClass().getResourceAsStream(s);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));

			numCols = Integer.parseInt(br.readLine());
			numRows = Integer.parseInt(br.readLine());
			map = new int[numRows][numCols];
			width = numCols * tileSize;
			height = numRows * tileSize;

			xmin = WindowClass.WIDTH - width;
			xmax = 0;
			ymin = WindowClass.HEIGHT - height;
			ymax = 0;

			String delims = "\\s+";
			for (int row = 0; row < numRows; row++) {
				String line = br.readLine();
				String[] tokens = line.split(delims);
				for (int col = 0; col < numCols; col++) {
					map[row][col] = Integer.parseInt(tokens[col]);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		int tempW = width / 16;
		int tempH = height / 16;

		createBlockedArea(0, -16, width, 16);
		createBlockedArea(-32, 0, 16, width);
		createBlockedArea(0, -16 * (tempH - 12), width, 16);
		createBlockedArea(-16 * (tempW - 17), 0, 16, height);

	}

	public int getTileSize() {
		return tileSize;
	}

	public double getx() {
		return x;
	}

	public double gety() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getNumRows() {
		return numRows;
	}

	public int getNumCols() {
		return numCols;
	}

	public int getXOffSet() {
		return xOffSet;
	}

	public int getYOffSet() {
		return yOffSet;
	}

	public int getType(int row, int col) {
		int rc = map[row][col];
		int r = rc / numTilesAcross;
		int c = rc % numTilesAcross;
		return tiles[r][c].getType();
	}

	public boolean isShaking() {
		return shaking;
	}

	public boolean hasMoved() {
		return tempX < x || tempX > x || tempY < y || tempY > y;
	}

	public boolean movedDirection(String direction) {
		if (direction.equalsIgnoreCase("right"))
			return moveRight;
		else if (direction.equalsIgnoreCase("left"))
			return moveLeft;
		else if (direction.equalsIgnoreCase("up"))
			return moveUp;
		else
			return moveDown;
	}

	public void setTween(double d) {
		tween = d;
	}

	public void setShaking(boolean b, int i) {
		shaking = b;
		intensity = i;
	}

	public void setBounds(int i1, int i2, int i3, int i4) {
		xmin = WindowClass.WIDTH - i1;
		ymin = WindowClass.WIDTH - i2;
		xmax = i3;
		ymax = i4;
	}

	public void setPosition(double x, double y) {

		xOffSet = (int) x;
		yOffSet = (int) y;

		this.x += (x - this.x) * tween;
		this.y += (y - this.y) * tween;

		fixBounds();

		colOffset = (int) -this.x / tileSize;
		rowOffset = (int) -this.y / tileSize;

	}

	public void setPosition(double x, double y, int dif) {

		this.x += (x - this.x) * dif;
		this.y += (y - this.y) * dif;

		colOffset = (int) -this.x / tileSize;
		rowOffset = (int) -this.y / tileSize;

	}

	public void createBlockedArea(int x, int y, int width, int height) {

		Rectangle rec = new Rectangle(x, y, width, height);
		blocks.add(rec);

	}

	/**
	 * Player is the direction change
	 * 
	 * @param change
	 *            - 1=Up, 2=Down, 3=Left, 4=Right
	 * @return
	 */
	public boolean checkCollisions(int change) {

		int tempChange = 0;
		for (int i = 0; i < blocks.size(); i++) {
			if (change == 1) {
				if (blocks.get(i).getY() == y + 2 + blocks.get(i).getHeight()
						&& blocks.get(i).getX() < x + blocks.get(i).getWidth() - 16
						&& blocks.get(i).getX() + blocks.get(i).getWidth() > x + blocks.get(i).getWidth() - 16) {
					tempChange++;
				}
			} else if (change == 2) {
				if (blocks.get(i).getY() == y - 14 && blocks.get(i).getX() < x + blocks.get(i).getWidth() - 16
						&& blocks.get(i).getX() + blocks.get(i).getWidth() > x + blocks.get(i).getWidth() - 16) {
					tempChange++;
				}
			} else if (change == 3) {
				if (blocks.get(i).getY() < y + blocks.get(i).getHeight()
						&& blocks.get(i).getY() + blocks.get(i).getHeight() > y + blocks.get(i).getHeight()
						&& blocks.get(i).getX() + (1 - blocks.get(i).getWidth()) == x) {
					tempChange++;
				}
			} else if (change == 4) {
				if (blocks.get(i).getY() < y + blocks.get(i).getHeight()
						&& blocks.get(i).getY() + blocks.get(i).getHeight() > y + blocks.get(i).getHeight()
						&& blocks.get(i).getX() + 17 == x) {
					tempChange++;
				}
			}
		}

		if (tempChange > 0)
			return true;
		else
			return false;
	}

	public void moveDown() {
		if (!checkCollisions(2)) {
			moveDown = true;
			y = y - 1; // 1
			colOffset = (int) -this.x / tileSize;
			rowOffset = (int) -this.y / tileSize;
		}
	}

	public void moveLeft() {
		if (!checkCollisions(3)) {
			moveLeft = true;
			x = x + 1;
			colOffset = (int) -this.x / tileSize;
			rowOffset = (int) -this.y / tileSize;
		}
	}

	public void moveRight() {
		if (!checkCollisions(4)) {
			moveRight = true;
			x = x - 1;
			colOffset = (int) -this.x / tileSize;
			rowOffset = (int) -this.y / tileSize;
		}
	}

	public void moveUp() {
		if (!checkCollisions(1)) {
			moveUp = true;
			y = y + 1;
			colOffset = (int) -this.x / tileSize;
			rowOffset = (int) -this.y / tileSize;
		}
	}

	public void fixBounds() {
		if (x < xmin)
			x = xmin;
		if (y < ymin)
			y = ymin;
		if (x > xmax)
			x = xmax;
		if (y > ymax)
			y = ymax;
	}

	public void update() {
		if (moveUp || moveDown || moveRight || moveLeft)
			moveUp = moveDown = moveRight = moveLeft = false;
		count++;
		if (count % 180 == 0) {
			tempX = x;
			tempY = y;
		}
		if (count > 540)
			count = 0;
		if (shaking) {
			this.x += Math.random() * intensity - intensity / 2;
			this.y += Math.random() * intensity - intensity / 2;
		}
	}

	public void draw(Graphics2D g) {

		for (int row = rowOffset; row < rowOffset + numRowsToDraw; row++) {

			if (row >= numRows)
				break;

			for (int col = colOffset; col < colOffset + numColsToDraw; col++) {

				if (col >= numCols)
					break;
				if (col < 0)
					col = 0;
				if (map[row][col] == 0)
					continue;

				int rc = map[row][col];
				int r = rc / numTilesAcross;
				int c = rc % numTilesAcross;

				g.drawImage(tiles[r][c].getImage(), (int) x + col * tileSize, (int) y + row * tileSize, null);

			}

		}

	}

}
