
package exe02;


public class Empregado extends Pessoa {
   private double salario;
   private String matricula;

   @Override
   public void imprimir(){
       super.imprimir();
       System.out.println("salario: "+getSalario());
       System.out.println("matricula: "+getMatricula());
    
}
    public Empregado() {
        super();
    }

   
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
   
   
}
