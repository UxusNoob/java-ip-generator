import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many ip should be generated? ");
    int count = scanner.nextInt();
    int a = 0;
    while (a<count){
      a +=1;
      int rand1 = (int)(Math.random() * 256);
      int rand2 = (int)(Math.random() * 256);
      int rand3 = (int)(Math.random() * 256);
      int rand4 = (int)(Math.random() * 256);

    System.out.println(rand1+"."+rand2+"."+rand3+"."+rand4);
    }
  }
}
