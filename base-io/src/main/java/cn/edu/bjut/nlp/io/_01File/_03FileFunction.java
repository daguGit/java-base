package cn.edu.bjut.nlp.io._01File;
import java.io.IOException;


public class _03FileFunction {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		/*
		创建：
			createNewFile()	在指定位置创建一个空文件，成功就返回true，如果已存在就不创建然后返回false
			mkdir()			在指定位置创建目录，这只会创建最后一级目录，如果上级目录不存在就抛异常。
			mkdirs()		在指定位置创建目录，这会创建路径中所有不存在的目录。
			renameTo(File dest)	重命名文件，文件不同时相当于文件的剪切,剪切时候不能操作文件夹。移动/重命名成功则返回true，失败则返回false。

		
		File file = new File("F://a.txt");
		System.out.println("创建成功了吗？"+file.createNewFile()); //createNewFile 创建一个指定的文件，如果该文件存
		File dir = new File("F://b.txt");
		System.out.println("创建文件夹成功吗？"+dir.mkdir()); // mkdir 创建一个单级文件夹，
		dir = new File("F:\\aa\\bb");
		System.out.println("创建多级文件夹："+ dir.mkdirs());
		
		File destFile = new File("F://aaaa.txt");
		System.out.println("重命名成功吗？"+file.renameTo(destFile)) ; 
		*/
		
		/*
		删除：
		delete()		删除文件或一个空文件夹，如果是文件夹且不为空，则不能删除，成功返回true，失败返回false。
		deleteOnExit()	在虚拟机终止时，请求删除此抽象路径名表示的文件或目录，保证程序异常时创建的临时文件也可以被删除

		
		File file = new File("F://a.txt");
		System.out.println("删除成功吗？ "+ file.delete()); //delete方法不能用于删除非空的文件夹。 delete方法会马上删除一个文件。
		//	file.deleteOnExit();//jvm退出的时候删除文件。  一般用于删除临时 文件。
		*/
		
		/*	
	 	判断：
		exists()		文件或文件夹是否存在。
		isFile()		是否是一个文件，如果不存在，则始终为false。
		isDirectory()	是否是一个目录，如果不存在，则始终为false。
		isHidden()		是否是一个隐藏的文件或是否是隐藏的目录。
		isAbsolute()	测试此抽象路径名是否为绝对路径名。
		
		File file = new File("F://b.txt");
		System.out.println("存在吗？"+ file.exists());
		System.out.println("判断是否是一个文件："+file.isFile()); //如果是文件返回true，否则返回false.
		System.out.println("是隐藏的 文件吗："+ file.isHidden());
		System.out.println("是绝对路吗？"+ file.isAbsolute());
		*/
		
		/*
		获取：
			getName()		获取文件或文件夹的名称，不包含上级路径。
			getPath()       返回绝对路径，可以是相对路径，但是目录要指定
			getAbsolutePath()	获取文件的绝对路径，与文件是否存在没关系
			length()		获取文件的大小（字节数），如果文件不存在则返回0L，如果是文件夹也返回0L。
			getParent()		返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回null。
			lastModified()	获取最后一次被修改的时间。
		
		File file = new File("F://a.txt");
		file.createNewFile();
		System.out.println("文件名："+ file.getName());
		System.out.println("获取绝对路径："+ file.getPath());
		System.out.println("getAbsolutePath获取绝对路径："+file.getAbsolutePath());
		System.out.println("获取文件的的大小(字节为单位)："+ file.length());
		System.out.println("获取文件的父路径："+ file.getParent());
		//使用毫秒值转换成Date对象
		long f = file.lastModified();
		System.out.println(new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss").format(new Date(f)));
		*/
		
		/*
		文件夹相关：
			staic File[] listRoots()	列出所有的根目录（Window中就是所有系统的盘符）
			list()						返回目录下的文件或者目录名，包含隐藏文件。对于文件这样操作会返回null。
			listFiles()					返回目录下的文件或者目录对象（File类实例），包含隐藏文件。对于文件这样操作会返回null。


			list(FilenameFilter filter)	返回指定当前目录中符合过滤条件的子文件或子目录。对于文件这样操作会返回null。
			listFiles(FilenameFilter filter)	返回指定当前目录中符合过滤条件的子文件或子目录。对于文件这样操作会返回null。
		*/
	
/*		File[] roots = File.listRoots(); //列出所有的根目录
		for(File file  : roots){
			System.out.println(file);
		}
		File file = new File("F://");
		for(String s:file.list()){//把 当前文件夹下面的所有子文件名与子文件夹名 存储到一个String类型 的数组中 返回。
			System.out.println(s);
		}
		for(File f:file.listFiles()){
			System.out.println(f.getName());
		}*/
		
		
	}

}
