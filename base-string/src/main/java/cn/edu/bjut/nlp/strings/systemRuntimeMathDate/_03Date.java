package cn.edu.bjut.nlp.strings.systemRuntimeMathDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
日期类 Date 
Calendar
日期格式化类    SimpleDateFormat
 */
public class _03Date {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance(); //获取当前的系统时间。
		System.out.println("年："+ calendar.get(Calendar.YEAR));
		System.out.println("月："+ (calendar.get(Calendar.MONTH)+1));
		System.out.println("日："+ calendar.get(Calendar.DATE));
		
		System.out.println("时："+ calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("分："+ calendar.get(Calendar.MINUTE));
		System.out.println("秒："+ calendar.get(Calendar.SECOND));
		
		// 显示 当前系统时间: 2014年12月26日  xx时xx分xx秒   
		/*
		 *  日期格式化类    SimpleDateFormat 
		 *  		作用1： 可以把日期转换转指定格式的字符串     format()
		 *  		作用2： 可以把一个 字符转换成对应的日期。    parse()   生日
		 *  	
		 */
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
		String string = dateFormat.format(date);
		System.out.println(string);
		
		String birthday = "2000年12月26日14时33分33秒";
		Date date2 = dateFormat.parse(birthday);  //注意： 指定的字符串格式必须要与SimpleDateFormat的模式要一致。
		System.out.println(date2);
		
	}

}
