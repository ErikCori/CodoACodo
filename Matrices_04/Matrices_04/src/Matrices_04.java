
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando
 */
public class Matrices_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int filas=0;
        int columnas=0;
        
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas:");
        filas= teclado.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        columnas= teclado.nextInt();
        
        //Declaro y creo la matriz:
        int[][] matriz= new int[filas][columnas];    
        
        //Cargar la matriz con el número 0:
        cargarMatriz(matriz,0);
        
        //Cargar los bordes de la matriz con el número 9:
        cargarBordes(matriz,9);
        
        //Cargar la diagonal de la matriz con el número 1:
        cargarDiagonal(matriz,1);
        
        //Cargar la parte baja de la diagonal con el número 5:
        cargarDiagonalInferior(matriz,5);
        
        //Informar la matriz:
        imprimirMatriz(matriz);
        
        //Invertir la matriz:
        if(  invertirMatriz(matriz)   ){
            System.out.println("Se pudo invertir la matriz");
            //Imprimo la matriz:
            imprimirMatriz(matriz);
        }else{
            System.out.println("No se pudo invertir!");
        }
    }
    
    public static void cargarMatriz(int[][] pMatriz, int pNum){
        for (int i = 0; i < pMatriz.length; i++) {
            for (int j = 0; j < pMatriz[i].length; j++) {
                pMatriz[i][j]=pNum;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    
                }
            }
        }
    }
    
    public static void cargarBordes(int[][] pMatriz, int pNum){
        for (int i = 0; i < pMatriz.length; i++) {
            for (int j = 0; j < pMatriz[i].length; j++) {
                if((i==0)||(i==(pMatriz.length -1))){
                    pMatriz[i][j]=pNum;
                }else{
                    if((j==0)||(j==pMatriz[i].length-1)){
                        pMatriz[i][j]=pNum;
                    }
                }
            }
        }
    }
    
    public static void imprimirMatriz(int[][] pMatriz){
        for (int i = 0; i < pMatriz.length; i++) {
            for (int j = 0; j < pMatriz[i].length; j++) {
                System.out.print(pMatriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void cargarDiagonal(int[][] pMatriz, int pNum){
        for (int i = 0; i < pMatriz.length; i++) {
            for (int j = 0; j < pMatriz[i].length; j++) {
                if (i==j) {
                    pMatriz[i][j]= pNum; 
                }
            }
        }
    }
    
    public static void cargarDiagonalInferior(int[][] pMatriz, int pNum){
        for (int i = 0; i < pMatriz.length; i++) {
            for (int j = 0; j < pMatriz[i].length; j++) {
                if((i>=1)&&(j<i)){
                    pMatriz[i][j]=pNum;
                }
            }
        }
    }
    
    public static void cargarDiagonalSuperior(int[][] pMatriz, int pNum){
        for (int i = 0; i < pMatriz.length; i++) {
            for (int j = 0; j < pMatriz[i].length; j++) {
                if((j>i)){
                    pMatriz[i][j]=pNum;
                }
            }
        }
    }
    
    public static boolean invertirMatriz(int[][] pMatriz){
        int aux=0;
        //Supongo que la matriz recibida es cuadrada:
        boolean esCuadrada=true;
     
        //Chequeo si realmente es cuadrada:
        for (int i = 0; i < pMatriz.length; i++) {
            if (pMatriz[i].length != pMatriz.length){
                esCuadrada=false;
            }
        }

        //Si es cuadrada la invierto:
        if (esCuadrada){
            for (int i = 0; i < pMatriz.length; i++) {
                for (int j = 0; j < pMatriz[i].length; j++) {
                    if((i>=1)&&(j<i)){
                        aux=pMatriz[i][j];
                        pMatriz[i][j]= pMatriz[j][i];
                        pMatriz[j][i]= aux;
                    }
                }
            }
        }
        //La función devuelve un valor (verdadero) en caso de que la matriz
        //sea cuadrada, o falso en caso contrario:
        return esCuadrada;
    }
}