package miniProjeAsalSayi;

public class main {

	public static void main(String[] args) {
	/*
	//ASAL BULMA 1
	int sayi=25;
	int sayac=0;
	for(int i=2;i<sayi;i++)
	{
		if(sayi%i==0)
		{
			sayac++;
		}
	}
	if(sayac>0)
	{
		System.out.println("SAYİ ASAL DEGİLDİR");
	}
	else
	{
		System.out.println("SAYİ ASALDİR");

	}*/
	//ASAL BULMA 2
	
	int number=20;
	boolean isPrime=true;
	if(number==1)
	{
		System.out.println("sayi asal degildir");
		return ;
	}
	
	if(number<1)
	{
		System.out.println("geceersiz sayi");
	}
	
	for(int i=2;i<number;i++)
	{
		if(number%i==0)
		{
			isPrime=false;
		}
	}
	
	if(isPrime==true)
	{
		System.out.println("sayi asaldir");
	}
	else
	{
		System.out.println("sayi asal degildir");
	}
	}
}
