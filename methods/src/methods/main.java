package methods;

public class main {

	public static void main(String[] args) {
		sayiBulmaca();
	}
	
	public static void sayiBulmaca()
	{
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
		String mesaj="";
		if(varMi)
		{
			mesaj="sayi mevcuttur: "+aranacak;
			mesajVer(mesaj);
		}
		else
		{
			mesajVer("sayi mevcut degildir: "+aranacak);
		}
	}
	
	public static void mesajVer(String mesaj)
	{
		System.out.println(mesaj);
	}
	
	

}
