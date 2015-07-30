package Jetstorm.Enterprise.Entities;

import java.awt.Graphics2D;

import Jetstorm.Enterprise.Handlers.ImageLoader;

public class TextBoxClass {

	private String type;
	private int x;
	private int y;
	private int width;
	private int height;

	public TextBoxClass(String textBoxType, int xLocal, int yLocal, int width, int height) {

		type = textBoxType;
		x = xLocal;
		y = yLocal;
		this.width = width;
		this.height = height;

	}

	public void setSize(int width, int height) {

		this.width = width;
		this.height = height;

	}

	public void draw(Graphics2D g) {

		if (type.equalsIgnoreCase("basic")) {
			g.drawImage(ImageLoader.BASICTEXTBOX1START, x, y, null);
			for (int i = 0; i < 10; i++) {
				g.drawImage(ImageLoader.BASICTEXTBOX1MIDDLE, 21 + (i * 20), y, null);
			}
			g.drawImage(ImageLoader.BASICTEXTBOX1END, 219, y, null);
		} else if (type.equalsIgnoreCase("textbox")) {
			g.drawImage(ImageLoader.getTextBoxArea(1), x, y, null);
			g.drawImage(ImageLoader.getTextBoxArea(3), x + width - 8, y, null);
			g.drawImage(ImageLoader.getTextBoxArea(5), x + width - 8, y + height - 8, null);
			g.drawImage(ImageLoader.getTextBoxArea(7), x, y + height - 8, null);
			for (int i = 0; i < (width / 8) - 2; i++) {
				g.drawImage(ImageLoader.getTextBoxArea(2), x + 8 + (i * 8), y, null);
				g.drawImage(ImageLoader.getTextBoxArea(6), x + 8 + (i * 8), y + height - 8, null);
			}
			for (int i = 0; i < (height / 8) - 2; i++) {
				g.drawImage(ImageLoader.getTextBoxArea(8), x, y + 8 + (i * 8), null);
				g.drawImage(ImageLoader.getTextBoxArea(4), x + width - 8, y + 8 + (i * 8), null);
			}
			for (int i = 0; i < (height / 8) - 2; i++) {
				for (int k = 0; k < (width / 8) - 2; k++) {
					g.drawImage(ImageLoader.getTextBoxArea(9), x + 8 + (k * 8), y + 8 + (i * 8), null);
				}
			}
		}

	}

}
