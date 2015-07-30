package Jetstorm.Enterprise.GameState;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import Jetstorm.Enterprise.Audio.JukeBox;
import Jetstorm.Enterprise.Entities.Player;
import Jetstorm.Enterprise.Entities.NPC.NPC;
import Jetstorm.Enterprise.Entities.Pokemon.Bulbasaur;
import Jetstorm.Enterprise.Entities.Pokemon.Charmander;
import Jetstorm.Enterprise.Entities.Pokemon.Moves.Ember;
import Jetstorm.Enterprise.Entities.Pokemon.Moves.Move;
import Jetstorm.Enterprise.Entities.Pokemon.Moves.Tackle;
import Jetstorm.Enterprise.Handlers.Animation;
import Jetstorm.Enterprise.Handlers.BattleDamage;
import Jetstorm.Enterprise.Handlers.ImageLoader;
import Jetstorm.Enterprise.Handlers.Keys;
import Jetstorm.Enterprise.Handlers.Font.FontLoader;

public class BattleState extends GameState {

	private int currentChoice = 0;
	private int currentBattleChoice = 0;
	private boolean startScene = false;
	private boolean optionSelection = true;
	private boolean battleScene = false;
	// private boolean myAttack = false;
	// private boolean enemyAttack = false;

	private Player player;
	private Animation playerAnimation;
	private NPC npc;

	private Charmander pokemon1;
	private Bulbasaur pokemon2;

	public BattleState(GameStateManager gsm) {
		super(gsm);
		init();
	}

	public void setBattle(Player player, NPC npc) {
		this.player = player;
		this.npc = npc;
		init();
	}

	public void init() {

		// playerAnimation.setFrames(player.getBattleAnimation());
		// playerAnimation.setDelay(180);

		pokemon1 = new Charmander(100);
		Move[] moves = new Move[4];
		moves[0] = new Tackle();
		moves[1] = new Ember();
		pokemon1.setMoveList(moves);
		pokemon1.displayStats();
		pokemon2 = new Bulbasaur(100);

	}

	public void update() {

		if (battleScene) {

		}

		pokemon1.update();
		pokemon2.update();

		handleInput();

	}

	public void draw(Graphics2D g) {

		if (startScene) {

			g.drawImage(ImageLoader.BATTLEBGGRASS, 0, 0, null);
			g.drawImage(ImageLoader.BATTLETEXTBOX, 0, 112, null);

			g.drawImage(playerAnimation.getImage(), 40, 64, null);

		} else {

			g.drawImage(ImageLoader.BATTLEBGGRASS, 0, 0, null);
			g.drawImage(ImageLoader.BATTLETEXTBOX, 0, 112, null);
			if (optionSelection)
				g.drawImage(ImageLoader.BATTLEOPTIONSBOX, 120, 112, null);
			else if (!optionSelection)
				g.drawImage(ImageLoader.BATTLEMOVESBOX, 0, 112, null);
			g.drawImage(ImageLoader.BATTLEENEMYPOKEMONSTATS, 10, 16, null);
			g.drawImage(ImageLoader.BATTLEMYPOKEMONSTATS, 126, 74, null);

			int tempHP = pokemon1.getHealthPercent();

			if (tempHP > 26) {
				g.drawImage(ImageLoader.POKEMONHEALTHBARGREEN, 174, 91, tempHP, 3, null);
			} else if (tempHP <= 26 && tempHP > 10) {
				g.drawImage(ImageLoader.POKEMONHEALTHBARYELLOW, 174, 91, tempHP, 3, null);
			} else if (tempHP <= 10 && tempHP > 0) {
				g.drawImage(ImageLoader.POKEMONHEALTHBARRED, 174, 91, tempHP, 3, null);
			}

			tempHP = pokemon2.getHealthPercent();

			if (tempHP > 26) {
				g.drawImage(ImageLoader.POKEMONHEALTHBARGREEN, 49, 33, tempHP, 3, null);
			} else if (tempHP <= 26 && tempHP > 10) {
				g.drawImage(ImageLoader.POKEMONHEALTHBARYELLOW, 49, 33, tempHP, 3, null);
			} else if (tempHP <= 10 && tempHP > 0) {
				g.drawImage(ImageLoader.POKEMONHEALTHBARRED, 49, 33, tempHP, 3, null);
			}

			if (currentChoice == 0 && optionSelection)
				g.drawImage(ImageLoader.BATTLESELECTIONARROW, 129, 124, null);
			else if (currentChoice == 1 && optionSelection)
				g.drawImage(ImageLoader.BATTLESELECTIONARROW, 185, 124, null);
			else if (currentChoice == 2 && optionSelection)
				g.drawImage(ImageLoader.BATTLESELECTIONARROW, 129, 140, null);
			else if (currentChoice == 3 && optionSelection)
				g.drawImage(ImageLoader.BATTLESELECTIONARROW, 185, 140, null);

			g.drawImage(pokemon2.getFrontAnimation().getImage(), 135, -8, null);
			g.drawImage(pokemon1.getBackAnimation().getImage(), 24, 32, null);

			BufferedImage[] pkm1Name = new BufferedImage[5];

			if (pokemon1.getGender() == 0) {
				pkm1Name = FontLoader.getBattleTranslation(pokemon1.getNickName() + "<");
			} else if (pokemon1.getGender() == 1) {
				pkm1Name = FontLoader.getBattleTranslation(pokemon1.getNickName() + ">");
			}

			for (int i = 0; i < pkm1Name.length; i++) {
				g.drawImage(pkm1Name[i], 142 + (i * 5), 79, null);
			}

			BufferedImage[] pkm2Name = new BufferedImage[5];

			if (pokemon2.getGender() == 0) {
				pkm2Name = FontLoader.getBattleTranslation(pokemon2.getNickName() + "<");
			} else if (pokemon2.getGender() == 1) {
				pkm2Name = FontLoader.getBattleTranslation(pokemon2.getNickName() + ">");
			}

			for (int i = 0; i < pkm2Name.length; i++) {
				g.drawImage(pkm2Name[i], 17 + (i * 5), 21, null);
			}

			BufferedImage[] tempPkm1 = FontLoader.getLevelImage(pokemon1.getLevel(), 1);

			for (int i = 0; i < tempPkm1.length; i++) {
				g.drawImage(tempPkm1[i], 206 + (i * 5), 79, null);
			}

			g.drawImage(ImageLoader.BATTLELEVELTEXT, 198, 79, null);

			BufferedImage[] tempPkm2 = FontLoader.getLevelImage(pokemon2.getLevel(), 1);

			for (int i = 0; i < tempPkm2.length; i++) {
				g.drawImage(tempPkm2[i], 81 + (i * 5), 21, null);
			}

			BufferedImage[] maxHealth = FontLoader.getLevelImage(pokemon1.getMaxHealth(), 1);
			BufferedImage[] currentHealth = FontLoader.getLevelImage(pokemon1.getHealth(), 1);

			if (currentHealth.length == 1) {
				for (int i = 0; i < currentHealth.length; i++) {
					g.drawImage(currentHealth[i], 196 + (i * 5), 97, null);
				}
			} else if (currentHealth.length == 2) {
				for (int i = 0; i < currentHealth.length; i++) {
					g.drawImage(currentHealth[i], 191 + (i * 5), 97, null);
				}
			} else if (currentHealth.length == 3) {
				for (int i = 0; i < currentHealth.length; i++) {
					g.drawImage(currentHealth[i], 186 + (i * 5), 97, null);
				}
			} else {
				for (int i = 0; i < currentHealth.length; i++) {
					g.drawImage(currentHealth[i], 181 + (i * 5), 97, null);
				}
			}

			for (int i = 0; i < maxHealth.length; i++) {
				g.drawImage(maxHealth[i], 206 + (i * 5), 97, null);
			}

			g.drawImage(ImageLoader.BATTLELEVELTEXT, 73, 21, null);

			if (!optionSelection) {
				BufferedImage[] move = new BufferedImage[3];
				if (pokemon1.getMove(0) != null) {
					move = FontLoader.getBattleTranslation(pokemon1.getMove(0).getName());
					for (int i = 0; i < move.length; i++) {
						g.drawImage(move[i], 16 + (i * 5), 125, null);
					}
				} else {
					move = FontLoader.getBattleTranslation("--");
					for (int i = 0; i < move.length; i++) {
						g.drawImage(move[i], 16 + (i * 4), 125, null);
					}
				}
				if (pokemon1.getMove(1) != null) {
					move = FontLoader.getBattleTranslation(pokemon1.getMove(1).getName());
					for (int i = 0; i < move.length; i++) {
						g.drawImage(move[i], 88 + (i * 5), 125, null);
					}
				} else {
					move = FontLoader.getBattleTranslation("--");
					for (int i = 0; i < move.length; i++) {
						g.drawImage(move[i], 88 + (i * 4), 125, null);
					}
				}
				if (pokemon1.getMove(2) != null) {
					move = FontLoader.getBattleTranslation(pokemon1.getMove(2).getName());
					for (int i = 0; i < move.length; i++) {
						g.drawImage(move[i], 16 + (i * 5), 141, null);
					}
				} else {
					move = FontLoader.getBattleTranslation("--");
					for (int i = 0; i < move.length; i++) {
						g.drawImage(move[i], 16 + (i * 4), 141, null);
					}
				}
				if (pokemon1.getMove(3) != null) {
					move = FontLoader.getBattleTranslation(pokemon1.getMove(3).getName());
					for (int i = 0; i < move.length; i++) {
						g.drawImage(move[i], 88 + (i * 5), 141, null);
					}
				} else {
					move = FontLoader.getBattleTranslation("--");
					for (int i = 0; i < move.length; i++) {
						g.drawImage(move[i], 88 + (i * 4), 141, null);
					}
				}
				BufferedImage[] moveType = new BufferedImage[5];
				BufferedImage[] movePP = new BufferedImage[2];
				BufferedImage[] moveMaxPP = new BufferedImage[2];
				if (currentBattleChoice == 0) {
					g.drawImage(ImageLoader.BATTLESELECTIONARROW, 9, 124, null);
					moveType = FontLoader.getBattleTranslation(pokemon1.getMove(0).getTypeString());
					movePP = FontLoader.getLevelImage(pokemon1.getMove(0).getPP(), 1);
					moveMaxPP = FontLoader.getLevelImage(pokemon1.getMove(0).getMaxPP(), 1);
					for (int i = 0; i < moveType.length; i++) {
						g.drawImage(moveType[i], 191 + (i * 5), 142, null);
					}
					if (movePP.length == 1) {
						for (int i = 0; i < movePP.length; i++) {
							g.drawImage(movePP[i], 209 + (i * 5), 125, null);
						}
					} else if (movePP.length == 2) {
						for (int i = 0; i < movePP.length; i++) {
							g.drawImage(movePP[i], 204 + (i * 5), 125, null);
						}
					}
					for (int i = 0; i < moveMaxPP.length; i++) {
						g.drawImage(moveMaxPP[i], 220 + (i * 5), 125, null);
					}
				} else if (currentBattleChoice == 1) {
					g.drawImage(ImageLoader.BATTLESELECTIONARROW, 81, 124, null);
					moveType = FontLoader.getBattleTranslation(pokemon1.getMove(1).getTypeString());
					movePP = FontLoader.getLevelImage(pokemon1.getMove(1).getPP(), 1);
					moveMaxPP = FontLoader.getLevelImage(pokemon1.getMove(1).getMaxPP(), 1);
					for (int i = 0; i < moveType.length; i++) {
						g.drawImage(moveType[i], 191 + (i * 5), 142, null);
					}
					if (movePP.length == 1) {
						for (int i = 0; i < movePP.length; i++) {
							g.drawImage(movePP[i], 209 + (i * 5), 125, null);
						}
					} else if (movePP.length == 2) {
						for (int i = 0; i < movePP.length; i++) {
							g.drawImage(movePP[i], 204 + (i * 5), 125, null);
						}
					}
					for (int i = 0; i < moveMaxPP.length; i++) {
						g.drawImage(moveMaxPP[i], 220 + (i * 5), 125, null);
					}
				} else if (currentBattleChoice == 2) {
					g.drawImage(ImageLoader.BATTLESELECTIONARROW, 9, 140, null);
					moveType = FontLoader.getBattleTranslation(pokemon1.getMove(2).getTypeString());
					movePP = FontLoader.getLevelImage(pokemon1.getMove(2).getPP(), 1);
					moveMaxPP = FontLoader.getLevelImage(pokemon1.getMove(2).getMaxPP(), 1);
					for (int i = 0; i < moveType.length; i++) {
						g.drawImage(moveType[i], 191 + (i * 5), 142, null);
					}
					if (movePP.length == 1) {
						for (int i = 0; i < movePP.length; i++) {
							g.drawImage(movePP[i], 209 + (i * 5), 125, null);
						}
					} else if (movePP.length == 2) {
						for (int i = 0; i < movePP.length; i++) {
							g.drawImage(movePP[i], 204 + (i * 5), 125, null);
						}
					}
					for (int i = 0; i < moveMaxPP.length; i++) {
						g.drawImage(moveMaxPP[i], 220 + (i * 5), 125, null);
					}
				} else if (currentBattleChoice == 3) {
					g.drawImage(ImageLoader.BATTLESELECTIONARROW, 81, 140, null);
					moveType = FontLoader.getBattleTranslation(pokemon1.getMove(3).getTypeString());
					movePP = FontLoader.getLevelImage(pokemon1.getMove(3).getPP(), 1);
					moveMaxPP = FontLoader.getLevelImage(pokemon1.getMove(3).getMaxPP(), 1);
					for (int i = 0; i < moveType.length; i++) {
						g.drawImage(moveType[i], 191 + (i * 5), 142, null);
					}
					if (movePP.length == 1) {
						for (int i = 0; i < movePP.length; i++) {
							g.drawImage(movePP[i], 209 + (i * 5), 125, null);
						}
					} else if (movePP.length == 2) {
						for (int i = 0; i < movePP.length; i++) {
							g.drawImage(movePP[i], 204 + (i * 5), 125, null);
						}
					}
					for (int i = 0; i < moveMaxPP.length; i++) {
						g.drawImage(moveMaxPP[i], 220 + (i * 5), 125, null);
					}
				}
			}

		}

		pokemon1.draw(g);
		pokemon2.draw(g);

	}

	public void select() {

		if (startScene) {

		} else {

			if (currentChoice == 0 && optionSelection) {
				optionSelection = false;
			} else if (currentChoice == 1 && optionSelection) {

			} else if (currentChoice == 2 && optionSelection) {

			} else if (currentChoice == 3 && optionSelection) {
				System.exit(0);
			} else if (!optionSelection) {
				if (pokemon1.getMove(currentBattleChoice).getPP() > 0) {
					int temp = BattleDamage.getDamage(pokemon1, pokemon2, pokemon1.getMove(currentBattleChoice));
					int temp2 = BattleDamage.getDamage(pokemon2, pokemon1, pokemon1.getMove(currentBattleChoice));
					pokemon2.damage(temp);
					pokemon1.getMove(currentBattleChoice).setPP(pokemon1.getMove(currentBattleChoice).getPP() - 1);
					pokemon1.getMove(currentBattleChoice).playAnimation();
					pokemon1.damage(temp2);
				}
			}

		}

	}

	public void handleInput() {

		if (Keys.isPressed(Keys.PLAYER_A)) {
			JukeBox.play("textclick");
			select();
		}

		if (startScene) {

		} else if (battleScene) {

		} else {

			if (Keys.isPressed(Keys.BACKSPACE) && !optionSelection)
				optionSelection = true;

			if (Keys.isPressed(Keys.UPARROW)) {
				if (optionSelection) {
					if (currentChoice == 2 || currentChoice == 3) {
						currentChoice -= 2;
					}
				} else {
					if (currentBattleChoice == 2 || currentBattleChoice == 3) {
						currentBattleChoice -= 2;
					}
				}
			} else if (Keys.isPressed(Keys.DOWNARROW)) {
				if (optionSelection) {
					if (currentChoice == 0 || currentChoice == 1) {
						currentChoice += 2;
					}
				} else {
					if (currentBattleChoice == 0) {
						if (pokemon1.getMove(2) != null) {
							currentBattleChoice += 2;
						}
					} else if (currentBattleChoice == 1) {
						if (pokemon1.getMove(3) != null) {
							currentBattleChoice += 2;
						}
					}
				}
			} else if (Keys.isPressed(Keys.RIGHTARROW)) {
				if (optionSelection) {
					if (currentChoice == 0 || currentChoice == 2) {
						currentChoice += 1;
					}
				} else {
					if (currentBattleChoice == 0) {
						if (pokemon1.getMove(1) != null) {
							currentBattleChoice += 1;
						}
					} else if (currentBattleChoice == 2) {
						if (pokemon1.getMove(3) != null) {
							currentBattleChoice += 1;
						}
					}
				}
			} else if (Keys.isPressed(Keys.LEFTARROW)) {
				if (optionSelection) {
					if (currentChoice == 1 || currentChoice == 3) {
						currentChoice -= 1;
					}
				} else {
					if (currentBattleChoice == 1 || currentBattleChoice == 3) {
						currentBattleChoice -= 1;
					}
				}
			}

		}

	}

}
