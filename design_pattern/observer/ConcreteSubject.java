package me.pattern.observer;

/**
 * 具体的目标对象，负责把有关状态存入相应的观察者对象中
 * 
 * @author Administrator
 */
public class ConcreteSubject extends Subject {

	//目标对象的状态
	private String weatherContent;

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		//内容有了说明天起更新了，通知所有的订阅者（观察者）
		this.notifyObservers();
	}
	
}
