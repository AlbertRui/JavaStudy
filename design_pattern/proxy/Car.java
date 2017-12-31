package me.pattern.proxy;

import java.util.Random;

public class Car implements MoveAble {

	@Override
	public void move() {

		// 实现开车
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("汽车行驶中");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
