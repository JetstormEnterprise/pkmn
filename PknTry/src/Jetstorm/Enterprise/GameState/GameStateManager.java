package Jetstorm.Enterprise.GameState;

import Jetstorm.Enterprise.Entities.Player;
import Jetstorm.Enterprise.Entities.Pokemon.Pokemon;
import Jetstorm.Enterprise.Main.WindowClass;

public class GameStateManager {

	public Player player;

	private GameState[] gameStates;
	private int currentState;

	private WildPokemonState wildPokemon;
	private boolean wildPokemonEncounter;

	public static final int NUMGAMESTATES = 20;
	public static final int STARTUPSCREENSTATE = 0;
	public static final int LOADINGSCREENSTATE = 1;
	public static final int STARTUPANIMATIONSTATE = 2;
	public static final int STARTMENUSTATE = 3;
	public static final int INTROTEXTSCREENSTATE = 4;
	public static final int WILDPOKEMONSTATE = 16;
	public static final int POKEMONSUPERCENTER = 17;
	public static final int TESTLEVELSTATE = 18;
	public static final int TESTFIGHT = 19;

	public GameStateManager() {

		gameStates = new GameState[NUMGAMESTATES];

		wildPokemon = new WildPokemonState(this);
		wildPokemonEncounter = false;

		currentState = STARTUPSCREENSTATE;
		loadState(currentState);

	}

	public void generatePlayer() {
		player = new Player();
	}

	private void loadState(int state) {

		if (state == STARTUPSCREENSTATE)
			gameStates[state] = new StartupScreenState(this);
		else if (state == LOADINGSCREENSTATE)
			gameStates[state] = new LoadingScreenState(this);
		else if (state == STARTMENUSTATE)
			gameStates[state] = new StartMenuState(this);
		else if (state == INTROTEXTSCREENSTATE)
			gameStates[state] = new IntroTextScreenState(this);
		else if (state == POKEMONSUPERCENTER)
			gameStates[state] = new PokemonSuperCenter(this);
		else if (state == TESTLEVELSTATE)
			gameStates[state] = new TestLevelState(this);
		else if (state == TESTFIGHT)
			gameStates[state] = new BattleState(this);

	}

	public Player getPlayer() {
		return player;
	}

	private void unloadState(int state) {
		gameStates[state] = null;
	}

	public void setState(int state) {
		unloadState(currentState);
		currentState = state;
		loadState(currentState);
	}

	public void wildPokemonEncountered() {
		wildPokemonEncounter = true;
		wildPokemon.reset();
	}

	public void wildBattleOver() {
		wildPokemonEncounter = false;
	}

	public void setWildPokemon(Pokemon wildPkm) {
		wildPokemon.setWildPokemon(wildPkm);
	}

	public void update() {

		if (wildPokemonEncounter) {
			wildPokemon.update();
			return;
		}

		if (gameStates[currentState] != null)
			gameStates[currentState].update();


	}

	public void draw(java.awt.Graphics2D g) {

		if (wildPokemonEncounter) {
			wildPokemon.draw(g);
			return;
		}

		if (gameStates[currentState] != null)
			gameStates[currentState].draw(g);
		else {
			g.setColor(java.awt.Color.BLACK);
			g.fillRect(0, 0, WindowClass.WIDTH, WindowClass.HEIGHT);
		}

	}

}
