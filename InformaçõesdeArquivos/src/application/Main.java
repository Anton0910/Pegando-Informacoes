package application;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Caminho do arquivo: ");
		Scanner sc = new Scanner(System.in);
		String strpath = sc.nextLine();
		
		File path = new File(strpath);
		
		System.out.println("getName: "+ path.getName());
		
		System.out.println("getName: "+ path.getParent());

	}

}
