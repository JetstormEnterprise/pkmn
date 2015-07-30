package Jetstorm.Enterprise.Handlers;

import java.util.Random;

import Jetstorm.Enterprise.Entities.Pokemon.Pokemon;
import Jetstorm.Enterprise.Entities.Pokemon.Moves.Move;

public class BattleDamage {

	private static Random ran = new Random();

	public static final String[] typeList = { "NORMAL", "FIGHTING", "FLYING", "POISON", "GROUND", "ROCK", "BUG",
			"GHOST", "STEEL", "FIRE", "WATER", "GRASS", "ELECTRIC", "PSYCHIC", "ICE", "DRAGON", "DARK", "FAIRY",
			"UNKOWN" };

	private static double damage;
	private static int level;
	private static double attack;
	private static double defense;
	private static double base;
	private static double modifier;
	private static double STAB;
	private static double type;
	private static int critical;
	private static double other;
	private static double ranNumber;

	public static int getDamage(Pokemon pokemonAttacking, Pokemon pokemonDefending, Move move) {

		level = pokemonAttacking.getLevel();
		if (move.getAttackType() == 0) {
			attack = pokemonAttacking.getAttack();
			defense = pokemonDefending.getDefense();
		} else if (move.getAttackType() == 1) {
			attack = pokemonAttacking.getSpAttack();
			defense = pokemonDefending.getSpDefense();
		}
		base = move.getPower();
		ranNumber = ran.nextDouble();
		while (ranNumber < 0.85) {
			ranNumber = ran.nextDouble();
		}
		STAB = STAB(pokemonAttacking, move);
		type = TYPE(pokemonDefending, move);
		double temp = ran.nextDouble();
		if (temp < 0.06) {
			critical = 2;
		} else {
			critical = 1;
		}
		other = OTHER(pokemonAttacking, pokemonDefending, move);
		modifier = STAB * type * critical * other * ranNumber;
		double p1 = 2 * level + 10;
		double p2 = attack / defense;
		damage = (int) (((p1 / 250) * p2 * base + 2) * modifier);

		System.out.println(damage);
		
		return (int) damage;

	}

	public static double STAB(Pokemon pokemon, Move move) {

		double temp;

		if (pokemon.getTypeOne() == move.getType() || pokemon.getTypeTwo() == move.getType()) {
			temp = 1.5;
		} else {
			temp = 1;
		}

		return temp;

	}

	/**
	 * types - 0:Normal, 1:Fight, 2:Flying, 3:Poison, 4:Ground, 5:Rock, 6:Bug,
	 * 7:Ghost, 8:Steel, 9:Fire, 10:Water, 11:Grass, 12:Electric, 13:Psychic,
	 * 14:Ice, 15:Dragon, 16:Dark, 17:Fairy, 18:NoType
	 * 
	 * @param pokemon
	 * @param move
	 * @return
	 */
	public static double TYPE(Pokemon pokemon, Move move) {

		double temp = 0;
		double type1 = 0;
		double type2 = 0;

		if (pokemon.getTypeOne() == 0) {
			if (move.getType() == 7) {
				type1 = 0;
			} else if (move.getType() == 1) {
				type1 = 2;
			} else {
				type1 = 1;
			}
		} else if (pokemon.getTypeOne() == 1) {
			if (move.getType() == 5 || move.getType() == 6 || move.getType() == 16) {
				type1 = 0.5;
			} else if (move.getType() == 2 || move.getType() == 13 || move.getType() == 17) {
				type1 = 2;
			} else {
				type1 = 1;
			}
		} else if (pokemon.getTypeOne() == 2) {
			if (move.getType() == 4) {
				type1 = 0;
			} else if (move.getType() == 1 || move.getType() == 6 || move.getType() == 11) {
				type1 = 0.5;
			} else if (move.getType() == 5 || move.getType() == 12 || move.getType() == 14) {
				type1 = 2;
			} else {
				type1 = 1;
			}
		} else if (pokemon.getTypeOne() == 3) {
			if (move.getType() == 1 || move.getType() == 3 || move.getType() == 6 || move.getType() == 11
					|| move.getType() == 17) {
				type1 = 0.5;
			} else if (move.getType() == 4 || move.getType() == 13) {
				type1 = 2;
			} else {
				type1 = 1;
			}
		} else if (pokemon.getTypeOne() == 4) {
			if (move.getType() == 12) {
				type1 = 0;
			} else if (move.getType() == 3 || move.getType() == 5) {
				type1 = 0.5;
			} else if (move.getType() == 10 || move.getType() == 11 || move.getType() == 14) {
				type1 = 2;
			} else {
				type1 = 1;
			}
		} else if (pokemon.getTypeOne() == 5) {
			if (move.getType() == 0 || move.getType() == 2 || move.getType() == 3 || move.getType() == 4
					|| move.getType() == 9) {
				type1 = 0.5;
			} else if (move.getType() == 1 || move.getType() == 4 || move.getType() == 8 || move.getType() == 10
					|| move.getType() == 11) {
				type1 = 2;
			} else {
				type1 = 1;
			}
		} else if (pokemon.getTypeOne() == 6) {
			if (move.getType() == 1 || move.getType() == 4 || move.getType() == 11) {
				type1 = 0.5;
			} else if (move.getType() == 2 || move.getType() == 5 || move.getType() == 9) {
				type1 = 2;
			} else {
				type1 = 1;
			}
		} else if (pokemon.getTypeOne() == 7) {
			if (move.getType() == 0 || move.getType() == 1) {
				type1 = 0;
			} else if (move.getType() == 3 || move.getType() == 6 || move.getType() == 7) {
				type1 = 0.5;
			} else if (move.getType() == 8 || move.getType() == 16) {
				type1 = 2;
			} else {
				type1 = 1;
			}
		} else if (pokemon.getTypeOne() == 8) {
			if (move.getType() == 3) {
				type1 = 0;
			} else if (move.getType() == 0 || move.getType() == 2 || move.getType() == 5 || move.getType() == 6
					|| move.getType() == 8 || move.getType() == 11 || move.getType() == 13 || move.getType() == 14
					|| move.getType() == 15 || move.getType() == 17) {
				type1 = 0.5;
			} else if (move.getType() == 1 || move.getType() == 4 || move.getType() == 9) {
				type1 = 2;
			} else {
				type1 = 1;
			}
		} else if (pokemon.getTypeOne() == 9) {
			if (move.getType() == 6 || move.getType() == 8 || move.getType() == 9 || move.getType() == 11
					|| move.getType() == 14 || move.getType() == 17) {
				type1 = 0.5;
			} else if (move.getType() == 4 || move.getType() == 5 || move.getType() == 10) {
				type1 = 2;
			} else {
				type1 = 1;
			}
		} else if (pokemon.getTypeOne() == 10) {
			if (move.getType() == 8 || move.getType() == 9 || move.getType() == 10 || move.getType() == 14) {
				type1 = 0.5;
			} else if (move.getType() == 11 || move.getType() == 12) {
				type1 = 2;
			} else {
				type1 = 1;
			}
		} else if (pokemon.getTypeOne() == 11) {
			if (move.getType() == 4 || move.getType() == 10 || move.getType() == 11 || move.getType() == 12) {
				type1 = 0.5;
			} else if (move.getType() == 2 || move.getType() == 3 || move.getType() == 6 || move.getType() == 9
					|| move.getType() == 14) {
				type1 = 2;
			} else {
				type1 = 1;
			}
		} else if (pokemon.getTypeOne() == 12) {
			if (move.getType() == 2 || move.getType() == 8 || move.getType() == 12) {
				type1 = 0.5;
			} else if (move.getType() == 4) {
				type1 = 2;
			} else {
				type1 = 1;
			}
		} else if (pokemon.getTypeOne() == 13) {
			if (move.getType() == 1 || move.getType() == 13) {
				type1 = 0.5;
			} else if (move.getType() == 6 || move.getType() == 7 || move.getType() == 16) {
				type1 = 2;
			} else {
				type1 = 1;
			}
		} else if (pokemon.getTypeOne() == 14) {
			if (move.getType() == 14) {
				type1 = 0.5;
			} else if (move.getType() == 1 || move.getType() == 5 || move.getType() == 8 || move.getType() == 9) {
				type1 = 2;
			} else {
				type1 = 1;
			}
		} else if (pokemon.getTypeOne() == 15) {
			if (move.getType() == 9 || move.getType() == 10 || move.getType() == 11 || move.getType() == 12) {
				type1 = 0.5;
			} else if (move.getType() == 14 || move.getType() == 15 || move.getType() == 17) {
				type1 = 2;
			} else {
				type1 = 1;
			}
		} else if (pokemon.getTypeOne() == 16) {
			if (move.getType() == 13) {
				type1 = 0;
			} else if (move.getType() == 7 || move.getType() == 16) {
				type1 = 0.5;
			} else if (move.getType() == 1 || move.getType() == 6 || move.getType() == 16) {
				type1 = 2;
			} else {
				type1 = 1;
			}
		} else if (pokemon.getTypeOne() == 17) {
			if (move.getType() == 15) {
				type1 = 0;
			} else if (move.getType() == 1 || move.getType() == 6 || move.getType() == 16) {
				type1 = 0.5;
			} else if (move.getType() == 3 || move.getType() == 8) {
				type1 = 2;
			} else {
				type1 = 1;
			}
		}

		if (pokemon.getTypeTwo() != 18) {
			if (pokemon.getTypeTwo() == 0) {
				if (move.getType() == 7) {
					type2 = 0;
				} else if (move.getType() == 1) {
					type2 = 2;
				} else {
					type2 = 1;
				}
			} else if (pokemon.getTypeTwo() == 1) {
				if (move.getType() == 5 || move.getType() == 6 || move.getType() == 16) {
					type2 = 0.5;
				} else if (move.getType() == 2 || move.getType() == 13 || move.getType() == 17) {
					type2 = 2;
				} else {
					type2 = 1;
				}
			} else if (pokemon.getTypeTwo() == 2) {
				if (move.getType() == 4) {
					type2 = 0;
				} else if (move.getType() == 1 || move.getType() == 6 || move.getType() == 11) {
					type2 = 0.5;
				} else if (move.getType() == 5 || move.getType() == 12 || move.getType() == 14) {
					type2 = 2;
				} else {
					type2 = 1;
				}
			} else if (pokemon.getTypeTwo() == 3) {
				if (move.getType() == 1 || move.getType() == 3 || move.getType() == 6 || move.getType() == 11
						|| move.getType() == 17) {
					type2 = 0.5;
				} else if (move.getType() == 4 || move.getType() == 13) {
					type2 = 2;
				} else {
					type2 = 1;
				}
			} else if (pokemon.getTypeTwo() == 4) {
				if (move.getType() == 12) {
					type2 = 0;
				} else if (move.getType() == 3 || move.getType() == 5) {
					type2 = 0.5;
				} else if (move.getType() == 10 || move.getType() == 11 || move.getType() == 14) {
					type2 = 2;
				} else {
					type2 = 1;
				}
			} else if (pokemon.getTypeTwo() == 5) {
				if (move.getType() == 0 || move.getType() == 2 || move.getType() == 3 || move.getType() == 4
						|| move.getType() == 9) {
					type2 = 0.5;
				} else if (move.getType() == 1 || move.getType() == 4 || move.getType() == 8 || move.getType() == 10
						|| move.getType() == 11) {
					type2 = 2;
				} else {
					type2 = 1;
				}
			} else if (pokemon.getTypeTwo() == 6) {
				if (move.getType() == 1 || move.getType() == 4 || move.getType() == 11) {
					type2 = 0.5;
				} else if (move.getType() == 2 || move.getType() == 5 || move.getType() == 9) {
					type2 = 2;
				} else {
					type2 = 1;
				}
			} else if (pokemon.getTypeTwo() == 7) {
				if (move.getType() == 0 || move.getType() == 1) {
					type2 = 0;
				} else if (move.getType() == 3 || move.getType() == 6 || move.getType() == 7) {
					type2 = 0.5;
				} else if (move.getType() == 8 || move.getType() == 16) {
					type2 = 2;
				} else {
					type2 = 1;
				}
			} else if (pokemon.getTypeTwo() == 8) {
				if (move.getType() == 3) {
					type2 = 0;
				} else if (move.getType() == 0 || move.getType() == 2 || move.getType() == 5 || move.getType() == 6
						|| move.getType() == 8 || move.getType() == 11 || move.getType() == 13 || move.getType() == 14
						|| move.getType() == 15 || move.getType() == 17) {
					type2 = 0.5;
				} else if (move.getType() == 1 || move.getType() == 4 || move.getType() == 9) {
					type2 = 2;
				} else {
					type2 = 1;
				}
			} else if (pokemon.getTypeTwo() == 9) {
				if (move.getType() == 6 || move.getType() == 8 || move.getType() == 9 || move.getType() == 11
						|| move.getType() == 14 || move.getType() == 17) {
					type2 = 0.5;
				} else if (move.getType() == 4 || move.getType() == 5 || move.getType() == 10) {
					type2 = 2;
				} else {
					type2 = 1;
				}
			} else if (pokemon.getTypeTwo() == 10) {
				if (move.getType() == 8 || move.getType() == 9 || move.getType() == 10 || move.getType() == 14) {
					type2 = 0.5;
				} else if (move.getType() == 11 || move.getType() == 12) {
					type2 = 2;
				} else {
					type2 = 1;
				}
			} else if (pokemon.getTypeTwo() == 11) {
				if (move.getType() == 4 || move.getType() == 10 || move.getType() == 11 || move.getType() == 12) {
					type2 = 0.5;
				} else if (move.getType() == 2 || move.getType() == 3 || move.getType() == 6 || move.getType() == 9
						|| move.getType() == 14) {
					type2 = 2;
				} else {
					type2 = 1;
				}
			} else if (pokemon.getTypeTwo() == 12) {
				if (move.getType() == 2 || move.getType() == 8 || move.getType() == 12) {
					type2 = 0.5;
				} else if (move.getType() == 4) {
					type2 = 2;
				} else {
					type2 = 1;
				}
			} else if (pokemon.getTypeTwo() == 13) {
				if (move.getType() == 1 || move.getType() == 13) {
					type2 = 0.5;
				} else if (move.getType() == 6 || move.getType() == 7 || move.getType() == 16) {
					type2 = 2;
				} else {
					type2 = 1;
				}
			} else if (pokemon.getTypeTwo() == 14) {
				if (move.getType() == 14) {
					type2 = 0.5;
				} else if (move.getType() == 1 || move.getType() == 5 || move.getType() == 8 || move.getType() == 9) {
					type2 = 2;
				} else {
					type2 = 1;
				}
			} else if (pokemon.getTypeTwo() == 15) {
				if (move.getType() == 9 || move.getType() == 10 || move.getType() == 11 || move.getType() == 12) {
					type2 = 0.5;
				} else if (move.getType() == 14 || move.getType() == 15 || move.getType() == 17) {
					type2 = 2;
				} else {
					type2 = 1;
				}
			} else if (pokemon.getTypeTwo() == 16) {
				if (move.getType() == 13) {
					type2 = 0;
				} else if (move.getType() == 7 || move.getType() == 16) {
					type2 = 0.5;
				} else if (move.getType() == 1 || move.getType() == 6 || move.getType() == 16) {
					type2 = 2;
				} else {
					type2 = 1;
				}
			} else if (pokemon.getTypeTwo() == 17) {
				if (move.getType() == 15) {
					type2 = 0;
				} else if (move.getType() == 1 || move.getType() == 6 || move.getType() == 16) {
					type2 = 0.5;
				} else if (move.getType() == 3 || move.getType() == 8) {
					type2 = 2;
				} else {
					type2 = 1;
				}
			}
		}

		// 0, 0.25, 0.5, 1, 2, or 4

		if (pokemon.getTypeTwo() == 18) {
			temp = type1;
		} else {
			if (type1 == 0) {
				if (type2 == 0) {
					temp = 0;
				} else if (type2 == 0.5) {
					temp = 0.25;
				} else if (type2 == 1) {
					temp = 0.5;
				} else if (type2 == 2) {
					temp = 1;
				}
			} else if (type1 == 0.5) {
				if (type2 == 0) {
					temp = 0.25;
				} else if (type2 == 0.5) {
					temp = 0.5;
				} else if (type2 == 1) {
					temp = 1;
				} else if (type2 == 2) {
					temp = 2;
				}
			} else if (type1 == 1) {
				if (type2 == 0) {
					temp = 0.5;
				} else if (type2 == 0.5) {
					temp = 1;
				} else if (type2 == 1) {
					temp = 1;
				} else if (type2 == 2) {
					temp = 2;
				}
			} else if (type1 == 2) {
				if (type2 == 0) {
					temp = 1;
				} else if (type2 == 0.5) {
					temp = 1;
				} else if (type2 == 1) {
					temp = 2;
				} else if (type2 == 2) {
					temp = 4;
				}
			}
		}

		return temp;

	}

	public static double OTHER(Pokemon pokemonAttacking, Pokemon pokemonDefending, Move move) {

		return 1;

	}

}
