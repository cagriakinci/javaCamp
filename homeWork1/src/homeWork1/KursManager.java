package homeWork1;

public class KursManager {
	public void addToCart(Kurs kurs) {
		System.out.println("Kurs Sepete Eklendi : " + kurs.name);
	}
	
	public void joinTheCourse(Kurs kurs) {
		System.out.println("Kursa Kat�l�m Sa�land� : "+kurs.name);
	}
}
