package cn.edu.bjut.nlp.advance._08Junit;

import junit.framework.Assert;

import org.junit.Test;

/*unit使用规范：
 1. 一个类如果需要测试，那么该类就应该对应着一个测试类，测试类的命名规范 ： 被测试类的类名+ Test.
 2. 一个被测试的方法一般对应着一个测试的方法，测试的方法的命名规范是： test+ 被测试的方法的方法名
 */
public class _03JunitStandardToolTest {

	@Test
	public void testGetMax() {
		int max = _03JunitStandardTool.getMax();
		/*
		 * if(max!=5){ throw new RuntimeException(); }else{
		 * System.out.println("最大值："+ max); }
		 */

		//断言
		// Assert.assertSame(5, max);// expected 期望 actual 真实 底层用 ==比较
		// Assert.assertSame(new String("dd"),"dd");
		// Assert.assertEquals(new String("hh"), "hh");// expected 期望 actual 真实 ==
		// Assert.assertNull("aa");
		Assert.assertTrue(true);

	}
}
