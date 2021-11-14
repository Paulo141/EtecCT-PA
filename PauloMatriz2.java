package Matriz2;

public class PauloMatriz2 {

  public static void main(String[] args) {
   
   int soma;
   int [][]i = new int[3][3];
  
  i[0][0] =3;
  i[0][1] =4;
  i[0][2] =5;
  i[1][0] =7;
  i[1][1] =8;
  i[1][2] =9;
  i[2][0] =3;
  i[2][1] =6;
  i[2][2] =78;
  
  for (int linha = 0; linha < i.length;linha++){
     for(int coluna = 0; coluna < i[0].length;coluna++){
     
     System.out.print(i[linha][coluna]+ " ");
     }
     
   System.out.println(" ");
  }
  soma = i [0][0] + i [0][1] + i [0][2] + i [1][0] + i [1][1] + i [1][2] + i [2][0]+i [2][1]+i [2][2];
   System.out.println("A soma de todos os elementos é "+soma);
  }
 }
