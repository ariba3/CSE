package exam;

public class child extends parent {
	child(){
		System.out.println("child con");
	}
	int a =20;
	void display() {
		System.out.println(super.a);
		System.out.println("child class");
		System.out.println(a);
		super.display();
	}
	
}
