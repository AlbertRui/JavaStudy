package me.pattern.proxy;

/**
 * 聚合方式实现静态代理
 * 
 * @author ZhangRui
 * @date 2017年12月14日 下午10:42:08
 */
public class Car3 implements MoveAble {

	private Car car;

	public Car3(Car car) {
		super();
		this.car = car;
	}

	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("汽车开始行驶");
		car.move();
		long endtime = System.currentTimeMillis();
		System.out.println("汽车结束行驶，汽车行驶时间：" + (endtime - starttime) + "毫秒！！！");
	}

}
