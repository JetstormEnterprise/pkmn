package Jetstorm.Enterprise.Entities.Items;

import java.awt.image.BufferedImage;
import java.util.Random;

import Jetstorm.Enterprise.Handlers.Font.FontLoader;

public class Items {

	public String name;
	public String effectText;
	public int numberOfItems;
	public int activeType;
	public int berryNumber;
	public BufferedImage itemImage;

	Random ran = new Random();

	public Items(String name) {

		this.name = name;
		numberOfItems = ran.nextInt(50);

	}

	public String getName() {

		return name;

	}

	public String getEffectText() {

		return effectText;

	}

	public int getNumberOfItems() {

		return numberOfItems;

	}

	public BufferedImage getImage() {

		return itemImage;

	}

	public BufferedImage[] getBerryText() {

		BufferedImage[] temp = null;
		BufferedImage[] temp2 = null;
		BufferedImage[] temp3 = null;
		BufferedImage[] temp4 = null;

		temp2 = FontLoader.getBattleTranslation("No");
		if (berryNumber < 10) {
			temp3 = FontLoader.getDarkTranslation("0" + Integer.toString(berryNumber));
		} else {
			temp3 = FontLoader.getDarkTranslation(Integer.toString(berryNumber));
		}

		temp4 = FontLoader.getDarkTranslation(" " + name);

		temp = new BufferedImage[temp2.length + temp3.length + temp4.length];

		for (int i = 0; i < temp.length; i++) {
			if (i < 2) {
				temp[i] = temp2[i];
			} else if (i >= 2 && i < 4) {
				temp[i] = temp3[i - 2];
			} else {
				temp[i] = temp4[i - 4];
			}
		}

		return temp;

	}

}
