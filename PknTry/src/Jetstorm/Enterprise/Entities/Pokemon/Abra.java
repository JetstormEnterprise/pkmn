package Jetstorm.Enterprise.Entities.Pokemon;

public class Abra  extends Pokemon {

	public Abra(int startingLevel) {

		species = "ABRA";
		nickname = "ABRA";
		typeOne = 13; // psychic
		typeTwo = 18; // none
		pkmNumber = 63;
		abilityOne = 1; // synchronize or inner focus
		hiddenAbility = 1; // magic guard
		friendship = 70;
		bodyStyle = 6; // 6? arms legs tail
		pokemonColor = 6; // brown
		eggGroup = 8; // human-like
		secondEggGroup = 18; // none
		height = 0.9; // meters standard
		weight = 19.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 75;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 1;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.75;
		catchRate = 200;
		baseHealth = 25;
		baseAttack = 20;
		baseDefense = 15;
		baseSpAttack = 105;
		baseSpDefense = 55;
		baseSpeed = 90;
		super.init(startingLevel);

	}
	
}
