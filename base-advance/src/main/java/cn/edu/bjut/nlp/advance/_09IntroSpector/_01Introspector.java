package cn.edu.bjut.nlp.advance._09IntroSpector;

import cn.edu.bjut.nlp.advance._07Reflect.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;


/*
 
 以后我们开发框架 的时候，我们是经常需要把一些数据封装到对象中的。
 //内省机制较为繁琐，使用beaninfo
 */
public class _01Introspector {

	
	public static void main(String[] args) throws Exception {
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("person.txt"));
		 //读取配置文件获取到完整的类名。
		String path = bufferedReader.readLine();
		Class clazz = Class.forName(path);
		//通过class对象获取到无参的构造方法
		Constructor constructor  = clazz.getConstructor(null);
		//创建对象
		Person p = (Person) constructor.newInstance(null);
		String line ;
		//读取属性值
		while((line = bufferedReader.readLine())!= null){
			String[] datas = line.split("=");
			//通过属性名获取到对应的Field对象。
			Field field = clazz.getDeclaredField(datas[0]);
			field.setAccessible(true);
			if (field.getType()==int.class) {
				
				field.set(p, Integer.parseInt(datas[1]));
			}
			else{field.set(p, datas[1]);}
			
		}
		System.out.println(p);
		/*Properties properties = new Properties();
		properties.load(new FileReader("person.txt"));
		properties.
		properties.setProperty("id", "1");
		properties.setProperty("name", "Simon");
		properties.store(new FileWriter("person.properties"),"person");*/
	}

}
