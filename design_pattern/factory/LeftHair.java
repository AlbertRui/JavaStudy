package me.pattern.factory;

/**
 * 左偏分发型
 * @author ZhangRui
 * @data 2017年12月14日 下午4:38:06
 */
public class LeftHair implements HairInterface {

	/**
	 * 画了一个左偏分发型
	 */
	@Override
	public void draw() {

		System.out.println("左偏分发型");
	}

}
