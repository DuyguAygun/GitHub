package loopDemo;

public class main {

	public static void main(String[] args) {
		 for(int i=1;i<10;i++)//1'den 10'a kadar sayilari bastırır
		 {
			 System.out.println(i);
		 }
		 System.out.println("for dongu bitti");
		 
		 for(int i=2;i<10;i+=2)//2'den 10'a kadar olan cift sayilari gosterir
		 {
			 System.out.println(i);
		 }
		 System.out.println("for dongu bitti");
		 
		 int i=1;
		 while(i<10)
		 {
			 System.out.println(i);
			 i++;
		 }
		 System.out.println("while dongusu bitti");
		 
		 i=2;
		 while(i<10)
		 {
			 System.out.println(i);
			 i+=2;
		 }
		 System.out.println("while dongusu bitti");
		 
		 
		 int j=2;
		 do
		 {
			 System.out.println(j);
			 j+=2;
		 }while(j<10) ;
		 System.out.println("do-while dongusu bitti");
		
		 
		 
		 }

}
