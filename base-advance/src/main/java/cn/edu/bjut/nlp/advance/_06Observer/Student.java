package cn.edu.bjut.nlp.advance._06Observer;

public class Student implements Weather {
	String name;

	public Student(String name) {
		this.name = name;
	}

	public void notify(String weather) {
		if ("晴天".equals(weather)) {
			System.out.println(name + "高高兴兴的去开学!!");
		} else if ("雾霾".equals(weather)) {
			System.out.println(name + "吸多两口去上学!");
		} else if ("刮风".equals(weather)) {
			System.out.println(name + "在家睡觉!");
		} else if ("冰雹".equals(weather)) {
			System.out.println(name + "在家睡觉!");
		} else if ("下雪".equals(weather)) {
			System.out.println(name + "等下完再去上学!");
		}

	}

}
