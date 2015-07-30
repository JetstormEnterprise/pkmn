package Jetstorm.Enterprise.Entities.Pokemon;

public class Grimer  extends Pokemon {

	public Grimer(int startingLevel) {

		species = "GRIMER";
		nickname = "GRIMER";
		typeOne = 3; // poison
		typeTwo = 18; // none
		pkmNumber = 88;
		abilityOne = 1; // stench or sticky hold
		hiddenAbility = 1; // poison touch
		friendship = 70;
		bodyStyle = 4; // 4? head arms
		pokemonColor = 7; // purple
		eggGroup = 11; // amorphous
		secondEggGroup = 18; // none
		height = 0.9; // meters standard
		weight = 30.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 90;
		EVYield[0] = 1;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 190;
		baseHealth = 80;
		baseAttack = 80;
		baseDefense = 50;
		baseSpAttack = 40;
		baseSpDefense = 50;
		baseSpeed = 25;
		super.init(startingLevel);

	}
	
}
