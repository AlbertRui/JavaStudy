package me.pattern.observer;

/**
 * 这是一个观察者接口，定义一个更新的接口给那些在目标发生改变的时候被通知的对象
 * 
 * @author Administrator
 */
public interface Observer {

	/**
	 * 更新的接口
	 * 
	 * @param subject
	 *            传入目标对象，方便获取目标对象的状态
	 */
	public void update(Subject subject);
}
