package Jetstorm.Enterprise.Handlers;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class PokemonImageLoader {

	public static int pokemonFinished = 112;

	/**
	 * 650 Pokemon
	 */

	public static BufferedImage[] loadPokemonFrontAnimation(int pokemonNumber) {
		
		BufferedImage[] io = null;
		
		try {
		
		io = new BufferedImage[2];
		io[0] = ImageIO.read(PokemonImageLoader.class.getResourceAsStream("/pokemon/pkm" + pokemonNumber + ".png")).getSubimage(0, 0, 80, 80);
		io[1] = ImageIO.read(PokemonImageLoader.class.getResourceAsStream("/pokemon/pkm" + pokemonNumber + ".png")).getSubimage(80, 0, 80, 80);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return io;
		
	}

	public static BufferedImage[] loadPokemonBackAnimation(int pokemonNumber) {
		
		BufferedImage[] io = null;
		
		try {
		
		io = new BufferedImage[2];
		io[0] = ImageIO.read(PokemonImageLoader.class.getResourceAsStream("/pokemon/pkm" + pokemonNumber + ".png")).getSubimage(160, 0, 80, 80);
		io[1] = ImageIO.read(PokemonImageLoader.class.getResourceAsStream("/pokemon/pkm" + pokemonNumber + ".png")).getSubimage(240, 0, 80, 80);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return io;
		
	}

	public static BufferedImage[] loadPokemonIconAnimation(int pokemonNumber) {
		
		BufferedImage[] io = null;
		
		try {
		
		io = new BufferedImage[2];
		io[0] = ImageIO.read(PokemonImageLoader.class.getResourceAsStream("/pokemon/pkm" + pokemonNumber + ".png")).getSubimage(320, 0, 32, 32);
		io[1] = ImageIO.read(PokemonImageLoader.class.getResourceAsStream("/pokemon/pkm" + pokemonNumber + ".png")).getSubimage(320, 32, 32, 32);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return io;
		
	}

	public static BufferedImage[] loadShinyPokemonFrontAnimation(int pokemonNumber) {
		
		BufferedImage[] io = null;
		
		try {
		
		io = new BufferedImage[2];
		io[0] = ImageIO.read(PokemonImageLoader.class.getResourceAsStream("/pokemon/pkm" + pokemonNumber + ".png")).getSubimage(0, 80, 80, 80);
		io[1] = ImageIO.read(PokemonImageLoader.class.getResourceAsStream("/pokemon/pkm" + pokemonNumber + ".png")).getSubimage(80, 80, 80, 80);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return io;
	}

	public static BufferedImage[] loadShinyPokemonBackAnimation(int pokemonNumber) {
		
		BufferedImage[] io = null;
		
		try {
			
			io = new BufferedImage[2];
			io[0] = ImageIO.read(PokemonImageLoader.class.getResourceAsStream("/pokemon/pkm" + pokemonNumber + ".png")).getSubimage(160, 80, 80, 80);
			io[1] = ImageIO.read(PokemonImageLoader.class.getResourceAsStream("/pokemon/pkm" + pokemonNumber + ".png")).getSubimage(240, 80, 80, 80);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return io;
	}

}
