import java.util.Scanner;
public class SalarioMin{
public static void main(Scanner[] args){
Scanner in = new Scanner(System.in);
int numero;
double horas;
double recebe;
double calculo;
System.out.println("Digite seu numero");
numero = in.nextInt;
System.out.println("Digite quantas horas voceh trabalha");
horas = in.nextDouble;
System.out.println("Quanto voceh recebe por hora trabalhada");
recebe = in.nextDouble;
calculo=horas*recebe;
System.out.println("o numero do funcionario eh: "+numero);
System.out.println("Salario=%.2f"+calculo);
}
}