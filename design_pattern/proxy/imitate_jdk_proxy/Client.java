package me.pattern.proxy.imitate_jdk_proxy;

import me.pattern.proxy.Car;
import me.pattern.proxy.MoveAble;

public class Client {

	/**
	 * jdk动态代理测试类
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		MoveAble m = (MoveAble)Proxy.newProxyInstance(MoveAble.class,h);
		m.move();
	}

}
