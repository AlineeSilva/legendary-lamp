package s2b_teste.Somatorio;

public class Soma {

	public static double soma(double d, double e) {
		if(d < 0) {
			throw new IllegalArgumentException();
		}else if(e < 0) {
			throw new IllegalArgumentException();
		}
		return d + e;
	}

}
