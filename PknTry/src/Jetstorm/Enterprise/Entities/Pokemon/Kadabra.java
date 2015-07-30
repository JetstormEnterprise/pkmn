package Jetstorm.Enterprise.Entities.Pokemon;

public class Kadabra  extends Pokemon {

	public Kadabra(int startingLevel) {

		species = "KADABRA";
		nickname = "KADABRA";
		typeOne = 13; // psychic
		typeTwo = 18; // none
		pkmNumber = 64;
		abilityOne = 1; // synchronize or inner focus
		hiddenAbility = 1; // magic guard
		friendship = 70;
		bodyStyle = 6; // 6? arms legs tail
		pokemonColor = 6; // brown
		eggGroup = 8; // human-like
		secondEggGroup = 18; // none
		height = 1.3; // meters standard
		weight = 56.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 145;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 2;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.75;
		catchRate = 100;
		baseHealth = 40;
		baseAttack = 35;
		baseDefense = 30;
		baseSpAttack = 120;
		baseSpDefense = 70;
		baseSpeed = 105;
		super.init(startingLevel);

	}
	
}
