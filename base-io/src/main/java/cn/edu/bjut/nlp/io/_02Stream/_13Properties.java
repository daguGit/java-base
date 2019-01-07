package cn.edu.bjut.nlp.io._02Stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/*
 Properties（配置文件类）: 主要用于生产配置文件与读取配置文件的信息。


 Properties要注意的细节：
 1. 如果配置文件的信息一旦使用了中文，那么在使用store方法生成配置文件的时候只能使用字符流解决，如果使用字节流生成配置文件的话，
 默认使 用的是iso8859-1码表进行编码存储，这时候会出现乱码。
 2. 如果Properties中的内容发生了变化，一定要重新使用Properties生成配置文件，否则配置文件信息不会发生变化。

 */
public class _13Properties {
	// 读取配置文件爱你的信息
	public void readProperties() throws IOException {
		Properties properties = new Properties();
		properties.load(new FileReader(new File("F:\\persons.properties")));
		Set<Entry<Object, Object>> entries = properties.entrySet();
		for (Entry<Object, Object> entry : entries) {
			System.out
					.println("键：" + entry.getKey() + " 值：" + entry.getValue());
		}
		// 修改狗娃的密码
		// 把修改后的Properties再生成一个配置文件
		properties.setProperty("铁蛋", "33333");
		properties.store(new FileWriter(new File("F:\\persons.properties")),
				"hehe");
	}

	// 保存配置文件文件的信息。
	public void creatProperties() throws IOException {
		// propertied继承自hashtable

		Properties properties = new Properties();
		properties.setProperty("狗娃", "123");
		properties.setProperty("狗剩", "234");
		properties.setProperty("铁蛋", "345");
		/*
		 // 遍历Properties Set<Entry<Object, Object>> entries =
		  properties.entrySet(); for (Entry<Object,Object> entry :entries) {
		 System.out.println("键："+ entry.getKey() +" 值："+ entry.getValue()); }
		*/
		
		// properties.store(new FileOutputStream("F:\\persons.properties"),
		// "haha"); //第一个参数是一个输出流对象，第二参数是使用一个字符串描述这个配置文件的信息。
		properties.store(new FileWriter(new File("F:\\persons.properties")),
				"hehe");

	}

	public static void main(String[] args) throws IOException {
		// new _13Properties().creatProperties();
		new _13Properties().readProperties();

	}

}
