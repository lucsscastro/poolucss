
package exe02;

public class Gerente extends Empregado{
    private String nomeGerencia;

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("nome da sua gerencia: "+getNomeGerencia());
    }
    
    public Gerente() {
        super();
    }
    
    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }  
}
