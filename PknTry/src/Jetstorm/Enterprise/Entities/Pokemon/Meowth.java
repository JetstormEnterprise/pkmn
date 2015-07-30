package Jetstorm.Enterprise.Entities.Pokemon;

public class Meowth extends Pokemon {

	public Meowth(int startingLevel) {

		species = "MEOWTH";
		nickname = "MEOWTH";
		typeOne = 0; // normal
		typeTwo = 18;
		pkmNumber = 52;
		abilityOne = 1; // pickup or technician
		hiddenAbility = 1; // unnerve
		friendship = 70;
		bodyStyle = 6; // quadra, four legs
		pokemonColor = 3; // yellow
		eggGroup = 5; // field
		secondEggGroup = 18; // none
		height = 0.4; // meters standard
		weight = 4.2; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 58;
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
		baseDefense = 35;
		baseSpAttack = 40;
		baseSpDefense = 40;
		baseSpeed = 90;
		super.init(startingLevel);

	}

}
