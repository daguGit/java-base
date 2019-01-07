package cn.edu.bjut.nlp.advance._10Path;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
如果经常会发生变化的数据我们可以定义在配置文件上。 比如说：数据库的用户名与密码。
 
配置文件的路径应该如何写 呢？
	
	绝对路径：一个文件的完整路径信息。一般绝对路径是包含有盘符 的。  绝对路径的缺陷： 因为绝对路径是有盘符开头的，有些系统是没有盘符的。
 		F:\\db.properties
	相对路径: 相对路径是相对于当前程序的路径。当前路径就是执行java命令的时候，控制台所在的路径。
		db.properties
	类文件路径 :类文件路径就是使用了classpath的路径找对应的资源文件。
	
	如果需要使用到类文件路径首先先要获取到一个Class对象。
	 


*/
public class _01Path {

static Properties properties ;
	
	static{
		try {
			properties = new Properties();
			//properties.load(new FileReader("db.properties"));
			//去加载配置文件  /
			Class clazz = _01Path.class; 
			//这里已经设置setclasspath=F:\test,同时db.properties 在这个文件夹下。类文件在这个文件夹下的包中
			//切换到E: 运行
			InputStream inputStream = clazz.getResourceAsStream("/db.properties"); //  "/"代表了Classpath的路径。           getResourceAsStream 该方法里面使用的路径就是使用了类文件路径。
			properties.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("当前路径："+ new File(".").getAbsolutePath() );
		System.out.println("用户名："+ properties.getProperty("userName")+" 密码："+properties.getProperty("password"));
		
	}

}
