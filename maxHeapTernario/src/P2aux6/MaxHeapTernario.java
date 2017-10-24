package P2aux6;

public class MaxHeapTernario {
	int cant; //Cantidad de elementos que posee, ojo que cantidad de elementos es distinto que el tamanho del arreglo
	int[] arr; //arreglo que contiene los elementos del heap
	public MaxHeapTernario() {
		cant = 0;
		arr = new int[1];
	}
	public void extraerMax() {
		if(cant >= 1) {
			arr[1] = arr[cant];//Traemos el ultimo elemento a la primera posicion
			//notar que estamos contando los elementos desde 1 hasta n
			cant--;//tenemos que modificar la cantidad de elementos
			//Hay que recuperar la condicion de max heap (todo padre es mayor que sus hijos)
			int j = 1; //apuntamos al primero
			while(3*j - 1 <= cant){
			    //mientras el primer hijo del que estoy mirando siga estando en el heap
			    int k = 3*j - 1;
			    int max = k;
			    if(k + 1 <= cant && arr[k + 1] > arr[max]){
			        max = k + 1;
			    }
			    if(k + 2 <= cant && arr[k + 2] > arr[max]){
			        max = k + 2;
			    }
			    if(arr[j] > arr[max]){
			        break;//terminamos si el elemento era mayor a sus 3 hijos
			    }
			    int aux = arr[j];
			    arr[j] = arr[max];
			    arr[max] = aux;
			    j = max;
			}
		}
	}
	public void insertar(int valor) {
		if(arr.length - 1 == cant) {
			realocarArr();
		}
		cant++;
		arr[cant] = valor;
		int j = cant;
		while(j > 1){
		    int padre = (j+1)/3;
		    if(arr[padre] >= arr[j]){
		        break;
		    }
		    else{
		        int aux = arr[j];
		        arr[j] = arr[padre];
		        arr[padre] = aux;
		        j = padre;
		    }
		}
	}
	public int getMax() {
		if(cant>=1) {
			return arr[1];
		}
		else {
			return -999999999;
		}
	}
	private void realocarArr() {
		int[] nuevoArr = new int[2*arr.length];
		for(int i = 0; i < arr.length; i++) {
			nuevoArr[i] = arr[i];
		}
		arr = nuevoArr;
	}
	public void imprimirMax() {
		int resp = getMax();
		System.out.println(resp);
	}
	public void imprimirHeap() {
		for(int i = 1; i <= cant; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
}
