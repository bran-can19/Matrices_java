//Matrices
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Matrices{

public static BufferedReader  bufer = new BufferedReader(new InputStreamReader(System.in));
public static String entrada; 

    public static void imprimirMatriz(int [][] m) {// m es parametro
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                System.out.print(m[i][j] + "   ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) throws IOException { 
        int[][] matriz1 = new int[3][3];
        int numero = 1;
        int renglones, columnas;

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = numero;
                numero ++;
            }
        }
        System.out.println("Los valores de matriz 1 son: ");
        imprimirMatriz(matriz1);//llamado con argumento
//Manipulación matriz irredular
        int[][] matriz2;
        System.out.println("Ingrese el numero de renglones: ");
        entrada = bufer.readLine();
        renglones = Integer.parseInt(entrada);
        //CONSTRUYENDO LA MATRIZ
        matriz2 = new int[renglones][];
        for (int i = 0; i < matriz2.length; i++) {
            System.out.println("Escriba columnas para el renglon: " + i);
            entrada = bufer.readLine();
            columnas = Integer.parseInt(entrada);
            matriz2[i] = new int[columnas];
            numero=1;
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = numero;
                numero++;
            }
        }
        //Imprimir la matriz2
        System.out.println("Los valores de matriz 2 son: ");
        imprimirMatriz(matriz2);
    }
}

