public class Javaapplication1
{
	public static void main(String args[])
	{
		PesawatTelepon a = new PesawatTelepon();
		Manusia b = new Manusia();
		Hewan c = new Hewan();

// 		boolean value = true;
// 		String output = Boolean.toString(value);

		System.out.println("Manusia: ");
		System.out.println("Bermain: " + b.bermain("Badminton"));
		System.out.println("Makan: " + b.makan("Nasi Goreng"));
		b.tidur();
		System.out.println("Bekerja: " + b.bekerja("IT"));
		System.out.println("Memasak: " + b.memasak("Nasi"));
		System.out.println("Mencuci: " + b.mencuci("Pakaian"));

		System.out.println("Hewan: ");
		System.out.println("Bermain: " + c.bermain("Bola"));
		System.out.println("Makan: " + c.makan("Ikan"));
		c.tidur();

		System.out.println("PesawatTelepon: ");
		System.out.println("Menerima Panggilan: " + a.terima_panggilan("Hallo"));
		System.out.println("Melakukan Panggilan: " + a.melakukan_panggilan("Ya Hallo"));
		b.tidur();

	}

}