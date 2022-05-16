//Challenge 1: Find maximum
//Este programa devuelve el número más grande de la lista

class Main {
public static void main(String[] args) {
        Integer[] numList = new Integer[]{1, 2, 3, 4, 5};
        System.out.println("El número máximo es: " + maximum(numList));
    }
    public static Integer maximum(Integer[] numList) {
        int mayor = numList[0];
        for (int i = 1; i < numList.length; i++) {
            if (numList[i] > mayor) {
                mayor = numList[i];
            }
        }
        return mayor;
    }
}
