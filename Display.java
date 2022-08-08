package com.mime.minefront;

import java.awt.Canvas;

import javax.swing.JFrame;

public class Display extends Canvas implements Runnable {
	private static final long serialVersionUID = 1L;

	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	public static final String TITLE = "Minefront Pre-Alpha 0.0.1";

	private Thread thread;
	private boolean running = false;

	private void start() {
		if (running)
			return;

		running = true;
		thread = new Thread(this);

	}

	public void run() {

	}

	public static void main(String[] args) {
		Display game = new Display();
		JFrame frame = new JFrame();
		frame.add(game);
		frame.pack();
		frame.setTitle(TITLE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(WIDTH, HEIGHT);
		frame.setResizable(false);
		frame.setVisible(true);

		System.out.println("Running...");
	}

}
