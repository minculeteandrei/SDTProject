package Lab2.Strategy;


public class MyCollections {
    public static <T extends Comparable<T>> void sort(T[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i].compareTo(arr[j]) > 0) {
                    T aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }

    public static <T> void sort(T[] arr, MyComparator<T> comp) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(comp.compare(arr[i], arr[j]) > 0) {
                    T aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }
}
