package exe02;
import java.util.Scanner;
public class Exe02 {

   
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    cliente p1 = new cliente();
    vendedor p2 = new vendedor();
    Gerente p3 = new Gerente();
    
        System.out.println("----------- CLIENTE ---------------");
    p1.setNome(" ricardo");
    System.out.println("digite seu sexo: ");
    p1.setSexo(scan.next());
    p1.setIdade(10);
    p1.setAnoNascim(2000);
    p1.setValorDivida(2000);
    
    System.out.println("----------- VENDEDOR ---------------");
    p2.setNome(" ricao");
     System.out.println("digite seu sexo: ");
    p1.setSexo(scan.next());
    p2.setIdade(10);
    p2.setMatricula("1222");
    p2.setQntVendas(20);
    p2.setValorVendas(30);
    
    System.out.println("----------- GERENTE ---------------");
    p3.setNome("ricado");
    System.out.println("digite seu sexo: ");
    p3.setSexo(scan.next());
    p3.setIdade(10);
    p3.setNomeGerencia(" Gerenciando");
   
    System.out.println("-----------DADOS CLIENTE-------------");
    p1.imprimir();
    System.out.println("--------------------------------------");
    System.out.println("-----------DADOS VENDEDOR-------------");
    p2.imprimir();
    System.out.println("--------------------------------------");
    System.out.println("-----------DADOS GERENTE-------------");
    p3.imprimir();
    System.out.println("--------------------------------------");
    }
    
}
