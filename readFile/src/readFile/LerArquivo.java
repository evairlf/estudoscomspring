package readFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LerArquivo {

	public static void main(String[] args) {
		Scanner sc = null;
		String arquivo = "//home//evailf//document.txt";
		
		try(BufferedReader bf = new BufferedReader(new FileReader(arquivo))){
			
			String line = bf.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = bf.readLine();
			}
		}catch(IOException ex) {
			System.out.println("Erro:"+ex.getMessage());
		}

	}

}
