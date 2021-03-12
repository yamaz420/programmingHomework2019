package p1;
import java.util.Random;
import javax.swing.ImageIcon;

public class Exercise1 {
	
    /*
     * Metoden beräknar totala biljettpriset och det genomsnittliga
     * biljettpriset för ett antal vuxna, barn och pensionärer.
     **/	
	public void exercise1a() {
		
	}
	
	public void exercise1b() {
		
	}
	
	// public void exercise1c() {...}
	
	// public void exercise1d() {...}
	
	public void exercise1e() {
		PaintWindow pw = new PaintWindow();
		Random rand = new Random();
		ImageIcon image = new ImageIcon("images/gubbe.jpg");
		int width = pw.getBackgroundWidth();
		int height = pw.getBackgroundHeight();
		int dx = -3;
		int dy = 0;
		int x = 250;
		int y = rand.nextInt(height-100);  // Bildens höjd är 100
		
		// oändlig loop, raderna 36-42 upprepas tills PaintWindow-fönstret stängs
		while(true) {
			pw.showImage(image, x, y);
			PaintWindow.pause(20); // pausa exekveringen i 20 ms innan nästa förflyttning
			x += dx;
			y += dy;
			if(x<0) {
				dx = -dx;
			}
		}
	}
	
	// public void exercise1f() {...}
	
}
