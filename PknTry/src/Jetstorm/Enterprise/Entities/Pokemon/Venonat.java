package Jetstorm.Enterprise.Entities.Pokemon;

public class Venonat extends Pokemon {

	public Venonat(int startingLevel) {

		species = "VENONAT";
		nickname = "VENONAT";
		typeOne = 6; // bug
		typeTwo = 3; // poison
		pkmNumber = 48;
		abilityOne = 1; // coumpound eyes or tinted lens
		hiddenAbility = 1; // run away
		friendship = 70;
		bodyStyle = 12; // human like
		pokemonColor = 7; // purple
		eggGroup = 3; // bug
		secondEggGroup = 18; // none
		height = 1.0; // meters standard
		weight = 30.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 61;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 1;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 190;
		baseHealth = 60;
		baseAttack = 55;
		baseDefense = 50;
		baseSpAttack = 40;
		baseSpDefense = 55;
		baseSpeed = 45;
		super.init(startingLevel);

	}

}
