package recursividade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Recursive recur = new Recursive();
		Double[][] valor = {{1.2,2.5,3.9,4.7,5.1},{1.0,2.0,3.0,4.0,5.1},{1.2,1.4,5.1,3.2,3.2}};
		Integer [] numRec = {23, 35, 16, 8, 13, 11, 10, 2, 9, 12};
		Integer[][] numCoconildo = {{1,2,3,4},{1,7,3,4},{1,2,8,4},{1,4,9,4}};
		String tico = "11010001";
		Scanner sc = new Scanner(System.in);
		
		System.out.println(recur.recursive1("Maconha-Caseira-Na-Bica",-2));
		System.out.println(recur.recursive2(valor,0,0));
		System.out.println(recur.recursive3(numRec, 0,Integer.MAX_VALUE));
		System.out.println(recur.printPrimaryDiagonal(numCoconildo));
		System.out.println(recur.binaryToDecimal(tico, 0));
		System.out.println(recur.numberExists(numRec, 9, 0));
		System.out.println(recur.numberPrimo(359, 1));
		System.out.println(recur.retornaInversao("maconha", -2));
		System.out.println(recur.fibonacci(8));
		System.out.println(recur.palindromo(sc.next().replaceAll(",", "").replaceAll(" ", "").replaceAll(".", "")
				.replaceAll("!", ""),0,-2));
	}

}
