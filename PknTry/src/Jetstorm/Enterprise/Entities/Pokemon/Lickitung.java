package Jetstorm.Enterprise.Entities.Pokemon;

public class Lickitung extends Pokemon {

	public Lickitung(int startingLevel) {

		species = "LICKITUNG";
		nickname = "LICKITUNG";
		typeOne = 0; // normal
		typeTwo = 18; // none
		pkmNumber = 108;
		abilityOne = 1; // own tempo or oblivious
		hiddenAbility = 1; // cloud nine
		friendship = 70;
		bodyStyle = 6; // 6? arms legs tail
		pokemonColor = 10; // pink
		eggGroup = 1; // monster
		secondEggGroup = 18; // none
		height = 1.2; // meters standard
		weight = 65.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 1127;
		EVYield[0] = 2;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 45;
		baseHealth = 90;
		baseAttack = 55;
		baseDefense = 75;
		baseSpAttack = 60;
		baseSpDefense = 75;
		baseSpeed = 30;
		super.init(startingLevel);

	}
	
}
