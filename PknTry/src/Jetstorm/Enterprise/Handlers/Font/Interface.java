package Jetstorm.Enterprise.Handlers.Font;

import java.awt.Graphics;

public interface Interface {

	public static final int LEFT = 1;
	public static final int RIGHT = 2;
	public static final int CENTER = 3;
	public static final int JUSTIFY = 4;

	public int write(Graphics graphics, String s, int x, int y);

	public int write(Graphics graphics, String s, int allignment, int x, int y, int width);

	public int write(Graphics graphics, String s, int allignment, int x, int y, int width, int vspace, int indentation);

	public int getWidth(String s);

	public int getWidth(char c);

	public int getHeight();

	public boolean isAvailable(char c);
}
