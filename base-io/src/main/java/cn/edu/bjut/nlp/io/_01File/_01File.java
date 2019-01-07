package cn.edu.bjut.nlp.io._01File;
import java.io.File;

/*
IO流(Input Output) ：

IO技术主要的作用是解决设备与设备之间 的数据传输问题。 比如： 硬盘--->内存          内存的数据---->硬盘上            把键盘的数据------->内存中

IO技术的应用场景：
	 导出报表 ， 上传大头照   、 下载 、 解释xml文件 ... 

数据保存到硬盘上，该数据就可以做到永久性的保存。   数据一般是以文件的形式保存到硬盘上

sun使用了一个File类描述了文件或者文件夹的。

File类可以描述一个文件或者一个文件夹。


File类的构造方法：

	File(String pathname)  指定文件或者文件夹的路径创建一个File文件。
	
	File(File parent, String child)   根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。 

	File(String parent, String child) 

目录分隔符：  在windows机器上 的目录分隔符是 \  ,在linux机器上的目录分隔符是/ .

注意：  在windows上面\ 与 / 都可以使用作为目录分隔符。 而且，如果写/ 的时候只需要写一个即可。


*/
public class _01File {

	public static void main(String[] args) {
		File file = new File("F:"+File.separator+"a.txt");
		file = new File(file, "a.txt");
		file = new File("f:\\", "a.txt");
		System.out.println(file.exists());
		//System.out.println(File.separator); //判断操作系统的分隔符
	}

}
