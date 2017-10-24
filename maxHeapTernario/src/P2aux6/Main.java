package P2aux6;

public class Main {

	public static void main(String[] args) {
		MaxHeapTernario myHeap = new MaxHeapTernario();
		myHeap.imprimirMax();
		myHeap.insertar(1);
		myHeap.imprimirMax();
		myHeap.insertar(2);
		myHeap.imprimirMax();
		for(int i = 3; i <= 1000; i++) {
			myHeap.insertar(i);
		}
		myHeap.imprimirMax();
		myHeap.extraerMax();
		myHeap.extraerMax();
		myHeap.extraerMax();
		myHeap.imprimirMax();
	}

}
