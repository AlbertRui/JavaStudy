package me.pattern.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * jdk动态代理
 * @author ZhangRui
 * @date 2017年12月14日 下午11:24:30
 */
public class TimeHandler implements InvocationHandler {

	private Object target;

	public TimeHandler(Object target) {
		super();
		this.target = target;
	}

	/**
	 * Object: 被代理对象 
	 * Method:被代理对象的方法
	 * Object[] 被代理对象的参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long starttime = System.currentTimeMillis();
		System.out.println("汽车开始行驶");
		method.invoke(target);
		long endtime = System.currentTimeMillis();
		System.out.println("汽车结束行驶，汽车行驶时间：" + (endtime - starttime) + "毫秒！！！");
		return null;
	}

}
