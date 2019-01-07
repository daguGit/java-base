package cn.edu.bjut.nlp.advance._09IntroSpector;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 BeanUtils：
 
 BeanUtils主要解决 的问题： 把对象的属性数据封装 到对象中。
 
 BeanUtils的好处：
 	1. BeanUtils设置属性值的时候，如果属性是基本数据 类型，BeanUtils会自动帮我转换数据类型。
  	2. BeanUtils设置属性值的时候底层也是依赖于get或者Set方法设置以及获取属性值的。
  	3. BeanUtils设置属性值,如果设置的属性是其他的引用 类型数据，那么这时候必须要注册一个类型转换器。
  	
 
 BeanUtilss使用的步骤：
 	1. 导包commons-logging.jar 、 commons-beanutils-1.8.0.jar

 */
public class _03BeanUtils {


	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		//从文件中读取到的数据都是字符串的数据，或者是表单提交的数据获取到的时候也是字符串的数据。
				String id ="110";
				String name="陈其";
				String salary = "1000.0";
				String birthday = "2013-12-10";
				//注册一个类型转换器
				ConvertUtils.register(new Converter() {
					//public Object convert(Class arg0, Object arg1) {//没有关联源代码造成的、 ctrl 单机 选出sourse文件即可
					@Override
					public Object convert(Class type, Object value) {// type : 目前所遇到的数据类型。 value :目前参数的值。
						Date date = null;
						SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
						try {
							date = (Date) dateFormat.parse((String)value);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return date;
					}}	
					,Date.class);
				
				
				
				Emp  e = new Emp();
				BeanUtils.setProperty(e, "id", id);
				BeanUtils.setProperty(e, "name",name);
				BeanUtils.setProperty(e, "salary",salary);
				BeanUtils.setProperty(e, "birthday",birthday);
				System.out.println(e);
	}

}
