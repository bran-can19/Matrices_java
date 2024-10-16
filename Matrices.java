//Matrices
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Matrices{

    public static  BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;



    public static void imprimirMatriz(int [][] m) {// m es parametro
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                System.out.print(m[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static int [][]  crearMatrizIrregular (int r) throws IOException{
        int c;
        //construyendo la matriz dos
        int [][] matriz2 = new int[r][];
        for (int i = 0; i < matriz2.length; i++) {
            System.out.println("Escribe el total de columnas para el renglon " + i + ": ");
            entrada= bufer.readLine();
            c = Integer.parseInt(entrada);
            matriz2[i] = new int[c];
        }
        return matriz2;
    }

    public static int [][] llenarMatrizIrregular (int [][] m) throws IOException{
        System.out.println("Introduciendo valores en una matriz irregular");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Escribe un valor de [:"+i+"]["+j+"]: ");
                entrada= bufer.readLine();
                m[i][j] = Integer.parseInt(entrada);
            }
        }
        return m;
    }

    public static void main(String[] args) throws IOException{
        int[][] matriz1 = new int[3][3];
        int numero = 1;
        int renglones;

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = numero;
                numero ++;
            }
        }
        System.out.println("Los valores de matriz 1 son: ");
        imprimirMatriz(matriz1);//llamado con argumento

        //Manipulando matriz irregular
        int[][] matriz2;
        System.out.println("Escribe el total de renglones");
        entrada= bufer.readLine();
        renglones = Integer.parseInt(entrada);

        //construyendo la matriz dos
        matriz2 = crearMatrizIrregular(renglones);
        matriz2 = llenarMatrizIrregular(matriz2);
        
        //imprimiendo la matriz 2
        System.out.println("Valores de la matriz irregular: ");
        imprimirMatriz(matriz2);
    }
}