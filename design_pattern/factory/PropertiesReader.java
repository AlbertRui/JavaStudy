package me.pattern.factory;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 读取properties文件
 * 
 * @author ZhangRui
 * @date 2017年12月14日 下午5:13:37
 */
public class PropertiesReader {

	/**
	 * 获取类名以及类的全名的键值对
	 * @return
	 */
	public Map<String, String> getProperties() {

		Properties props = new Properties();
		Map<String, String> map = new HashMap<String, String>();
		try {

			InputStream in = getClass().getResourceAsStream("type.properties");
			props.load(in);
			@SuppressWarnings("unchecked")
			Enumeration<String> en = (Enumeration<String>) props.propertyNames();
			while (en.hasMoreElements()) {
				String key = en.nextElement();
				String property = props.getProperty(key);
				map.put(key, property);
				// System.out.println(key + " " + property);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
}
