package Jetstorm.Enterprise.Entities.Pokemon;

public class Slowpoke extends Pokemon {

	public Slowpoke(int startingLevel) {

		species = "SLOWPOKE";
		nickname = "SLOWPOKE";
		typeOne = 10; // water
		typeTwo = 13; // psychic
		pkmNumber = 79;
		abilityOne = 1; // oblivious or own tempo
		hiddenAbility = 1; // regenerator
		friendship = 70;
		bodyStyle = 8; // 8? four legs
		pokemonColor = 10; // pink
		eggGroup = 1; // monster
		secondEggGroup = 2; // water 1
		height = 1.2; // meters standard
		weight = 36.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 99;
		EVYield[0] = 1;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 190;
		baseHealth = 90;
		baseAttack = 65;
		baseDefense = 65;
		baseSpAttack = 40;
		baseSpDefense = 40;
		baseSpeed = 15;
		super.init(startingLevel);

	}
	
}
