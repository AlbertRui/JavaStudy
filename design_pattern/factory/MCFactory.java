package me.pattern.factory;

/**
 * 圣诞工厂
 * @author ZhangRui
 * @date 2017年12月14日 下午6:08:40
 */
public class MCFactory implements PersonFactory {

	@Override
	public IBoy getBoy() {
		return new MCBoy();
	}

	@Override
	public IGirl getGirl() {
		return new MCGirl();
	}

}
