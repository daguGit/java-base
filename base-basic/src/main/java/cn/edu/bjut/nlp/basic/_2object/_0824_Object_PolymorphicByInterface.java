package cn.edu.bjut.nlp.basic._2object;

/*
 多态： 父类的引用类型变量指向了子类的对象或者是接口类型的引用类型变量指向了接口实现类 的对象。

 实现关系下的多态：

 接口  变量  = new  接口实现类的对象。
 */
interface Dao {
	public void add();

	public void del();
}

class UserDao implements Dao {

	public void add() {
		System.out.println("添加员工成功！！");
	}

	public void del() {
		System.out.println("删除员工成功！！");
	}

}

public class _0824_Object_PolymorphicByInterface {
	public static void main(String[] args) {
		Dao dao = new UserDao();
		dao.add();
	}
}
