package me.pattern.observer;

/**
 * 具体的观察者对象，实现更新的方法，时自己的状态和目标的状态保持一致
 * @author Administrator
 */
public class ConcreteObserver implements Observer {

	//观察者的名字
	private String observerName;
	
	//天气内容的情况，这个消息从目标处获取
	private String weatherContent;
	
	//提醒的内容
	private String remindThings;
	
	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
	}

	public String getRemindThings() {
		return remindThings;
	}

	public void setRemindThings(String remindThings) {
		this.remindThings = remindThings;
	}

	/**
	 * 获取目标类的状态同步到观察者的状态中
	 */
	@Override
	public void update(Subject subject) {
		weatherContent = ((ConcreteSubject)subject).getWeatherContent();
		System.out.println(observerName + "收到了" + weatherContent + "," + remindThings);
	}

}
