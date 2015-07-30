package Jetstorm.Enterprise.Entities.Pokemon;

public class Gengar  extends Pokemon {

	public Gengar(int startingLevel) {

		species = "GENGAR";
		nickname = "GENGAR";
		typeOne = 7;
		typeTwo = 3;
		pkmNumber = 94;
		abilityOne = 1; // levitate
		hiddenAbility = 1; // shadow tag
		friendship = 70;
		bodyStyle = 6; // 6? arms legs tail
		pokemonColor = 7; // purple
		eggGroup = 11; // amorphous
		secondEggGroup = 18; // none
		height = 1.5; // meters standard
		weight = 40.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 225;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 3;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 45;
		baseHealth = 60;
		baseAttack = 65;
		baseDefense = 80;
		baseSpAttack = 170;
		baseSpDefense = 95;
		baseSpeed = 110;
		super.init(startingLevel);

	}
	
}
