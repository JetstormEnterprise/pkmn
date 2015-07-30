package Jetstorm.Enterprise.Entities.Pokemon;

public class Machamp  extends Pokemon {

	public Machamp(int startingLevel) {

		species = "MACHAMP";
		nickname = "MACHAMP";
		typeOne = 1; // fighting
		typeTwo = 18; // none
		pkmNumber = 68;
		abilityOne = 1; // guts or no guard
		hiddenAbility = 1; // steadfast
		friendship = 70;
		bodyStyle = 12; // 12? human like
		pokemonColor = 8; // gray
		eggGroup = 8; // human-like
		secondEggGroup = 18; // none
		height = 1.6; // meters standard
		weight = 130.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 227;
		EVYield[0] = 0;
		EVYield[1] = 3;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.75;
		catchRate = 45;
		baseHealth = 90;
		baseAttack = 130;
		baseDefense = 80;
		baseSpAttack = 65;
		baseSpDefense = 85;
		baseSpeed = 55;
		super.init(startingLevel);

	}
	
}
