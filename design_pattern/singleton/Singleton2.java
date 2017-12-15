package me.pattern.singleton;

/**
 * 懒汉模式
 * 加载类比较快，运行时获取对象速度比较慢，线程不安全
 * @author ZhangRui
 * @data 2017年12月13日 下午11:59:14
 */
public class Singleton2 {

	// 1.将构造方法私有化，不允许外界直接创建对象
	private Singleton2() {

	}

	// 3.创建类的唯一实例,使用private static 修饰
	private static Singleton2 instance;

	/**
	 * 4.提供一个用于获取实例的方法，用public static 修饰
	 * 
	 * @return
	 */
	public static Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
}
