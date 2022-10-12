package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();
	public final void gameOver() //(final kullanımı)gameCalculatoru kullanan gameoverı hiçbir zaman degiştirmeyecek demektir
	{
		System.out.println("oyun bitti");
	}
}
