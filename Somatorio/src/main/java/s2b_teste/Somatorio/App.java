package s2b_teste.Somatorio;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner input = new Scanner(System.in);
    	System.out.print("A:\n");
    	double a = input.nextDouble();
    	System.out.print("B:\n");
        double b = input.nextDouble();
        input.close();
        double r = Soma.soma(a, b);
        System.out.printf("A= %f\n", a);
        System.out.printf("B= %f\n", b);
        System.out.printf("Soma= %f\n", r);
    }
}
