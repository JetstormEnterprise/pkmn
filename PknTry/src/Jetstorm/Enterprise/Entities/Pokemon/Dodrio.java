package Jetstorm.Enterprise.Entities.Pokemon;

public class Dodrio extends Pokemon {

	public Dodrio(int startingLevel) {

		species = "DODRIO";
		nickname = "DODRIO";
		typeOne = 0; // normal
		typeTwo = 2; // flying
		pkmNumber = 85;
		abilityOne = 1; // run away or early bird
		hiddenAbility = 1; // tangled feet
		friendship = 70;
		bodyStyle = 7; // 7? body, head
		pokemonColor = 6; // brown
		eggGroup = 4; // flying
		secondEggGroup = 18; // none
		height = 1.8; // meters standard
		weight = 85.2; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 161;
		EVYield[0] = 0;
		EVYield[1] = 2;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 45;
		baseHealth = 60;
		baseAttack = 110;
		baseDefense = 70;
		baseSpAttack = 60;
		baseSpDefense = 60;
		baseSpeed = 100;
		super.init(startingLevel);

	}
	
}
