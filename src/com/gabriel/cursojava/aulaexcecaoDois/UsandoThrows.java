package com.gabriel.cursojava.aulaexcecaoDois;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		System.out.println("Informe um numero decimal");

		try {
			double num = leNumero();
			System.out.println("Voçê digitou " + num);

		} catch (Exception e) {

			System.out.println("Entrada Invalida");
			e.printStackTrace();
		}
	}

	public static double leNumero() throws Exception {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		return num;
	}
}