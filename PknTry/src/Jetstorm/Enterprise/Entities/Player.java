package Jetstorm.Enterprise.Entities;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;

import Jetstorm.Enterprise.Entities.Items.Items;
import Jetstorm.Enterprise.Entities.Items.Berries.Berries;
import Jetstorm.Enterprise.Entities.Pokemon.Arcanine;
import Jetstorm.Enterprise.Entities.Pokemon.Blastoise;
import Jetstorm.Enterprise.Entities.Pokemon.Butterfree;
import Jetstorm.Enterprise.Entities.Pokemon.Charizard;
import Jetstorm.Enterprise.Entities.Pokemon.Pidgeot;
import Jetstorm.Enterprise.Entities.Pokemon.Pokemon;
import Jetstorm.Enterprise.Entities.Pokemon.Venusaur;
import Jetstorm.Enterprise.Entities.Pokemon.Moves.Ember;
import Jetstorm.Enterprise.Entities.Pokemon.Moves.Move;
import Jetstorm.Enterprise.Handlers.Animation;
import Jetstorm.Enterprise.Handlers.ImageLoader;
import Jetstorm.Enterprise.Handlers.Keys;
import Jetstorm.Enterprise.Handlers.PlayerBag;
import Jetstorm.Enterprise.Handlers.PokeboxInventory;
import Jetstorm.Enterprise.Handlers.PokemonImageLoader;
import Jetstorm.Enterprise.Handlers.PokemonInfo;
import Jetstorm.Enterprise.Handlers.ViewingPokemon;
import Jetstorm.Enterprise.Handlers.Font.FontLoader;
import Jetstorm.Enterprise.TileMap.TileMap;

public class Player {

	private Random ran = new Random();
	private Animation animation;
	private TileMap tileMap;
	private int currentAction;

	private double x;
	private double y;
	private double xmap;
	private double ymap;
	private int width;
	private int height;
	// private int cWidth;
	// private int cHeight;
	// private int moveWaitTime;

	// private boolean up, down, left, right;

	private boolean running;
	private boolean walking;
	private int timer;
	private ArrayList<BufferedImage[]> sprites;
	private int playerSelected = 1;
	private BufferedImage[] battleScene;
	private final int[] numFrames = { 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2 };

	private String name;
	private int gender = 1; // 0=F, 1=M
	private boolean interact;
	private boolean busy;
	private String direction = "Down";

	private boolean pokemonSelect = false;
	private boolean viewingPokemon = false;
	private int currentPage = 0;
	private int currentPokemonChoice = 0;

	private boolean inventoryBag = false;
	private int currentBagItem = 0;
	private int currentBagPage = 0;

	private boolean storageBox = false;

	private boolean paused = false;
	private int currentChoice = 0;
	private int startMenuItems = 5; // Least:4, Most: 6
	private ArrayList<BufferedImage[]> startMenuText;
	private TextBoxClass startMenu;

	private boolean moveRight;
	private boolean moveLeft;
	private boolean moveUp;
	private boolean moveDown;
	private int tempTry = 0;

	private boolean keepRight;
	private boolean keepLeft;
	private boolean keepUp;
	private boolean keepDown;

	private static final int IDLEDOWN = 0;
	private static final int IDLELEFT = 1;
	private static final int IDLEUP = 2;
	private static final int IDLERIGHT = 3;
	private static final int WALKINGDOWN = 4;
	private static final int WALKINGLEFT = 5;
	private static final int WALKINGUP = 6;
	private static final int WALKINGRIGHT = 7;
	private static final int RUNNINGDOWN = 8;
	private static final int RUNNINGLEFT = 9;
	private static final int RUNNINGUP = 10;
	private static final int RUNNINGRIGHT = 11;

	public Player() {

		width = 19;
		height = 19;
		name = "Jetstorm";

		ArrayList<ArrayList<Items>> items = new ArrayList<ArrayList<Items>>();
		ArrayList<Items> temp = null;

		for (int i = 0; i < 5; i++) {
			temp = new ArrayList<Items>();
			Berries berry = new Berries("CHERI BERRY", 1);
			Berries berry1 = new Berries("GREPA BERRY", 25);
			Berries berry2 = new Berries("YACHE BERRY", 40);
			Berries berry3 = new Berries("ORAN BERRY", 7);
			temp.add(berry);
			temp.add(berry1);
			temp.add(berry2);
			temp.add(berry3);
			items.add(temp);
		}

		items.add(temp);

		PlayerBag.setItems(items);

		Move[] moves = new Move[4];
		moves[0] = new Ember();

		ArrayList<Pokemon> pokemon = new ArrayList<Pokemon>();

		for (int i = 1; i < PokemonImageLoader.pokemonFinished + 1; i++) {
			moves = new Move[4];
			moves[0] = new Ember();
			Pokemon poke = PokemonInfo.generatePokemon(i, 50);
			poke.addExp(ran.nextInt(poke.getMaxExp() - poke.getExp()));
			poke.setMoveList(moves);
			PokeboxInventory.depositPokemon(poke);
		}
		
		for (int i = 0; i < 10; i++) {
			Charizard tkpm = new Charizard(50);
			tkpm.addExp(ran.nextInt(tkpm.getMaxExp() - tkpm.getExp()));
			PokeboxInventory.depositPokemon(tkpm);
		}

		Pidgeot tempPkm = new Pidgeot(10);
		tempPkm.addExp(ran.nextInt(tempPkm.getMaxExp() - tempPkm.getExp()));
		tempPkm.setMoveList(moves);
		pokemon.add(tempPkm);

		moves = new Move[4];
		moves[0] = new Ember();
		Charizard tempPkm2 = new Charizard(10);
		tempPkm2.addExp(ran.nextInt(tempPkm2.getMaxExp() - tempPkm2.getExp()));
		tempPkm.setMoveList(moves);
		pokemon.add(tempPkm2);

		moves = new Move[4];
		moves[0] = new Ember();
		Blastoise tempPkm3 = new Blastoise(10);
		tempPkm3.addExp(ran.nextInt(tempPkm3.getMaxExp() - tempPkm3.getExp()));
		tempPkm3.setMoveList(moves);
		pokemon.add(tempPkm3);

		moves = new Move[4];
		moves[0] = new Ember();
		Butterfree tempPkm4 = new Butterfree(10);
		tempPkm4.addExp(ran.nextInt(tempPkm4.getMaxExp() - tempPkm4.getExp()));
		tempPkm4.setMoveList(moves);
		pokemon.add(tempPkm4);

		moves = new Move[4];
		moves[0] = new Ember();
		Venusaur tempPkm5 = new Venusaur(10);
		tempPkm5.addExp(ran.nextInt(tempPkm5.getMaxExp() - tempPkm5.getExp()));
		tempPkm5.setMoveList(moves);
		pokemon.add(tempPkm5);
		
		Arcanine tempPkm6 = new Arcanine(10);
		tempPkm6.addExp(ran.nextInt(tempPkm5.getMaxExp() - tempPkm5.getExp()));
		pokemon.add(tempPkm6);

		PlayerBag.setPokemon(pokemon);

		startMenu = new TextBoxClass("textbox", 176, 0, 64, 120);
		startMenuText = new ArrayList<BufferedImage[]>();

		startMenuText.add(FontLoader.getDarkTranslation("POKEMON"));
		startMenuText.add(FontLoader.getDarkTranslation("BAG"));
		startMenuText.add(FontLoader.getDarkTranslation(name));
		startMenuText.add(FontLoader.getDarkTranslation("SAVE"));
		startMenuText.add(FontLoader.getDarkTranslation("OPTIONS"));
		startMenuText.add(FontLoader.getDarkTranslation("EXIT"));

		try {

			BufferedImage image = null;
			battleScene = new BufferedImage[5];

			if (gender == 1) {

				if (playerSelected == 1) {

					image = ImageIO.read(getClass().getResourceAsStream("/entities/player.png"));

					for (int i = 0; i < battleScene.length; i++) {
						battleScene[i] = ImageIO.read(
								getClass().getResourceAsStream("/entities/player1battlescene.png")).getSubimage(
								0 + (i * 64), 0, 64, 64);
					}

				}

			}

			sprites = new ArrayList<BufferedImage[]>();

			for (int i = 0; i < 12; i++) {

				if (i < 4) {
					BufferedImage[] bi = new BufferedImage[numFrames[i]];
					bi[0] = image.getSubimage(0 + (i * 57), 19, width, height);
					sprites.add(bi);
				} else if (i >= 4 && i < 8) {
					BufferedImage[] bi = new BufferedImage[numFrames[i]];
					bi[0] = image.getSubimage(19 + ((i - 4) * 57), 19, width, height);
					bi[1] = image.getSubimage(38 + ((i - 4) * 57), 19, width, height);
					sprites.add(bi);
				} else if (i >= 8) {
					BufferedImage[] bi = new BufferedImage[numFrames[i]];
					bi[0] = image.getSubimage(19 + ((i - 8) * 57), 0, width, height);
					bi[1] = image.getSubimage(38 + ((i - 8) * 57), 0, width, height);
					sprites.add(bi);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		animation = new Animation();
		currentAction = IDLEDOWN;
		animation.setFrames(sprites.get(IDLEDOWN));
		animation.setDelay(30);

	}

	public void setTileMap(TileMap tm) {
		tileMap = tm;
	}

	public int getx() {
		return (int) x;
	}

	public int gety() {
		return (int) y;
	}

	public BufferedImage[] getBattleAnimation() {

		return battleScene;

	}

	public void stop() {
		currentAction = IDLEDOWN;
	}

	public void setWalking(boolean w) {
		walking = w;
	}

	public void setRunning(boolean r) {
		running = r;
	}

	public void moveDown() {
		if (!moveRight && !moveLeft && !moveUp && !moveDown) {
			// down = true;
			// left = up = right = false;
			moveDown = true;
			tempTry = 16;
			timer = 0;
			animation.setFrames(sprites.get(WALKINGDOWN));
			if (running)
				animation.setFrames(sprites.get(RUNNINGDOWN));
		}
	}

	public void moveLeft() {
		if (!moveRight && !moveLeft && !moveUp && !moveDown) {
			// left = true;
			// down = up = right = false;
			moveLeft = true;
			tempTry = 16;
			timer = 0;
			animation.setFrames(sprites.get(WALKINGLEFT));
			if (running)
				animation.setFrames(sprites.get(RUNNINGLEFT));
		}
	}

	public void moveUp() {
		if (!moveRight && !moveLeft && !moveUp && !moveDown) {
			// up = true;
			// down = left = right = false;
			moveUp = true;
			tempTry = 16;
			timer = 0;
			animation.setFrames(sprites.get(WALKINGUP));
			if (running)
				animation.setFrames(sprites.get(RUNNINGUP));
		}
	}

	public void moveRight() {
		if (!moveRight && !moveLeft && !moveUp && !moveDown) {
			// right = true;
			// down = left = up = false;
			moveRight = true;
			tempTry = 16;
			timer = 0;
			animation.setFrames(sprites.get(WALKINGRIGHT));
			if (running)
				animation.setFrames(sprites.get(RUNNINGRIGHT));
		}
	}

	public int getTimer() {
		return timer;
	}

	public void setTimer(int i) {
		timer = i;
	}

	public boolean getWalking() {
		return walking;
	}

	public boolean getRunning() {
		return running;
	}

	public void setPosition(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public boolean getMoveRight() {
		return moveRight;
	}

	public boolean getMoveLeft() {
		return moveLeft;
	}

	public boolean getMoveUp() {
		return moveUp;
	}

	public boolean getMoveDown() {
		return moveDown;
	}

	public void stayDown() {
		keepDown = true;
		keepUp = keepRight = keepLeft = false;
	}

	public void stayLeft() {
		keepLeft = true;
		keepDown = keepRight = keepUp = false;
	}

	public void stayRight() {
		keepRight = true;
		keepDown = keepLeft = keepUp = false;
	}

	public void stayUp() {
		keepUp = true;
		keepDown = keepLeft = keepRight = false;
	}

	public void allMoveStop() {
		keepDown = keepUp = keepLeft = keepRight = false;
	}

	public void setGender(int gen) {
		gender = gen;
	}

	public int getGender() {
		return gender;
	}

	public boolean getInteract() {
		return interact;
	}

	public String getDirection() {
		return direction;
	}

	public boolean isBusy() {
		return busy;
	}

	public void setBusy(boolean busy) {
		this.busy = busy;
	}

	public void setInteract(boolean inter) {
		interact = inter;
	}

	public void update() {

		if (viewingPokemon) {
			ViewingPokemon.setPokemon(PlayerBag.getPokemon(currentPokemonChoice));
			ViewingPokemon.update();
		}

		if (moveRight || moveLeft || moveUp || moveDown) {
			timer++;
			double temp = 3;
			animation.setDelay(180);
			if (running) {
				temp = 1;
				animation.setDelay(120);
			}
			if (timer % temp == 0) {
				if (moveRight) {
					// x++;
					tileMap.moveRight();
				} else if (moveLeft) {
					// x--;
					tileMap.moveLeft();
				} else if (moveUp) {
					// y--;
					tileMap.moveUp();
				} else if (moveDown) {
					// y++;
					tileMap.moveDown();
				}
				tempTry--;
				if (tempTry == 0) {
					if (moveRight && !keepRight) {
						animation.setFrames(sprites.get(IDLERIGHT));
						direction = "Right";
					} else if (moveLeft && !keepLeft) {
						animation.setFrames(sprites.get(IDLELEFT));
						direction = "Left";
					} else if (moveUp && !keepUp) {
						animation.setFrames(sprites.get(IDLEUP));
						direction = "Up";
					} else if (moveDown && !keepDown) {
						animation.setFrames(sprites.get(IDLEDOWN));
						direction = "Down";
					}
					moveRight = moveLeft = moveUp = moveDown = false;
				}
			}
		}

		PlayerBag.update();

		if (storageBox) {
			if (PokeboxInventory.summary) {
				ViewingPokemon.setPokemon(PokeboxInventory.getPokemon());
			}
			PokeboxInventory.update();
		}

		// getNextPosition();
		animation.update();

	}

	public void draw(Graphics2D g) {

		g.drawImage(animation.getImage(), (int) (x + xmap - width / 2), (int) (y + ymap - height / 2), null);

	}

	public void drawText(Graphics2D g) {

		if (paused) {
			if (!pokemonSelect && !viewingPokemon && !inventoryBag && !storageBox) {
				if (startMenuText.size() == 5) {
					startMenu.setSize(64, 80);
				} else if (startMenuText.size() == 6) {
					startMenu.setSize(64, 88);
				} else if (startMenuText.size() == 7) {
					startMenu.setSize(64, 104);
				}
				startMenu.draw(g);
				for (int i = 0; i < startMenuText.size(); i++) {
					for (int k = 0; k < startMenuText.get(i).length; k++) {
						g.drawImage(startMenuText.get(i)[k], 190 + (k * 5), 10 + (i * 12), null);
					}
				}
				g.drawImage(ImageLoader.BATTLESELECTIONARROW, 183, 22 + (12 * (currentChoice - 1)), null);

			} else if (pokemonSelect) {

				g.drawImage(ImageLoader.POKEMONSELECTBACKGROUND, 0, 0, null);

				if (currentPokemonChoice == 0) {
					g.drawImage(ImageLoader.POKEMONSELECTFIRSTLIGHT, 2, 18, null);
					g.drawImage(ImageLoader.POKEMONSELECTCANCELDARK, 184, 134, null);
					if (PlayerBag.getArraySize() > 1) {
						for (int i = 1; i < PlayerBag.getArraySize(); i++) {
							g.drawImage(ImageLoader.POKEMONSELECTOTHERDARK, 88, 10 + ((i - 1) * 24), null);
						}
					}
				} else if (currentPokemonChoice == PlayerBag.getArraySize()) {
					g.drawImage(ImageLoader.POKEMONSELECTFIRSTDARK, 2, 20, null);
					g.drawImage(ImageLoader.POKEMONSELECTCANCELLIGHT, 184, 132, null);
					if (PlayerBag.getArraySize() > 1) {
						for (int i = 1; i < PlayerBag.getArraySize(); i++) {
							g.drawImage(ImageLoader.POKEMONSELECTOTHERDARK, 88, 10 + ((i - 1) * 24), null);
						}
					}
				} else {
					g.drawImage(ImageLoader.POKEMONSELECTFIRSTDARK, 2, 20, null);
					if (PlayerBag.getArraySize() > 1) {
						for (int i = 1; i < PlayerBag.getArraySize(); i++) {
							if (currentPokemonChoice == i) {
								g.drawImage(ImageLoader.POKEMONSELECTOTHERLIGHT, 88, 9 + ((i - 1) * 24), null);
							} else {
								g.drawImage(ImageLoader.POKEMONSELECTOTHERDARK, 88, 10 + ((i - 1) * 24), null);
							}
						}
						g.drawImage(ImageLoader.POKEMONSELECTCANCELDARK, 184, 134, null);
					}
				}

				BufferedImage[] tempName;
				BufferedImage[] tempLevel;
				BufferedImage[] tempGen = null;
				BufferedImage[] tempHealth;
				BufferedImage[] tempMaxHealth;

				for (int i = 0; i < PlayerBag.getArraySize(); i++) {
					int tempHealthPercent = PlayerBag.getPokemon(i).getHealthPercent();
					for (int k = 0; k < tempHealthPercent; k++) {
						if (i == 0) {
							if (tempHealthPercent > 26) {
								g.drawImage(ImageLoader.POKEMONHEALTHBARGREEN, 32 + (k * 1), 59, null);
							} else if (tempHealthPercent <= 26 && tempHealthPercent > 10) {
								g.drawImage(ImageLoader.POKEMONHEALTHBARYELLOW, 32 + (k * 1), 59, null);
							} else if (tempHealthPercent <= 10) {
								g.drawImage(ImageLoader.POKEMONHEALTHBARRED, 32 + (k * 1), 59, null);
							}
						} else {
							if (tempHealthPercent > 26) {
								g.drawImage(ImageLoader.POKEMONHEALTHBARGREEN, 184 + (k * 1), 18 + ((i - 1) * 24), null);
							} else if (tempHealthPercent <= 26 && tempHealthPercent > 10) {
								g.drawImage(ImageLoader.POKEMONHEALTHBARYELLOW, 184 + (k * 1), 18 + ((i - 1) * 24),
										null);
							} else if (tempHealthPercent <= 10) {
								g.drawImage(ImageLoader.POKEMONHEALTHBARRED, 184 + (k * 1), 18 + ((i - 1) * 24), null);
							}
						}
					}
					tempName = FontLoader.getPokemonSelectTranslation(PlayerBag.getPokemon(i).getNickName());
					tempLevel = FontLoader.getLevelImage(PlayerBag.getPokemon(i).getLevel(), 4);
					if (PlayerBag.getPokemon(i).getGender() == 0) {
						tempGen = FontLoader.getPokemonSelectTranslation("<");
					} else if (PlayerBag.getPokemon(i).getGender() == 1) {
						tempGen = FontLoader.getPokemonSelectTranslation(">");
					}
					tempHealth = FontLoader.getLevelImage(PlayerBag.getPokemon(i).getHealth(), 4);
					tempMaxHealth = FontLoader.getLevelImage(PlayerBag.getPokemon(i).getMaxHealth(), 4);
					for (int k = 0; k < tempName.length; k++) {
						if (i == 0) {
							g.drawImage(tempName[k], 30 + (k * 5), 38, null);
						} else {
							g.drawImage(tempName[k], 118 + (k * 5), 13 + ((i - 1) * 24), null);
						}
					}
					for (int k = 0; k < tempLevel.length; k++) {
						if (i == 0) {
							g.drawImage(tempLevel[k], 48 + (k * 5), 48, null);
						} else {
							g.drawImage(tempLevel[k], 136 + (k * 5), 24 + ((i - 1) * 24), null);
						}
					}
					for (int k = 0; k < tempGen.length; k++) {
						if (i == 0) {
							g.drawImage(tempGen[k], 68, 48, null);
						} else {
							g.drawImage(tempGen[k], 170, 24 + ((i - 1) * 24), null);
						}
					}
					for (int k = 0; k < tempHealth.length; k++) {
						if (i == 0) {
							if (tempHealth.length == 1) {
								g.drawImage(tempHealth[k], 56 + (k * 5), 64, null);
							} else if (tempHealth.length == 2) {
								g.drawImage(tempHealth[k], 51 + (k * 5), 64, null);
							} else {
								g.drawImage(tempHealth[k], 46 + (k * 5), 64, null);
							}
						} else {
							if (tempHealth.length == 1) {
								g.drawImage(tempHealth[k], 208 + (k * 5), 24 + ((i - 1) * 24), null);
							} else if (tempHealth.length == 2) {
								g.drawImage(tempHealth[k], 203 + (k * 5), 24 + ((i - 1) * 24), null);
							} else {
								g.drawImage(tempHealth[k], 198 + (k * 5), 24 + ((i - 1) * 24), null);
							}
						}
					}
					for (int k = 0; k < tempMaxHealth.length; k++) {
						if (i == 0) {
							g.drawImage(tempMaxHealth[k], 66 + (k * 5), 64, null);
						} else {
							g.drawImage(tempMaxHealth[k], 218 + (k * 5), 24 + ((i - 1) * 24), null);
						}
					}

					if (i == 0) {
						g.drawImage(PlayerBag.getPokemon(i).getIconAnimation().getImage(), 0, 20, null);
					} else {
						g.drawImage(PlayerBag.getPokemon(i).getIconAnimation().getImage(), 85, 3 + ((i - 1) * 24), null);
					}

				}

			} else if (viewingPokemon) {

				ViewingPokemon.draw(g);

			} else if (inventoryBag) {

				if (gender == 1) {
					g.drawImage(ImageLoader.MALEBAGBG, 0, 0, null);
				} else {
					g.drawImage(ImageLoader.FEMALEBAGBG, 0, 0, null);
				}

				if (currentBagPage == 0) {
					g.drawImage(ImageLoader.BAGTITLEONE, 24, 8, null);
				} else if (currentBagPage == 1) {
					g.drawImage(ImageLoader.BAGTITLETWO, 24, 8, null);
				} else if (currentBagPage == 2) {
					g.drawImage(ImageLoader.BAGTITLETHREE, 24, 8, null);
				} else if (currentBagPage == 3) {
					g.drawImage(ImageLoader.BAGTITLEFOUR, 24, 8, null);
				} else if (currentBagPage == 4) {
					g.drawImage(ImageLoader.BAGTITLEFIVE, 24, 8, null);
				}

				for (int i = 0; i < PlayerBag.getItemList(currentBagPage).size() + 1; i++) {
					BufferedImage[] temp = null;
					BufferedImage[] tempNum;
					if (i < PlayerBag.getItemList(currentBagPage).size()) {
						if (currentBagPage == 3) {

							temp = PlayerBag.getItemList(currentBagPage).get(i).getBerryText();

							for (int k = 0; k < temp.length; k++) {
								if (k < 2) {
									g.drawImage(temp[k], 120 + (k * 4), 21 + (i * 12), null);
								} else if (k >= 2 && k < 5) {
									g.drawImage(temp[k], 129 + ((k - 2) * 5), 21 + (i * 12), null);
								} else {
									g.drawImage(temp[k], 140 + ((k - 5) * 6), 19 + (i * 12), null);
								}
							}

						} else {

							temp = FontLoader
									.getDarkTranslation(PlayerBag.getItemList(currentBagPage).get(i).getName());

							for (int k = 0; k < temp.length; k++) {
								g.drawImage(temp[k], 120 + (k * 6), 19 + (i * 12), null);
							}

						}
						if (PlayerBag.getItemList(currentBagPage).get(i).getNumberOfItems() < 10) {
							tempNum = FontLoader
									.getDarkTranslation("x "
											+ Integer.toString(PlayerBag.getItemList(currentBagPage).get(i)
													.getNumberOfItems()));
						} else {
							tempNum = FontLoader
									.getDarkTranslation("x"
											+ Integer.toString(PlayerBag.getItemList(currentBagPage).get(i)
													.getNumberOfItems()));
						}
						for (int k = 0; k < tempNum.length; k++) {
							g.drawImage(tempNum[k], 213 + (k * 6), 19 + (i * 12), null);
						}
					} else {
						temp = FontLoader.getDarkTranslation("CLOSE BAG");
						for (int k = 0; k < temp.length; k++) {
							g.drawImage(temp[k], 120 + (k * 6), 19 + (i * 12), null);
						}
					}
				}

				g.drawImage(ImageLoader.BATTLESELECTIONARROW, 113, 19 + (currentBagItem * 12), null);

				if (currentBagItem < PlayerBag.getItemList(currentBagPage).size()) {
					g.drawImage(PlayerBag.getItemList(currentBagPage).get(currentBagItem).getImage(), 0, 68, null);
				}

			}

		} else if (!paused) {
			if (storageBox) {
				PokeboxInventory.draw(g);
				if (PokeboxInventory.summary) {
					ViewingPokemon.draw(g);
				}
			}
		}

	}

	private void select() {

		if (!pokemonSelect && !viewingPokemon && !inventoryBag && !storageBox) {
			if (startMenuItems == 4) {
				if (currentChoice == 0) {
					inventoryBag = true;
				} else if (currentChoice == 1) {

				} else if (currentChoice == 2) {

				} else if (currentChoice == 3) {

				} else if (currentChoice == 4) {
					paused = false;
				}
			} else if (startMenuItems == 5) {
				if (currentChoice == 0) {
					pokemonSelect = true;
				} else if (currentChoice == 1) {
					inventoryBag = true;
				} else if (currentChoice == 2) {

				} else if (currentChoice == 3) {

				} else if (currentChoice == 4) {

				} else if (currentChoice == 5) {
					paused = false;
				}
			} else if (startMenuItems == 6) {
				if (currentChoice == 0) {

				} else if (currentChoice == 1) {
					pokemonSelect = true;
				} else if (currentChoice == 2) {
					inventoryBag = true;
				} else if (currentChoice == 3) {

				} else if (currentChoice == 4) {

				} else if (currentChoice == 5) {

				} else if (currentChoice == 6) {
					paused = false;
				}
			}
		} else if (pokemonSelect) {
			if (currentPokemonChoice < PlayerBag.getArraySize()) {
				pokemonSelect = false;
				viewingPokemon = true;
			} else if (currentPokemonChoice == PlayerBag.getArraySize()) {
				pokemonSelect = false;
				viewingPokemon = false;
			}
		} else if (inventoryBag) {

			if (currentBagItem == PlayerBag.getItemList(currentBagPage).size()) {
				inventoryBag = false;
			}

		} else if (storageBox) {

			if (PokeboxInventory.boxOptions) {
				if (PokeboxInventory.currentOptionsSelect == 0) {
					PokeboxInventory.jump = true;
					PokeboxInventory.boxOptions = false;
				} else if (PokeboxInventory.currentOptionsSelect == 1) {
					PokeboxInventory.wallpaper = true;
					PokeboxInventory.boxOptions = false;
				} else if (PokeboxInventory.currentOptionsSelect == 2) {

				} else if (PokeboxInventory.currentOptionsSelect == 3) {
					PokeboxInventory.boxOptions = false;
				}

			} else if (PokeboxInventory.pokeOptions) {

				if (PokeboxInventory.currentOptionsSelect == 0) {
					if (PokeboxInventory.carrying) {
						PokeboxInventory.putdownPokemon();
						PokeboxInventory.pokeOptions = false;
					} else {
						PokeboxInventory.pickupPokemon();
						PokeboxInventory.pokeOptions = false;
					}
				} else if (PokeboxInventory.currentOptionsSelect == 1) {
					PokeboxInventory.summary = true;
					PokeboxInventory.pokeOptions = false;
				} else if (PokeboxInventory.currentOptionsSelect == 5) {
					PokeboxInventory.pokeOptions = false;
				}

			} else if (PokeboxInventory.currentPokemon) {
				if (PokeboxInventory.currentPokemonSelect == PlayerBag.getArraySize()) {
					PokeboxInventory.closeCurrentPokemon();
				} else {
					PokeboxInventory.pokeOptions = true;
				}
			} else {
				if (PokeboxInventory.currentYChoice == 1) {
					PokeboxInventory.boxOptions = true;
				} else if (PokeboxInventory.currentYChoice >= 2) {
					if (PokeboxInventory.getPokemon() != null || PokeboxInventory.carrying) {
						PokeboxInventory.pokeOptions = true;
					}
				}
			}

		}

	}

	public void handleInput() {

		if (!paused) {

			if (!storageBox) {
				if (Keys.downKeyPress() && !busy) {
					stayDown();
					moveDown();
				} else if (Keys.upKeyPress() && !busy) {
					stayUp();
					moveUp();
				} else if (Keys.leftKeyPress() && !busy) {
					stayLeft();
					moveLeft();
				} else if (Keys.rightKeyPress() && !busy) {
					stayRight();
					moveRight();
				} else {
					allMoveStop();
				}

				if (Keys.isHeld(Keys.SHIFT) && timer == 0) {
					running = true;
				} else if (!Keys.isHeld(Keys.SHIFT) && timer != 0) {
					running = false;
				}

				if (Keys.isPressed(Keys.PLAYER_START)) {
					paused = true;
					busy = true;
				}

				if (Keys.isPressed(Keys.PLAYER_A) && !moveLeft && !moveRight && !moveDown && !moveUp) {
					interact = true;
				} else if (!busy) {
					interact = false;
				}

				if (Keys.isPressed(Keys.BACKSPACE)) {
					storageBox = true;
				}

			} else if (storageBox) {

				if (!PokeboxInventory.moveLeft && !PokeboxInventory.moveRight && !PokeboxInventory.openPokemon
						&& !PokeboxInventory.closePokemon) {

					if (PokeboxInventory.currentPokemon) {

						if (Keys.isPressed(Keys.PLAYER_A)) {
							select();
						}

						if (Keys.isPressed(Keys.PLAYER_B)) {
							PokeboxInventory.closeCurrentPokemon();
						}

						if (Keys.isPressed(Keys.LEFTARROW)) {

							if (PokeboxInventory.currentPokemonSelect > 0) {
								PokeboxInventory.currentPokemonSelect = 0;
							}

						} else if (Keys.isPressed(Keys.RIGHTARROW)) {

							if (PokeboxInventory.currentPokemonSelect == 0) {
								PokeboxInventory.currentPokemonSelect = 1;
							} else {
								PokeboxInventory.closeCurrentPokemon();
							}

						} else if (Keys.isPressed(Keys.UPARROW)) {

							if (PokeboxInventory.currentPokemonSelect > 0) {
								PokeboxInventory.currentPokemonSelect -= 1;
							}

						} else if (Keys.isPressed(Keys.DOWNARROW)) {

							if (PokeboxInventory.carrying) {

								if (PokeboxInventory.currentPokemonSelect < 6) {
									PokeboxInventory.currentPokemonSelect += 1;
								}

							} else {

								if (PokeboxInventory.currentPokemonSelect < PlayerBag.getArraySize()) {
									PokeboxInventory.currentPokemonSelect += 1;
								}

							}

						}

					} else {

						if (PokeboxInventory.boxOptions) {

							if (Keys.isPressed(Keys.PLAYER_A)) {
								select();
								PokeboxInventory.currentOptionsSelect = 0;
							}

							if (Keys.isPressed(Keys.PLAYER_B) && PokeboxInventory.boxOptions) {
								PokeboxInventory.boxOptions = false;
							}

							if (Keys.isPressed(Keys.UPARROW)) {
								if (PokeboxInventory.currentOptionsSelect > 0) {
									PokeboxInventory.currentOptionsSelect -= 1;
								}
							} else if (Keys.isPressed(Keys.DOWNARROW)) {
								if (PokeboxInventory.currentOptionsSelect < 3) {
									PokeboxInventory.currentOptionsSelect += 1;
								}
							}

						} else if (PokeboxInventory.wallpaper) {

							if (Keys.isPressed(Keys.PLAYER_A)) {
								PokeboxInventory.boxBackground[PokeboxInventory.currentBox] = PokeboxInventory.currentOptionsSelect + 1;
								PokeboxInventory.wallpaper = false;
								PokeboxInventory.currentOptionsSelect = 0;
								PokeboxInventory.staticOptionsSelect = 0;
							}

							if (Keys.isPressed(Keys.PLAYER_B)) {
								PokeboxInventory.wallpaper = false;
								PokeboxInventory.boxOptions = true;
								PokeboxInventory.currentOptionsSelect = 0;
								PokeboxInventory.staticOptionsSelect = 0;
							}

							if (Keys.isPressed(Keys.UPARROW)) {

								if (PokeboxInventory.currentOptionsSelect > 0) {
									PokeboxInventory.currentOptionsSelect -= 1;
								}

								if (PokeboxInventory.staticOptionsSelect == 1) {
									PokeboxInventory.staticOptionsSelect = 0;
								} else if (PokeboxInventory.staticOptionsSelect == 2) {
									PokeboxInventory.staticOptionsSelect = 1;
								} else if (PokeboxInventory.staticOptionsSelect == 3) {
									PokeboxInventory.staticOptionsSelect = 2;
								}

							} else if (Keys.isPressed(Keys.DOWNARROW)) {

								if (PokeboxInventory.currentOptionsSelect < PokeboxInventory.bgList.length - 1) {
									PokeboxInventory.currentOptionsSelect += 1;
								}

								if (PokeboxInventory.staticOptionsSelect == 0) {
									PokeboxInventory.staticOptionsSelect = 1;
								} else if (PokeboxInventory.staticOptionsSelect == 1) {
									PokeboxInventory.staticOptionsSelect = 2;
								} else if (PokeboxInventory.staticOptionsSelect == 2) {
									PokeboxInventory.staticOptionsSelect = 3;
								}

							}

						} else if (PokeboxInventory.jump) {

							if (Keys.isPressed(Keys.PLAYER_A)) {
								PokeboxInventory.currentBox = PokeboxInventory.boxJump;
								PokeboxInventory.jump = false;
							}

							if (Keys.isPressed(Keys.PLAYER_B)) {
								PokeboxInventory.jump = false;
								PokeboxInventory.boxOptions = true;
							}

							if (Keys.isPressed(Keys.RIGHTARROW)) {

								if (PokeboxInventory.boxJump < 29) {
									PokeboxInventory.boxJump += 1;
								} else if (PokeboxInventory.boxJump == 29) {
									PokeboxInventory.boxJump = 0;
								}

							} else if (Keys.isPressed(Keys.LEFTARROW)) {

								if (PokeboxInventory.boxJump > 0) {
									PokeboxInventory.boxJump -= 1;
								} else if (PokeboxInventory.boxJump == 0) {
									PokeboxInventory.boxJump = 29;
								}

							}

						} else if (PokeboxInventory.pokeOptions) {

							if (Keys.isPressed(Keys.UPARROW)) {
								if (PokeboxInventory.currentOptionsSelect > 0) {
									PokeboxInventory.currentOptionsSelect -= 1;
								}
							} else if (Keys.isPressed(Keys.DOWNARROW)) {
								if (PokeboxInventory.currentOptionsSelect < 5) {
									PokeboxInventory.currentOptionsSelect += 1;
								}
							}

							if (Keys.isPressed(Keys.PLAYER_A)) {
								select();
							}

							if (Keys.isPressed(Keys.PLAYER_B)) {
								PokeboxInventory.pokeOptions = false;
							}

						} else if (PokeboxInventory.summary) {
							if (Keys.isPressed(Keys.PLAYER_B)) {
								PokeboxInventory.summary = false;
							}

							if (Keys.isPressed(Keys.RIGHTARROW)) {
								if (ViewingPokemon.currentPage < 2) {
									ViewingPokemon.currentPage += 1;
								}
							} else if (Keys.isPressed(Keys.LEFTARROW)) {
								if (ViewingPokemon.currentPage > 0) {
									ViewingPokemon.currentPage -= 1;
								}
							} else if (Keys.isPressed(Keys.UPARROW)) {
								if (PokeboxInventory.isLastPokemon()) {
									PokeboxInventory.setLastPokemonPosition();
								}
							} else if (Keys.isPressed(Keys.DOWNARROW)) {
								if (PokeboxInventory.isNextPokemon()) {
									PokeboxInventory.setNextPokemonPosition();
								}
							}

						} else {

							if (PokeboxInventory.currentYChoice == 0 && PokeboxInventory.currentXChoice == 0
									&& Keys.isPressed(Keys.PLAYER_A)) {
								PokeboxInventory.openCurrentPokemon();
							}

							if (Keys.isPressed(Keys.PLAYER_A) && PokeboxInventory.currentYChoice == 1) {
								PokeboxInventory.boxOptions = true;
							}

							if (PokeboxInventory.currentYChoice >= 2) {
								if (Keys.isPressed(Keys.PLAYER_A)) {
									select();
								}
							}

							if (Keys.isPressed(Keys.PLAYER_B)) {
								storageBox = false;
							}

							if (Keys.isPressed(Keys.UPARROW)) {
								if (PokeboxInventory.currentYChoice == 2) {
									PokeboxInventory.currentYChoice -= 1;
									PokeboxInventory.currentXChoice = 0;
								} else if (PokeboxInventory.currentYChoice != 2 && PokeboxInventory.currentYChoice > 0) {
									PokeboxInventory.currentYChoice -= 1;
								} else if (PokeboxInventory.currentYChoice == 0) {
									PokeboxInventory.currentYChoice = 6;
								}
							} else if (Keys.isPressed(Keys.DOWNARROW)) {
								if (PokeboxInventory.currentYChoice == 0) {
									PokeboxInventory.currentXChoice = 0;
									PokeboxInventory.currentYChoice = 1;
								} else if (PokeboxInventory.currentYChoice >= 1 && PokeboxInventory.currentYChoice < 6) {
									PokeboxInventory.currentYChoice += 1;
								} else if (PokeboxInventory.currentYChoice == 6) {
									PokeboxInventory.currentYChoice = 0;
									PokeboxInventory.currentXChoice = 0;
								}
							} else if (Keys.isPressed(Keys.RIGHTARROW)) {
								if (PokeboxInventory.currentYChoice > 1) {
									if (PokeboxInventory.currentXChoice < 5) {
										PokeboxInventory.currentXChoice += 1;
									} else if (PokeboxInventory.currentXChoice == 5) {
										PokeboxInventory.currentXChoice = 0;
									}
								} else if (PokeboxInventory.currentYChoice == 0) {
									if (PokeboxInventory.currentXChoice == 0) {
										PokeboxInventory.currentXChoice = 1;
									} else if (PokeboxInventory.currentXChoice == 1) {
										PokeboxInventory.currentXChoice = 0;
									}
								} else if (PokeboxInventory.currentYChoice == 1) {
									PokeboxInventory.moveRight();
								}
							} else if (Keys.isPressed(Keys.LEFTARROW)) {
								if (PokeboxInventory.currentYChoice > 1) {
									if (PokeboxInventory.currentXChoice > 0) {
										PokeboxInventory.currentXChoice -= 1;
									} else if (PokeboxInventory.currentXChoice == 0) {
										PokeboxInventory.currentXChoice = 5;
									}
								} else if (PokeboxInventory.currentYChoice == 0) {
									if (PokeboxInventory.currentXChoice == 0) {
										PokeboxInventory.currentXChoice = 1;
									} else if (PokeboxInventory.currentXChoice == 1) {
										PokeboxInventory.currentXChoice = 0;
									}
								} else if (PokeboxInventory.currentYChoice == 1) {
									PokeboxInventory.moveLeft();
								}
							}

						}

					}

				}

			}

		} else {

			if (!pokemonSelect && !viewingPokemon && !inventoryBag) {
				if (Keys.isPressed(Keys.DOWNARROW) && currentChoice < startMenuItems) {
					currentChoice += 1;
				} else if (Keys.isPressed(Keys.UPARROW) && currentChoice > 0) {
					currentChoice -= 1;
				}

				if (Keys.isPressed(Keys.PLAYER_A)) {
					select();
				}

				if (Keys.isPressed(Keys.PLAYER_B)) {
					paused = false;
					busy = false;
				}
			} else if (pokemonSelect) {

				if (Keys.isPressed(Keys.DOWNARROW) && currentPokemonChoice < PlayerBag.getArraySize()) {
					currentPokemonChoice += 1;
				} else if (Keys.isPressed(Keys.UPARROW) && currentPokemonChoice > 0) {
					currentPokemonChoice -= 1;
				} else if (Keys.isPressed(Keys.LEFTARROW) && currentPokemonChoice > 0) {
					currentPokemonChoice = 0;
				} else if (Keys.isPressed(Keys.RIGHTARROW) && currentPokemonChoice == 0) {
					currentPokemonChoice = 1;
				}

				if (Keys.isPressed(Keys.PLAYER_A)) {
					select();
				}

				if (Keys.isPressed(Keys.PLAYER_B)) {
					pokemonSelect = false;
				}

			} else if (viewingPokemon) {

				if (Keys.isPressed(Keys.LEFTARROW) && currentPage > 0) {
					ViewingPokemon.currentPage -= 1;
					currentPage -= 1;
				} else if (Keys.isPressed(Keys.RIGHTARROW) && currentPage < 2) {
					ViewingPokemon.currentPage += 1;
					currentPage += 1;
				} else if (Keys.isPressed(Keys.UPARROW) && currentPokemonChoice > 0) {
					currentPokemonChoice -= 1;
				} else if (Keys.isPressed(Keys.DOWNARROW) && currentPokemonChoice < PlayerBag.getArraySize() - 1) {
					currentPokemonChoice += 1;
				}

				if (Keys.isPressed(Keys.PLAYER_B)) {
					viewingPokemon = false;
					pokemonSelect = true;
				}

			} else if (inventoryBag) {

				if (Keys.isPressed(Keys.LEFTARROW)) {
					if (currentBagPage > 0) {
						currentBagPage -= 1;
					} else if (currentBagPage == 0) {
						currentBagPage = 4;
					}
					currentBagItem = 0;
				} else if (Keys.isPressed(Keys.RIGHTARROW)) {
					if (currentBagPage < 4) {
						currentBagPage += 1;
					} else if (currentBagPage == 4) {
						currentBagPage = 0;
					}
					currentBagItem = 0;
				} else if (Keys.isPressed(Keys.DOWNARROW)) {
					if (currentBagItem < PlayerBag.getItemList(currentBagPage).size()) {
						currentBagItem += 1;
					}
				} else if (Keys.isPressed(Keys.UPARROW)) {
					if (currentBagItem > 0) {
						currentBagItem -= 1;
					}
				}

				if (Keys.isPressed(Keys.PLAYER_A)) {
					select();
				}

				if (Keys.isPressed(Keys.PLAYER_B)) {
					inventoryBag = false;
				}

			}

		}

	}

}
