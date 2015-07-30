package Jetstorm.Enterprise.Handlers.Dialouge;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import Jetstorm.Enterprise.Entities.TextBoxClass;
import Jetstorm.Enterprise.Handlers.Keys;
import Jetstorm.Enterprise.Handlers.Font.FontLoader;

public class Dialouge {

	public static String person;
	public static String line1, line2;
	public static boolean show;
	public static int currentSpot, maxSpot;
	public static BufferedImage[] top, bot;

	public Dialouge() {

	}

	public static void showBox(String Person, int conversation) {

		show = true;
		person = Person;
		if (person.equalsIgnoreCase("NurseJoy")) {
			NurseJoyDialouge.conversation = conversation;
			NurseJoyDialouge.currentSpot = 0;
			line1 = NurseJoyDialouge.getLine1();
			line2 = NurseJoyDialouge.getLine2();
			currentSpot = NurseJoyDialouge.currentSpot;
			maxSpot = NurseJoyDialouge.getMaxSpot();
			top = FontLoader.getDarkTranslation(line1);
			bot = FontLoader.getDarkTranslation(line2);
		}

	}

	public static void update() {

		if (show) {
			if (person.equalsIgnoreCase("NurseJoy")) {
				NurseJoyDialouge.currentSpot = currentSpot;
				line1 = NurseJoyDialouge.getLine1();
				line2 = NurseJoyDialouge.getLine2();
			}

		}

	}

	public static void draw(Graphics2D g) {

		if (show) {
			TextBoxClass temp = new TextBoxClass("textbox", 0, 112, 240, 48);
			temp.draw(g);
			for (int i = 0; i < top.length; i++) {
				g.drawImage(top[i], 10 + (6 * i), 120, null);
			}
			for (int i = 0; i < bot.length; i++) {
				g.drawImage(bot[i], 10 + (6 * i), 140, null);
			}
		}

	}

	public static void handleInput() {

		if (show) {
			if (Keys.isPressed(Keys.PLAYER_A)) {
				System.out.println("WEFWEFWF");
				if (currentSpot < maxSpot) {
					top = FontLoader.getDarkTranslation(line1);
					bot = FontLoader.getDarkTranslation(line2);
					currentSpot = currentSpot + 1;
				} else if (currentSpot >= maxSpot) {
					show = false;
				}
			}
		}

	}

}
