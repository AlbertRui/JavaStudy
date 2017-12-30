package me.pattern.factory;

/**
 * 模拟客户端实现
 * @author ZhangRui
 * @data 2017年12月14日 下午4:43:13
 */
public class SunnyTest {

	public static void main(String[] args) {
//		HairFactory factory = new HairFactory();
//		HairInterface left = factory.getHair("left");
//		left.draw();
//		HairInterface left = factory.getHairByClass("me.pattern.factory.LeftHair");
//		left.draw();
//		HairInterface hair = factory.getHairByClassKey("in");
//		hair.draw();
//		PersonFactory factory = new HNFactory();
//		IBoy boy = factory.getBoy();
//		boy.drawBoy();
		PersonFactory factory = new MCFactory();
		IGirl girl = factory.getGirl();
		girl.drawGirl();
	}
}
