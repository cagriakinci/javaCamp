package homeWork1;

public class Main {

	public static void main(String[] args) {

		Kurs kurs1 = new Kurs
				(
						1,
						"Yazýlým Geliþtirici Yetiþtirme Kampý(C# + Angular)",
						"Engin Demiroð",
						"Ücretsiz",
						"2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn..."
						);
		
		Kurs kurs2 = new Kurs
				(
						2,
						"Yazýlým Geliþtirici Yetiþtirme Kampý(Java + React)",
						"Engin Demiroð",
						"Ücretsiz",
						"2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn..."
						);
		
		Kurs kurs3 = new Kurs
				(
						3,
						"Programlamaya Giriþ için Temel Kurs",
						"Engin Demiroð",
						"Ücretsiz",
						"Python,java,c# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr..."
						);
				
		Kurs[] kurslar = {kurs1,kurs2,kurs3};
		
		for(Kurs kurs : kurslar) {
			System.out.println("Kurs Adý : "+kurs.name);
		}
		
		KursManager kursManager = new KursManager();
		kursManager.addToCart(kurs1);
		kursManager.addToCart(kurs2);
		kursManager.addToCart(kurs3);
		kursManager.joinTheCourse(kurs1);
		kursManager.joinTheCourse(kurs2);
		kursManager.joinTheCourse(kurs3);
	}

}
