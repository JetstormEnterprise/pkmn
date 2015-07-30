package Jetstorm.Enterprise.Entities.Pokemon;

public class Doduo extends Pokemon {

	public Doduo(int startingLevel) {

		species = "DODUO";
		nickname = "DODUO";
		typeOne = 0; // normal
		typeTwo = 2; // flying
		pkmNumber = 84;
		abilityOne = 1; // run away or early bird
		hiddenAbility = 1; // tangled feet
		friendship = 70;
		bodyStyle = 7; // 7? head, body
		pokemonColor = 6; // brown
		eggGroup = 4; // flying
		secondEggGroup = 18; // none
		height = 1.4; // meters standard
		weight = 39.2; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 96;
		EVYield[0] = 0;
		EVYield[1] = 1;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 190;
		baseHealth = 35;
		baseAttack = 85;
		baseDefense = 45;
		baseSpAttack = 35;
		baseSpDefense = 35;
		baseSpeed = 75;
		super.init(startingLevel);

	}
	
}
