package Jetstorm.Enterprise.Entities.Pokemon;

public class Venomoth extends Pokemon {

	public Venomoth(int startingLevel) {

		species = "VILEPLUME";
		nickname = "VILEPLUME";
		typeOne = 6; // bug
		typeTwo = 3; // poison
		pkmNumber = 49;
		abilityOne = 1; // shield dust or tinted lens
		hiddenAbility = 1; // wonder skin
		friendship = 70;
		bodyStyle = 13; // multiple sets of wings
		pokemonColor = 7; // purple
		eggGroup = 3; // bug
		secondEggGroup = 18; // none
		height = 1.5; // meters standard
		weight = 12.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 158;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 1;
		EVYield[4] = 0;
		EVYield[5] = 1;
		genderRatio = 0.5;
		catchRate = 75;
		baseHealth = 70;
		baseAttack = 65;
		baseDefense = 60;
		baseSpAttack = 90;
		baseSpDefense = 75;
		baseSpeed = 90;
		super.init(startingLevel);

	}

}
