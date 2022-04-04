import java.util.Random;
import java.util.Scanner;

public class Jogo {
	public int numero;
	
	public void sorteiaNumero() {
		Random rand = new Random();
		this.numero = rand.nextInt(2);
		// 0 = pedra; 1 = papel; 2 = tesoura;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha uma opção: " + "\n" + "0 = Pedra" + "\n" + "1 = Papel" + "\n" + "2 = Tesoura");
		int chute = sc.nextInt();
		
		Jogo jogo = new Jogo();
		jogo.sorteiaNumero();
		
		switch (jogo.numero){
		case 0: 
			switch (chute){
				case 0:
					System.out.println("\n" + "Pedra x Pedra");
					System.out.println("Empatou!");
					break;
				case 1:
					System.out.println("\n" + "Pedra x Papel");
					System.out.println("Você ganhou!");
					break;
				case 2:
					System.out.println("\n" + "Pedra x Tesoura");
					System.out.println("Jogador 1 ganhou");
					break;
			} break;
		case 1:
			switch(chute) {
				case 0: 
					System.out.println("\n" + "Papel x Pedra");
					System.out.println("Você perdeu!");
					break;
				case 1:
					System.out.println("\n" + "Papel x Papel");
					System.out.println("Empatou!");
					break;
				case 2:
					System.out.println("\n" + "Papel x Tesoura");
					System.out.println("Você ganhou!");
					break;
			} break;
		case 2:
			switch(chute) {
					case 0:
						System.out.println("\n" + "Tesoura x Pedra");
						System.out.println("Você ganhou!");
						break;
					case 1:
						System.out.println("\n" + "Tesoura x Papel");
						System.out.println("Você perdeu!");
						break;
					case 2:
						System.out.println("\n" + "Tesoura x Tesoura");
						System.out.println("Empatou!");
						break;
			} break;
		default: 
			System.out.println ("Entrada inválida");
	}
	
		
}
}
		
		
		
		