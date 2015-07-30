package Jetstorm.Enterprise.Entities.Pokemon;

public class Growlithe extends Pokemon {

	public Growlithe(int startingLevel) {

		species = "GROWLITHE";
		nickname = "GROWLITHE";
		typeOne = 9; // fire
		typeTwo = 18; // none
		pkmNumber = 58;
		abilityOne = 1; // intimidate or flash fire
		hiddenAbility = 1; // justified
		friendship = 70;
		bodyStyle = 8; // 8? four legs body head
		pokemonColor = 6; // brown
		eggGroup = 5; // field
		secondEggGroup = 18; // none
		height = 0.7; // meters standard
		weight = 19.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Slow";
		baseExpYield = 91;
		EVYield[0] = 0;
		EVYield[1] = 1;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.25;
		catchRate = 190;
		baseHealth = 55;
		baseAttack = 70;
		baseDefense = 45;
		baseSpAttack = 70;
		baseSpDefense = 50;
		baseSpeed = 60;
		super.init(startingLevel);

	}
	
}
