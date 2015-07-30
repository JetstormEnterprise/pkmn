package Jetstorm.Enterprise.Entities.Pokemon;

public class Alakazam  extends Pokemon {

	public Alakazam(int startingLevel) {

		species = "ALAKAZAM";
		nickname = "ALAKAZAM";
		typeOne = 13; // psychic
		typeTwo = 18; // none
		pkmNumber = 65;
		abilityOne = 1; // synchronize or inner focus
		hiddenAbility = 1; // magic guard
		friendship = 70;
		bodyStyle = 12; // 12? human like
		pokemonColor = 6; // brown
		eggGroup = 8; // human-like
		secondEggGroup = 18; // none
		height = 1.5; // meters standard
		weight = 48.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 221;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 3;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.75;
		catchRate = 50;
		baseHealth = 55;
		baseAttack = 50;
		baseDefense = 45;
		baseSpAttack = 135;
		baseSpDefense = 95;
		baseSpeed = 120;
		super.init(startingLevel);

	}
	
}
