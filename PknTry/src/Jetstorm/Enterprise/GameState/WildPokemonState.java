package Jetstorm.Enterprise.GameState;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;

import Jetstorm.Enterprise.Audio.JukeBox;
import Jetstorm.Enterprise.Entities.Pokemon.Pokemon;
import Jetstorm.Enterprise.Handlers.BattleDamage;
import Jetstorm.Enterprise.Handlers.ImageLoader;
import Jetstorm.Enterprise.Handlers.Keys;
import Jetstorm.Enterprise.Handlers.PlayerBag;
import Jetstorm.Enterprise.Handlers.PokemonInfo;
import Jetstorm.Enterprise.Handlers.Font.FontLoader;

public class WildPokemonState extends GameState {

	private Random ran = new Random();

	private int currentChoice = 0;
	private int currentBattleChoice = 0;
	private int pokemonChoice = 0;
	private boolean foundBattle = true;
	private int timeCount = 0;
	private int xVar = 0;
	private int yVar = 0;

	private boolean startScene = false;

	private boolean optionsSelection = false;

	private boolean battleSelection = false;

	private boolean battleScene = false;

	// private Animation playerAnimation;
	private Pokemon wildPokemon;

	public WildPokemonState(GameStateManager gsm) {
		super(gsm);
	}

	public void setWildPokemon(Pokemon pokemon) {
		wildPokemon = pokemon;
		pokemonChoice = PlayerBag.getFirstPokemon();
		init();
	}

	public void init() {

	}

	public void reset() {
		xVar = 0;
		yVar = 0;
		foundBattle = true;
		startScene = false;
		optionsSelection = false;
		battleSelection = false;
		battleScene = false;
	}

	public void update() {

		if (foundBattle) {
			timeCount++;

			if (timeCount % 3 == 0) {
				xVar += 2;
				yVar++;
				if (yVar == 80) {
					foundBattle = false;
					startScene = true;
					timeCount = 0;
				}
			}
		} else if (startScene) {
			timeCount++;

			if (timeCount == 180) {
				startScene = false;
				optionsSelection = true;
				timeCount = 0;
			}
		} else if (battleScene) {

			if (wildPokemon.getSpeed() > PlayerBag.getPokemon(pokemonChoice).getSpeed()) {
				timeCount++;
				if (timeCount == 60) {
					PlayerBag.getPokemon(pokemonChoice).damage(
							BattleDamage.getDamage(wildPokemon, PlayerBag.getPokemon(pokemonChoice),
									wildPokemon.getMove(ran.nextInt(4))));
					if (wildPokemon.getFainted()) {
						PlayerBag.getPokemon(pokemonChoice).addExp(
								PokemonInfo.getExpGain(wildPokemon, PlayerBag.getPokemon(pokemonChoice)));
						PlayerBag.getPokemon(pokemonChoice).addEV(wildPokemon.getEVYield());
						gsm.wildBattleOver();
					}
				}
				if (timeCount == 120) {
					if (!wildPokemon.getFainted()) {
						wildPokemon.damage(BattleDamage.getDamage(PlayerBag.getPokemon(pokemonChoice), wildPokemon,
								PlayerBag.getPokemon(pokemonChoice).getMove(currentBattleChoice)));
						if (PlayerBag.getPokemon(pokemonChoice).getFainted()) {
							if (PlayerBag.getFirstPokemon() != -1) {
								pokemonChoice = PlayerBag.getFirstPokemon();
							} else {
								System.exit(0);
							}
						}
					}
				}
				if (timeCount == 180) {
					battleScene = false;
					optionsSelection = true;
					timeCount = 0;
				}
			} else if (wildPokemon.getSpeed() < PlayerBag.getPokemon(pokemonChoice).getSpeed()) {
				timeCount++;
				if (timeCount == 120) {
					PlayerBag.getPokemon(pokemonChoice).damage(
							BattleDamage.getDamage(wildPokemon, PlayerBag.getPokemon(pokemonChoice),
									wildPokemon.getMove(ran.nextInt(4))));
					if (wildPokemon.getFainted()) {
						PlayerBag.getPokemon(pokemonChoice).addExp(wildPokemon.getExpYield());
						PlayerBag.getPokemon(pokemonChoice).addEV(wildPokemon.getEVYield());
						gsm.wildBattleOver();
					}
				}
				if (timeCount == 60) {
					if (!wildPokemon.getFainted()) {
						wildPokemon.damage(BattleDamage.getDamage(PlayerBag.getPokemon(pokemonChoice), wildPokemon,
								PlayerBag.getPokemon(pokemonChoice).getMove(currentBattleChoice)));
						if (PlayerBag.getPokemon(pokemonChoice).getFainted()) {
							if (PlayerBag.getFirstPokemon() != -1) {
								pokemonChoice = PlayerBag.getFirstPokemon();
							} else {
								System.exit(0);
							}
						}
					}
				}
				if (timeCount == 180) {
					battleScene = false;
					optionsSelection = true;
					timeCount = 0;
				}
			} else if (wildPokemon.getSpeed() == PlayerBag.getPokemon(pokemonChoice).getSpeed()) {
				timeCount++;
				if (timeCount == 120) {
					PlayerBag.getPokemon(pokemonChoice).damage(
							BattleDamage.getDamage(wildPokemon, PlayerBag.getPokemon(pokemonChoice),
									wildPokemon.getMove(ran.nextInt(4))));
					if (wildPokemon.getFainted()) {
						PlayerBag.getPokemon(pokemonChoice).addExp(wildPokemon.getExpYield());
						PlayerBag.getPokemon(pokemonChoice).addEV(wildPokemon.getEVYield());
						gsm.wildBattleOver();
					}
				}
				if (timeCount == 60) {
					if (!wildPokemon.getFainted()) {
						wildPokemon.damage(BattleDamage.getDamage(PlayerBag.getPokemon(pokemonChoice), wildPokemon,
								PlayerBag.getPokemon(pokemonChoice).getMove(currentBattleChoice)));
						if (PlayerBag.getPokemon(pokemonChoice).getFainted()) {
							if (PlayerBag.getFirstPokemon() != -1) {
								pokemonChoice = PlayerBag.getFirstPokemon();
							} else {
								System.exit(0);
							}
						}
					}
				}
				if (timeCount == 180) {
					battleScene = false;
					optionsSelection = true;
					timeCount = 0;
				}
			}

		}

		if (!foundBattle) {
			wildPokemon.update();
		}

		handleInput();
		PlayerBag.update();

	}

	public void draw(Graphics2D g) {

		if (!foundBattle) {

			g.drawImage(ImageLoader.getAreaBattleBG(), 0, 0, null);
			g.drawImage(ImageLoader.BATTLETEXTBOX, 0, 112, null);

		}

		if (foundBattle) {

			g.fillRect(0, 0, xVar, 160);
			g.fillRect(0, 0, 240, yVar);
			g.fillRect(240 - xVar, 0, xVar, 160);
			g.fillRect(0, 160 - yVar, 240, yVar);

		} else if (startScene) {

			g.drawImage(ImageLoader.BATTLEPLAYERPOKEMON, 136, 88, null);

			for (int i = 0; i < PlayerBag.getArraySize(); i++) {
				if (PlayerBag.getPokemon(i).getFainted()) {
					g.drawImage(ImageLoader.BATTLEPOKEMONFAINTED, 156 + (i * 10), 88, null);
				} else if (PlayerBag.getPokemon(i).getStatusEffect() != 0) {
					g.drawImage(ImageLoader.BATTLEPOKEMONSTATUS, 156 + (i * 10), 88, null);
				} else {
					g.drawImage(ImageLoader.BATTLEPOKEMONALIVE, 156 + (i * 10), 88, null);
				}
			}

		} else if (optionsSelection) {

			g.drawImage(ImageLoader.BATTLEOPTIONSBOX, 120, 112, null);

			if (currentChoice == 0) {
				g.drawImage(ImageLoader.BATTLESELECTIONARROW, 129, 124, null);
			} else if (currentChoice == 1) {
				g.drawImage(ImageLoader.BATTLESELECTIONARROW, 185, 124, null);
			} else if (currentChoice == 2) {
				g.drawImage(ImageLoader.BATTLESELECTIONARROW, 129, 140, null);
			} else if (currentChoice == 3) {
				g.drawImage(ImageLoader.BATTLESELECTIONARROW, 185, 140, null);
			}

		} else if (battleSelection) {

			g.drawImage(ImageLoader.BATTLEMOVESBOX, 0, 112, null);

			BufferedImage[] moveName = null;

			if (PlayerBag.getPokemon(pokemonChoice).getMove(0) != null) {
				moveName = FontLoader.getBattleTranslation(PlayerBag.getPokemon(pokemonChoice).getMove(0).getName());
				for (int i = 0; i < moveName.length; i++) {
					g.drawImage(moveName[i], 16 + (i * 5), 125, null);
				}
			} else {
				moveName = FontLoader.getBattleTranslation("--");
				for (int i = 0; i < moveName.length; i++) {
					g.drawImage(moveName[i], 16 + (i * 4), 125, null);
				}
			}
			if (PlayerBag.getPokemon(pokemonChoice).getMove(1) != null) {
				moveName = FontLoader.getBattleTranslation(PlayerBag.getPokemon(pokemonChoice).getMove(1).getName());
				for (int i = 0; i < moveName.length; i++) {
					g.drawImage(moveName[i], 88 + (i * 5), 125, null);
				}
			} else {
				moveName = FontLoader.getBattleTranslation("--");
				for (int i = 0; i < moveName.length; i++) {
					g.drawImage(moveName[i], 88 + (i * 4), 125, null);
				}
			}
			if (PlayerBag.getPokemon(pokemonChoice).getMove(2) != null) {
				moveName = FontLoader.getBattleTranslation(PlayerBag.getPokemon(pokemonChoice).getMove(2).getName());
				for (int i = 0; i < moveName.length; i++) {
					g.drawImage(moveName[i], 16 + (i * 5), 141, null);
				}
			} else {
				moveName = FontLoader.getBattleTranslation("--");
				for (int i = 0; i < moveName.length; i++) {
					g.drawImage(moveName[i], 16 + (i * 4), 141, null);
				}
			}
			if (PlayerBag.getPokemon(pokemonChoice).getMove(3) != null) {
				moveName = FontLoader.getBattleTranslation(PlayerBag.getPokemon(pokemonChoice).getMove(3).getName());
				for (int i = 0; i < moveName.length; i++) {
					g.drawImage(moveName[i], 88 + (i * 5), 141, null);
				}
			} else {
				moveName = FontLoader.getBattleTranslation("--");
				for (int i = 0; i < moveName.length; i++) {
					g.drawImage(moveName[i], 88 + (i * 4), 141, null);
				}
			}

			BufferedImage[] moveType = FontLoader.getBattleTranslation(PlayerBag.getPokemon(pokemonChoice)
					.getMove(currentBattleChoice).getTypeString());
			BufferedImage[] movePP = FontLoader.getLevelImage(
					PlayerBag.getPokemon(pokemonChoice).getMove(currentBattleChoice).getPP(), 1);
			BufferedImage[] moveMaxPP = FontLoader.getLevelImage(
					PlayerBag.getPokemon(pokemonChoice).getMove(currentBattleChoice).getMaxPP(), 1);

			for (int i = 0; i < moveType.length; i++) {
				g.drawImage(moveType[i], 191 + (i * 5), 142, null);
			}
			for (int i = 0; i < movePP.length; i++) {
				g.drawImage(movePP[i], (214 - (5 * movePP.length)) + (i * 5), 125, null);
			}
			for (int i = 0; i < moveMaxPP.length; i++) {
				g.drawImage(moveMaxPP[i], 220 + (i * 5), 125, null);
			}

			if (currentBattleChoice == 0) {
				g.drawImage(ImageLoader.BATTLESELECTIONARROW, 9, 124, null);
			} else if (currentBattleChoice == 1) {
				g.drawImage(ImageLoader.BATTLESELECTIONARROW, 81, 124, null);
			} else if (currentBattleChoice == 2) {
				g.drawImage(ImageLoader.BATTLESELECTIONARROW, 9, 140, null);
			} else if (currentBattleChoice == 3) {
				g.drawImage(ImageLoader.BATTLESELECTIONARROW, 81, 140, null);
			}

		}

		if (!foundBattle) {

			g.drawImage(ImageLoader.BATTLEENEMYPOKEMONSTATS, 10, 16, null);

			int tempHP = wildPokemon.getHealthPercent();

			if (tempHP > 26) {
				g.drawImage(ImageLoader.POKEMONHEALTHBARGREEN, 49, 33, tempHP, 3, null);
			} else if (tempHP <= 26 && tempHP > 10) {
				g.drawImage(ImageLoader.POKEMONHEALTHBARYELLOW, 49, 33, tempHP, 3, null);
			} else if (tempHP <= 10 && tempHP > 0) {
				g.drawImage(ImageLoader.POKEMONHEALTHBARRED, 49, 33, tempHP, 3, null);
			}

			g.drawImage(wildPokemon.getFrontAnimation().getImage(), 135, 0, null);

			BufferedImage[] wldPkmNam = null;

			if (wildPokemon.getGender() == 0) {
				wldPkmNam = FontLoader.getBattleTranslation(wildPokemon.getNickName() + "<");
			} else if (wildPokemon.getGender() == 1) {
				wldPkmNam = FontLoader.getBattleTranslation(wildPokemon.getNickName() + ">");
			}

			for (int i = 0; i < wldPkmNam.length; i++) {
				g.drawImage(wldPkmNam[i], 17 + (i * 5), 21, null);
			}

			BufferedImage[] tempWldLvl = FontLoader.getLevelImage(wildPokemon.getLevel(), 1);

			for (int i = 0; i < tempWldLvl.length; i++) {
				g.drawImage(tempWldLvl[i], 81 + (i * 5), 21, null);
			}

			g.drawImage(ImageLoader.BATTLELEVELTEXT, 73, 21, null);

			wildPokemon.draw(g);

			if (!startScene) {

				g.drawImage(PlayerBag.getPokemon(pokemonChoice).getBackAnimation().getImage(), 24, 32, null);
				g.drawImage(ImageLoader.BATTLEMYPOKEMONSTATS, 126, 74, null);

				int pkmHP = PlayerBag.getPokemon(pokemonChoice).getHealthPercent();

				if (pkmHP > 26) {
					g.drawImage(ImageLoader.POKEMONHEALTHBARGREEN, 174, 91, pkmHP, 3, null);
				} else if (pkmHP <= 26 && pkmHP > 10) {
					g.drawImage(ImageLoader.POKEMONHEALTHBARYELLOW, 174, 91, pkmHP, 3, null);
				} else if (pkmHP <= 10 && pkmHP > 0) {
					g.drawImage(ImageLoader.POKEMONHEALTHBARRED, 174, 91, pkmHP, 3, null);
				}

				BufferedImage[] pkmNam = null;

				if (PlayerBag.getPokemon(pokemonChoice).getGender() == 0) {
					pkmNam = FontLoader.getBattleTranslation(PlayerBag.getPokemon(pokemonChoice).getNickName() + "<");
				} else if (PlayerBag.getPokemon(pokemonChoice).getGender() == 1) {
					pkmNam = FontLoader.getBattleTranslation(PlayerBag.getPokemon(pokemonChoice).getNickName() + ">");
				}

				for (int i = 0; i < pkmNam.length; i++) {
					g.drawImage(pkmNam[i], 142 + (i * 5), 79, null);
				}

				g.drawImage(ImageLoader.BATTLELEVELTEXT, 198, 79, null);

				BufferedImage[] pkmLvl = FontLoader.getLevelImage(PlayerBag.getPokemon(pokemonChoice).getLevel(), 1);

				for (int i = 0; i < pkmLvl.length; i++) {
					g.drawImage(pkmLvl[i], 206 + (i * 5), 79, null);
				}

				BufferedImage[] maxHealth = FontLoader.getLevelImage(
						PlayerBag.getPokemon(pokemonChoice).getMaxHealth(), 1);
				BufferedImage[] currentHealth = FontLoader.getLevelImage(PlayerBag.getPokemon(pokemonChoice)
						.getHealth(), 1);

				for (int i = 0; i < currentHealth.length; i++) {
					g.drawImage(currentHealth[i], (201 - (5 * currentHealth.length)) + (i * 5), 97, null);
				}

				for (int i = 0; i < maxHealth.length; i++) {
					g.drawImage(maxHealth[i], 206 + (i * 5), 97, null);
				}

				PlayerBag.getPokemon(pokemonChoice).draw(g);

			}

		}

	}

	public void select() {

		if (optionsSelection) {

			if (currentChoice == 0) {
				optionsSelection = false;
				battleSelection = true;
			} else if (currentChoice == 1) {

			} else if (currentChoice == 2) {

			} else if (currentChoice == 3) {
				gsm.wildBattleOver();
			}

		} else if (battleSelection) {

			battleSelection = false;
			battleScene = true;

		}

	}

	public void handleInput() {

		if (Keys.isPressed(Keys.PLAYER_A)) {
			JukeBox.play("textclick");
			select();
		}

		if (optionsSelection) {

			if (Keys.isPressed(Keys.UPARROW)) {

				if (currentChoice == 2 || currentChoice == 3) {
					currentChoice -= 2;
				}

			} else if (Keys.isPressed(Keys.DOWNARROW)) {

				if (currentChoice == 0 || currentChoice == 1) {
					currentChoice += 2;
				}

			} else if (Keys.isPressed(Keys.RIGHTARROW)) {

				if (currentChoice == 0 || currentChoice == 2) {
					currentChoice += 1;
				}

			} else if (Keys.isPressed(Keys.LEFTARROW)) {

				if (currentChoice == 1 || currentChoice == 3) {
					currentChoice -= 1;
				}

			}

		} else if (battleSelection) {

			if (Keys.isPressed(Keys.PLAYER_B)) {
				battleSelection = false;
				optionsSelection = true;
			}

			if (Keys.isPressed(Keys.UPARROW)) {

				if (currentBattleChoice == 2 || currentBattleChoice == 3) {
					currentBattleChoice -= 2;
				}

			} else if (Keys.isPressed(Keys.DOWNARROW)) {

				if (currentBattleChoice == 0 || currentBattleChoice == 1) {
					if (PlayerBag.getPokemon(pokemonChoice).getMove(currentBattleChoice + 2) != null) {
						currentBattleChoice += 2;
					}
				}

			} else if (Keys.isPressed(Keys.RIGHTARROW)) {

				if (currentBattleChoice == 0 || currentBattleChoice == 2) {
					if (PlayerBag.getPokemon(pokemonChoice).getMove(currentBattleChoice + 1) != null) {
						currentBattleChoice += 1;
					}
				}

			} else if (Keys.isPressed(Keys.LEFTARROW)) {

				if (currentBattleChoice == 1 || currentBattleChoice == 3) {
					currentBattleChoice -= 1;
				}

			}

		}

	}

}
