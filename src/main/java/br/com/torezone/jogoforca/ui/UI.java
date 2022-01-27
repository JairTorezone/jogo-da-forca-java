package br.com.torezone.jogoforca.ui;

import java.security.InvalidAlgorithmParameterException;
import java.util.Scanner;

public class UI {

	public static void print(Object object) {
		System.out.println(object);
	}
	
	public static void printNewLine() {
		System.out.println();
	}
	
	@SuppressWarnings("resource")
	public static char readChar(String text) throws InvalidAlgorithmParameterException {
		System.out.println(text + " ");
		
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		
		if(line.trim().isEmpty()) {
			throw new InvalidAlgorithmParameterException("Nenhuma letra foi digitada");
		}
		
		if(line.length() > 1) {
			throw new InvalidAlgorithmParameterException("Apenas uma letra deve ser digitada");
		}
		
		char c = line.charAt(0);
		
		if(!Character.isLetter(c)) {
			throw new InvalidAlgorithmParameterException("Apenas letras deve ser digitada");
		}
		
		return c;
	}
}
