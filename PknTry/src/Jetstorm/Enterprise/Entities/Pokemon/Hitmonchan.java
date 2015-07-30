package Jetstorm.Enterprise.Entities.Pokemon;

public class Hitmonchan extends Pokemon {

	public Hitmonchan(int startingLevel) {

		species = "HITMONCHAN";
		nickname = "HITMONCHAN";
		typeOne = 1; // fighting
		typeTwo = 18; // none
		pkmNumber = 107;
		abilityOne = 1; // keen eye or iron fist
		hiddenAbility = 1; // inner focus
		friendship = 70;
		bodyStyle = 12; // 12? human like
		pokemonColor = 6; // brown
		eggGroup = 8; // human-like
		secondEggGroup = 18; // none
		height = 1.4; // meters standard
		weight = 50.2; // kg standard
		hatchTime = 6630; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 45;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 2;
		EVYield[5] = 0;
		genderRatio = 1; // male
		catchRate = 45;
		baseHealth = 50;
		baseAttack = 105;
		baseDefense = 79;
		baseSpAttack = 35;
		baseSpDefense = 110;
		baseSpeed = 76;
		super.init(startingLevel);

	}
	
}
