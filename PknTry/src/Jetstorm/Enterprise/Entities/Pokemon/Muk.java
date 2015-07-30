package Jetstorm.Enterprise.Entities.Pokemon;

public class Muk  extends Pokemon {

	public Muk(int startingLevel) {

		species = "MUK";
		nickname = "MUK";
		typeOne = 3; // poison
		typeTwo = 18; // none
		pkmNumber = 89;
		abilityOne = 1; // stench or stick hold
		hiddenAbility = 1; // poison touch
		friendship = 70;
		bodyStyle = 4; // 4? head arms
		pokemonColor = 7; // purple
		eggGroup = 11; // amorphous
		secondEggGroup = 18; // none
		height = 1.2; // meters standard
		weight = 30.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 175;
		EVYield[0] = 1;
		EVYield[1] = 1;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 75;
		baseHealth = 105;
		baseAttack = 105;
		baseDefense = 75;
		baseSpAttack = 65;
		baseSpDefense = 100;
		baseSpeed = 50;
		super.init(startingLevel);

	}
	
}
