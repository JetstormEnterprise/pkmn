package Jetstorm.Enterprise.Entities.Pokemon;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;

import Jetstorm.Enterprise.Entities.Pokemon.Moves.Move;
import Jetstorm.Enterprise.Handlers.Animation;
import Jetstorm.Enterprise.Handlers.PokemonImageLoader;
import Jetstorm.Enterprise.Handlers.PokemonInfo;

public class Pokemon {

	Random ran = new Random();

	protected String species;
	protected String nickname;
	protected String locationFound;
	protected int typeOne;
	protected int typeTwo;
	protected int nature;
	protected int abilityOne;
	protected int abilityTwo;
	protected int hiddenAbility;
	protected int gender;
	protected int friendship;
	protected int bodyStyle;
	protected int pokemonColor;
	protected int eggGroup;
	protected int secondEggGroup;
	protected double height;
	protected double weight;
	protected double genderRatio;
	protected double catchRate;
	protected String personalityValue;
	protected int hatchTime;

	protected double[] natureSet;
	protected String trainer;
	protected int id;
	protected int pkmNumber;
	protected int statusEffect;
	protected boolean fainted;

	protected int maxHealth;
	protected int health;
	protected int attack;
	protected int defense;
	protected int spAttack;
	protected int spDefense;
	protected int speed;

	protected int baseLevel;
	protected int baseHealth;
	protected int baseAttack;
	protected int baseDefense;
	protected int baseSpAttack;
	protected int baseSpDefense;
	protected int baseSpeed;

	protected String levelStyle;
	protected int level;
	protected int leastExp;
	protected int currentExp;
	protected int maxExp;
	protected int baseExpYield;

	protected int[] EVYield = new int[6];

	protected BufferedImage frontImage;
	protected BufferedImage backImage;
	protected Animation frontImages;
	protected Animation backImages;
	protected Animation iconImages;

	protected Move[] movesList;
	protected int[] EVList;
	protected String[] IVList;

	// protected Item itemHeld;

	public void init(int startingLevel) {

		leastExp = PokemonInfo.getLevelEXP(levelStyle, startingLevel - 1);
		currentExp = PokemonInfo.getLevelEXP(levelStyle, startingLevel - 1);
		maxExp = PokemonInfo.getLevelEXP(levelStyle, startingLevel);
		locationFound = "Null";
		statusEffect = 0;
		fainted = false;
		generateNature();
		generateID();
		createPersonalityValue();
		EVList = new int[6];
		for (int i = 0; i < 6; i++) {
			EVList[i] = 0;
		}
		IVList = new String[6];
		for (int i = 0; i < 6; i++) {
			IVList[i] = createBinaryIV();
		}
		frontImages = new Animation();
		frontImages.setFrames(PokemonImageLoader.loadPokemonFrontAnimation(pkmNumber));
		frontImages.setDelay(360);
		backImages = new Animation();
		backImages.setFrames(PokemonImageLoader.loadPokemonBackAnimation(pkmNumber));
		backImages.setDelay(360);
		iconImages = new Animation();
		iconImages.setFrames(PokemonImageLoader.loadPokemonIconAnimation(pkmNumber));
		iconImages.setDelay(360);
		level = startingLevel;
		health = calculateHealth();
		maxHealth = health;
		attack = calculateAttack();
		defense = calculateDefense();
		spAttack = calculateSPAttack();
		spDefense = calculateSPDefense();
		speed = calculateSpeed();

	}

	public void setLocationFount(String location) {

		locationFound = location;

	}

	public int[] getEVYield() {
		return EVYield;
	}

	public boolean getNatureBoost(int stat) {

		boolean temp = false;

		if (natureSet[stat] == 1.1) {
			temp = true;
		} else {
			temp = false;
		}

		return temp;

	}

	public boolean getNatureDrop(int stat) {

		boolean temp = false;

		if (natureSet[stat] == 0.9) {
			temp = true;
		} else {
			temp = false;
		}

		return temp;

	}

	public void generateNature() {

		nature = ran.nextInt(25) + 1;
		natureSet = new double[5];

		if (nature == 1 || nature == 7 || nature == 13 || nature == 19 || nature == 25) {
			for (int i = 0; i < 5; i++) {
				natureSet[i] = 1;
			}
		} else if (nature == 2) {
			natureSet[0] = 1.1;
			natureSet[1] = 0.9;
			natureSet[2] = 1;
			natureSet[3] = 1;
			natureSet[4] = 1;
		} else if (nature == 3) {
			natureSet[0] = 1.1;
			natureSet[1] = 1;
			natureSet[2] = 1;
			natureSet[3] = 1;
			natureSet[4] = 0.9;
		} else if (nature == 4) {
			natureSet[0] = 1.1;
			natureSet[1] = 1;
			natureSet[2] = 0.9;
			natureSet[3] = 1;
			natureSet[4] = 1;
		} else if (nature == 5) {
			natureSet[0] = 1.1;
			natureSet[1] = 1;
			natureSet[2] = 1;
			natureSet[3] = 0.9;
			natureSet[4] = 1;
		} else if (nature == 6) {
			natureSet[0] = 0.9;
			natureSet[1] = 1.1;
			natureSet[2] = 1;
			natureSet[3] = 1;
			natureSet[4] = 1;
		} else if (nature == 8) {
			natureSet[0] = 1;
			natureSet[1] = 1.1;
			natureSet[2] = 1;
			natureSet[3] = 1;
			natureSet[4] = 0.9;
		} else if (nature == 9) {
			natureSet[0] = 1;
			natureSet[1] = 1.1;
			natureSet[2] = 0.9;
			natureSet[3] = 1;
			natureSet[4] = 1;
		} else if (nature == 10) {
			natureSet[0] = 1;
			natureSet[1] = 1.1;
			natureSet[2] = 1;
			natureSet[3] = 0.9;
			natureSet[4] = 1;
		} else if (nature == 11) {
			natureSet[0] = 0.9;
			natureSet[1] = 1;
			natureSet[2] = 1;
			natureSet[3] = 1;
			natureSet[4] = 1.1;
		} else if (nature == 12) {
			natureSet[0] = 1;
			natureSet[1] = 0.9;
			natureSet[2] = 1;
			natureSet[3] = 1;
			natureSet[4] = 1.1;
		} else if (nature == 14) {
			natureSet[0] = 1;
			natureSet[1] = 1;
			natureSet[2] = 0.9;
			natureSet[3] = 1;
			natureSet[4] = 1.1;
		} else if (nature == 15) {
			natureSet[0] = 1;
			natureSet[1] = 1;
			natureSet[2] = 1;
			natureSet[3] = 0.9;
			natureSet[4] = 1.1;
		} else if (nature == 16) {
			natureSet[0] = 0.9;
			natureSet[1] = 1;
			natureSet[2] = 1.1;
			natureSet[3] = 1;
			natureSet[4] = 1;
		} else if (nature == 17) {
			natureSet[0] = 1;
			natureSet[1] = 0.9;
			natureSet[2] = 1.1;
			natureSet[3] = 1;
			natureSet[4] = 1;
		} else if (nature == 18) {
			natureSet[0] = 1;
			natureSet[1] = 1;
			natureSet[2] = 1.1;
			natureSet[3] = 1;
			natureSet[4] = 0.9;
		} else if (nature == 20) {
			natureSet[0] = 1;
			natureSet[1] = 1;
			natureSet[2] = 1.1;
			natureSet[3] = 0.9;
			natureSet[4] = 1;
		} else if (nature == 21) {
			natureSet[0] = 0.9;
			natureSet[1] = 1;
			natureSet[2] = 1;
			natureSet[3] = 1.1;
			natureSet[4] = 1;
		} else if (nature == 22) {
			natureSet[0] = 1;
			natureSet[1] = 0.9;
			natureSet[2] = 1;
			natureSet[3] = 1.1;
			natureSet[4] = 1;
		} else if (nature == 23) {
			natureSet[0] = 1;
			natureSet[1] = 1;
			natureSet[2] = 1;
			natureSet[3] = 1.1;
			natureSet[4] = 0.9;
		} else if (nature == 24) {
			natureSet[0] = 1;
			natureSet[1] = 1;
			natureSet[2] = 0.9;
			natureSet[3] = 1.1;
			natureSet[4] = 1;
		}

	}

	public void setTrainer(String trainerName) {

		trainer = trainerName;

	}

	public void generateID() {

		id = ran.nextInt(100000);

	}

	public void testIV() {

		for (int i = 0; i < 6; i++) {
			System.out.println(IVList[i]);
		}

	}

	public void createPersonalityValue() {

		String p1 = "", p2 = "", p3 = "", p4 = "";

		if (genderRatio == 2) {
			gender = 2;
			p1 = "11111111";
		} else if (genderRatio == 1) {
			gender = 1;
			p1 = "11111110";
		} else if (genderRatio == 0.125) {
			int temp = ran.nextInt(256);
			if (temp < 0.125 * 255) {
				gender = 0;
			} else {
				gender = 1;
			}
			p1 = "11011111";
		} else if (genderRatio == 0.25) {
			int temp = ran.nextInt(256);
			if (temp < 0.25 * 255) {
				gender = 0;
			} else {
				gender = 1;
			}
			p1 = "10111111";
		} else if (genderRatio == 0.5) {
			int temp = ran.nextInt(256);
			if (temp < 0.5 * 255) {
				gender = 0;
			} else {
				gender = 1;
			}
			p1 = "01111111";
		} else if (genderRatio == 0.75) {
			int temp = ran.nextInt(256);
			if (temp < 0.75 * 255) {
				gender = 0;
			} else {
				gender = 1;
			}
			p1 = "00111111";
		} else if (genderRatio == 0.875) {
			int temp = ran.nextInt(256);
			if (temp < 0.875 * 255) {
				gender = 0;
			} else {
				gender = 1;
			}
			p1 = "00011111";
		} else if (genderRatio == 0) {
			gender = 0;
			p1 = "00000000";
		}

		personalityValue = p4 + p3 + p2 + p1;

	}

	public String createBinarySet(int size) {

		String temp = "";

		for (int i = 0; i < size; i++) {
			temp = temp + Integer.toString(ran.nextInt(2));
		}

		return temp;

	}

	public String createBinaryIV() {

		int tempI = 0;
		String temp = "";

		for (int i = 0; i < 5; i++) {
			tempI = ran.nextInt(2);
			temp = temp + Integer.toString(tempI);
		}

		return temp;

	}

	/**
	 * 1:Red, 2:Blue, 3:Yellow, 4:Green, 5:Black, 6:Brown, 7:Purple, 8:Gray,
	 * 9:White, 10:Pink
	 * 
	 * @return
	 */
	public int getColor() {
		return pokemonColor;
	}

	/**
	 * 1:Monster, 2:Water 1, 3:Bug, 4:Flying, 5:Field, 6:Fairy, 7:Grass,
	 * 8:Human-Like, 9:Water 3, 10:Mineral, 11:Amorphous, 12:Water 2, 13:Ditto,
	 * 14:Dragon, 15:Undiscovered
	 * 
	 * @return
	 */
	public int getEggGroupOne() {
		return eggGroup;
	}

	public int getEggGroupTwo() {
		return secondEggGroup;
	}

	/**
	 * 1:Only a head, 2:Serpentine body, 3:Has fins, 4:Head and arms, 5:Head and
	 * a base, 6:Bipedal tailed form, 7:Head and legs, 8:Quadruped body,
	 * 9:Single wings, 10:Tentacles or multiped body, 11:Multiple bodies,
	 * 12:Bipedal tailless form, 13:Two or more pairs of wings, 14:Insectoid
	 * body
	 * 
	 * @return
	 */
	public int getBodyType() {
		return bodyStyle;
	}

	public int convertBinaryToInt(String binary) {

		double temp = 0;
		int k = 0;

		for (int i = binary.length() - 1; i > -1; i--) {
			temp = temp + (Integer.parseInt(binary.substring(k, k + 1)) * Math.pow(2, i));
			k++;
		}
		return (int) temp;

	}

	/**
	 * Does not compute accurately with 32-digit or more
	 * 
	 * @param num
	 */
	public void test(int num) {

		int tempI = 0;
		String tempS = "";

		for (int i = 0; i < num; i++) {
			tempI = ran.nextInt(2);
			if (tempI == 0) {
				tempS = tempS + "0";
			} else if (tempI == 1) {
				tempS = tempS + "1";
			}
		}

		System.out.println("Binary: " + tempS);
		tempI = 0;
		double take = 0;
		int k = 0;

		for (int i = num - 1; i > -1; i--) {
			take = take + (Integer.parseInt(tempS.substring(k, k + 1)) * Math.pow(2, i));
			System.out.println(take);
			k++;
		}

		System.out.println("Decimal: " + take);

	}

	/**
	 * Does not compute 32-digit or more accurately
	 * 
	 * @param num
	 */
	public void decimalToBinary(int num) {

		double tempD = num;
		String tempS = "";

		while (tempD >= 0) {

			System.out.println(tempD);
			tempD = (int) tempD / 2;

			if (tempD == 0) {
				tempS = tempS + "0";
				tempD = -1;
			} else if (tempD % 2 == 0) {
				tempS = tempS + "0";
			} else {
				tempS = tempS + "1";
				tempD = tempD - 1;
			}

		}

		System.out.println(tempS);

	}

	public void addEV(int[] addedPoints) {

		for (int i = 0; i < 6; i++) {
			EVList[i] += addedPoints[i];
		}

		maxHealth = calculateHealth();
		attack = calculateAttack();
		defense = calculateDefense();
		spAttack = calculateSPAttack();
		spDefense = calculateSPDefense();
		speed = calculateSpeed();

	}

	/**
	 * 0:Health, 1:Attack, 2:Defense, 3:SPAttack, 4:SPDefense, 5:Speed
	 * 
	 * @param newEV
	 */
	public void setEV(int[] newEV) {

		EVList = newEV;
		health = calculateHealth();
		maxHealth = health;
		attack = calculateAttack();
		defense = calculateDefense();
		spAttack = calculateSPAttack();
		spDefense = calculateSPDefense();
		speed = calculateSpeed();
		displayStats();

	}

	public void displayStats() {
		System.out.println("Health: " + health);
		System.out.println("Attack: " + attack);
		System.out.println("Defense: " + defense);
		System.out.println("SPAttack: " + spAttack);
		System.out.println("SPDefense: " + spDefense);
		System.out.println("Speed: " + speed);
	}

	public void levelUp() {

	}

	public void learnMove(int replaceMoveNumber) {

	}

	public void forgetMove(int moveNumber) {

	}

	public BufferedImage getFrontImage() {

		return frontImage;

	}

	public BufferedImage getBackImage() {

		return backImage;

	}

	public Animation getIconAnimation() {

		return iconImages;

	}

	public void addExp(int exp) {
		currentExp += exp;
	}

	public void setExp(int exp) {
		currentExp = exp;
	}

	public void setMaxExp(int exp) {
		maxExp = exp;
	}

	public void setNickName(String name) {
		nickname = name;
	}

	public Move getMove(int moveNumber) {
		return movesList[moveNumber];
	}

	public void damage(int damage) {

		health = health - damage;

	}

	public int getExpYield() {
		return baseExpYield;
	}

	public void setMoveList(Move[] moves) {

		movesList = new Move[moves.length];
		movesList = moves;

	}

	public void setGender(int gender) {

		this.gender = gender;

	}

	public int getExpPercent() {

		double temp = 0;
		double temp2 = 0;
		double temp3 = 0;

		temp2 = maxExp - leastExp;
		temp3 = currentExp - leastExp;

		temp = (temp3 / temp2) * 64;

		return (int) temp;

	}

	public int getHealthPercent() {

		double temp = 0;

		temp = ((double) health / (double) maxHealth) * 48;

		return (int) temp;

	}

	protected int calculateHealth() {

		int temp;
		int p1, p2, p3;

		p1 = 2 * baseHealth;
		p2 = EVList[0] / 4;
		p3 = (convertBinaryToInt(IVList[0]) + p1 + p2 + 100) * level;

		temp = ((p3 / 100) + 10);

		return temp;

	}

	protected int calculateAttack() {

		double temp;
		int p1, p2, p3;

		p1 = 2 * baseAttack;
		p2 = EVList[1] / 4;
		p3 = (convertBinaryToInt(IVList[1]) + p1 + p2) * level;

		temp = ((p3 / 100) + 5) * natureSet[0];

		return (int) temp;

	}

	protected int calculateDefense() {

		double temp;
		int p1, p2, p3;

		p1 = 2 * baseDefense;
		p2 = EVList[2] / 4;
		p3 = (convertBinaryToInt(IVList[2]) + p1 + p2) * level;

		temp = ((p3 / 100) + 5) * natureSet[1];

		return (int) temp;

	}

	protected int calculateSPAttack() {

		double temp;
		int p1, p2, p3;

		p1 = 2 * baseSpAttack;
		p2 = EVList[3] / 4;
		p3 = (convertBinaryToInt(IVList[3]) + p1 + p2) * level;

		temp = ((p3 / 100) + 5) * natureSet[2];

		return (int) temp;

	}

	protected int calculateSPDefense() {

		double temp;
		int p1, p2, p3;

		p1 = 2 * baseSpDefense;
		p2 = EVList[4] / 4;
		p3 = (convertBinaryToInt(IVList[4]) + p1 + p2) * level;

		temp = ((p3 / 100) + 5) * natureSet[3];

		return (int) temp;

	}

	protected int calculateSpeed() {

		double temp;
		int p1, p2, p3;

		p1 = 2 * baseSpeed;
		p2 = EVList[5] / 4;
		p3 = (convertBinaryToInt(IVList[5]) + p1 + p2) * level;

		temp = ((p3 / 100) + 5) * natureSet[4];

		return (int) temp;

	}

	public String getNickName() {

		return nickname;

	}

	public int getLevel() {
		return level;
	}

	public int getTypeOne() {

		return typeOne;

	}

	public int getTypeTwo() {

		return typeTwo;

	}

	public int getHealth() {

		return health;

	}

	public int getAttack() {

		return attack;

	}

	public int getDefense() {

		return defense;

	}

	public int getSpAttack() {

		return spAttack;

	}

	public int getSpDefense() {

		return spDefense;

	}

	public int getSpeed() {

		return speed;

	}

	public String getSpecies() {

		return species;

	}

	public String getLocationFound() {

		return locationFound;

	}

	/**
	 * 1:Hardy, 2:Lonely, 3:Brave, 4:Adamant, 5:Naughty, 6:Bold, 7:Docile,
	 * 8:Relaxed, 9:Impish, 10:Lax, 11:Timid, 12:Hasty, 13:Serious, 14:Jolly,
	 * 15:Naive, 16:Modest, 17:Mild, 18:Quiet, 19:Bashful, 20:Rash, 21:Calm,
	 * 22:Gentle, 23:Sassy, 24:Careful, 25:Quirky
	 * 
	 * @return
	 */
	public int getNature() {

		return nature;

	}

	public int getExp() {

		return currentExp;

	}

	public int getAbilityOne() {

		return abilityOne;

	}

	public int getExpBonus() {

		int temp = 1;

		return temp;

	}

	public int getTrainerExpBonus() {

		int temp = 1;

		return temp;

	}

	public int getGender() {

		return gender;

	}

	public String getTrainer() {

		return trainer;

	}

	public int getID() {

		return id;

	}

	public int getPokemonNumber() {

		return pkmNumber;

	}

	public int getInitHealth() {

		return baseHealth;

	}

	public int getInitLevel() {

		return baseLevel;

	}

	public int getInitAttack() {

		return baseAttack;

	}

	public int getInitDefense() {

		return baseDefense;

	}

	public int getInitSpAttack() {

		return spAttack;

	}

	public int getInitSpDefense() {

		return spDefense;

	}

	public int getInitSpeed() {

		return baseSpeed;

	}

	public int getCurrentExp() {

		return currentExp;

	}

	public int getMaxExp() {

		return maxExp;

	}

	public boolean getFainted() {

		return fainted;

	}

	public int getStatusEffect() {

		return statusEffect;

	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public Animation getFrontAnimation() {
		return frontImages;
	}

	public Animation getBackAnimation() {
		return backImages;
	}

	public void update() {

		if (movesList != null) {
			for (int i = 0; i < movesList.length; i++) {
				if (movesList[i] != null) {
					movesList[i].update();
				}
			}
		}

		if (health <= 0) {
			fainted = true;
		}

		frontImages.update();
		backImages.update();
		iconImages.update();

	}

	public void draw(Graphics2D g) {

		if (movesList != null) {
			for (int i = 0; i < movesList.length; i++) {
				if (movesList[i] != null) {
					movesList[i].draw(g);
				}
			}
		}

	}

}
