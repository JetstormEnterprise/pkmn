package Jetstorm.Enterprise.GameState;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;

import Jetstorm.Enterprise.Audio.JukeBox;
import Jetstorm.Enterprise.Entities.NPC.NPC;
import Jetstorm.Enterprise.Entities.NPC.Idle.FemaleChild;
import Jetstorm.Enterprise.Entities.NPC.Idle.OldMan;
import Jetstorm.Enterprise.Entities.NPC.Pokemon.Chansey;
import Jetstorm.Enterprise.Entities.NPC.Talking.FemaleMart;
import Jetstorm.Enterprise.Entities.NPC.Talking.MaleMart;
import Jetstorm.Enterprise.Entities.NPC.Talking.NurseJoy;
import Jetstorm.Enterprise.Entities.Pokemon.Pokemon;
import Jetstorm.Enterprise.Entities.Pokemon.Moves.Move;
import Jetstorm.Enterprise.Entities.Pokemon.Moves.Tackle;
import Jetstorm.Enterprise.Entities.Static.Desk;
import Jetstorm.Enterprise.Entities.Static.NurseJoyComputer;
import Jetstorm.Enterprise.Entities.Static.PokemonHealer;
import Jetstorm.Enterprise.Handlers.Keys;
import Jetstorm.Enterprise.Handlers.PokemonInfo;
import Jetstorm.Enterprise.Main.WindowClass;
import Jetstorm.Enterprise.TileMap.TileMap;

public class PokemonSuperCenter extends GameState {

	private TileMap tileMap;
	private NurseJoy nurseJoy;
	private Chansey chansey;
	private PokemonHealer pokemonHealer;
	private NurseJoyComputer nurseComputer;
	private ArrayList<NPC> npcs;

	private Desk[] desks;

	public PokemonSuperCenter(GameStateManager gsm) {
		super(gsm);
		init();
	}

	public void init() {

		npcs = new ArrayList<NPC>();

		tileMap = new TileMap(16);
		tileMap.loadTiles("/maps/pokemoncentertiles.gif");
		tileMap.loadMap("/maps/PokemonCenter1.map");
		tileMap.setTween(1);

		tileMap.setPosition(-15 - (16 * 23), -2 - (16 * 32));

		tileMap.createBlockedArea(-576, -480, 32, 32);
		tileMap.createBlockedArea(-688, -480, 32, 32);
		tileMap.createBlockedArea(-688, -368, 32, 32);

		tileMap.createBlockedArea(-176, -480, 32, 32);
		tileMap.createBlockedArea(-64, -480, 32, 32);
		tileMap.createBlockedArea(-64, -368, 32, 32);

		tileMap.createBlockedArea(-544, -256, 32, 32);
		tileMap.createBlockedArea(-688, -256, 32, 32);
		tileMap.createBlockedArea(-224, -256, 32, 32);
		tileMap.createBlockedArea(-128, -256, 32, 32);

		tileMap.createBlockedArea(-256, -352, 32, 16);
		tileMap.createBlockedArea(-512, -352, 32, 16);

		tileMap.createBlockedArea(-48, -304, 128, 48);
		tileMap.createBlockedArea(-96, -272, 16, 48);
		tileMap.createBlockedArea(-208, -304, 400, 48);
		tileMap.createBlockedArea(-640, -304, 96, 48);
		tileMap.createBlockedArea(-48, -144, 688, 32);
		tileMap.createBlockedArea(-272, -240, 16, 64);
		tileMap.createBlockedArea(-512, -240, 16, 64);

		gsm.player.setTileMap(tileMap);
		gsm.player.setPosition(WindowClass.WIDTH / 2, WindowClass.HEIGHT / 2);

		nurseJoy = new NurseJoy(tileMap, gsm.player);
		nurseJoy.setPosition(-212, -350);
		nurseJoy.faceDown();

		chansey = new Chansey(tileMap, gsm.player);
		chansey.setPosition(-200, -344);

		pokemonHealer = new PokemonHealer(tileMap);
		pokemonHealer.setPosition(-240, -352);

		nurseComputer = new NurseJoyComputer(tileMap);
		nurseComputer.setPosition(-160, -344);

		OldMan oldMan = new OldMan(tileMap, gsm.player, "Down");
		oldMan.setNPCPosition(-160, -16);
		npcs.add(oldMan);

		MaleMart maleMart = new MaleMart(tileMap, gsm.player, "Down");
		maleMart.setNPCPosition(-16, -16);
		npcs.add(maleMart);

		FemaleMart femaleMart = new FemaleMart(tileMap, gsm.player, "Down");
		femaleMart.setNPCPosition(-48, -48);
		npcs.add(femaleMart);

		FemaleChild femaleChild = new FemaleChild(tileMap, gsm.player, "Down");
		femaleChild.setNPCPosition(32, -48);
		npcs.add(femaleChild);

		desks = new Desk[5];

		Desk temp = new Desk(tileMap, "fooddesk");
		temp.setPosition(-48, -168);
		temp.createDeskArea("fooddesk");
		desks[0] = temp;

		temp = new Desk(tileMap, "pokemoncenterdesk");
		temp.setPosition(-256, -344);
		temp.createDeskArea("pokemoncenterdesk");
		desks[1] = temp;

		temp = new Desk(tileMap, "pokemonhelpdesk");
		temp.setPosition(-64, -344);
		temp.createDeskArea("pokemonhelpdesk");
		desks[2] = temp;

		temp = new Desk(tileMap, "pokemonbasedesk");
		temp.setPosition(160, -344);
		temp.createDeskArea("pokemonbasedesk");
		desks[3] = temp;

		temp = new Desk(tileMap, "pokemonmartdesk2");
		temp.setPosition(-96, -244);
		temp.createDeskArea("pokemonmartdesk2");
		desks[4] = temp;

		JukeBox.play("pokemoncentermusic");

	}

	public void update() {

		handleInput();
		gsm.player.update();
		for (int i = 0; i < desks.length; i++) {
			desks[i].update();
		}
		pokemonHealer.update();
		nurseComputer.update();
		nurseJoy.update();
		chansey.update();
		for (int i = 0; i < npcs.size(); i++) {
			npcs.get(i).update();
		}
		tileMap.update();

	}

	public void draw(Graphics2D g) {

		tileMap.draw(g);

		pokemonHealer.draw(g);
		nurseComputer.draw(g);
		nurseJoy.draw(g);
		chansey.draw(g);

		for (int i = 0; i < npcs.size(); i++) {
			npcs.get(i).draw(g);
		}

		for (int i = 0; i < desks.length; i++) {
			desks[i].draw(g);
		}

		gsm.player.draw(g);

		for (int i = 0; i < npcs.size(); i++) {
			npcs.get(i).drawVoid(g);
		}

		if (nurseJoy.isTalking()) {
			nurseJoy.drawText(g);
		}

		gsm.player.drawText(g);

	}

	public void handleInput() {

		if (tileMap.getx() == -383 && tileMap.gety() == -514 && Keys.isPressed(Keys.DOWNARROW)
				&& gsm.player.getDirection().equalsIgnoreCase("down") && !gsm.player.isBusy()) {
			gsm.setState(GameStateManager.TESTLEVELSTATE);
		}

		if (Keys.isPressed(Keys.DBUTTON)) {
			Random ran = new Random();
			Pokemon tempPkm = PokemonInfo.generatePokemon(ran.nextInt(56) + 1, 10);
			Move[] moves = new Move[4];
			moves[0] = new Tackle();
			moves[1] = new Tackle();
			moves[2] = new Tackle();
			moves[3] = new Tackle();
			tempPkm.setMoveList(moves);
			gsm.wildPokemonEncountered();
			gsm.setWildPokemon(tempPkm);
		}

		gsm.player.handleInput();

	}

}
