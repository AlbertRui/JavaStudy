package me.pattern.factory;

/**
 * 右偏分发型
 * @author ZhangRui
 * @data 2017年12月14日 下午4:40:42
 */
public class RightHair implements HairInterface {

	/**
	 * 画了一个右偏分发型
	 */
	@Override
	public void draw() {

		System.out.println("右偏分发型");
	}

}
