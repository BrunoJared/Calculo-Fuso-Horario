package Application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite hora de saida: ");
		int horasaida = sc.nextInt();

		System.out.print("Digite tempo de viagem: ");
		int tempoviagem = sc.nextInt();

		System.out.print("Digite diferença de fuso horario: ");
		int fuso = sc.nextInt();

		
		boolean condicao1 = horasaida >= 0 && horasaida <= 23;
		boolean condicao2 = tempoviagem >= 1 && tempoviagem <= 12;
		boolean condicao3 = fuso >= -5 && fuso <= 5;

		int horaChegada;

		System.out.println();

		if (condicao1 && condicao2 && condicao3) {
			int ajuste = horasaida + tempoviagem;
			if (ajuste >= 24)
				ajuste -= 24;
			horaChegada = ajuste + fuso;
			if (horaChegada < 0)
				horaChegada += 24;
			System.out.println("O Horario de Chegada Será: " + horaChegada + " horas ");
		}
		sc.close();
	}

}
