package homeWork1;

public class Main {

	public static void main(String[] args) {

		Kurs kurs1 = new Kurs
				(
						1,
						"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C# + Angular)",
						"Engin Demiro�",
						"�cretsiz",
						"2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n..."
						);
		
		Kurs kurs2 = new Kurs
				(
						2,
						"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(Java + React)",
						"Engin Demiro�",
						"�cretsiz",
						"2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n..."
						);
		
		Kurs kurs3 = new Kurs
				(
						3,
						"Programlamaya Giri� i�in Temel Kurs",
						"Engin Demiro�",
						"�cretsiz",
						"Python,java,c# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r..."
						);
				
		Kurs[] kurslar = {kurs1,kurs2,kurs3};
		
		for(Kurs kurs : kurslar) {
			System.out.println("Kurs Ad� : "+kurs.name);
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
