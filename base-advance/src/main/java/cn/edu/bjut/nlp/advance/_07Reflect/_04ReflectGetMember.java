package cn.edu.bjut.nlp.advance._07Reflect;

import java.lang.reflect.Field;

public class _04ReflectGetMember {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		//获取到对应的Class对象
		Class class1 = Class.forName("_07Reflect.Person");
		//获取 到所有的成员变量
		Field[] fields = class1.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		Person p = new Person();
		Field field = class1.getDeclaredField("id");
		field.setAccessible(true);
		field.set(p, 1);
		System.out.println(p);
	}

}
