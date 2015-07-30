package Jetstorm.Enterprise.Entities.Pokemon;

public class Persian extends Pokemon {

	public Persian(int startingLevel) {

		species = "PERSIAN";
		nickname = "PERSIAN";
		typeOne = 0; // normal
		typeTwo = 18;
		pkmNumber = 53;
		abilityOne = 1; // limber or technician
		hiddenAbility = 1; // unnerve
		friendship = 70;
		bodyStyle = 8; // quadraped, four legs
		pokemonColor = 3; // yellow
		eggGroup = 5; // field
		secondEggGroup = 18; // none
		height = 1.0; // meters standard
		weight = 32.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 154;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 2;
		genderRatio = 0.5;
		catchRate = 90;
		baseHealth = 65;
		baseAttack = 70;
		baseDefense = 60;
		baseSpAttack = 65;
		baseSpDefense = 65;
		baseSpeed = 115;
		super.init(startingLevel);

	}

}
