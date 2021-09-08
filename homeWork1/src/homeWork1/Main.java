package homeWork1;

public class Main {

	public static void main(String[] args) {

		Kurs kurs1 = new Kurs
				(
						1,
						"Yazılım Geliştirici Yetiştirme Kampı(C# + Angular)",
						"Engin Demiroğ",
						"Ücretsiz",
						"2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın..."
						);
		
		Kurs kurs2 = new Kurs
				(
						2,
						"Yazılım Geliştirici Yetiştirme Kampı(Java + React)",
						"Engin Demiroğ",
						"Ücretsiz",
						"2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın..."
						);
		
		Kurs kurs3 = new Kurs
				(
						3,
						"Programlamaya Giriş için Temel Kurs",
						"Engin Demiroğ",
						"Ücretsiz",
						"Python,java,c# gibi tüm programlama dilleri için temel programlama mantığını anlatıyor..."
						);
				
		Kurs[] kurslar = {kurs1,kurs2,kurs3};
		
		for(Kurs kurs : kurslar) {
			System.out.println("Kurs Adı : "+kurs.name);
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
