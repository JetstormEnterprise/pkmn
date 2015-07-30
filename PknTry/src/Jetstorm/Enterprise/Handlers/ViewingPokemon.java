package Jetstorm.Enterprise.Handlers;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import Jetstorm.Enterprise.Entities.Pokemon.Pokemon;
import Jetstorm.Enterprise.Handlers.Font.FontLoader;

public class ViewingPokemon {

	public static Pokemon pokemon;
	public static int currentPage = 0;

	public static void setPokemon(Pokemon newPokemon) {
		pokemon = newPokemon;
	}

	public static void update() {
		pokemon.update();
	}

	public static void draw(Graphics2D g) {

		g.drawImage(ImageLoader.VIEWINGPOKEMONPAGE1, 0, 0, null);

		if (currentPage == 0) {

			BufferedImage[] pageText = FontLoader.getLightTranslation("POKEMON INFO");
			BufferedImage[] originalTrainer = FontLoader.getLightTranslation("OT/" + pokemon.getTrainer());
			BufferedImage[] IDNo = FontLoader.getLightTranslation("IDNo" + pokemon.getID());
			BufferedImage[] type = FontLoader.getDarkTranslation("TYPE/");
			BufferedImage[] number = FontLoader.getLightTranslation("No" + pokemon.getPokemonNumber());
			BufferedImage[] rNature = FontLoader.getRedTranslation(PokemonInfo.getNature(pokemon.getNature())
					.toUpperCase());
			BufferedImage[] sNature = FontLoader.getDarkTranslation(" nature,");
			BufferedImage[] nature = new BufferedImage[rNature.length + sNature.length];
			for (int i = 0; i < nature.length; i++) {
				if (i < rNature.length) {
					nature[i] = rNature[i];
				} else {
					nature[i] = sNature[i - rNature.length];
				}
			}
			BufferedImage[] sMet = FontLoader.getDarkTranslation("met at Lv ");
			BufferedImage[] lMet = FontLoader.getLevelImage(pokemon.getLevel(), 6);
			BufferedImage fMet = FontLoader.getDarkTranslation(",")[0];
			BufferedImage[] levelMet = new BufferedImage[sMet.length + lMet.length + 1];
			for (int i = 0; i < levelMet.length; i++) {
				if (i < sMet.length) {
					levelMet[i] = sMet[i];
				} else if (i >= sMet.length && i < sMet.length + lMet.length) {
					levelMet[i] = lMet[i - sMet.length];
				} else {
					levelMet[i] = fMet;
				}
			}

			for (int i = 0; i < pageText.length; i++) {
				g.drawImage(pageText[i], 2 + (i * 6), 4, null);
			}

			for (int i = 0; i < originalTrainer.length; i++) {
				g.drawImage(originalTrainer[i], 88 + (i * 6), 35, null);
			}

			for (int i = 0; i < IDNo.length; i++) {
				g.drawImage(IDNo[i], 183 + (i * 6), 35, null);
			}

			for (int i = 0; i < type.length; i++) {
				g.drawImage(type[i], 88 + (i * 6), 52, null);
			}

			for (int i = 0; i < number.length; i++) {
				g.drawImage(number[i], 8 + (i * 6), 20, null);
			}

			g.drawImage(ImageLoader.getTypeImage(pokemon.getTypeOne()), 120, 49, null);

			if (pokemon.getTypeTwo() != 18) {
				g.drawImage(ImageLoader.getTypeImage(pokemon.getTypeTwo()), 154, 49, null);
			}

			for (int i = 0; i < nature.length; i++) {
				g.drawImage(nature[i], 88 + (i * 6), 116, null);
			}

			for (int i = 0; i < levelMet.length; i++) {
				g.drawImage(levelMet[i], 88 + (i * 6), 132, null);
			}

		} else if (currentPage == 1) {

			g.drawImage(ImageLoader.VIEWINGPOKEMONPAGE2, 0, 0, null);

			BufferedImage[] pageText = FontLoader.getLightTranslation("POKEMON SKILLS");
			BufferedImage[] number = FontLoader.getLightTranslation("No" + pokemon.getPokemonNumber());

			for (int i = 0; i < pageText.length; i++) {
				g.drawImage(pageText[i], 2 + (i * 6), 4, null);
			}
			for (int i = 0; i < number.length; i++) {
				g.drawImage(number[i], 8 + (i * 6), 20, null);
			}

			BufferedImage[] hp = FontLoader.getLightTranslation("HP");
			BufferedImage[] attack = FontLoader.getLightTranslation("ATTACK");
			BufferedImage[] defense = FontLoader.getLightTranslation("DEFENSE");
			BufferedImage[] spattack = FontLoader.getLightTranslation("SP.ATK");
			BufferedImage[] spdefense = FontLoader.getLightTranslation("SP.DEF");
			BufferedImage[] speed = FontLoader.getLightTranslation("SPEED");
			BufferedImage[] exp = FontLoader.getLightTranslation("EXP.POINTS");
			BufferedImage[] nextlevel = FontLoader.getLightTranslation("NEXT LV.");

			BufferedImage[] hpPkm = FontLoader.getDarkTranslation(Integer.toString(pokemon.getHealth()));
			BufferedImage[] maxhpPkm = FontLoader.getDarkTranslation("/" + Integer.toString(pokemon.getMaxHealth()));
			BufferedImage[] attackPkm = FontLoader.getDarkTranslation(Integer.toString(pokemon.getAttack()));
			BufferedImage[] defensePkm = FontLoader.getDarkTranslation(Integer.toString(pokemon.getDefense()));
			BufferedImage[] spattackPkm = FontLoader.getDarkTranslation(Integer.toString(pokemon.getSpAttack()));
			BufferedImage[] spdefensePkm = FontLoader.getDarkTranslation(Integer.toString(pokemon.getSpDefense()));
			BufferedImage[] speedPkm = FontLoader.getDarkTranslation(Integer.toString(pokemon.getSpeed()));
			BufferedImage[] expPkm = FontLoader.getDarkTranslation(Integer.toString(pokemon.getExp()));
			BufferedImage[] nextlevelPkm = FontLoader.getDarkTranslation(Integer.toString(pokemon.getMaxExp()
					- pokemon.getExp()));

			for (int i = 0; i < hp.length; i++) {
				g.drawImage(hp[i], 101 + (i * 6), 60, null);
			}
			for (int i = 0; i < hpPkm.length; i++) {
				g.drawImage(hpPkm[i], (144 - (6 * (hpPkm.length - 1))) + (i * 6), 60, null);
			}
			for (int i = 0; i < maxhpPkm.length; i++) {
				g.drawImage(maxhpPkm[i], 150 + (i * 6), 60, null);
			}
			for (int i = 0; i < attack.length; i++) {
				g.drawImage(attack[i], 89 + (i * 6), 76, null);
			}
			for (int i = 0; i < attackPkm.length; i++) {
				g.drawImage(attackPkm[i], (168 - (6 * (attackPkm.length - 1))) + (i * 6), 76, null);
			}
			for (int i = 0; i < defense.length; i++) {
				g.drawImage(defense[i], 86 + (i * 6), 92, null);
			}
			for (int i = 0; i < defensePkm.length; i++) {
				g.drawImage(defensePkm[i], (168 - (6 * (defensePkm.length - 1))) + (i * 6), 92, null);
			}
			for (int i = 0; i < spattack.length; i++) {
				g.drawImage(spattack[i], 178 + (i * 6), 60, null);
			}
			for (int i = 0; i < spattackPkm.length; i++) {
				g.drawImage(spattackPkm[i], (231 - (6 * (spattackPkm.length - 1))) + (i * 6), 60, null);
			}
			for (int i = 0; i < spdefense.length; i++) {
				g.drawImage(spdefense[i], 178 + (i * 6), 76, null);
			}
			for (int i = 0; i < spdefensePkm.length; i++) {
				g.drawImage(spdefensePkm[i], (231 - (6 * (spdefensePkm.length - 1))) + (i * 6), 76, null);
			}
			for (int i = 0; i < speed.length; i++) {
				g.drawImage(speed[i], 181 + (i * 6), 92, null);
			}
			for (int i = 0; i < speedPkm.length; i++) {
				g.drawImage(speedPkm[i], (231 - (6 * (speedPkm.length - 1))) + (i * 6), 92, null);
			}
			for (int i = 0; i < exp.length; i++) {
				g.drawImage(exp[i], 92 + (i * 6), 115, null);
			}
			for (int i = 0; i < expPkm.length; i++) {
				g.drawImage(expPkm[i], (231 - (6 * (expPkm.length - 1))) + (i * 6), 115, null);
			}
			for (int i = 0; i < nextlevel.length; i++) {
				g.drawImage(nextlevel[i], 92 + (i * 6), 131, null);
			}
			for (int i = 0; i < nextlevelPkm.length; i++) {
				g.drawImage(nextlevelPkm[i], (231 - (6 * (nextlevelPkm.length - 1))) + (i * 6), 131, null);
			}

			for (int i = 0; i < pokemon.getExpPercent(); i++) {
				g.drawImage(ImageLoader.POKEMONEXPERIENCEBAR, 168 + (i * 1), 146, 1, 3, null);
			}

		} else if (currentPage == 2) {

			g.drawImage(ImageLoader.VIEWINGPOKEMONPAGE3, 0, 0, null);

			BufferedImage[] pageText = FontLoader.getLightTranslation("BATTLE MOVES");
			BufferedImage[] number = FontLoader.getLightTranslation("No" + pokemon.getPokemonNumber());

			for (int i = 0; i < pageText.length; i++) {
				g.drawImage(pageText[i], 2 + (i * 6), 4, null);
			}
			for (int i = 0; i < number.length; i++) {
				g.drawImage(number[i], 8 + (i * 6), 20, null);
			}

		}

		g.drawImage(pokemon.getFrontAnimation().getImage(), 0, 20, null);

		BufferedImage[] nickName = FontLoader.getLightTranslation(pokemon.getNickName());
		BufferedImage[] species = FontLoader.getLightTranslation("/" + pokemon.getSpecies());
		BufferedImage[] level = FontLoader.getLightTranslation("Lv" + pokemon.getLevel());
		if (pokemon.getGender() == 0) {
			BufferedImage[] gender = FontLoader.getBlueTranslation("<");
			g.drawImage(gender[0], 65, 131, null);
		} else {
			BufferedImage[] gender = FontLoader.getRedTranslation(">");
			g.drawImage(gender[0], 65, 131, null);
		}

		for (int i = 0; i < nickName.length; i++) {
			g.drawImage(nickName[i], 10 + (i * 6), 101, null);
		}
		for (int i = 0; i < species.length; i++) {
			g.drawImage(species[i], 10 + (i * 6), 115, null);
		}
		for (int i = 0; i < level.length; i++) {
			g.drawImage(level[i], 32 + (i * 6), 132, null);
		}

	}

}
