package projeto4;

public class Shukudai17 {

  public static void main(String[] args) {
    boolean stop = false;
    int n = 0;

    if (stop) {
      while (!stop) {
        n++;
        System.out.println(n);
      }
    } else {
      while (!stop) {
        n--;
        System.out.println(n);
        stop = (n < -1); // Condição para parar o loop
      }
    }
  }
}
