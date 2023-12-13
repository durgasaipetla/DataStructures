package LinkedHashMap;

public class Student {
	int id;
	 String name;
	 float marks;
public Student(int i, String name, float marks) {
	 this.id=i;
	 this.name=name;
	 this.marks=marks;
	}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
}
}
