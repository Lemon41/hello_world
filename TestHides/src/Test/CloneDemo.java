package Test;
class Student implements Cloneable{
	String name;
	int age;
	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	public Object clone(){
		Object o = null;
		try{
		//Object 中的clone()识别出你要克隆的对象
			o = (Student)super.clone();
					
		}catch(CloneNotSupportedException e){
		System.out.println(e.getMessage());	
		}
		return o;
	}
}

public class CloneDemo {
	public static void main(String[] args) {
		Student s1 = new Student("zhangsan", 16);
		Student s2 = (Student) s1.clone();
		s2.name = "luorao";
		s2.age = 20;
		System.err.println("name = "+ s1.name + "age- " + s1.age);
	}

}
