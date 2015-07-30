package Jetstorm.Enterprise.Entities.Pokemon;

public class Rattata extends Pokemon {

	public Rattata(int startingLevel) {

		species = "RATTATA";
		nickname = "RATTATA";
		typeOne = 0; // NORMAL
		typeTwo = 18;
		pkmNumber = 19;
		abilityOne = 1; // Run away or Guts
		hiddenAbility = 1; // Hustle
		friendship = 70;
		bodyStyle = 8; // four legs, body, head
		pokemonColor = 7; // purple
		eggGroup = 5; // field
		secondEggGroup = 0; // none
		height = 0.3; // meters standard
		weight = 3.5; // kg standard
		hatchTime = 4080; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 51;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 1;
		genderRatio = 0.5;
		catchRate = 255;
		baseHealth = 30;
		baseAttack = 56;
		baseDefense = 35;
		baseSpAttack = 25;
		baseSpDefense = 35;
		baseSpeed = 72;
		super.init(startingLevel);

	}

}
