package Jetstorm.Enterprise.Entities.Items.Berries;

import java.awt.image.BufferedImage;

import Jetstorm.Enterprise.Entities.Items.Items;
import Jetstorm.Enterprise.Handlers.ImageLoader;
import Jetstorm.Enterprise.Handlers.Font.FontLoader;

public class Berries extends Items {

	public Berries(String name, int berry) {
		super(name);
		berryNumber = berry;
		itemImage = ImageLoader.getBerry(berry);
	}

	public BufferedImage[] getBerryText() {

		BufferedImage[] temp = null;
		BufferedImage[] temp2 = null;
		BufferedImage[] temp3 = null;
		BufferedImage[] temp4 = null;

		temp2 = FontLoader.getBattleTranslation("No");
		if (berryNumber < 10) {
			temp3 = FontLoader.getBattleTranslation("0" + Integer.toString(berryNumber));
		} else {
			temp3 = FontLoader.getBattleTranslation(Integer.toString(berryNumber));
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
