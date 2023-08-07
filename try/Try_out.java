import java.util.*;

class Pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a,x; // rows
        int b = 1;
        int y = n;
        while (b++ < n) { //Rows
                 a = y--;
                 x = b;       
            while (a-- > 0) {
            System.out.print(" ");
            }
            while (x++ < a-y){
                System.out.print("+");
            }
            System.out.println("");

        }
    }
}