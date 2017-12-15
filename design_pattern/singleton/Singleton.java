package me.pattern.singleton;

/**
 * 单例模式：Singleton 
 * 应用场合：有些对象只需要一个就够了，如古代皇帝，老婆 
 * 作用：保证整个应用程序中某个实例有且只有一个 类型：
 * 饿汉模式，懒汉模式
 * 此为饿汉模式：加载类比较慢，运行时获取对象较快，线程安全
 * @author ZhangRui
 * @data 2017年12月13日 下午11:33:53
 */
public class Singleton {

	// 1.将构造方法私有化，不允许外界直接创建对象
	private Singleton() {

	}

	// 3.创建类的唯一实例,使用private static 修饰
	private static Singleton instance = new Singleton();

	/**
	 * 4.提供一个用于获取实例的方法，用public static 修饰
	 * 
	 * @return
	 */
	public static Singleton getInstance() {
		return instance;
	}
}
