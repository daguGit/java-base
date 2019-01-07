package cn.edu.bjut.nlp.advance._09IntroSpector;

import cn.edu.bjut.nlp.advance._07Reflect.Person;
import org.junit.Test;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/*
 内省--->一个变态的反射.

 内省主要解决 的问题： 把对象的属性数据封装 到对象中。
 必须要有get set方法

 */
public class _02BeanInfo {
	@Test
	public void getAllProperty() throws IntrospectionException {
		//Introspector 内省类
		BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
		//通过BeanInfo获取所有的属性描述其
		PropertyDescriptor[] propertyDescriptors = beanInfo
				.getPropertyDescriptors();//获取一个类中的所有属性描述器
		for (PropertyDescriptor p : propertyDescriptors) {
			System.out.println(p.getName());
			System.out.println(p.getReadMethod()); //get方法
		}
	}
	
	@Test
	public void testProperty () throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Person person = new Person();
		//属性描述器
		PropertyDescriptor p = new PropertyDescriptor("id", Person.class);
		//获取属性对应的get或者是set方法设置或者获取属性了
		Method method = p.getWriteMethod();
		//执行该方法设置属性值
		method.invoke(person, 1);
		 //是获取属性的get方法
		Method method2 = p.getReadMethod();
		System.out.println(method2.invoke(person, null));
		
	}

	


}
