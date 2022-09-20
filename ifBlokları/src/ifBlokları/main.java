package ifBlokları;

public class main {

	public static void main(String[] args) {
		int sayi=14;
		if(sayi<20)
		{
			System.out.println("sayi 20'den kucuktur");
		}
		else
		{
			System.out.println("sayi 20'den kucuk degildir");
		}
		
		int sayi2=24;
		if(sayi2<20)
		{
			System.out.println("sayi2 kucuktur 20'den");
		}
		else if(sayi2==20)
		{
			System.out.println("sayi2 esittir 20'ye");
		}
		else
		{
			System.out.println("sayi2 buyuktur 20'den");
		}

	}

}
