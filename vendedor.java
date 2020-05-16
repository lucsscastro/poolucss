
package exe02;

public class vendedor extends Empregado{
    private double valorVendas;
    private int qntVendas;

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    @Override
       public void imprimir(){
           super.imprimir();
           System.out.println("qual eh o valor venda: "+getValorVendas());
           
       }
    public vendedor() {
        super();
    }
    
    
    public int getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }
    
    
}
