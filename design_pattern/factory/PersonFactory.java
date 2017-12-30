package me.pattern.factory;

/**
 * 人物的实现接口
 * @author ZhangRui
 * @date 2017年12月14日 下午6:02:59
 */
public interface PersonFactory {

	//男孩接口
	public IBoy getBoy();
	
	//女孩接口
	public IGirl getGirl();
}
