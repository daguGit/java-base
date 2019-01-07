package cn.edu.bjut.nlp.strings.systemRuntimeMathDate;

import java.util.Arrays;
import java.util.Properties;

/*
System  系统类 主要用于获取系统的属性数据。
	
System类常用的方法：
	arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 一般
		src - 源数组。
		srcPos - 源数组中的起始位置。
		dest - 目标数组。
		destPos - 目标数据中的起始位置。
		length - 要复制的数组元素的数量。
		
	currentTimeMillis()  获取当前系统系统。       重点
	exit(int status)  退出jvm  如果参数是0表示正常退出jvm，非0表示异常退出jvm。    一般

	gc()    建议jvm赶快启动垃圾回收期回收垃圾。
	getenv(String name) 根据环境变量的名字获取环境变量。
	getProperty(key) 
	
	
		
	finalize()  如果一个对象被垃圾回收 器回收的时候，会先调用对象的finalize()方法。
*/
class Person{
	String name;
	public Person(String name) {
		this.name = name;
	}
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(this.name+" OUT");
	}
}
public class _01System {

	
	public static void main(String[] args) {
		int[] srcArr={10,12,14,16,19};
		int[] desArr = new int[4];
		//把srcArr的数组元素拷贝 到destArr数组中。
		System.arraycopy(srcArr, 1, desArr, 0, 4);
		System.out.println(Arrays.toString(desArr));
		
		System.out.println("system.currentTime" + System.currentTimeMillis());
		System.out.println("java_home"+System.getenv("JAVA_HOME"));
		//System.exit(0); //jvm退出..  注意： 0或者非0的 数据都可以退出jvm。对于用户而言没有任何区别。
		
		for(int i = 0 ; i<4; i++){
			new Person("狗娃"+i);
			System.gc(); //建议马上启动垃圾回收期
		}
		
		Properties properties = System.getProperties();
		properties.list(System.out);
		System.out.println("OS.name " + System.getProperty("os.name"));
	}

}
