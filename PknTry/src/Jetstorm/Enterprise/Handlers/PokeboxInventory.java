package Jetstorm.Enterprise.Handlers;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

import Jetstorm.Enterprise.Entities.TextBoxClass;
import Jetstorm.Enterprise.Entities.Pokemon.Pokemon;
import Jetstorm.Enterprise.Handlers.Font.FontLoader;

public class PokeboxInventory {

	public static Random ran = new Random();

	public static Pokemon[][] pokemonInventory = new Pokemon[30][30];
	public static String[] boxName = { "BOX1", "BOX2", "BOX3", "BOX4", "BOX5", "BOX6", "BOX7", "BOX8", "BOX9", "BOX10",
			"BOX11", "BOX12", "BOX13", "BOX14", "BOX15", "BOX16", "BOX17", "BOX18", "BOX19", "BOX20", "BOX21", "BOX22",
			"BOX23", "BOX24", "BOX25", "BOX26", "BOX27", "BOX28", "BOX29", "BOX30" };
	public static int[] boxBackground = { ran.nextInt(95) + 1, ran.nextInt(95) + 1, ran.nextInt(95) + 1,
			ran.nextInt(95) + 1, ran.nextInt(95) + 1, ran.nextInt(95) + 1, ran.nextInt(95) + 1, ran.nextInt(95) + 1,
			ran.nextInt(95) + 1, ran.nextInt(95) + 1, ran.nextInt(95) + 1, ran.nextInt(95) + 1, ran.nextInt(95) + 1,
			ran.nextInt(95) + 1, ran.nextInt(95) + 1, ran.nextInt(95) + 1, ran.nextInt(95) + 1, ran.nextInt(95) + 1,
			ran.nextInt(95) + 1, ran.nextInt(95) + 1, ran.nextInt(95) + 1, ran.nextInt(95) + 1, ran.nextInt(95) + 1,
			ran.nextInt(95) + 1, ran.nextInt(95) + 1, ran.nextInt(95) + 1, ran.nextInt(95) + 1, ran.nextInt(95) + 1,
			ran.nextInt(95) + 1, ran.nextInt(95) + 1 };
	public static String[] bgList = { "Forest 1", "Forest 2", "Forest 3", "City 1", "City 2", "City 3", "Desert 1",
			"Desert 2", "Desert 3", "Savanna 1", "Savanna 2", "Savanna 3", "Crag 1", "Crag 2", "Crag 3", "Volcano 1",
			"Volcano 2", "Volcano 3", "Snow 1", "Snow 2", "Snow 3", "Cave 1", "Cave 2", "Cave 3", "Beach 1", "Beach 2",
			"Beach 3", "Seafloor 1", "Seafloor 2", "Seafloor 3", "River 1", "River 2", "River 3", "Sky 1", "Sky 2",
			"Sky 3", "Polka-Dot", "PokeCenter", "Machine", "Plain", "Stars",
			"PokeCenter", "Tiles", "Simple", "Polka-Dot", "PokeCenter", "Machine", "Simple", "Zigzagoon", "Screen",
			"Horizontal", "Diagonal", "Blocks", "Ribbon", "Pokemon Center", "Frame", "Symbol", "Circles", "Azumarill",
			"Pikachu", "Legendary", "Dusclops", "Ludicolo", "Whiscash", "Checks", "PokeCenter", "Machine", "Simple",
			"Space", "Backyard", "Nostalgic", "Torchic", "Trio", "PikaPika", "Legend", "Team Galactic", "Distortion",
			"Contest", "Nostalgic", "Croagunk", "Trio", "PikaPika", "Legend", "Team Galactic", "Heart", "Soul",
			"Big Brother", "Pokeathlon", "Trio", "Spiky Pika", "Kimono Girl", "Revival", "Reshiram", "Zekrom",
			"Team Plasma", "Munna", "Zoroark", "Musical", "Monochrome", "Team Plasma", "Black Kyurem", "White Kyurem",
			"Reshiram", "Kekrom", "Trio", "Groudon", "Kyogre", "Rayquaza", "Team Magma", "Team Aqua" };

	private static Animation bg = ImageLoader.getStorageBoxAnimaiton();
	private static Animation infoLight = ImageLoader.getStorageBoxInfoAnimation();
	private static Animation arrowFloat = ImageLoader.getStorageBoxArrowFloat();
	private static Animation arrowCarry = ImageLoader.getStorageBoxArrowCarry();
	private static Animation sideArrow = ImageLoader.getStorageSideArrow();

	private static Pokemon carryingPokemon = null;
	private static String[] textBoxText = {};
	private static TextBoxClass textBox = new TextBoxClass("textbox", 80, 128, 160, 32);
	private static String[] pokemonOptionsText = { "MOVE", "SUMMARY", "WITHDRAW", "MARK", "RELEASE", "CANCEL" };
	private static TextBoxClass pokemonOptionsBox = new TextBoxClass("textbox", 144, 16, 96, 112);
	private static String[] boxOptionsText = { "JUMP", "WALLPAPER", "NAME", "CANCEL" };
	private static TextBoxClass boxOptionsBox = new TextBoxClass("textbox", 136, 48, 104, 80);
	private static String[] yesNoText = { "Yes", "No" };
	private static TextBoxClass yesNoBox = new TextBoxClass("textbox", 184, 80, 56, 48);

	public static boolean currentPokemon = false;
	public static int currentPokemonSelect = 0;
	public static int currentPokemonboxY = 0;
	public static boolean openPokemon = false;
	public static boolean closePokemon = false;

	public static int currentOptionsSelect = 0;
	public static int staticOptionsSelect = 0;
	public static int boxJump = 0;
	public static boolean boxOptions = false;
	public static boolean jump = false;
	public static boolean wallpaper = false;
	public static boolean name = false;

	public static boolean pokeOptions = false;
	public static boolean move = false;
	public static boolean summary = false;
	public static boolean withdraw = false;
	public static boolean mark = false;
	public static boolean release = false;

	public static boolean carrying = false;
	public static boolean moveRight = false;
	public static boolean moveLeft = false;
	public static int boxX = 82;
	public static int otherX = 0;
	public static int currentXChoice = 0;
	public static int currentYChoice = 2;
	public static int currentBox = 0;

	public static void movePokemon(int boxPage, Pokemon pokemon) {

		if (currentYChoice >= 2) {
			pokemonInventory[currentBox][(currentYChoice - 1) * currentXChoice] = pokemon;
		}

	}

	public static void depositPokemon(Pokemon pokemon) {

		while (isBoxFull()) {

			currentBox += 1;

		}

		for (int i = 0; i < 30; i++) {
			if (pokemonInventory[currentBox][i] == null) {
				pokemonInventory[currentBox][i] = pokemon;
				return;
			}
		}

	}

	public static void depositPokemonHolding(Pokemon pokemon) {

	}

	public static boolean isBoxFull() {

		boolean temp = true;

		for (int i = 0; i < 30; i++) {
			if (pokemonInventory[currentBox][i] == null) {
				temp = false;
			}
		}

		return temp;

	}

	public static Pokemon getPokemon() {

		return pokemonInventory[currentBox][((currentYChoice - 2) * 6) + currentXChoice];

	}

	public static void moveLeft() {
		moveLeft = true;
		otherX = -90;
	}

	public static void moveRight() {
		moveRight = true;
		otherX = 256;
	}

	public static void openCurrentPokemon() {
		openPokemon = true;
		currentPokemonboxY = -160;
	}

	public static void closeCurrentPokemon() {
		closePokemon = true;
		currentPokemonboxY = 0;
	}

	public static boolean isLastPokemon() {

		boolean temp = false;

		for (int i = 0; i < ((currentYChoice - 2) * 6) + currentXChoice; i++) {
			if (pokemonInventory[currentBox][i] != null) {
				temp = true;
			}
		}

		return temp;

	}

	public static boolean isNextPokemon() {

		boolean temp = false;

		for (int i = 29; i > ((currentYChoice - 2) * 6) + currentXChoice; i--) {
			if (pokemonInventory[currentBox][i] != null) {
				temp = true;
			}
		}

		return temp;

	}

	public static void setLastPokemonPosition() {

		int temp = 0;
		boolean tempB = false;

		for (int i = (((currentYChoice - 2) * 6) + currentXChoice) - 1; i > 0; i--) {
			if (!tempB) {
				if (pokemonInventory[currentBox][i] != null) {
					temp = i;
					tempB = true;
				}
			}
		}

		if (temp < 6) {
			currentYChoice = 2;
			currentXChoice = temp;
		} else if (temp >= 6 && temp < 12) {
			currentYChoice = 3;
			currentXChoice = temp - 6;
		} else if (temp >= 12 && temp < 18) {
			currentYChoice = 4;
			currentXChoice = temp - 12;
		} else if (temp >= 18 && temp < 24) {
			currentYChoice = 5;
			currentXChoice = temp - 18;
		} else if (temp >= 24) {
			currentYChoice = 6;
			currentXChoice = temp - 24;
		}

	}

	public static void setNextPokemonPosition() {

		int temp = 0;
		boolean tempB = false;

		for (int i = (((currentYChoice - 2) * 6) + currentXChoice) + 1; i < 30; i++) {
			if (!tempB) {
				if (pokemonInventory[currentBox][i] != null) {
					temp = i;
					tempB = true;
				}
			}
		}

		if (temp < 6) {
			currentYChoice = 2;
			currentXChoice = temp;
		} else if (temp >= 6 && temp < 12) {
			currentYChoice = 3;
			currentXChoice = temp - 6;
		} else if (temp >= 12 && temp < 18) {
			currentYChoice = 4;
			currentXChoice = temp - 12;
		} else if (temp >= 18 && temp < 24) {
			currentYChoice = 5;
			currentXChoice = temp - 18;
		} else if (temp >= 24) {
			currentYChoice = 6;
			currentXChoice = temp - 24;
		}

	}

	public static void pickupPokemon() {

		if (!currentPokemon) {
			if (pokemonInventory[currentBox][((currentYChoice - 2) * 6) + currentXChoice] != null) {
				carryingPokemon = pokemonInventory[currentBox][((currentYChoice - 2) * 6) + currentXChoice];
				pokemonInventory[currentBox][((currentYChoice - 2) * 6) + currentXChoice] = null;
				carrying = true;
			}
		} else {
			if (PlayerBag.getPokemon(currentPokemonSelect) != null) {
				carryingPokemon = PlayerBag.getPokemon(currentPokemonSelect);
				PlayerBag.pokemon.remove(currentPokemonSelect);
				carrying = true;
			}
		}

	}

	public static void putdownPokemon() {

		if (!currentPokemon) {
			if (pokemonInventory[currentBox][((currentYChoice - 2) * 6) + currentXChoice] == null) {
				pokemonInventory[currentBox][((currentYChoice - 2) * 6) + currentXChoice] = carryingPokemon;
				carryingPokemon = null;
				carrying = false;
			} else {
				Pokemon temp = pokemonInventory[currentBox][((currentYChoice - 2) * 6) + currentXChoice];
				pokemonInventory[currentBox][((currentYChoice - 2) * 6) + currentXChoice] = carryingPokemon;
				carryingPokemon = temp;
			}
		} else {
			if (PlayerBag.getArraySize() <= currentPokemonSelect) {
				PlayerBag.pokemon.add(carryingPokemon);
				carryingPokemon = null;
				carrying = false;
			} else {
				Pokemon tempP = carryingPokemon;
				carryingPokemon = PlayerBag.pokemon.get(currentPokemonSelect);
				ArrayList<Pokemon> temp = new ArrayList<Pokemon>();
				for (int i = 0; i < PlayerBag.getArraySize(); i++) {
					temp.add(PlayerBag.getPokemon(i));
				}
				int tempI = PlayerBag.getArraySize() - currentPokemonSelect;
				for (int i = PlayerBag.getArraySize() - 1; i > currentPokemonSelect - 1; i--) {
					PlayerBag.pokemon.remove(i);
				}
				PlayerBag.pokemon.add(tempP);
				for (int i = currentPokemonSelect + 1; i < currentPokemonSelect + tempI; i++) {
					PlayerBag.pokemon.add(temp.get(i));
				}
			}
		}

	}

	public static void update() {

		for (int i = 0; i < 30; i++) {
			for (int k = 0; k < 30; k++) {
				if (pokemonInventory[i][k] != null) {
					pokemonInventory[i][k].update();
				}
			}
		}

		if (!jump) {
			boxJump = currentBox;
		}

		if (moveLeft) {
			if (otherX < 82) {
				boxX += 4;
				otherX += 4;
			} else {
				boxX = 82;
				moveLeft = false;
				if (currentBox == 0) {
					currentBox = 29;
				} else {
					currentBox--;
				}
			}
		} else if (moveRight) {
			if (otherX > 82) {
				boxX -= 4;
				otherX -= 4;
			} else {
				boxX = 82;
				moveRight = false;
				if (currentBox == 29) {
					currentBox = 0;
				} else {
					currentBox++;
				}
			}
		}

		if (openPokemon) {
			if (currentPokemonboxY < 0) {
				currentPokemonboxY += 4;
			} else {
				openPokemon = false;
				currentPokemon = true;
			}
		} else if (closePokemon) {
			if (currentPokemonboxY > -160) {
				currentPokemonboxY -= 4;
			} else {
				closePokemon = false;
				currentPokemon = false;
			}
		}

		bg.update();
		infoLight.update();
		arrowFloat.update();
		arrowCarry.update();

		if (carrying) {
			carryingPokemon.update();
		}

		if (currentYChoice == 1) {
			sideArrow.update();
		} else {
			sideArrow.setFrame(0);
		}

	}

	public static void draw(Graphics2D g) {

		g.drawImage(bg.getImage(), 0, 0, null);

		if (!moveLeft && !moveRight) {
			g.drawImage(ImageLoader.getStorageBoxImage(boxBackground[currentBox]), 82, 17, null);
		} else if (moveRight && !moveLeft) {
			g.drawImage(ImageLoader.getStorageBoxImage(boxBackground[currentBox]), boxX, 17, null);
			if (currentBox == 29) {
				g.drawImage(ImageLoader.getStorageBoxImage(boxBackground[0]), otherX, 17, null);
			} else {
				g.drawImage(ImageLoader.getStorageBoxImage(boxBackground[currentBox + 1]), otherX, 17, null);
			}
		} else if (moveLeft && !moveRight) {
			g.drawImage(ImageLoader.getStorageBoxImage(boxBackground[currentBox]), boxX, 17, null);
			if (currentBox == 0) {
				g.drawImage(ImageLoader.getStorageBoxImage(boxBackground[29]), otherX, 17, null);
			} else {
				g.drawImage(ImageLoader.getStorageBoxImage(boxBackground[currentBox - 1]), otherX, 17, null);
			}
		}

		g.drawImage(ImageLoader.STORAGEBOXPARTY, 82, 0, null);
		g.drawImage(ImageLoader.STORAGEBOXCLOSE, 155, 0, null);

		if (currentYChoice >= 2) {
			g.drawImage(ImageLoader.STORAGEBOXSHADOW, 92 + (currentXChoice * 25), 49 + ((currentYChoice - 2) * 24),
					null);
		}

		if (!moveLeft && !moveRight) {
			for (int i = 0; i < 30; i++) {
				if (pokemonInventory[currentBox][i] != null) {
					if (i <= 5) {
						g.drawImage(pokemonInventory[currentBox][i].getIconAnimation().getImage(), 84 + (i * 24), 28,
								null);
					} else if (i > 5 && i <= 11) {
						g.drawImage(pokemonInventory[currentBox][i].getIconAnimation().getImage(), 84 + ((i - 6) * 24),
								52, null);
					} else if (i > 11 && i <= 17) {
						g.drawImage(pokemonInventory[currentBox][i].getIconAnimation().getImage(),
								84 + ((i - 12) * 24), 76, null);
					} else if (i > 17 && i <= 23) {
						g.drawImage(pokemonInventory[currentBox][i].getIconAnimation().getImage(),
								84 + ((i - 18) * 24), 100, null);
					} else if (i > 23 && i <= 29) {
						g.drawImage(pokemonInventory[currentBox][i].getIconAnimation().getImage(),
								84 + ((i - 24) * 24), 124, null);
					}
				}
			}
		} else if (moveRight && !moveLeft) {
			for (int i = 0; i < 30; i++) {
				if (pokemonInventory[currentBox][i] != null) {
					if (i <= 5) {
						g.drawImage(pokemonInventory[currentBox][i].getIconAnimation().getImage(), boxX + 2 + (i * 24),
								28, null);
					} else if (i > 5 && i <= 11) {
						g.drawImage(pokemonInventory[currentBox][i].getIconAnimation().getImage(), boxX + 2
								+ ((i - 6) * 24), 52, null);
					} else if (i > 11 && i <= 17) {
						g.drawImage(pokemonInventory[currentBox][i].getIconAnimation().getImage(), boxX + 2
								+ ((i - 12) * 24), 76, null);
					} else if (i > 17 && i <= 23) {
						g.drawImage(pokemonInventory[currentBox][i].getIconAnimation().getImage(), boxX + 2
								+ ((i - 18) * 24), 100, null);
					} else if (i > 23 && i <= 29) {
						g.drawImage(pokemonInventory[currentBox][i].getIconAnimation().getImage(), boxX + 2
								+ ((i - 24) * 24), 124, null);
					}
				}
			}
			int temp = 0;
			if (currentBox == 29) {
				temp = 0;
			} else {
				temp = currentBox + 1;
			}
			for (int i = 0; i < 30; i++) {
				if (pokemonInventory[temp][i] != null) {
					if (i <= 5) {
						g.drawImage(pokemonInventory[temp][i].getIconAnimation().getImage(), otherX + 2 + (i * 24), 28,
								null);
					} else if (i > 5 && i <= 11) {
						g.drawImage(pokemonInventory[temp][i].getIconAnimation().getImage(), otherX + 2
								+ ((i - 6) * 24), 52, null);
					} else if (i > 11 && i <= 17) {
						g.drawImage(pokemonInventory[temp][i].getIconAnimation().getImage(), otherX + 2
								+ ((i - 12) * 24), 76, null);
					} else if (i > 17 && i <= 23) {
						g.drawImage(pokemonInventory[temp][i].getIconAnimation().getImage(), otherX + 2
								+ ((i - 18) * 24), 100, null);
					} else if (i > 23 && i <= 29) {
						g.drawImage(pokemonInventory[temp][i].getIconAnimation().getImage(), otherX + 2
								+ ((i - 24) * 24), 124, null);
					}
				}
			}
		} else if (moveLeft && !moveRight) {
			for (int i = 0; i < 30; i++) {
				if (pokemonInventory[currentBox][i] != null) {
					if (i <= 5) {
						g.drawImage(pokemonInventory[currentBox][i].getIconAnimation().getImage(), boxX + 2 + (i * 24),
								28, null);
					} else if (i > 5 && i <= 11) {
						g.drawImage(pokemonInventory[currentBox][i].getIconAnimation().getImage(), boxX + 2
								+ ((i - 6) * 24), 52, null);
					} else if (i > 11 && i <= 17) {
						g.drawImage(pokemonInventory[currentBox][i].getIconAnimation().getImage(), boxX + 2
								+ ((i - 12) * 24), 76, null);
					} else if (i > 17 && i <= 23) {
						g.drawImage(pokemonInventory[currentBox][i].getIconAnimation().getImage(), boxX + 2
								+ ((i - 18) * 24), 100, null);
					} else if (i > 23 && i <= 29) {
						g.drawImage(pokemonInventory[currentBox][i].getIconAnimation().getImage(), boxX + 2
								+ ((i - 24) * 24), 124, null);
					}
				}
			}
			int temp = 0;
			if (currentBox == 0) {
				temp = 29;
			} else {
				temp = currentBox - 1;
			}
			for (int i = 0; i < 30; i++) {
				if (pokemonInventory[temp][i] != null) {
					if (i <= 5) {
						g.drawImage(pokemonInventory[temp][i].getIconAnimation().getImage(), otherX + 2 + (i * 24), 28,
								null);
					} else if (i > 5 && i <= 11) {
						g.drawImage(pokemonInventory[temp][i].getIconAnimation().getImage(), otherX + 2
								+ ((i - 6) * 24), 52, null);
					} else if (i > 11 && i <= 17) {
						g.drawImage(pokemonInventory[temp][i].getIconAnimation().getImage(), otherX + 2
								+ ((i - 12) * 24), 76, null);
					} else if (i > 17 && i <= 23) {
						g.drawImage(pokemonInventory[temp][i].getIconAnimation().getImage(), otherX + 2
								+ ((i - 18) * 24), 100, null);
					} else if (i > 23 && i <= 29) {
						g.drawImage(pokemonInventory[temp][i].getIconAnimation().getImage(), otherX + 2
								+ ((i - 24) * 24), 124, null);
					}
				}
			}
		}

		BufferedImage[] text = FontLoader.getLightTranslation(boxName[currentBox]);

		if (moveRight) {
			BufferedImage[] text2 = null;
			if (currentBox == 29) {
				text2 = FontLoader.getLightTranslation(boxName[0]);
			} else {
				text2 = FontLoader.getLightTranslation(boxName[currentBox + 1]);
			}
			for (int i = 0; i < text2.length; i++) {
				g.drawImage(text2[i], otherX + 64 + (i * 6), 22, null);
			}
		} else if (moveLeft) {
			BufferedImage[] text2 = null;
			if (currentBox == 0) {
				text2 = FontLoader.getLightTranslation(boxName[29]);
			} else {
				text2 = FontLoader.getLightTranslation(boxName[currentBox - 1]);
			}
			for (int i = 0; i < text2.length; i++) {
				g.drawImage(text2[i], otherX + 64 + (i * 6), 22, null);
			}
		}

		for (int i = 0; i < text.length; i++) {
			g.drawImage(text[i], boxX + 64 + (i * 6), 22, null);
		}

		if (!moveRight && !moveLeft) {
			g.drawImage(sideArrow.getImage(), 80, 20, null);
			g.drawImage(sideArrow.getImage(), 240, 20, -16, 16, null);
		} else if (moveRight || moveLeft) {
			g.drawImage(sideArrow.getImage(), boxX - 2, 20, null);
			g.drawImage(sideArrow.getImage(), boxX + 158, 20, -16, 16, null);
			g.drawImage(sideArrow.getImage(), otherX - 2, 20, null);
			g.drawImage(sideArrow.getImage(), otherX + 158, 20, -16, 16, null);
		}

		if (openPokemon) {

			g.drawImage(ImageLoader.STORAGEBOXCURRENTPOKEMON, 82, currentPokemonboxY, null);

			for (int i = 0; i < PlayerBag.getArraySize(); i++) {
				if (i == 0) {
					g.drawImage(ImageLoader.STORAGEBOXPOKEMONICONBG, 89, currentPokemonboxY + 56, null);
					g.drawImage(PlayerBag.getPokemon(0).getIconAnimation().getImage(), 87, currentPokemonboxY + 48,
							null);
				} else {
					g.drawImage(ImageLoader.STORAGEBOXPOKEMONICONBG, 137, currentPokemonboxY + 8 + ((i - 1) * 24), null);
					g.drawImage(PlayerBag.getPokemon(i).getIconAnimation().getImage(), 135, currentPokemonboxY + 0
							+ ((i - 1) * 24), null);
				}
			}

		}

		if (currentPokemon) {

			g.drawImage(ImageLoader.STORAGEBOXCURRENTPOKEMON, 82, currentPokemonboxY, null);

			for (int i = 0; i < PlayerBag.getArraySize(); i++) {
				if (i == 0) {
					g.drawImage(ImageLoader.STORAGEBOXPOKEMONICONBG, 89, currentPokemonboxY + 56, null);
					g.drawImage(PlayerBag.getPokemon(0).getIconAnimation().getImage(), 87, currentPokemonboxY + 48,
							null);
				} else {
					g.drawImage(ImageLoader.STORAGEBOXPOKEMONICONBG, 137, currentPokemonboxY + 8 + ((i - 1) * 24), null);
					g.drawImage(PlayerBag.getPokemon(i).getIconAnimation().getImage(), 135, currentPokemonboxY + 0
							+ ((i - 1) * 24), null);
				}
			}

			if (!carrying) {

				if (currentPokemonSelect == 0) {

					g.drawImage(infoLight.getImage(), 0, 2, null);

					g.drawImage(PlayerBag.getPokemon(currentPokemonSelect).getFrontAnimation().getImage(), 0, 5, null);

					BufferedImage[] nickName = FontLoader.getLightTranslation(PlayerBag
							.getPokemon(currentPokemonSelect).getNickName());
					BufferedImage[] species = FontLoader.getLightTranslation("/"
							+ PlayerBag.getPokemon(currentPokemonSelect).getSpecies());
					BufferedImage[] level = FontLoader.getLightTranslation("Lv"
							+ PlayerBag.getPokemon(currentPokemonSelect).getLevel());
					if (PlayerBag.getPokemon(currentPokemonSelect).getGender() == 0) {
						BufferedImage[] gender = FontLoader.getBlueTranslation("<");
						g.drawImage(gender[0], 12, 122, null);
					} else {
						BufferedImage[] gender = FontLoader.getRedTranslation(">");
						g.drawImage(gender[0], 12, 122, null);
					}

					for (int i = 0; i < nickName.length; i++) {
						g.drawImage(nickName[i], 10 + (i * 6), 94, null);
					}
					for (int i = 0; i < species.length; i++) {
						g.drawImage(species[i], 10 + (i * 6), 108, null);
					}
					for (int i = 0; i < level.length; i++) {
						g.drawImage(level[i], 20 + (i * 6), 123, null);
					}

				} else if (currentPokemonSelect < PlayerBag.getArraySize()) {

					g.drawImage(infoLight.getImage(), 0, 2, null);

					g.drawImage(PlayerBag.getPokemon(currentPokemonSelect).getFrontAnimation().getImage(), 0, 5, null);

					BufferedImage[] nickName = FontLoader.getLightTranslation(PlayerBag
							.getPokemon(currentPokemonSelect).getNickName());
					BufferedImage[] species = FontLoader.getLightTranslation("/"
							+ PlayerBag.getPokemon(currentPokemonSelect).getSpecies());
					BufferedImage[] level = FontLoader.getLightTranslation("Lv"
							+ PlayerBag.getPokemon(currentPokemonSelect).getLevel());
					if (PlayerBag.getPokemon(currentPokemonSelect).getGender() == 0) {
						BufferedImage[] gender = FontLoader.getBlueTranslation("<");
						g.drawImage(gender[0], 12, 122, null);
					} else {
						BufferedImage[] gender = FontLoader.getRedTranslation(">");
						g.drawImage(gender[0], 12, 122, null);
					}

					for (int i = 0; i < nickName.length; i++) {
						g.drawImage(nickName[i], 10 + (i * 6), 94, null);
					}
					for (int i = 0; i < species.length; i++) {
						g.drawImage(species[i], 10 + (i * 6), 108, null);
					}
					for (int i = 0; i < level.length; i++) {
						g.drawImage(level[i], 20 + (i * 6), 123, null);
					}

				} else {
					g.drawImage(ImageLoader.STORAGEBOXDARK, 0, 2, null);
				}
			} else {

				g.drawImage(infoLight.getImage(), 0, 2, null);

				g.drawImage(carryingPokemon.getFrontAnimation().getImage(), 0, 5, null);

				BufferedImage[] nickName = FontLoader.getLightTranslation(carryingPokemon.getNickName());
				BufferedImage[] species = FontLoader.getLightTranslation("/" + carryingPokemon.getSpecies());
				BufferedImage[] level = FontLoader.getLightTranslation("Lv" + carryingPokemon.getLevel());
				if (carryingPokemon.getGender() == 0) {
					BufferedImage[] gender = FontLoader.getBlueTranslation("<");
					g.drawImage(gender[0], 12, 122, null);
				} else {
					BufferedImage[] gender = FontLoader.getRedTranslation(">");
					g.drawImage(gender[0], 12, 122, null);
				}

				for (int i = 0; i < nickName.length; i++) {
					g.drawImage(nickName[i], 10 + (i * 6), 94, null);
				}
				for (int i = 0; i < species.length; i++) {
					g.drawImage(species[i], 10 + (i * 6), 108, null);
				}
				for (int i = 0; i < level.length; i++) {
					g.drawImage(level[i], 20 + (i * 6), 123, null);
				}

			}
		}

		if (!currentPokemon) {
			if (!carrying) {
				if (currentYChoice >= 2) {
					if (pokemonInventory[currentBox][((currentYChoice - 2) * 6) + currentXChoice] != null) {
						g.drawImage(infoLight.getImage(), 0, 2, null);
					} else {
						g.drawImage(ImageLoader.STORAGEBOXDARK, 0, 2, null);
					}
				} else {
					g.drawImage(ImageLoader.STORAGEBOXDARK, 0, 2, null);
				}

				if (currentYChoice >= 2) {
					if (pokemonInventory[currentBox][((currentYChoice - 2) * 6) + currentXChoice] != null) {
						g.drawImage(pokemonInventory[currentBox][((currentYChoice - 2) * 6) + currentXChoice]
								.getFrontAnimation().getImage(), 0, 5, null);
					}
				}

				if (currentYChoice >= 2) {
					if (pokemonInventory[currentBox][((currentYChoice - 2) * 6) + currentXChoice] != null) {
						BufferedImage[] nickName = FontLoader
								.getLightTranslation(pokemonInventory[currentBox][((currentYChoice - 2) * 6)
										+ currentXChoice].getNickName());
						BufferedImage[] species = FontLoader.getLightTranslation("/"
								+ pokemonInventory[currentBox][((currentYChoice - 2) * 6) + currentXChoice]
										.getSpecies());
						BufferedImage[] level = FontLoader.getLightTranslation("Lv"
								+ pokemonInventory[currentBox][((currentYChoice - 2) * 6) + currentXChoice].getLevel());
						if (pokemonInventory[currentBox][((currentYChoice - 2) * 6) + currentXChoice].getGender() == 0) {
							BufferedImage[] gender = FontLoader.getBlueTranslation("<");
							g.drawImage(gender[0], 12, 122, null);
						} else {
							BufferedImage[] gender = FontLoader.getRedTranslation(">");
							g.drawImage(gender[0], 12, 122, null);
						}

						for (int i = 0; i < nickName.length; i++) {
							g.drawImage(nickName[i], 10 + (i * 6), 94, null);
						}
						for (int i = 0; i < species.length; i++) {
							g.drawImage(species[i], 10 + (i * 6), 108, null);
						}
						for (int i = 0; i < level.length; i++) {
							g.drawImage(level[i], 20 + (i * 6), 123, null);
						}
					}
					g.drawImage(arrowFloat.getImage(), 83 + (currentXChoice * 25), 15 + ((currentYChoice - 2) * 24),
							null); // 33
				} else if (currentYChoice == 1) {
					g.drawImage(arrowFloat.getImage(), 145, 0, null);
				} else if (currentYChoice == 0) {
					g.drawImage(arrowFloat.getImage(), 104 + (currentXChoice * 50), 37, 32, -32, null);
				}

			} else if (carrying) {

				g.drawImage(infoLight.getImage(), 0, 2, null);

				arrowCarry.setFrame(1);
				if (currentYChoice >= 2) {
					g.drawImage(carryingPokemon.getIconAnimation().getImage(), 83 + (currentXChoice * 25),
							17 + ((currentYChoice - 2) * 24), null);
					g.drawImage(arrowCarry.getImage(), 83 + (currentXChoice * 25), 15 + ((currentYChoice - 2) * 24),
							null);
				} else if (currentYChoice == 1) {
					g.drawImage(carryingPokemon.getIconAnimation().getImage(), 145, 2, null);
					g.drawImage(arrowCarry.getImage(), 145, 0, null);
				} else if (currentYChoice == 0) {
					g.drawImage(carryingPokemon.getIconAnimation().getImage(), 104 + (currentXChoice * 50), -2, null);
					g.drawImage(arrowCarry.getImage(), 104 + (currentXChoice * 50), -3, null);
				}

				g.drawImage(carryingPokemon.getFrontAnimation().getImage(), 0, 5, null);

				BufferedImage[] nickName = FontLoader.getLightTranslation(carryingPokemon.getNickName());
				BufferedImage[] species = FontLoader.getLightTranslation("/" + carryingPokemon.getSpecies());
				BufferedImage[] level = FontLoader.getLightTranslation("Lv" + carryingPokemon.getLevel());
				if (carryingPokemon.getGender() == 0) {
					BufferedImage[] gender = FontLoader.getBlueTranslation("<");
					g.drawImage(gender[0], 12, 122, null);
				} else {
					BufferedImage[] gender = FontLoader.getRedTranslation(">");
					g.drawImage(gender[0], 12, 122, null);
				}

				for (int i = 0; i < nickName.length; i++) {
					g.drawImage(nickName[i], 10 + (i * 6), 94, null);
				}
				for (int i = 0; i < species.length; i++) {
					g.drawImage(species[i], 10 + (i * 6), 108, null);
				}
				for (int i = 0; i < level.length; i++) {
					g.drawImage(level[i], 20 + (i * 6), 123, null);
				}

			}
		} else {

			if (!carrying) {

				if (currentPokemonSelect == 0) {

					g.drawImage(arrowFloat.getImage(), 88, 37, null);

				} else if (currentPokemonSelect < PlayerBag.getArraySize()) {

					g.drawImage(arrowFloat.getImage(), 136, -13 + ((currentPokemonSelect - 1) * 24), null);

				} else if (currentPokemonSelect == PlayerBag.getArraySize()) {

					g.drawImage(arrowFloat.getImage(), 136, 116, null);

				}

			} else {

				arrowCarry.setFrame(1);
				if (currentPokemonSelect == 0) {

					g.drawImage(carryingPokemon.getIconAnimation().getImage(), 88, 39, null);
					g.drawImage(arrowCarry.getImage(), 88, 37, null);

				} else if (currentPokemonSelect < 6) {

					g.drawImage(carryingPokemon.getIconAnimation().getImage(), 136, -11
							+ ((currentPokemonSelect - 1) * 24), null);
					g.drawImage(arrowCarry.getImage(), 136, -13 + ((currentPokemonSelect - 1) * 24), null);

				} else if (currentPokemonSelect == 6) {

					g.drawImage(carryingPokemon.getIconAnimation().getImage(), 136, 118, null);
					g.drawImage(arrowCarry.getImage(), 136, 116, null);

				}

			}

		}

		if (boxOptions) {

			textBox.draw(g);
			boxOptionsBox.draw(g);

			for (int i = 0; i < boxOptionsText.length; i++) {
				BufferedImage[] temp = FontLoader.getDarkTranslation(boxOptionsText[i]); // 136,
																							// 48
				for (int k = 0; k < temp.length; k++) {
					g.drawImage(temp[k], 152 + (k * 6), 60 + (i * 16), null);
				}
			}

			g.drawImage(ImageLoader.BATTLESELECTIONARROW, 145, 60 + (currentOptionsSelect * 16), null);

		}

		if (pokeOptions) {

			textBox.draw(g);
			pokemonOptionsBox.draw(g);

			for (int i = 0; i < pokemonOptionsText.length; i++) {
				BufferedImage[] temp = FontLoader.getDarkTranslation(pokemonOptionsText[i]);

				for (int k = 0; k < temp.length; k++) {
					g.drawImage(temp[k], 160 + (k * 6), 28 + (i * 16), null);
				}

			}

			g.drawImage(ImageLoader.BATTLESELECTIONARROW, 153, 28 + (currentOptionsSelect * 16), null);

		}

		if (wallpaper) {

			textBox.draw(g);
			boxOptionsBox.draw(g);

			BufferedImage[] temp1 = null;
			BufferedImage[] temp2 = null;
			BufferedImage[] temp3 = null;
			BufferedImage[] temp4 = null;
			if (staticOptionsSelect == 0) {
				temp1 = FontLoader.getDarkTranslation(bgList[currentOptionsSelect]);
				temp2 = FontLoader.getDarkTranslation(bgList[currentOptionsSelect + 1]);
				temp3 = FontLoader.getDarkTranslation(bgList[currentOptionsSelect + 2]);
				temp4 = FontLoader.getDarkTranslation(bgList[currentOptionsSelect + 3]);
			} else if (staticOptionsSelect == 1) {
				temp1 = FontLoader.getDarkTranslation(bgList[currentOptionsSelect - 1]);
				temp2 = FontLoader.getDarkTranslation(bgList[currentOptionsSelect]);
				temp3 = FontLoader.getDarkTranslation(bgList[currentOptionsSelect + 1]);
				temp4 = FontLoader.getDarkTranslation(bgList[currentOptionsSelect + 2]);
			} else if (staticOptionsSelect == 2) {
				temp1 = FontLoader.getDarkTranslation(bgList[currentOptionsSelect - 2]);
				temp2 = FontLoader.getDarkTranslation(bgList[currentOptionsSelect - 1]);
				temp3 = FontLoader.getDarkTranslation(bgList[currentOptionsSelect]);
				temp4 = FontLoader.getDarkTranslation(bgList[currentOptionsSelect + 1]);
			} else if (staticOptionsSelect == 3) {
				temp1 = FontLoader.getDarkTranslation(bgList[currentOptionsSelect - 3]);
				temp2 = FontLoader.getDarkTranslation(bgList[currentOptionsSelect - 2]);
				temp3 = FontLoader.getDarkTranslation(bgList[currentOptionsSelect - 1]);
				temp4 = FontLoader.getDarkTranslation(bgList[currentOptionsSelect]);
			}
			for (int i = 0; i < temp1.length; i++) {
				g.drawImage(temp1[i], 152 + (i * 6), 60, null);
			}
			for (int i = 0; i < temp2.length; i++) {
				g.drawImage(temp2[i], 152 + (i * 6), 76, null);
			}
			for (int i = 0; i < temp3.length; i++) {
				g.drawImage(temp3[i], 152 + (i * 6), 92, null);
			}
			for (int i = 0; i < temp4.length; i++) {
				g.drawImage(temp4[i], 152 + (i * 6), 108, null);
			}
			g.drawImage(ImageLoader.BATTLESELECTIONARROW, 145, 60 + (staticOptionsSelect * 16), null);

		}

		if (jump) {

			textBox.draw(g);

			g.drawImage(ImageLoader.STORAGEBOXJUMPBG, 120, 64, null);
			g.drawImage(sideArrow.getImage(), 112, 80, null);
			g.drawImage(sideArrow.getImage(), 208, 80, -16, 16, null);

			BufferedImage[] temp = FontLoader.getDarkTranslation(boxName[boxJump]);

			for (int i = 0; i < temp.length; i++) {
				g.drawImage(temp[i], (160 - ((temp.length / 2) * 6)) + (i * 6), 76, null);
			}
			int tempcount = 0;
			for (int i = 0; i < 30; i++) {
				if (pokemonInventory[boxJump][i] != null) {
					tempcount += 1;
				}
			}
			BufferedImage[] current = FontLoader.getDarkTranslation(Integer.toString(tempcount));
			BufferedImage[] tempS = FontLoader.getDarkTranslation("/");
			BufferedImage[] max = FontLoader.getDarkTranslation("30");

			for (int i = 0; i < current.length; i++) {
				g.drawImage(current[i], (157 - (current.length * 6)) + (i * 6), 92, null);
			}
			g.drawImage(tempS[0], 157, 92, null);
			for (int i = 0; i < max.length; i++) {
				g.drawImage(max[i], 163 + (i * 6), 92, null);
			}

		}

	}

}
