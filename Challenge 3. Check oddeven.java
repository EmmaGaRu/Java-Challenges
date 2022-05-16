//Challenge 3: Check odd/even

//Este programa imprime "par" si el número es par e "impar" si es impar

class Main {
  public static void main(String[] args) {
    int num = 3;
    checkOddEven(num);
  }
public static void checkOddEven(int num) {
  if (num % 2 == 0) {
    System.out.println("Par");
  } else {
    System.out.println("Impar");
  }
}
}