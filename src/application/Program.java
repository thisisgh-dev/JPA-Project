package application;

import domain.Person;

public class Program {

	public static void main(String[] args) {
		
		Person P1 = new Person(1, "Carlos da Silva", "carlossilva@gmail.com");
		Person P2 = new Person(2, "Joaquin Torres", "joaquintorres@gmail.com");
		Person P3 = new Person(3, "Ana Maria", "anamaria@gmail.com");
		
		System.out.println(P1);
		System.out.println(P2);
		System.out.println(P3);

	}

}