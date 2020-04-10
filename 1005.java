import java.util.Scanner{
public class PrimeiraMedia{
public static void main(Scanner[] args){
Scanner in = new Scanner (System.in);
int a;
int b;
int media;
System.out.println("digite sua primeira nota:");
a = in.nextInt();
System.out.println("Digite sua segunda nota:");
b = in.nextInt();
media=((a*3.5)+(b*7.5));
System.out.println("A media é de:"+media);
}
}