package me.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，他知道观察他的观察者，并提供注册（添加）和删除观察者的接口
 * @author Administrator
 */
public class Subject {

	//保存注册的观察者对象
	private List<Observer> observers = new ArrayList<Observer>();
	
	/**
	 * 添加观察者对象
	 * @param observer
	 */
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	/**
	 * 删除集合中的指定观察者对象
	 * @param observer
	 */
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	/**
	 * 向所有注册的观察者发送消息
	 */
	protected void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}
}
