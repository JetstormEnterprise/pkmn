package Jetstorm.Enterprise.Entities.Pokemon;

public class Pidgey extends Pokemon {

	public Pidgey(int startingLevel) {

		species = "PIDGEY";
		nickname = "PIDGEY";
		typeOne = 0; // Normal
		typeTwo = 2; // Flying
		pkmNumber = 16;
		abilityOne = 1; // Keen Eye:Tangled Feet
		hiddenAbility = 1; // Big Pecks
		friendship = 70;
		bodyStyle = 9; // single pair of wings
		pokemonColor = 6; // brown
		eggGroup = 4; // flying
		secondEggGroup = 0; // none
		height = 0.3; // meters standard
		weight = 1.8; // kg standard
		hatchTime = 4080; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 50;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 1;
		genderRatio = 0.5;
		catchRate = 255;
		baseHealth = 40;
		baseAttack = 45;
		baseDefense = 40;
		baseSpAttack = 35;
		baseSpDefense = 35;
		baseSpeed = 56;
		super.init(startingLevel);

	}


}
