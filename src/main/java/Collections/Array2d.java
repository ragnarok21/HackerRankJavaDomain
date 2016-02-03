package Collections;

import java.util.Scanner;

/**
 * Created by ramon on 02-02-16.
 */
public class Array2d {
    static Integer suma_mayor = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[6][6];
        int [][] aux = new int [3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }


        for (int i = 1; i <matrix.length-1 ; i++) {
            for (int j = 1; j <matrix.length-1 ; j++) {

                aux = submatrix(matrix,i,j);
                int suma = suma(aux);
                if(suma>suma_mayor){
                    suma_mayor=suma;
                }

            }
        }

        System.out.println(suma_mayor);

    }

    public static int suma(int [][]matrix){
        int suma = 0;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix.length ; j++) {
                suma+=matrix[i][j];
            }
        }
        suma += -(matrix[matrix.length/2][(matrix.length/2)-1]+matrix[matrix.length/2][(matrix.length/2)+1]);
        return suma;
    }
    public static int[][]submatrix(int [][]matrix,int x,int y){
        int [][] aux = new int[3][3];
        int a = 0;
        int b=0;
        for (int i = x-1; i < x+2; i++) {
            for (int j = y-1; j <y+2 ; j++) {
                aux[a][b]=matrix[i][j];
                b++;
            }
            b=0;
            a++;

        }

        return aux;
    }

}
