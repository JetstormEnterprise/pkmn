package Jetstorm.Enterprise.Handlers;

import Jetstorm.Enterprise.Entities.Pokemon.*;

public class PokemonInfo {

	public static final int[] erratic = { 0, 15, 52, 122, 237, 406, 637, 942, 1326, 1800, 2369, 3041, 3822, 4719, 5737,
			6881,
			8155, 9564, 11111, 12800, 14632, 16610, 18737, 21012, 23437, 26012, 28737, 31610, 34632, 37800, 41111,
			44564, 48155, 51881, 55737, 59719, 63822, 68041, 72369, 76800, 81326, 85942, 90637, 95406, 100237, 105122,
			110052, 115015, 120001, 125000, 131324, 137795, 144410, 151165, 158056, 165079, 172229, 179503, 186894,
			194400, 202013, 209728, 217540, 225443, 233431, 241496, 249633, 257834, 267406, 276458, 286328, 296358,
			305767, 316074, 326531, 336255, 346965, 357812, 367807, 378880, 390077, 400293, 411686, 423190, 433572,
			445239, 457001, 467489, 479378, 491346, 501878, 513934, 526049, 536557, 548720, 560922, 571333, 583539,
			591882, 600000 };
	public static final int[] fast = { 0, 6, 21, 51, 100, 172, 274, 409, 583, 800, 1064, 1382, 1757, 2195, 2700, 3276,
			3930,
			4665, 5487, 6400, 7408, 8518, 9733, 11059, 12500, 14060, 15746, 17561, 19511, 21600, 23832, 26214, 28749,
			31443, 34300, 37324, 40522, 43897, 47455, 51200, 55136, 59270, 63605, 68147, 72900, 77868, 83058, 88473,
			94119, 100000, 106120, 112486, 119101, 125971, 133100, 140492, 148154, 156089, 164303, 172800, 181584,
			190662, 200037, 209715, 219700, 229996, 240610, 251545, 262807, 274400, 286328, 298598, 311213, 324179,
			337500, 351180, 365226, 379641, 394431, 409600, 425152, 441094, 457429, 474163, 491300, 508844, 526802,
			545177, 563975, 583200, 602856, 622950, 643485, 664467, 685900, 707788, 730138, 752953, 776239, 800000 };
	public static final int[] mediumfast = { 0, 8, 27, 64, 125, 216, 343, 512, 729, 1000, 1331, 1728, 2197, 2744, 3375,
			4096,
			4913, 5832, 6859, 8000, 9261, 10648, 12167, 13824, 15625, 17576, 19683, 21952, 24389, 27000, 29791, 32768,
			35937, 39304, 42875, 46656, 50653, 54872, 59319, 64000, 68921, 74088, 79507, 85184, 91125, 97336, 103823,
			110592, 117649, 125000, 132651, 140608, 148877, 157464, 166375, 175616, 185193, 195112, 205379, 216000,
			226981, 238328, 250047, 262144, 274625, 287496, 300763, 314432, 328509, 343000, 357911, 373248, 389017,
			405224, 421875, 438976, 456533, 474552, 493039, 512000, 531441, 551368, 571787, 592704, 614125, 636056,
			658503, 681472, 704969, 729000, 753571, 778688, 804357, 830584, 857375, 884736, 912673, 941192, 970299,
			1000000 };
	public static final int[] mediumslow = { 0, 9, 57, 96, 135, 179, 236, 314, 419, 560, 742, 973, 1261, 1612, 2035,
			2535,
			3120, 3798, 4575, 5460, 6458, 7577, 8825, 10208, 11735, 13411, 15244, 17242, 19411, 21760, 24294, 27021,
			29949, 33084, 36435, 40007, 43808, 47846, 52127, 56660, 61450, 66505, 71833, 77440, 83335, 89523, 96012,
			102810, 109923, 117360, 125126, 133229, 141677, 150476, 159635, 169159, 179056, 189334, 199999, 211060,
			222522, 234393, 246681, 259392, 272535, 286115, 300140, 314618, 329555, 344960, 360838, 377197, 394045,
			411388, 429235, 447591, 466464, 485862, 505791, 526260, 547274, 568841, 590969, 613664, 636935, 660787,
			685228, 710266, 735907, 762160, 789030, 816525, 844653, 873420, 902835, 932903, 963632, 995030, 1027103,
			1059860 };
	public static final int[] slow = { 0, 10, 33, 80, 156, 270, 428, 640, 911, 1250, 1663, 2160, 2746, 3430, 4218,
			5120,
			6141, 7290, 8573, 10000, 11576, 13310, 15208, 17280, 19531, 21970, 24603, 27440, 30486, 33750, 37238,
			40960, 44921, 49130, 53593, 58320, 63316, 68590, 74148, 80000, 86151, 92610, 99383, 106480, 113906, 121670,
			129778, 138240, 147061, 156250, 165813, 175760, 186096, 196830, 207968, 219520, 231491, 243890, 256723,
			270000, 283726, 297910, 312558, 327680, 343281, 359370, 375953, 393040, 410636, 428750, 447388, 466560,
			486271, 506530, 527343, 548720, 570666, 593190, 616298, 640000, 664301, 689210, 714733, 740880, 767656,
			795070, 823128, 851840, 881211, 911250, 941963, 973360, 1005446, 1038230, 1071718, 1105920, 1140841,
			1176490, 1212873, 1250000 };
	public static final int[] fluctuating = { 0, 4, 13, 32, 65, 112, 178, 276, 393, 540, 745, 967, 1230, 1591, 1957,
			2457,
			3046, 3732, 4526, 5440, 6482, 7666, 9003, 10506, 12187, 14060, 16140, 18439, 20974, 23760, 26811, 30146,
			33780, 37731, 42017, 46656, 50653, 55969, 60505, 66560, 71677, 78533, 84277, 91998, 98415, 107069, 114205,
			123863, 131766, 142500, 151222, 163105, 172697, 185807, 196322, 210739, 222231, 238036, 250562, 267840,
			281456, 300293, 315059, 335544, 351520, 373744, 390991, 415050, 433631, 459620, 479600, 507617, 529063,
			559209, 582187, 614566, 639146, 673863, 700115, 737280, 765275, 804997, 834809, 877201, 908905, 954084,
			987754, 1035837, 1071552, 1122660, 1160499, 1214753, 1254796, 1312322, 1354652, 1415577, 1460276, 1524731,
			1571884, 1640000 };

	public static int getLevelEXP(String levelingType, int level) {

		int temp = 0;

		if (levelingType.equalsIgnoreCase("Erratic")) {
			temp = erratic[level - 1];
		} else if (levelingType.equalsIgnoreCase("Fast")) {
			temp = fast[level - 1];
		} else if (levelingType.equalsIgnoreCase("Medium Fast")) {
			temp = mediumfast[level - 1];
		} else if (levelingType.equalsIgnoreCase("Medium Slow")) {
			temp = mediumslow[level - 1];
		} else if (levelingType.equalsIgnoreCase("Slow")) {
			temp = slow[level - 1];
		} else if (levelingType.equalsIgnoreCase("Fluctuating")) {
			temp = fluctuating[level - 1];
		}

		return temp;

	}

	public static int getExpGain(Pokemon wildPokemon, Pokemon playerPokemon) {

		int temp = 0;
		double d1 = 0;
		double d2 = 0;
		double d3 = 0;
		double d4 = 0;
		double d5 = 0;
		double d6 = 0;

		if (wildPokemon.getTrainer() == null) {
			d1 = 1 * wildPokemon.getExpYield() * wildPokemon.getLevel();
		}

		d2 = 5 * 1;
		d3 = Math.pow((2 * wildPokemon.getLevel()) + 10, 2.5);
		d4 = Math.pow((wildPokemon.getLevel() + playerPokemon.getLevel() + 10), 2.5);
		d5 = ((d1 / d2) * (d3 / d4) + 1);
		d6 = d5 * playerPokemon.getTrainerExpBonus() * playerPokemon.getExpBonus();
		temp = (int) d6;

		return temp;

	}

	/**
	 * 1:Hardy, 2:Lonely, 3:Brave, 4:Adamant, 5:Naughty, 6:Bold, 7:Docile,
	 * 8:Relaxed, 9:Impish, 10:Lax, 11:Timid, 12:Hasty, 13:Serious, 14:Jolly,
	 * 15:Naive, 16:Modest, 17:Mild, 18:Quiet, 19:Bashful, 20:Rash, 21:Calm,
	 * 22:Gentle, 23:Sassy, 24:Careful, 25:Quirky
	 * 
	 * @return
	 */
	public static String getNature(int natureValue) {

		String temp = null;

		if (natureValue == 1) {
			temp = "Hardy";
		} else if (natureValue == 2) {
			temp = "Lonely";
		} else if (natureValue == 3) {
			temp = "Brave";
		} else if (natureValue == 4) {
			temp = "Adamant";
		} else if (natureValue == 5) {
			temp = "Naughty";
		} else if (natureValue == 6) {
			temp = "Bold";
		} else if (natureValue == 7) {
			temp = "Docile";
		} else if (natureValue == 8) {
			temp = "Relaxed";
		} else if (natureValue == 9) {
			temp = "Impish";
		} else if (natureValue == 10) {
			temp = "Lax";
		} else if (natureValue == 11) {
			temp = "Timid";
		} else if (natureValue == 12) {
			temp = "Hasty";
		} else if (natureValue == 13) {
			temp = "Serious";
		} else if (natureValue == 14) {
			temp = "Jolly";
		} else if (natureValue == 15) {
			temp = "Naive";
		} else if (natureValue == 16) {
			temp = "Modest";
		} else if (natureValue == 17) {
			temp = "Mild";
		} else if (natureValue == 18) {
			temp = "Quiet";
		} else if (natureValue == 19) {
			temp = "Bashful";
		} else if (natureValue == 20) {
			temp = "Rash";
		} else if (natureValue == 21) {
			temp = "Calm";
		} else if (natureValue == 22) {
			temp = "Gentle";
		} else if (natureValue == 23) {
			temp = "Sassy";
		} else if (natureValue == 24) {
			temp = "Careful";
		} else if (natureValue == 25) {
			temp = "Quirky";
		}

		return temp;

	}

	public static Pokemon generatePokemon(int pokeNum, int level) {

		Pokemon temp = null;

		if (pokeNum == 1) {
			temp = new Bulbasaur(level);
		} else if (pokeNum == 2) {
			temp = new Ivysaur(level);
		} else if (pokeNum == 3) {
			temp = new Venusaur(level);
		} else if (pokeNum == 4) {
			temp = new Charmander(level);
		} else if (pokeNum == 5) {
			temp = new Charmeleon(level);
		} else if (pokeNum == 6) {
			temp = new Charizard(level);
		} else if (pokeNum == 7) {
			temp = new Squirtle(level);
		} else if (pokeNum == 8) {
			temp = new Wartortle(level);
		} else if (pokeNum == 9) {
			temp = new Blastoise(level);
		} else if (pokeNum == 10) {
			temp = new Caterpie(level);
		} else if (pokeNum == 11) {
			temp = new Metapod(level);
		} else if (pokeNum == 12) {
			temp = new Butterfree(level);
		} else if (pokeNum == 13) {
			temp = new Weedle(level);
		} else if (pokeNum == 14) {
			temp = new Kakuna(level);
		} else if (pokeNum == 15) {
			temp = new Beedrill(level);
		} else if (pokeNum == 16) {
			temp = new Pidgey(level);
		} else if (pokeNum == 17) {
			temp = new Pidgeotto(level);
		} else if (pokeNum == 18) {
			temp = new Pidgeot(level);
		} else if (pokeNum == 19) {
			temp = new Rattata(level);
		} else if (pokeNum == 20) {
			temp = new Raticate(level);
		} else if (pokeNum == 21) {
			temp = new Spearow(level);
		} else if (pokeNum == 22) {
			temp = new Fearow(level);
		} else if (pokeNum == 23) {
			temp = new Ekans(level);
		} else if (pokeNum == 24) {
			temp = new Arbok(level);
		} else if (pokeNum == 25) {
			temp = new Pikachu(level);
		} else if (pokeNum == 26) {
			temp = new Raichu(level);
		} else if (pokeNum == 27) {
			temp = new Sandshrew(level);
		} else if (pokeNum == 28) {
			temp = new Sandslash(level);
		} else if (pokeNum == 29) {
			temp = new NidoranF(level);
		} else if (pokeNum == 30) {
			temp = new Nidorina(level);
		} else if (pokeNum == 31) {
			temp = new Nidoqueen(level);
		} else if (pokeNum == 32) {
			temp = new NidoranM(level);
		} else if (pokeNum == 33) {
			temp = new Nidorino(level);
		} else if (pokeNum == 34) {
			temp = new Nidoking(level);
		} else if (pokeNum == 35) {
			temp = new Clefairy(level);
		} else if (pokeNum == 36) {
			temp = new Clefable(level);
		} else if (pokeNum == 37) {
			temp = new Vulpix(level);
		} else if (pokeNum == 38) {
			temp = new Ninetales(level);
		} else if (pokeNum == 39) {
			temp = new Jigglypuff(level);
		} else if (pokeNum == 40) {
			temp = new Wigglytuff(level);
		} else if (pokeNum == 41) {
			temp = new Zubat(level);
		} else if (pokeNum == 42) {
			temp = new Golbat(level);
		} else if (pokeNum == 43) {
			temp = new Oddish(level);
		} else if (pokeNum == 44) {
			temp = new Gloom(level);
		} else if (pokeNum == 45) {
			temp = new Vileplume(level);
		} else if (pokeNum == 46) {
			temp = new Paras(level);
		} else if (pokeNum == 47) {
			temp = new Parasect(level);
		} else if (pokeNum == 48) {
			temp = new Venonat(level);
		} else if (pokeNum == 49) {
			temp = new Venomoth(level);
		} else if (pokeNum == 50) {
			temp = new Diglett(level);
		} else if (pokeNum == 51) {
			temp = new Dugtrio(level);
		} else if (pokeNum == 52) {
			temp = new Meowth(level);
		} else if (pokeNum == 53) {
			temp = new Persian(level);
		} else if (pokeNum == 54) {
			temp = new Psyduck(level);
		} else if (pokeNum == 55) {
			temp = new Golduck(level);
		} else if (pokeNum == 56) {
			temp = new Mankey(level);
		} else if (pokeNum == 57) {
			temp = new Primeape(level);
		} else if (pokeNum == 58) {
			temp = new Growlithe(level);
		} else if (pokeNum == 59) {
			temp = new Arcanine(level);
		} else if (pokeNum == 60) {
			temp = new Poliwag(level);
		} else if (pokeNum == 61) {
			temp = new Poliwhirl(level);
		} else if (pokeNum == 62) {
			temp = new Poliwrath(level);
		} else if (pokeNum == 63) {
			temp = new Abra(level);
		} else if (pokeNum == 64) {
			temp = new Kadabra(level);
		} else if (pokeNum == 65) {
			temp = new Alakazam(level);
		} else if (pokeNum == 66) {
			temp = new Machop(level);
		} else if (pokeNum == 67) {
			temp = new Machoke(level);
		} else if (pokeNum == 68) {
			temp = new Machamp(level);
		} else if (pokeNum == 69) {
			temp = new Bellsprout(level);
		} else if (pokeNum == 70) {
			temp = new Weepinbell(level);
		} else if (pokeNum == 71) {
			temp = new Victreebel(level);
		} else if (pokeNum == 72) {
			temp = new Tentacool(level);
		} else if (pokeNum == 73) {
			temp = new Tentacruel(level);
		} else if (pokeNum == 74) {
			temp = new Geodude(level);
		} else if (pokeNum == 75) {
			temp = new Graveler(level);
		} else if (pokeNum == 76) {
			temp = new Golem(level);
		} else if (pokeNum == 77) {
			temp = new Ponyta(level);
		} else if (pokeNum == 78) {
			temp = new Rapidash(level);
		} else if (pokeNum == 79) {
			temp = new Slowpoke(level);
		} else if (pokeNum == 80) {
			temp = new Slowbro(level);
		} else if (pokeNum == 81) {
			temp = new Magnemite(level);
		} else if (pokeNum == 82) {
			temp = new Magneton(level);
		} else if (pokeNum == 83) {
			temp = new Farfetchd(level);
		} else if (pokeNum == 84) {
			temp = new Doduo(level);
		} else if (pokeNum == 85) {
			temp = new Dodrio(level);
		} else if (pokeNum == 86) {
			temp = new Seel(level);
		} else if (pokeNum == 87) {
			temp = new Dewgong(level);
		} else if (pokeNum == 88) {
			temp = new Grimer(level);
		} else if (pokeNum == 89) {
			temp = new Muk(level);
		} else if (pokeNum == 90) {
			temp = new Shellder(level);
		} else if (pokeNum == 91) {
			temp = new Cloyster(level);
		} else if (pokeNum == 92) {
			temp = new Gastly(level);
		} else if (pokeNum == 93) {
			temp = new Haunter(level);
		} else if (pokeNum == 94) {
			temp = new Gengar(level);
		} else if (pokeNum == 95) {
			temp = new Onix(level);
		} else if (pokeNum == 96) {
			temp = new Drowzee(level);
		} else if (pokeNum == 97) {
			temp = new Hypno(level);
		} else if (pokeNum == 98) {
			temp = new Krabby(level);
		} else if (pokeNum == 99) {
			temp = new Kingler(level);
		} else if (pokeNum == 100) {
			temp = new Voltorb(level);
		} else if (pokeNum == 101) {
			temp = new Electrode(level);
		} else if (pokeNum == 102) {
			temp = new Exeggcute(level);
		} else if (pokeNum == 103) {
			temp = new Exeggutor(level);
		} else if (pokeNum == 104) {
			temp = new Cubone(level);
		} else if (pokeNum == 105) {
			temp = new Marowak(level);
		} else if (pokeNum == 106) {
			temp = new Hitmonlee(level);
		} else if (pokeNum == 107) {
			temp = new Hitmonchan(level);
		} else if (pokeNum == 108) {
			temp = new Lickitung(level);
		} else if (pokeNum == 109) {
			temp = new Koffing(level);
		} else if (pokeNum == 110) {
			temp = new Weezing(level);
		} else if (pokeNum == 111) {
			temp = new Rhyhorn(level);
		} else if (pokeNum == 112) {
			temp = new Rhydon(level);
		}
		return temp;

	}

}
