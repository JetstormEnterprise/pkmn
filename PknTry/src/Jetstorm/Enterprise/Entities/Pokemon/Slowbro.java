package Jetstorm.Enterprise.Entities.Pokemon;

public class Slowbro extends Pokemon {

	public Slowbro(int startingLevel) {

		species = "SLOWBRO";
		nickname = "SLOWBRO";
		typeOne = 10; // water
		typeTwo = 13; // psychic
		pkmNumber = 80;
		abilityOne = 1; // oblivious or own tempo
		hiddenAbility = 1; // regenerator
		friendship = 70;
		bodyStyle = 6; // 6? arms, legs, tail
		pokemonColor = 10; // pink
		eggGroup = 1; // monster
		secondEggGroup = 2; // water 1
		height = 1.6; // meters standard
		weight = 78.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 172;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 2;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 75;
		baseHealth = 95;
		baseAttack = 75;
		baseDefense = 110;
		baseSpAttack = 100;
		baseSpDefense = 80;
		baseSpeed = 30;
		super.init(startingLevel);

	}
	
}
