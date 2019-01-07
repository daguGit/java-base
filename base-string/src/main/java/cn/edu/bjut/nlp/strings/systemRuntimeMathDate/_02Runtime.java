package cn.edu.bjut.nlp.strings.systemRuntimeMathDate;

import java.io.IOException;

/*
RunTime   该类类主要代表了应用程序运行的环境。
	
	getRuntime()  返回当前应用程序的运行环境对象。
	exec(String command)  根据指定的路径执行对应的可执行文件。
	freeMemory()   返回 Java 虚拟机中的空闲内存量。。 以字节为单位
	maxMemory()    返回 Java 虚拟机试图使用的最大内存量。
	totalMemory()    返回 Java 虚拟机中的内存总量

*/
public class _02Runtime {
	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec("C:\\Windows\\notepad.exe");
		Thread.sleep(1000);
		process.destroy();
		
		System.out.println(" Java虚拟机中的空闲内存量。"+runtime.freeMemory());
		System.out.println("Java 虚拟机试图使用的最大内存量:"+ runtime.maxMemory());
		System.out.println("返回 Java 虚拟机中的内存总量:"+ runtime.totalMemory());

	}

}
