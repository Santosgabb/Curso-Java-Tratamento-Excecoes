package com.gabriel.cursojava.aulaexcecao;

public class AulaUtilizandoTratamento {

	public static void main(String[] args) {
		
		
		// UTILIZANDO O TRY CATCH
		try {
		int[] vetor = new int[4];

		System.out.println("Antes da exception");

		vetor[4] = 1;

		System.out.println("Esse texto não vai ser impresso, por que vai ocorrer uma exception");
		}catch(ArrayIndexOutOfBoundsException exception) {// tipo da excecao
			System.out.println("Exceção ao acessar um indice do vetor que não existe");
		}
		System.out.println("Esse texto será impresso apos a exception");
	}

}
