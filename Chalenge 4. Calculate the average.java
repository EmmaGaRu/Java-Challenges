//Chalenge 4: Calculate the average

//Este programa calcula la media

public class Main {

    public static void main(String[] args) {
        Integer[] numList = {1, 2, 3, 4, 5};
        System.out.println(average(numList));

    }

    static double average(Integer[] numList) {

        int suma = 0;
        int longitud = numList.length;

        for (int i = 0; i < numList.length; i++) {
            suma += numList[i];
        }
        return (double)suma / longitud;
    }

}