package exe02;
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    
    public void imprimir(){
        System.out.println("nome: "+getNome());
        System.out.println("idade: "+getIdade());
        System.out.println("sexo: "+getSexo());
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

  
}
