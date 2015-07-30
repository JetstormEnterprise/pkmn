package Jetstorm.Enterprise.Entities.Pokemon;

public class Marowak extends Pokemon {

	public Marowak(int startingLevel) {

		species = "MAROWAK";
		nickname = "MAROWAK";
		typeOne = 4; // ground
		typeTwo = 18; // none
		pkmNumber = 105;
		abilityOne = 1; // rock head or lightning rod
		hiddenAbility = 1; // battle armor
		friendship = 70;
		bodyStyle = 6; // 6? arms legs tail
		pokemonColor = 6; // brown
		eggGroup = 1; // monster
		secondEggGroup = 18; // none
		height = 1.0; // meters standard
		weight = 45.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 149;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 2;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 75;
		baseHealth = 60;
		baseAttack = 80;
		baseDefense = 110;
		baseSpAttack = 50;
		baseSpDefense = 80;
		baseSpeed = 45;
		super.init(startingLevel);

	}
	
}
