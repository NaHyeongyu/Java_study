package ch01;

public class Hello {
	public static void main(String[] args) {
		Person[] people = new Person[3];
		people[0] = new Person("Hyeongyu", 22);
		people[1] = new Person("Kangin", 24);
		people[2] = new Person("Jisung", 23);

		for (int i = 0; i < people.length; i++) {
			people[i].sayHello(); // 기본 인사
		}

		// 오버로딩된 메서드 호출!
		people[0].sayHello("반가워요!");
		people[1].sayHello("오늘도 화이팅!");
	}
}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 기본 인사 메서드
	public void sayHello() {
		System.out.printf("Hi I'm %s and %d years old.\n", name, age);
	}

	// 오버로딩된 인사 메서드
	public void sayHello(String message) {
		System.out.printf("Hi I'm %s and %d years old. %s\n", name, age, message);
	}
}