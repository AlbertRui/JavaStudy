package me.pattern.factory;

import java.util.Map;

/**
 * 发型工厂
 * 
 * @author ZhangRui
 * @data 2017年12月14日 下午4:45:17
 */
public class HairFactory {

	/**
	 * 根据类型创建对象
	 * 
	 * @param key
	 * @return
	 */
	public HairInterface getHair(String key) {
		if ("left".equals(key)) {
			return new LeftHair();
		} else if ("right".equals(key)) {
			return new RightHair();
		}
		return null;
	}
	
	/**
	 * 根据类的名称创建对象
	 * @param className
	 * @return
	 */
	public HairInterface getHairByClass(String className) {
		try {
			HairInterface hair = (HairInterface) Class.forName(className).newInstance();
			return hair;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 根据类的名称产生对象
	 * @param key
	 * @return
	 */
	public HairInterface getHairByClassKey(String key) {
		Map<String, String> map = new PropertiesReader().getProperties();
		try {
			return (HairInterface) Class.forName(map.get(key)).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
