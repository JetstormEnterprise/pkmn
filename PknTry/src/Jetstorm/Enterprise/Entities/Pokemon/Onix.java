package Jetstorm.Enterprise.Entities.Pokemon;

public class Onix  extends Pokemon {

	public Onix(int startingLevel) {

		species = "ONIX";
		nickname = "ONIX";
		typeOne = 5; // rock
		typeTwo = 4; // ground
		pkmNumber = 95;
		abilityOne = 1; // rock head or sturdy
		hiddenAbility = 1; // weak armor
		friendship = 70;
		bodyStyle = 2; // 2? serpent
		pokemonColor = 8; // gray
		eggGroup = 10; // mineral
		secondEggGroup = 10; // none
		height = 8.8; // meters standard
		weight = 210.0; // kg standard
		hatchTime = 6630; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 108;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 1;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 45;
		baseHealth = 35;
		baseAttack = 45;
		baseDefense = 160;
		baseSpAttack = 30;
		baseSpDefense = 45;
		baseSpeed = 70;
		super.init(startingLevel);

	}
	
}
