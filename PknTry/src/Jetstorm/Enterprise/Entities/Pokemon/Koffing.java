package Jetstorm.Enterprise.Entities.Pokemon;

public class Koffing extends Pokemon {

	public Koffing(int startingLevel) {

		species = "KOFFING";
		nickname = "KOFFING";
		typeOne = 3; // poison
		typeTwo = 18; // none
		pkmNumber = 109;
		abilityOne = 1; // levitate
		hiddenAbility = 1; // none
		friendship = 70;
		bodyStyle = 1; // 1? head
		pokemonColor = 7; // purple
		eggGroup = 11; // amorphous
		secondEggGroup = 18; // none
		height = 0.6; // meters standard
		weight = 1.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 114;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 1;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 190;
		baseHealth = 40;
		baseAttack = 65;
		baseDefense = 95;
		baseSpAttack = 60;
		baseSpDefense = 45;
		baseSpeed = 35;
		super.init(startingLevel);

	}
	
}
