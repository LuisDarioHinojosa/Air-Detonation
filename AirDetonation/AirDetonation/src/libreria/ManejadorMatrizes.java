package libreria;

import java.util.Scanner;

public class ManejadorMatrizes {
    public static void leeMatriz(double a[][],int n, int m){
        int i, j;
        Scanner lectura;
        
        lectura=new Scanner(System.in);
        for(i=0;i<n;i++)
            for(j=0;j<m;j++){
                System.out.print("Dame el elemento "+i+","+j+" ");
                a[i][j]=lectura.nextDouble();
            }
    }
    
    public static void imprimeMatriz(int a[][], int n, int m){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++)
                System.out.print(a[i][j]+"  ");
            System.out.println();
        }
    }
    
    public static double sumaFila(int a[][], int m, int f){
        double suma;
        int j;
        suma=0;
        for(j=0;j<m;j++)
            suma=suma+a[f][j];
        return suma;
    }
    
    public static int sumaColumna(int a[][], int n, int c){
        int suma;
        int i;
        suma=0;
        for(i=0;i<n;i++)
            suma=suma+a[i][c];
        return suma;
    }
    
    public static int mayorFila(double a[][], int m, int f){
        int j, mayor;
        mayor=0;
        for(j=1; j<m;j++)
            if(a[f][j]>a[f][mayor])
                mayor=j;
        return mayor;
    }
    
    public static int mayorColumna(double a[][], int n, int c){
        int i, mayor;
        mayor=0;
        for(i=1;i<n;i++)
            if(a[i][c]>a[mayor][c])
                mayor=i;
        return mayor;
    }
    
    public static  int[] encuentraMayorMatriz(double a[][], int n, int m){
        int fmayor, cmayor, i, j;
        int b[];
        b=new int[2];
        fmayor=0;
        cmayor=0;
        for(i=0;i<n;i++)
            for(j=0;j<m;j++)
                if(a[i][j]>a[fmayor][cmayor]){
                    fmayor=i;
                    cmayor=j;
                }
        b[0]=fmayor;
        b[1]=cmayor;
        return b;
    }
    
    public static double sumaDiagonal(double a[][], int n, int m){
        int i,j;
        double suma;
        suma=0;
        i=0;
        j=0;
        while(i<n && j<m){
            suma=suma+a[i][j];
            i++;
            j++;
        }
        return suma;
    }
    
    public static double sumaMatriz(double a[][], int n, int m){
        int i,j;
        double suma;
        suma=0;
        for(i=0;i<n;i++)
            for(j=0;j<m;j++)
                suma=suma+a[i][j];
        return suma;
    }
    
    public static double[][] sumaMatrices(double a[][], double b[][], int n, int m){
        int i, j;
        double c[][];
        c=new double [n][m];
        for(i=0;i<n;i++)
            for(j=0;j<m;j++)
                c[i][j]=a[i][j]+b[i][j];
        return c;
    }
    
    public static double[][] multiplicaMatrices(double a[][], double b[][], int n, int m, int p){
        int i, j, k;
        double c[][];
        c=new double[n][p];
        for(i=0;i<n;i++)
            for(j=0;j<p;j++)
                for(k=0;k<m;k++)
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
        return c;
    }
    
    
}
