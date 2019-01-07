package cn.edu.bjut.nlp.capture;

/*//自定义一个性别类 等价与枚举
 *class Gender{
	String value;
	private Gender(String value){
		this.value = value;
	}
	public static final Gender man = new Gender("man");
	public static final Gender woman = new Gender("woman");
}*/
enum Gender{
	man("man"),woman("woman");
	String value;
	private Gender(String value ){
		this.value = value;
	}
}
class Person{
	private String name;
	private Gender sex;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getSex() {
		return sex;
	}
	public void setSex(Gender sex) {
		this.sex = sex;
	}
	
}
public class _05EnumTheory {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("xxx");
		person.setSex(Gender.man);
	}

}
