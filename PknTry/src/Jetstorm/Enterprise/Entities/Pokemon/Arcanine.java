package Jetstorm.Enterprise.Entities.Pokemon;

public class Arcanine  extends Pokemon {

	public Arcanine(int startingLevel) {

		species = "ARCANINE";
		nickname = "ARCANINE";
		typeOne = 9; // fire
		typeTwo = 18; // none
		pkmNumber = 59;
		abilityOne = 1; // intimidate or flash fire
		hiddenAbility = 1; // justified
		friendship = 70;
		bodyStyle = 8; // 8? four legs body tail
		pokemonColor = 6; // brown
		eggGroup = 5; // field
		secondEggGroup = 18; // none
		height = 1.9; // meters standard
		weight = 155.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Slow";
		baseExpYield = 213;
		EVYield[0] = 0;
		EVYield[1] = 2;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.25;
		catchRate = 75;
		baseHealth = 90;
		baseAttack = 110;
		baseDefense = 80;
		baseSpAttack = 100;
		baseSpDefense = 80;
		baseSpeed = 95;
		super.init(startingLevel);

	}
	
}
