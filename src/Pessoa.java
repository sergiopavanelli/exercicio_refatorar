public class Pessoa {
    
    private String nome;
    private String ra;

    public Pessoa (String nome,String ra) {
        this.nome = nome;
        this.ra = ra;
        
    }

    public String falar() {
        return "Oi, eu sou " + nome + " Meu RA é " + ra;
    }

    public String getNome() {
        return nome;
    }
}


