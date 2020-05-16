
package exe02;

public class cliente extends Pessoa {
    private double valorDivida;
    private int anoNascim;
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("valor da divida: "+getValorDivida());
        System.out.println("ano de nascimento: "+getAnoNascim());
    }
    
    public cliente(){
        super();
    }
    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascim() {
        return anoNascim;
    }

    public void setAnoNascim(int anoNascim) {
        this.anoNascim = anoNascim;
    }

    @Override
    public String toString() {
        return "cliente{" + "valorDivida=" + valorDivida + ", anoNascim=" + anoNascim + '}';
    }
    
    
    
}
