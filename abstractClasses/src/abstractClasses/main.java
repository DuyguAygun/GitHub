package abstractClasses;

public class main {

	public static void main(String[] args) {
		WomenGameCalculator womenGameCalculator=new WomenGameCalculator();
		womenGameCalculator.hesapla();
		womenGameCalculator.gameOver();
		
		GameCalculator gameCalculator=new WomenGameCalculator();
		
	}

}
