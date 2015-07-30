package Jetstorm.Enterprise.Entities.Pokemon;

public class Hypno extends Pokemon {

	public Hypno(int startingLevel) {

		species = "HYPNO";
		nickname = "HYPNO";
		typeOne = 13; // psychic
		typeTwo = 18; // none
		pkmNumber = 97;
		abilityOne = 1; // insomnia or forewarn
		hiddenAbility = 1; // inner focus
		friendship = 70;
		bodyStyle = 12; // 12? human like
		pokemonColor = 3; // yellow
		eggGroup = 8; // human-like
		secondEggGroup = 18; // none
		height = 1.6; // meters standard
		weight = 75.6; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 169;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 2;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 75;
		baseHealth = 85;
		baseAttack = 73;
		baseDefense = 70;
		baseSpAttack = 73;
		baseSpDefense = 115;
		baseSpeed = 67;
		super.init(startingLevel);

	}
	
}
