package me.pattern.factory;

/**
 * 新年系列加工厂
 * @author ZhangRui
 * @date 2017年12月14日 下午6:12:06
 */
public class HNFactory implements PersonFactory{

	@Override
	public IBoy getBoy() {
		return new HNBoy();
	}

	@Override
	public IGirl getGirl() {
		return new HNGirl();
	}

}
