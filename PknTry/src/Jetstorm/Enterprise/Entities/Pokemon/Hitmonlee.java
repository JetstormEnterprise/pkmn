package Jetstorm.Enterprise.Entities.Pokemon;

public class Hitmonlee extends Pokemon {

	public Hitmonlee(int startingLevel) {

		species = "HITMONLEE";
		nickname = "HITMONLEE";
		typeOne = 1; // fighting
		typeTwo = 18; // none
		pkmNumber = 106;
		abilityOne = 1; // limber or reckless
		hiddenAbility = 1; // unburden
		friendship = 70;
		bodyStyle = 12; // 12? human like
		pokemonColor = 6; // brown
		eggGroup = 8; // human-like
		secondEggGroup = 18; // none
		height = 1.5; // meters standard
		weight = 49.8; // kg standard
		hatchTime = 6630; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 1159;
		EVYield[0] = 0;
		EVYield[1] = 2;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 1; // male
		catchRate = 45;
		baseHealth = 50;
		baseAttack = 120;
		baseDefense = 53;
		baseSpAttack = 35;
		baseSpDefense = 110;
		baseSpeed = 87;
		super.init(startingLevel);

	}
	
}
