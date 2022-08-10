package com.mime.minefront.graphics;

import java.util.Random;

public class Screen extends Render {

	private Render test;

	public Screen(int width, int height) {
		super(width, height);
		Random random = new Random();
		test = new Render(256, 256);
		for (int i = 0; i < 256 * 256; i++) {
			test.pixels[i] = random.nextInt();
		}
	}

	public void render() {
		for(int i =0;i<width*height;i++) {
			pixels[i]=0;
		}
		
		for(int i=0;i<100;i++) {
		int anim = (int) (Math.sin((System.currentTimeMillis()+i) % 1000.0 / 1000 * Math.PI * 1) * 100);
		int anim2 = (int) (Math.cos((System.currentTimeMillis()+i) % 1000.0 / 1000 * Math.PI * 1) * 100);

		draw(test, (width - 256) / 2 + anim, (height - 256) / 2 + anim2);
		}
	}

}
