import java.util.Scanner;
public class SalarioBonus{
public static void main(String[] args) 
Scanner in = new Scanner (System.in);
double salario; 
double ganho;
System.out.println("digite seu salario:");
double salario = in.nextDouble();
System.out.println("digite quanto voceh vende:");
double ganho = in.nextDouble();
salario=(ganho*0.15);
System.out.println("seu salario eh =" +salario);
}
}