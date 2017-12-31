package me.pattern.proxy;

/**
 * 时间上的代理
 * @author ZhangRui
 * @date 2017年12月14日 下午10:56:37
 */
public class CarTimeProxy implements MoveAble {

	private MoveAble moveable;

	public CarTimeProxy(MoveAble moveable) {
		super();
		this.moveable = moveable;
	}

	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("汽车开始行驶");
		moveable.move();
		long endtime = System.currentTimeMillis();
		System.out.println("汽车结束行驶，汽车行驶时间：" + (endtime - starttime) + "毫秒！！！");
	}
}
