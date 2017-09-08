package s2b_teste.Somatorio;

public class Soma {

	public static double soma(double d, double e) {
		if(d < 0) {
			throw new IllegalArgumentException("O primeiro número não pode ser negativo");
		}
		if(e < 0){
			throw new IllegalArgumentException("O segundo número não pode ser negativo");
		}
		return d + e;
	}

}
