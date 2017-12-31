package me.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import me.pattern.proxy.jdkproxy.TimeHandler;

/**
 * 测试类
 * @author ZhangRui
 * @date 2017年12月14日 下午10:33:39
 */
public class Test {

	public static void main(String[] args) {
//		Car car = new Car();
//		car.move();
//		Car2 car2 = new Car2();
//		car2.move();
//		
//		Car3 car3 = new Car3(new Car());
//		car3.move();
//		
//		CarTimeProxy ctp = new CarTimeProxy(new Car());
//		CarLogProxy clp = new CarLogProxy(ctp);
//		clp.move();
		
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Class<?> cls = car.getClass();
		/**
		 * loader  类加载器
		 * interfaces  实现接口
		 * h InvocationHandler
		 * 
		 * 动态代理实现思路：
		 * 实现功能：通过proxy的newProxyInstance返回代理对象
		 * 1、声明一段源码（动态产生代理）
		 * 2、编译源码（jdk compiler API），产生新的类（代理类）
		 * 3、将这个类load到内存当中，产生一个新的对象（代理对象）
		 * 4、return
		 */
		MoveAble m = (MoveAble)Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(), h);
		m.move();
		
		System.out.println("代理类实例：" + m.getClass().getName());
	}
}
