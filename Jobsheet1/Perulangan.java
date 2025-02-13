import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Nim;
        int n;
 
        System.out.print("Masukkan NIM : ");
        Nim = sc.nextLine();

        n = Integer.parseInt(Nim.substring(10, 12));
        if (n < 10) {
            n += 10;
        }

        System.out.println("===========================");
        System.out.println("n : " + n);

        for(int a = 1; a <= n; a++){
            if (a % 2 == 0) {
                if (a == 6 || a == 10) {
                    System.out.print("");
                } else {
                    System.out.print(a + " ");
                }
            } else {
                System.out.print("* ");
            }
        }
    }
}