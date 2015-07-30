package Jetstorm.Enterprise.Handlers;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class ImageLoader {

	public static BufferedImage DRAGONINTRO = load("/backgrounds/redDragon.gif");
	// public static BufferedImage PLAYER = load("/entities/player.jpg");
	public static BufferedImage INTROTEXTSCREEN = load("/backgrounds/introtextscreen.png");
	public static BufferedImage INTROTALKINGSCREENPROF = load("/backgrounds/introtalkingscreenprof.png");
	public static BufferedImage INTROTALKINGSCREENPROFOAK = load("/backgrounds/profoak.png");
	public static BufferedImage POKEMONTITLE = load("/backgrounds/pkmtitle.png");
	public static BufferedImage STARTTEXT = load("/backgrounds/starttext.png");
	public static BufferedImage TITLESCREEN = load("/backgrounds/titlescreen.png");
	public static BufferedImage TITLECHARIZARD = load("/backgrounds/titlecharizard.png");
	public static BufferedImage BATTLEBGGRASS = load("/backgrounds/battlebggrass.png");
	public static BufferedImage BATTLEMOVESBOX = load("/backgrounds/battlemovesbox.png");
	public static BufferedImage BATTLEOPTIONSBOX = load("/backgrounds/battleoptionsbox.png");
	public static BufferedImage BATTLETEXTBOX = load("/backgrounds/battletextbox.png");
	public static BufferedImage BATTLEMYPOKEMONSTATS = load("/backgrounds/battlemypokemonstats.png");
	public static BufferedImage BATTLEENEMYPOKEMONSTATS = load("/backgrounds/battleenemypokemonstats.png");
	public static BufferedImage BATTLESELECTIONARROW = load("/backgrounds/battleselectionarrow.png");
	public static BufferedImage POKEMONHEALTHBARGREEN = loadChunk("/backgrounds/battlehealthbars.png", 1, 3, 0, 0);
	public static BufferedImage POKEMONHEALTHBARYELLOW = loadChunk("/backgrounds/battlehealthbars.png", 1, 3, 0, 4);
	public static BufferedImage POKEMONHEALTHBARRED = loadChunk("/backgrounds/battlehealthbars.png", 1, 3, 0, 8);
	public static BufferedImage POKEMONHEALTHBARNULL = loadChunk("/backgrounds/battlehealthbars.png", 1, 3, 0, 12);
	public static BufferedImage BATTLELEVELTEXT = load("/backgrounds/battlelevel.png");
	public static BufferedImage POKEMONEXPERIENCEBAR = load("/backgrounds/experience.png");

	public static BufferedImage BATTLEENEMYPOKEMON = load("/backgrounds/battleenemypokemon.png");
	public static BufferedImage BATTLEPLAYERPOKEMON = load("/backgrounds/battleplayerpokemon.png");
	public static BufferedImage BATTLEPOKEMONALIVE = load("/backgrounds/battlepokemonalive.png");
	public static BufferedImage BATTLEPOKEMONSTATUS = load("/backgrounds/battlepokemonstatus.png");
	public static BufferedImage BATTLEPOKEMONFAINTED = load("/backgrounds/battlepokemonfainted.png");

	public static BufferedImage POKEMONSELECTBACKGROUND = load("/backgrounds/pokemonselectbackground.png");
	public static BufferedImage POKEMONSELECTFIRSTLIGHT = load("/backgrounds/firstpokemonlight.png");
	public static BufferedImage POKEMONSELECTFIRSTDARK = load("/backgrounds/firstpokemondark.png");
	public static BufferedImage POKEMONSELECTOTHERLIGHT = load("/backgrounds/otherpokemonlight.png");
	public static BufferedImage POKEMONSELECTOTHERDARK = load("/backgrounds/otherpokemondark.png");
	public static BufferedImage POKEMONSELECTCANCELDARK = load("/backgrounds/pokemoncanceldark.png");
	public static BufferedImage POKEMONSELECTCANCELLIGHT = load("/backgrounds/pokemoncancellight.png");

	public static BufferedImage VIEWINGPOKEMONPAGE1 = load("/backgrounds/viewpokemonpage1.png");
	public static BufferedImage VIEWINGPOKEMONPAGE2 = load("/backgrounds/viewpokemonpage2.png");
	public static BufferedImage VIEWINGPOKEMONPAGE3 = load("/backgrounds/viewpokemonpage3.png");
	// Text boxes
	public static BufferedImage BASICTEXTBOX1START = loadChunk("/backgrounds/basictextbox1.png", 21, 46, 0, 0);
	public static BufferedImage BASICTEXTBOX1MIDDLE = loadChunk("/backgrounds/basictextbox1.png", 20, 46, 21, 0);
	public static BufferedImage BASICTEXTBOX1END = loadChunk("/backgrounds/basictextbox1.png", 21, 46, 41, 0);

	private static BufferedImage TEXTBOX = load("/backgrounds/textboxset.png");
	private static BufferedImage SELECTBAR = load("/backgrounds/selectbar.png");

	public static BufferedImage STORAGEBOXDARK = load("/backgrounds/storagebox/storageboxinfodark.png");
	public static BufferedImage STORAGEBOXSHADOW = load("/backgrounds/storagebox/storageboxshadow.png");
	public static BufferedImage STORAGEBOXPARTY = load("/backgrounds/storagebox/storageboxpartybutton.png");
	public static BufferedImage STORAGEBOXCLOSE = load("/backgrounds/storagebox/storageboxclosebutton.png");
	public static BufferedImage STORAGEBOXCURRENTPOKEMON = load("/backgrounds/storagebox/storageboxcurrentpokemon.png");
	public static BufferedImage STORAGEBOXPOKEMONICONBG = load("/backgrounds/storagebox/storageboxpokemoniconbg.png");
	public static BufferedImage STORAGEBOXJUMPBG = load("/backgrounds/storagebox/storageboxjumpbg.png");

	public static BufferedImage MALEBAGBG = load("/backgrounds/malebagbackground.png");
	public static BufferedImage FEMALEBAGBG = load("/backgrounds/femalebagbackground.png");
	public static BufferedImage BAGROTATEBALL = load("/backgrounds/bagrotateball.png");
	public static BufferedImage BAGPAGETITLE = load("/backgrounds/bagpagetitle.png");
	public static BufferedImage BAGPAGESELECT = load("/backgrounds/bagpageselect.png");
	public static BufferedImage BAGTITLEONE = loadChunk("/backgrounds/bagpagetitle.png", 80, 16, 0, 0);
	public static BufferedImage BAGTITLETWO = loadChunk("/backgrounds/bagpagetitle.png", 80, 16, 0, 16);
	public static BufferedImage BAGTITLETHREE = loadChunk("/backgrounds/bagpagetitle.png", 80, 16, 0, 32);
	public static BufferedImage BAGTITLEFOUR = loadChunk("/backgrounds/bagpagetitle.png", 80, 16, 0, 48);
	public static BufferedImage BAGTITLEFIVE = loadChunk("/backgrounds/bagpagetitle.png", 80, 16, 0, 64);

	public static BufferedImage getTypeImage(int type) {

		BufferedImage temp = null;

		temp = loadChunk("/backgrounds/typeblocks.png", 32, 14, 0 + (type * 32), 0);

		return temp;

	}

	private static BufferedImage load(String s) {
		BufferedImage image = null;
		try {
			image = ImageIO.read(ImageLoader.class.getResourceAsStream(s));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return image;
	}

	private static BufferedImage loadChunk(String s, int width, int height, int x, int y) {
		BufferedImage image = null;
		try {
			image = ImageIO.read(ImageLoader.class.getResourceAsStream(s)).getSubimage(x, y,
					width, height);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return image;
	}

	public static BufferedImage getAreaBattleBG() {

		BufferedImage temp = null;

		temp = BATTLEBGGRASS;

		return temp;

	}

	public static BufferedImage getBerry(int berry) {

		BufferedImage temp = null;

		temp = loadChunk("/entities/berries.png", 32, 32, -32 + (berry * 32), 0);

		return temp;

	}

	public static BufferedImage getStorageBoxImage(int bgNumber) {

		BufferedImage temp = load("/backgrounds/storagebox/Box_" + bgNumber + ".png");

		return temp;

	}

	public static Animation getStorageSideArrow() {

		Animation temp = new Animation();
		BufferedImage[] tempB = new BufferedImage[6];

		for (int i = 0; i < tempB.length; i++) {
			tempB[i] = loadChunk("/backgrounds/storagebox/storageboxsidearrow.png", 16, 16, 0 + (i * 16), 0);
		}

		temp.setFrames(tempB);
		temp.setDelay(60);

		return temp;

	}

	public static Animation getStorageBoxAnimaiton() {

		Animation temp = new Animation();
		BufferedImage[] tempB = new BufferedImage[3];

		for (int i = 0; i < 3; i++) {
			tempB[i] = loadChunk("/backgrounds/storagebox/storageboxbackground.png", 240, 160, 0 + (i * 240), 0);
		}

		temp.setFrames(tempB);
		temp.setDelay(60);

		return temp;

	}

	public static Animation getStorageBoxInfoAnimation() {

		Animation temp = new Animation();
		BufferedImage[] tempB = new BufferedImage[3];

		for (int i = 0; i < 3; i++) {
			tempB[i] = loadChunk("/backgrounds/storagebox/storageboxinfolight.png", 80, 156, 0 + (i * 80), 0);
		}

		temp.setFrames(tempB);
		temp.setDelay(180);

		return temp;

	}

	public static Animation getStorageBoxArrowFloat() {

		Animation temp = new Animation();
		BufferedImage[] tempB = new BufferedImage[2];

		tempB[0] = loadChunk("/backgrounds/storagebox/storageboxarrowfloat.png", 32, 32, 0, 0);
		tempB[1] = loadChunk("/backgrounds/storagebox/storageboxarrowfloat.png", 32, 32, 32, 0);

		temp.setFrames(tempB);
		temp.setDelay(360);

		return temp;

	}

	public static Animation getStorageBoxArrowCarry() {

		Animation temp = new Animation();
		BufferedImage[] tempB = new BufferedImage[2];

		tempB[0] = loadChunk("/backgrounds/storagebox/storageboxarrowcarry.png", 32, 32, 0, 0);
		tempB[1] = loadChunk("/backgrounds/storagebox/storageboxarrowcarry.png", 32, 32, 32, 0);

		temp.setFrames(tempB);
		temp.setDelay(360);

		return temp;

	}

	public static Animation getBagBall() {

		Animation temp = new Animation();
		BufferedImage[] tempB = new BufferedImage[7];

		for (int i = 0; i < 7; i++) {
			tempB[i] = loadChunk("/backgrounds/bagrotateball.png", 16, 16, 0, 0 + (i * 16));
		}

		temp.setFrames(tempB);
		temp.setDelay(360);

		return temp;

	}

	/**
	 * 1:TopLeft, 2:Top, 3:TopRight, 4:Right, 5:BottomRight, 6:Bottom,
	 * 7:BottomLeft, 8:Left, 9:Inside
	 * 
	 * @param type
	 * @return
	 */
	public static BufferedImage getTextBoxArea(int type) {

		BufferedImage temp = null;

		if (type == 1) {
			temp = TEXTBOX.getSubimage(0, 0, 8, 8);
		} else if (type == 2) {
			temp = TEXTBOX.getSubimage(8, 0, 8, 8);
		} else if (type == 3) {
			temp = TEXTBOX.getSubimage(16, 0, 8, 8);
		} else if (type == 4) {
			temp = TEXTBOX.getSubimage(16, 8, 8, 8);
		} else if (type == 5) {
			temp = TEXTBOX.getSubimage(16, 16, 8, 8);
		} else if (type == 6) {
			temp = TEXTBOX.getSubimage(8, 16, 8, 8);
		} else if (type == 7) {
			temp = TEXTBOX.getSubimage(0, 16, 8, 8);
		} else if (type == 8) {
			temp = TEXTBOX.getSubimage(0, 8, 8, 8);
		} else if (type == 9) {
			temp = TEXTBOX.getSubimage(8, 8, 8, 8);
		}

		return temp;

	}

	/**
	 * 1:Left, 2:Mid, 3:Right
	 * 
	 * @param type
	 * @return
	 */
	public static BufferedImage getSelectBar(int type) {

		BufferedImage temp = null;

		if (type == 1) {
			temp = SELECTBAR.getSubimage(0, 0, 16, 16);
		} else if (type == 2) {
			temp = SELECTBAR.getSubimage(16, 0, 16, 16);
		} else if (type == 3) {
			temp = SELECTBAR.getSubimage(32, 0, 16, 16);
		}

		return temp;

	}

}
