
package valoresint; 
import java.util.Scanner;

public class ValoresInt {

   
    public static void main(String[] args) {
    int A,B,C,D;
    Scanner scan = new Scanner(System.in);
    
        System.out.println("Digite 4 valores inteiros: ");
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();
        
        if((B>C)&(D>A)&(C+D)>(A+B)&(B >= 0)&(C >= 0)& (A  % 2) == 0){
            System.out.println("Valores aceitos");
        }else System.out.println("Valores não aceitos");
        
    
    }
    
}
