package recursividade;

public class Recursive {

	private Integer count = -1;
	
	public String recursive1(String recursive,int i) {
		if(recursive == null) {
			return null;
		}
		if(i == -2) {
			i = recursive.length()-1;
		}
		
		if(i < 0) {
			return "";
		}
		
		return (recursive.charAt(i) + recursive1(recursive,i-1));
	}
	
	public Double recursive2(Double[][] recursive,int i,int j) {
		
		//se o array recursivo for null, ele nem inicia a recursividade
		if(recursive == null) {
			return null;
		}
		
		//Se a linha I for maior ou igual o tamanho do array, ele retorna 0.0 na soma da recursividade final e volta somando
		if(i >= recursive.length) {
			return 0.0;
		}
		//se a coluna for esgotada ele aumenta a linha e reseta a coluna
		if(j >= recursive[i].length ) {
			return recursive2(recursive,i+1,0);
		}
		//ele começa varrendo pela coluna 0 e por ai vai até chegar no tamanho do array
		return recursive[i][j] + recursive2(recursive,i,j+1);
		
	}
	
	public Integer recursive3(Integer[] numRec,int i,Integer coco) {
		if(numRec == null) {
			throw new IllegalArgumentException("coé manolo");
		}
		
		
		if(i >= numRec.length) {
			return coco;
		}
		
		if(numRec[i] < coco) {
			coco = numRec[i];
		}
		
		return recursive3(numRec,i+1,coco);
	}
	
	public String printPrimaryDiagonal(Integer[][] primary) {
		
		if(primary[0].length != primary.length) {
			throw new MatrixNotPossibleException("Somente matrizes quadradas possuem diagonal");
		}
		count++;
		if(count >= primary.length) {
			return "";
		}
		
		return "|"+primary[count][count] + "|" + printPrimaryDiagonal(primary);
		
	}
	
	public Integer binaryToDecimal(String binary,int i) {
		if(binary == null) {
			throw new RuntimeException("Não pode enviar uma String vazia");
		}
		
		if(binary.length()!=8) {
			throw new RuntimeException("O valor de conversao deve ter exatamente 8 digitos");
		}
		
		if( i >= binary.length()) {
			return 0;
		}
		
		if(binary.charAt(i) == '1') {
			return (int) (Math.pow(2, binary.length()-1-i)) + binaryToDecimal(binary, i+1);
		}
		return binaryToDecimal(binary, i+1);
		
	}
	
	public boolean numberExists(Integer[] num,Integer numSort,Integer i) {
		if(num == null) {
			throw new RuntimeException("Array nula invalida");
		}
		
		if(i >= num.length) {
			return false;
		}
		
		if(num[i] == numSort) {
			return true;
		}
		return numberExists(num,numSort,i+1);
	}
	
	public boolean numberPrimo(Integer num,int i) {
		if(num == null) {
			throw new RuntimeException("numero nao informado");
		}
		
		if(i!= 1 && i != num) {
			if(num %i==0) {
			return false;
			}
		}
		if(i > num) {
			return true;
		}
		return numberPrimo(num,i+1);
	}
	
	
	public String retornaInversao(String palavra,int i) {
		if(palavra == null) {
			throw new RuntimeException("Palavra sem corpo nula");
		}
		
		if(i == -2) {
			i = palavra.length()-1;
		}
		if(i < 0) {
			return "";
		}
		return palavra.charAt(i) + retornaInversao(palavra,i-1);
	}
	
	public Integer fibonacci(Integer num) {
		
		if(num == 1 || num == 0) {
			return 1;
		}else {
		
		return fibonacci(num-1) + fibonacci(num-2);
	}
	}
	
}
