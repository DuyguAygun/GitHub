package sayiBulma;

public class main {

	public static void main(String[] args) {
		int[] sayilar=new int[] {1,5,3,9,4};
		int aranacak=5;
		boolean varMi=false;
		for (int sayi : sayilar) {
			if(sayi==aranacak)
			{
				varMi=true;
				break;
			}
		}
		if(varMi)
		{
			System.out.println("sayi mevcuttur");
		}
		else
		{
			System.out.println("sayi mevcut degildir");
		}
	}

}
