package me.pattern.proxy;

/**
 * 继承方式实现静态代理
 * @author ZhangRui
 * @date 2017年12月14日 下午10:38:13
 */
public class Car2 extends Car {

	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("汽车开始行驶");
		super.move();
		long endtime = System.currentTimeMillis();
		System.out.println("汽车结束行驶，汽车行驶时间：" + (endtime - starttime) + "毫秒！！！");
	}

}
