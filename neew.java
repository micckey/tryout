import java.util.Scanner;

public class neew {
    public static void main(String[] args) {
       /* for (int i=1; i<=5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }

        for (int a=1; a<=5; a++) {
        for (int b = a; b <= 5; b++) {
            System.out.print(b);
        }
        System.out.print("\n");
    } */

    /*    Scanner inputt = new Scanner(System.in);
        int n=inputt.nextInt();
        for (int i=n; i>=1; i--) {
            for (int j=n; j>=i; j--) {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }  */

        int k=7;
        for(int i=0; i<6; i++){
            k-=1;
            for (int j=0; j<k; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

}
}
       // System.out.print("\n");


