import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Person pedro = new Person ("", 0, 0);
		
		System.out.printf("Digite o seu nome: ");
		pedro.setName(scan.nextLine());
				
		System.out.printf("Digite o ano que você nasceu: ");
		pedro.setBirthYear(scan.nextInt());
		
		System.out.printf("Digite a sua altura: ");
		pedro.setHeight(scan.nextDouble());
		
		pedro.introduceAttributes();
		
		scan.close();
	}
}
