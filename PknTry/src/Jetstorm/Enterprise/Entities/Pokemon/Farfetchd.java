package Jetstorm.Enterprise.Entities.Pokemon;

public class Farfetchd extends Pokemon {

	public Farfetchd(int startingLevel) {

		species = "FARFETCH'D";
		nickname = "FARFETCH'D";
		typeOne = 0; // normal
		typeTwo = 2; // flying
		pkmNumber = 83;
		abilityOne = 1; // keen eye or inner focus
		hiddenAbility = 1; // defiant
		friendship = 70;
		bodyStyle = 9; // 9? single pair wings
		pokemonColor = 6; // brown
		eggGroup = 4; // flying
		secondEggGroup = 5; // field
		height = 0.8; // meters standard
		weight = 15.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 123;
		EVYield[0] = 0;
		EVYield[1] = 1;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 45;
		baseHealth = 52;
		baseAttack = 65;
		baseDefense = 55;
		baseSpAttack = 58;
		baseSpDefense = 62;
		baseSpeed = 60;
		super.init(startingLevel);

	}
	
}
