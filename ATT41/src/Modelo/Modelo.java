package Modelo;

public class Modelo {
    private int[] arr = {13, 5, 7, 9, 11, 13, 15};

    public int[] getVetor() {
        return arr;
    }

    public int buscaSequencial(int elemento) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elemento) {
                return i; // 

                
            }
        }
        return -1; 
    }
}