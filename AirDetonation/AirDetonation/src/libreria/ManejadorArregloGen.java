package libreria;

public class ManejadorArregloGen {
	
		
	public static <T> void swap(int posX, int posY, T [] a){
		T aux;
	
		aux=a[posX];
		a[posX]=a[posY];
		a[posY]=aux;
	}
	
	public static <T extends Comparable> int minimo(T [] arreglo, int n, int inicio){
		int min=inicio;
		
		for(int i=inicio+1; i<n; i++)
			if(arreglo[min].compareTo(arreglo[i])>0)
				min=i;
		return min;
	}

	public static <T extends Comparable> int posMinimo(T [] arreglo, int n){
		int min=0;
		
		for(int i=1; i<n; i++)
			if(arreglo[min].compareTo(arreglo[i])>0)
				min=i;
		return min;
	}

	public static <T extends Comparable> int posMaximo(T [] arreglo, int n){
		int max=0;
		
		for(int i=1; i<n; i++)
			if(arreglo[max].compareTo(arreglo[i])<0)
				max=i;
		return max;
	}
	
	public static <T extends Comparable> void seleccionDirecta(T [] a, int n){
		int min;
		
		for(int i=0; i<n-1; i++){
			min=minimo(a,n,i);
			swap(min,i,a);
		}
	}
	
	public static <T extends Comparable> int busqSecuencialOrdenada(T [] a, int n, T x){
		int i=0;
		
		while (i<n && a[i].compareTo(x)<0)
			i++;
		if (i>=n || !a[i].equals(x))
			i=-i-1;
		return i;
	}
	
	public static <T> int busqSecuencialDesordenada(T [] a, int n, T x){
		int i=0;
		
		while (i<n && !a[i].equals(x))
			i++;
		if (i==n)
			i=-1;
		return i;
	}
			
	public static <T extends Comparable> int busqBinaria(T [] a, int n, T x){
		int pos;
		int inicio = 0;
		int fin = n-1;
		int mitad = (inicio+fin)/2; 
		
		while ( inicio <= fin && !a[mitad].equals(x) ) {
			if ( x.compareTo(a[mitad])<0 )
				fin = mitad-1; 
			else 
				inicio = mitad+1;
			mitad = (inicio+fin)/2;
		}
		if ( inicio > fin )		// elemento no encontrado
			pos = -inicio-1;	
		else 					// vector[mitad].equals(buscado)
			pos = mitad;
		return pos;
	}
	
	public static <T> void corrimientosDer(T [] a, int n, int pos){
        for (int i = n; i>pos; i--)
            a[i] = a[i-1];
	}
	
	public static <T> void corrimientosIzq(T [] a, int n, int pos){
		for (int i=pos; i<n-1; i++)
				a[i]=a[i+1];
	}
	
	
	public static <T> void imprimeArreglo(T [] a, int n, int pos){
		for (int i=0; i<n-1; i++)
				System.out.println(a[i]);
	}
	//encuentra el indice del entero más pequeño
	public static int minIndArreglo(int []x, int n) {
		int minIndice=0;
		for(int i=1; i<n;i++)
			if(x[minIndice]>x[i]) {
				minIndice=i;
			}
		return minIndice;
	}
	//encuentra el indice del entero más grande 
	public static int mayIndArreglo(double []x, int n) {
		int may=0;
		for(int i=1; i<n;i++)
			if(x[may]<x[i]) {
				may=i;}
		return may;
	}
	//intercambia dos numero enteros 
		public static void intercambio(int x[],int ind1, int ind2) {
			int aux;
			aux=x[ind1];
			x[ind1]=x[ind2];
			x[ind2]=aux;
		}
	//encuentra el indice del entero más pequeño desde un indice dado 
		public static int minIndArregloPos(int []x, int j, int n) {
			int indice=j;
			for(int i=j+1; i<n;i++)
				if(x[indice]>x[i]) {
					indice=i;}
			return indice;
		}
		
		//encuentra el indice del entero más grande desde un indice dado 
				public static int mayIndArregloPos(int []x, int j, int n) {
					int indice=j;
					for(int i=j+1; i<n;i++)
						if(x[indice]<x[i]) {
							indice=i;}
					return indice;
				}
		
		//encuentra el indice del entero más grande 
		public static int mayIndArreglo(int []x, int n) {
			int may=0;
			for(int i=1; i<n;i++)
				if(x[may]<x[i]) {
					may=i;}
			return may;
		}
		
		
		//ordena un arreglo de enteros de mayor a menor
		public static void ordenaArreglo (int []x, int n) {
			int y;
			for(int i=0;i<n;i++) {
				y=mayIndArregloPos(x,i, n);
				intercambio(x,i,y);
			}
}}

