import java.util.Scanner;
public class Main{
public static void main(String[] args) {
Scanner in = new Scanner (System.in);
int a;
int b;
int c;
System.out.println("Digite tres valores:");
 a= in.nextInt();
 b= in.nextInt();
 c= in.nextInt();
if(a>b && a>c){
System.out.println("maior:" + a);
}else if(b>a && b>c){
System.out.println("maior:" + b);
}else if(c>a && c>b){
System.out.println("maior:" + c);
}
}
}
