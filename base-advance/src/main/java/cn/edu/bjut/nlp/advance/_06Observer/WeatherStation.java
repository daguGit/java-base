package cn.edu.bjut.nlp.advance._06Observer;

import java.util.ArrayList;
import java.util.Random;

/*
 观察者设计模式：观察者设计模式解决的问题时当一个对象发生指定的动作时，要通过另外一个对象做出相应的处理。

 需求： 编写一个气象站、一个工人两个类，当气象站更新天气 的时候，要通知人做出相应的处理。

 问题1： 气象站更新了多次天气，然后人才做一次的处理。

 问题2： 目前气象站只能通知一个人而已。

 问题3： 在现实生活中出了工人群体要关注天气，其他 的群体也需要关注天气


 观察者设计模式的步骤：
 1. 当前目前对象发生指定的动作是，要通知另外一个对象做出相应的处理，这时候应该把对方的相应处理方法定义在接口上。
 2. 在当前对象维护接口的引用，当当前对象发生指定的动作这时候即可调用接口中的方法了。


 */

//气象站
public class WeatherStation {

	String[] weathers = { "晴天", "雾霾", "刮风", "冰雹", "下雪" };

	// 当前天气
	String weather;

	//该集合中存储的都是需要收听天气预报的人
	ArrayList<Weather> list = new ArrayList<Weather>();
	
	public void addList(Weather w){
		list.add(w);
	}
	public void tellAll(){
		for(Weather w:list){
			w.notify(weather);
		}
	}
	// 更新天气的 方法
	public void updateWeather() {
		Random random = new Random();
		int index = random.nextInt(weathers.length);
		weather = weathers[index];
		System.out.println("当前的天气是： " + weather);
	}
	
	public void startWork(){
		final Random random = new Random();
		new Thread(){
			@Override
			public void run() {
				while(true){
					updateWeather();
					tellAll();
					int s = random.nextInt(501) + 1000; // 500
					try {
						Thread.sleep(s);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}	
		}.start();
	}
}
