package cn.edu.bjut.nlp.capture;

/*
 switch适用的数据类型： byte \ char \short \ int \ String\枚举类型
 
 注意： 
 	case语句后面跟的枚举值，只需要单写枚举值即可，不需要再声明该 枚举值是属于哪个枚举类的。
 	
 
 */
enum Season {
	spring, summer, autumn, winter;
}

public class _05EnumTest_Switch {
	public static void main(String[] args) {
		Season season = Season.spring;
		switch (season) {
		case spring:
			System.out.println("spring");
			break;
		case summer:
			System.out.println("summer");
			break;
		case autumn:
			System.out.println("autumn");
			break;
		case winter:
			System.out.println("winter");
			break;

		default:
			break;
		}
	}
}
