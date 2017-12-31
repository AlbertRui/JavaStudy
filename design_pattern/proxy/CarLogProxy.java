package me.pattern.proxy;

/**
 * 日志的代理
 * @author ZhangRui
 * @date 2017年12月14日 下午10:56:37
 */
public class CarLogProxy implements MoveAble {

	private MoveAble moveable;

	public CarLogProxy(MoveAble moveable) {
		super();
		this.moveable = moveable;
	}

	@Override
	public void move() {
		System.out.println("日志开始");
		moveable.move();
		System.out.println("日志结束");
	}
}
