import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Retangulo retangulo = new Retangulo();
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a altura do retangulo: ");
		retangulo.setAltura(teclado.nextDouble());
		
		System.out.print("Digite a largura do retangulo: ");
		retangulo.setLargura(teclado.nextDouble());
		
		System.out.println("O perimetro do retangulo é: " + retangulo.perimetro());
		
		System.out.printf("A área de um retangulo é: " + retangulo.area());
		
		
		
		teclado.close();
	}

}
