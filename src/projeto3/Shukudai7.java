package projeto3;

import java.util.Scanner;

public class Shukudai7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaIni;
		int horaFim;
		int duracao;
				
		System.out.println("Digite a hora inicial");
		horaIni = sc.nextInt();
		System.out.println("Digite a hora de encerramento");
		horaFim = sc.nextInt();
		
		sc.close();
		
		if (horaIni > 23) horaIni = 23;
		else if (horaIni < 0) horaIni = 0;
		
		if (horaFim > 23) horaFim = 23;
		else if (horaFim < 0) horaFim = 0;
		
		if (horaIni > horaFim) duracao = (horaFim + 24) - horaIni;
		else if (horaFim > horaIni) duracao = horaFim - horaIni;
		else duracao = 24;
			System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		
	}

}
