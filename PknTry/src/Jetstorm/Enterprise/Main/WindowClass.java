package Jetstorm.Enterprise.Main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import Jetstorm.Enterprise.Audio.JukeBox;
import Jetstorm.Enterprise.GameState.GameStateManager;
import Jetstorm.Enterprise.Handlers.Keys;
import Jetstorm.Enterprise.Handlers.Mouse;

@SuppressWarnings("serial")
public class WindowClass extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener {

	public static final int WIDTH = 240;
	public static final int HEIGHT = 160;
	public static final int SCALE = 3;

	private Thread thread;
	private boolean running;
	private int FPS = 60;
	private long targetTime = 1000 / FPS;

	private BufferedImage image;
	private Graphics2D g;

	private GameStateManager gsm;

	private boolean recording = false;
	private int recordingCount = 0;
	private boolean screenShot;

	public WindowClass() {
		super();
		setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		setFocusable(true);
		requestFocus();
	}

	public void addNotify() {
		super.addNotify();
		if (thread == null) {
			thread = new Thread(this);
			addKeyListener(this);
			addMouseListener(this);
			addMouseMotionListener(this);
			thread.start();
		}
	}

	private void init() {

		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		g = (Graphics2D) image.getGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

		running = true;

		JukeBox.init();
		JukeBox.load("/audio/music/PokemonCenter.mid", "pokemoncentermusic");
		JukeBox.load("/audio/music/Title.mid", "titlemusic");
		JukeBox.load("/audio/sound/Menu.wav", "menuclick");
		JukeBox.load("/audio/sound/Select.wav", "textclick");

		gsm = new GameStateManager();

	}

	public void run() {

		init();

		long start;
		long elasped;
		long wait;

		while (running) {

			start = System.nanoTime();

			update();
			draw();
			drawToScreen();

			elasped = System.nanoTime() - start;

			wait = targetTime - elasped / 100000;

			if (wait < 5)
				wait = 5;

			try {
				Thread.sleep(wait);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	private void update() {
		gsm.update();
		Keys.update();
		Mouse.update();
	}

	private void draw() {
		gsm.draw(g);
	}

	private void drawToScreen() {
		Graphics g2 = getGraphics();
		g2.drawImage(image, 0, 0, WIDTH * SCALE, HEIGHT * SCALE, null);
		g2.dispose();
		if (screenShot) {
			screenShot = false;
			try {
				java.io.File out = new java.io.File("screenshot " + System.nanoTime() + ".gif");
				javax.imageio.ImageIO.write(image, "gif", out);
			} catch (Exception e) {
			}
		}
		if (!recording)
			return;
		try {
			java.io.File out = new java.io.File("C:\\out\\frame" + recordingCount + ".gif");
			javax.imageio.ImageIO.write(image, "gif", out);
			recordingCount++;
		} catch (Exception e) {
		}
	}

	public void mouseClicked(MouseEvent mouse) {

	}

	public void mouseEntered(MouseEvent mouse) {
	}

	public void mouseExited(MouseEvent mouse) {
	}

	public void mousePressed(MouseEvent mouse) {
		Mouse.setAction(Mouse.PRESSED);
	}

	public void mouseReleased(MouseEvent mouse) {
		Mouse.setAction(Mouse.RELEASED);
		Mouse.setPosition(mouse.getX(), mouse.getY());
	}

	public void keyPressed(KeyEvent key) {
		if (key.isControlDown()) {
			if (key.getKeyCode() == KeyEvent.VK_R) {
				recording = !recording;
				return;
			}
			if (key.getKeyCode() == KeyEvent.VK_S) {
				screenShot = true;
				return;
			}
		}
		Keys.keyset(key.getKeyCode(), true);
	}

	public void keyReleased(KeyEvent key) {
		Keys.keyset(key.getKeyCode(), false);
	}

	public void keyTyped(KeyEvent key) {
	}

	public void mouseDragged(MouseEvent mouse) {
		Mouse.setAction(Mouse.PRESSED);
		Mouse.setPosition(mouse.getX(), mouse.getY());
	}

	public void mouseMoved(MouseEvent mouse) {
		Mouse.setPosition(mouse.getX(), mouse.getY());
	}

}
