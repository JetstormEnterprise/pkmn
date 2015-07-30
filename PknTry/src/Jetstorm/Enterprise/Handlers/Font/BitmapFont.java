package Jetstorm.Enterprise.Handlers.Font;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Hashtable;

/**
 * The bitmap font class. Used for fonts of fixed height, using images to
 * represent the letters
 * 
 * @author thomas
 * 
 */

public class BitmapFont extends AbstractFont {

	private Hashtable<Character, BufferedImage> charIndex = new Hashtable<Character, BufferedImage>();
	private int height;
	private int lastWriteWidth = 0, lastWriteLines = 0, lastWriteHeight = 0;

	/**
	 * Creates a Bitmap font, using the samemethods as the
	 * "standard Bitmap Font Writer" of Stefan Pettersson does. The given image
	 * is cut in two parts: one one-pixel row with untransparent dots (which's
	 * color is specified in the first pixel) determinig the letters' with, and
	 * one row containing the letters thatare separated according to this width.
	 * 
	 * In this case, the default letter sequence is used:
	 * 
	 * ! " # $ % & ' ( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ; < = > ? @ A B C D E
	 * F G H I J K L M N O P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c d e f g h i j
	 * k l m n o p q r s t u v w x y z { | } ~
	 * 
	 * @param letters
	 *            - the image containing the font's letters
	 */
	public BitmapFont(BufferedImage image) {
		this(image, defaultSequence);
	}

	public BitmapFont(BufferedImage image, String sequence) {
		BufferedImage widthRow = image.getSubimage(1, 0, image.getWidth() - 2, 1);
		this.height = image.getHeight() - 1;
		BufferedImage letterRow = image.getSubimage(1, 1, image.getWidth() - 2, this.height);
		int splitColor = image.getRGB(0, 0);
		int x = 0;

		for (int i = 0; i < sequence.length(); i++) {
			int p = 0;
			while (x + p < widthRow.getWidth() && widthRow.getRGB(x + p, 0) != splitColor)
				p++;
			this.charIndex.put(new Character(sequence.charAt(i)), letterRow.getSubimage(x, 0, p, this.height));
			x += (p + 1);
			if (x >= widthRow.getWidth())
				break;
		}

	}

	/**
	 * Creates a new instance of this class with the given images and the
	 * default letter sequence:
	 * 
	 * ! " # $ % & ' ( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ; < = > ? @ A B C D E
	 * F G H I J K L M N O P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c d e f g h i j
	 * k l m n o p q r s t u v w x y z { | } ~
	 * 
	 * @param letters
	 *            - the font images
	 */
	public BitmapFont(BufferedImage letters[]) {
		this(letters, defaultSequence);
	}

	/**
	 * Creates a new instance of this class with the given images and the given
	 * letter sequence.
	 * 
	 * @param letters
	 *            - the font images
	 * @param s
	 *            - the char representations of the images
	 */
	public BitmapFont(BufferedImage letters[], String s) {
		for (int i = 0; i < s.length() && i < letters.length; i++) {
			this.charIndex.put(new Character(s.charAt(i)), letters[i]);
		}
		this.height = letters[0].getHeight();
	}

	// TODO: fix alignment
	public int write(Graphics graphics, String s, int alignment, int x, int y, int width, int vspace, int indentation) {

		int writtenWidth = 0;
		int lines = 0;
		Character curChar;

		for (int i = 0; i < s.length(); i++) {
			curChar = new Character(s.charAt(i));
			if (this.charIndex.get(curChar) != null) {
				writtenWidth += this.charIndex.get(curChar).getWidth();
				if (writtenWidth > width) {
					lines++;
					writtenWidth = 0;
				}
				if (!isAvailable(curChar))
					curChar = this.charIndex.keys().nextElement();
				graphics.drawImage(this.charIndex.get(curChar), x + writtenWidth,
						y + lines * (vspace + this.getHeight()), null);
			}
		}

		this.lastWriteHeight = y + lines * (vspace + this.getHeight());
		this.lastWriteLines = lines + 1;
		this.lastWriteWidth = writtenWidth;

		return this.lastWriteLines;
	}

	public int getLastWriteHeight() {
		return this.lastWriteHeight;
	}

	public int getLastWriteLines() {
		return this.lastWriteLines;
	}

	public int getLastWriteWidth() {
		return this.lastWriteWidth;
	}

	public int getWidth(char c) {
		return getWidth(new Character(c));
	}

	public int getWidth(Character c) {
		return this.charIndex.get(c).getWidth();
	}

	public int getHeight() {
		return this.height;
	}

	public boolean isAvailable(char c) {
		return this.isAvailable(new Character(c));
	}

	public boolean isAvailable(Character c) {
		return this.charIndex.containsKey(c);
	}
}
