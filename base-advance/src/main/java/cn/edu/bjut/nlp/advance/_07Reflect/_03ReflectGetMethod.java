package cn.edu.bjut.nlp.advance._07Reflect;

import java.lang.reflect.Method;

/*
 通过Class对象获取到对应的方法。

 在反射技术中使用了Method类描述了方法的。

 */
public class _03ReflectGetMethod {

	public static void main(String[] args) throws Exception {
		Class clazz1 = Class.forName("_07Reflect.Person");

		/*
		 * // getMethods() 获取所有 的公共方法而已。包括父类 Method[] methods =
		 * clazz1.getMethods();
		 */

		// 获取到所有的方法，但是不包含父类的方法。
		Method[] methods = clazz1.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}

		Person p = new Person(110, "狗娃");
		Method method = clazz1.getMethod("eat", int.class);// 第一个是函数名字，第二个是函数参数
		method.invoke(p, 1);// invoke 执行一个方法。 第一个参数：方法的调用对象。 第二参数： 方法所需要的参数。

		// 执行私有的方法
		Method m = clazz1.getDeclaredMethod("sleep", int.class);
		// 设置访问权限允许访问
		m.setAccessible(true);
		m.invoke(null, 6);
	
		Method m1 = clazz1.getMethod("sum", int[].class);
		m1.invoke(p,new int[] { 12, 5, 9 } );

	}

}
