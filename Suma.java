import java.util.Scanner;
public class Suma {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		Scanner msj = new Scanner(System.in);
		System.out.println("Oye loco dame el primer numero xaxo");
		num1 = msj.nextInt(); //Lo que se introduce por teclado se almacena en la variable num1
		System.out.println("Oye loco dame el segundo numero xaxo");
		num2 = msj.nextInt(); //Lo que se introduce por teclado se almacena en la variable num2
		num3 = num1+num2; //Suma las variables 1 y 2
		System.out.println("El resultado de la suma es: " + num3); //Muestra la variable 3 (resultado de la suma)
	}
}