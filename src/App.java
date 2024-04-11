public class App {
    public static void main(String[] args) throws Exception {
 
     
        // teste git dell
        // teste git dell 2

        Aluno aluno1 = new Aluno("João","123456",25,30,35); 
        Aluno aluno2 = new Aluno("Maria","654321",20,30,40);   
        
        Pessoa pessoa1 = new Pessoa("Joao","123456");
        Pessoa pessoa2 = new Pessoa("Maria", "654321");

        System.out.println(pessoa1.falar());
        System.out.println(pessoa2.falar());


        System.out.println(aluno1.apresentar());
        System.out.println(aluno2.apresentar());

 
    }
}
