package Jetstorm.Enterprise.Entities.Pokemon;

public class Jigglypuff extends Pokemon {

	public Jigglypuff(int startingLevel) {

		species = "JIGGLYPUFF";
		nickname = "JIGGLYPUFF";
		typeOne = 0; // normal
		typeTwo =17; // fairy
		pkmNumber = 39;
		abilityOne = 1; // cute charm or competitive
		hiddenAbility = 1; // friend guard
		friendship = 70;
		bodyStyle = 12; // human like
		pokemonColor = 10; // pink
		eggGroup = 6; // fairy
		secondEggGroup = 18; // none
		height = 0.5; // meters standard
		weight = 5.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Fast";
		baseExpYield = 95;
		EVYield[0] = 2;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.25;
		catchRate = 170;
		baseHealth = 115;
		baseAttack = 45;
		baseDefense = 20;
		baseSpAttack = 45;
		baseSpDefense = 25;
		baseSpeed = 20;
		super.init(startingLevel);

	}

}
