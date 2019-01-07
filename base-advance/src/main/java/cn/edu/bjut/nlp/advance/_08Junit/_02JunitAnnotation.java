package cn.edu.bjut.nlp.advance._08Junit;

import java.io.FileInputStream;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * 如果测试一个方法的时候需要准备测试的环境或者是清理测试的环境，那么可以@Before、 @After 、@BeforeClass、 @AfterClass这四个注解。
 @Before、 @After 是在每个测试方法测试的时候都会调用一次， @BeforeClass、 @AfterClass是在所有的测试方法测试之前与测试之后调用一次而已,方法为static。
 */
public class _02JunitAnnotation {

	// /读取文件数据，把把文件数据都排序
	//@Before、 @After 是在每个测试方法测试的时候都会调用一次，
	//@Before
	@BeforeClass
	public static void before(){
		System.out.println("before");
	}
	@Test
	public void readFile() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("F:\\a.txt");
		int content = fileInputStream.read();
		System.out.println("内容：" + content);
	}

	@Test
	public void sort() {
		System.out.println("读取文件数据排序..");
	}
	@AfterClass
	public static void after(){
		System.out.println("after");
	}
}
