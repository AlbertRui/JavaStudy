package me.pattern.observer;

public class ObserverTest {

	public static void main(String[] args) {
		//1.创建目标
		ConcreteSubject weather = new ConcreteSubject();
		//2.创建观察者
		ConcreteObserver observerGirl = new ConcreteObserver();
		observerGirl.setObserverName("黄明的女朋友");
		observerGirl.setRemindThings("第一次约会");
		
		ConcreteObserver observerMum = new ConcreteObserver();
		observerMum.setObserverName("老妈");
		observerMum.setRemindThings("是一个购物的好日子");
		//3.注册观察者
		weather.attach(observerGirl);
		weather.attach(observerMum);
		//4.目标发布天气
		weather.setWeatherContent("明天天气晴朗，气温28度");
	}
}
