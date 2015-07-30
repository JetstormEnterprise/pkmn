package Jetstorm.Enterprise.Entities.Pokemon;

public class Dugtrio extends Pokemon {

	public Dugtrio(int startingLevel) {

		species = "DUGTRIO";
		nickname = "DUGTRIO";
		typeOne = 4; // ground
		typeTwo = 18;
		pkmNumber = 51;
		abilityOne = 1; // sand veil or arena trap
		hiddenAbility = 1; // sand force
		friendship = 70;
		bodyStyle = 11; // multiple heads
		pokemonColor = 6; // brown
		eggGroup = 5; // field
		secondEggGroup = 18; // none
		height = 0.7; // meters standard
		weight = 33.3; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 142;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 2;
		genderRatio = 0.5;
		catchRate = 50;
		baseHealth = 35;
		baseAttack = 80;
		baseDefense = 50;
		baseSpAttack = 50;
		baseSpDefense = 70;
		baseSpeed = 120;
		super.init(startingLevel);

	}

}
