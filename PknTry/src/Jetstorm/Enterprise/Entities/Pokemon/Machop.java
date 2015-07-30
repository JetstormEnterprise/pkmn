package Jetstorm.Enterprise.Entities.Pokemon;

public class Machop  extends Pokemon {

	public Machop(int startingLevel) {

		species = "MACHOP";
		nickname = "MACHOP";
		typeOne = 1; // fighting
		typeTwo = 18; // none
		pkmNumber = 66;
		abilityOne = 1; // guts or no guard
		hiddenAbility = 1; // steadfast
		friendship = 70;
		bodyStyle = 6; // 6? arms legs tail
		pokemonColor = 8; // gray
		eggGroup = 8; // human-like
		secondEggGroup = 18; // none
		height = 0.8; // meters standard
		weight = 19.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 75;
		EVYield[0] = 0;
		EVYield[1] = 1;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.75;
		catchRate = 180;
		baseHealth = 70;
		baseAttack = 80;
		baseDefense = 50;
		baseSpAttack = 35;
		baseSpDefense = 35;
		baseSpeed = 35;
		super.init(startingLevel);

	}
	
}
