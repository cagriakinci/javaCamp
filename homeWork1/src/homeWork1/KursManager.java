package homeWork1;

public class KursManager {
	public void addToCart(Kurs kurs) {
		System.out.println("Kurs Sepete Eklendi : " + kurs.name);
	}
	
	public void joinTheCourse(Kurs kurs) {
		System.out.println("Kursa Katılım Sağlandı : "+kurs.name);
	}
}
