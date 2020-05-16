
package principal;

public class Principal {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Peixe a2 = new Peixe();
        Cachorro a3 = new Cachorro();
        
        a1.setNome("animal");
        a2.setNome("Peixe");
        a3.setNome("Cachorro");
        
        a1.setPeso(5);
        a2.setPeso(3);
        a3.setPeso(10);
        
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        
        
        
    }
    
}
