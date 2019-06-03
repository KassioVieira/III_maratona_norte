import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int convidados[] = { 300, 1500, 600, 1000, 150 };

    int total = 0;
    int aux;
    for (int i = 0; i < 5; i++) {
      aux = in.nextInt();
      total += convidados[i] * aux;
    }

    System.out.println(total+225);
  }
}
