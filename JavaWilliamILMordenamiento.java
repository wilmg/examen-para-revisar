/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawilliamilm;

/**
 *
 * @author HP
 */
public class JavaWilliamILMordenamiento {
   
	private static int a=0, aux=1, b=0; //Declaramos los datos necesarios
	private static final int[][] matriz = new int[6][6]; //La matriz debe ser cuadrada
 
	public static void main(String[] args) {
 
		llenarMatriz(matriz, a, b); //Iniciamos el llamado recursivo
		imprimir(); //imprimimos la matriz
 
	}
 
	public static void llenarMatriz(int matriz[][], int i, int j){
 
		if(j > matriz.length -1){ //Si llegó a la ultima coluna, reseteamos los datos para la siguiente
			i++;
			j=0;
			aux++;
		}
		if(i <matriz.length){ // compara que no hallamos llegado al final
 
			if(i==(aux-1) && j >= (aux-1)){ //comprueba que estemos en el lugar adecuado, es decir ira imprimiento escaladamente
				if(i==0)// si es la primera fila ingresamos aux=1
					matriz[i][j] = matriz[i][j]=aux;
				else
					matriz[i][j] = matriz[i][i-1]*2;//ingresamos el valor correspondiente al ultimo de la "escala" *2
				llenarMatriz(matriz, i , j+1);
			}
			else{ //si no, asignamos los valores anteriores de la escala
				if(j==0)// comprobamos si es el primer digito a ingresar
					matriz[i][j] = j+1;
				else
					matriz[i][j] = matriz[i-1][j];// asignamos el mismo numero de la fila anterior (i-1)
				llenarMatriz(matriz, i, j+1);
			}
		}
	}
 
	public static void imprimir(){ //este metodo nos imprime la matriz por consola
            for (int[] matriz1 : matriz) {
                for (int j = 0; j< matriz.length; j++) {
                    System.out.print(matriz1[j] + " ");
                }
                System.out.print("\n");
            }
	}
 
}
