public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pessoa pessoa1 = new Pessoa("João","123456");   
        Aluno aluno1 = new Aluno("João","123456",25,30,35,90); 

        Pessoa pessoa2 = new Pessoa("Maria","654321");
        Aluno aluno2 = new Aluno("Maria","654321",20,30,40,90);    




        String nome_aluno1 = "João";
        String ra_aluno1 = "123456";

        
        
        int nota1_aluno1 = 25;
        int nota2_aluno1 = 30;  
        int nota3_aluno1 = 35;

        int total_notas_aluno1 = nota1_aluno1 + nota2_aluno1 + nota3_aluno1;


        

        String nome_aluno2 = "Maria";
        String ra_aluno2 = "654321";

        int nota1_aluno2 = 20;
        int nota2_aluno2 = 30;
        int nota3_aluno2 = 40;

        int total_notas_aluno2 = nota1_aluno2 + nota2_aluno2 + nota3_aluno2;

        System.out.println("Aluno: " + nome_aluno1);
        System.out.println("RA: " + ra_aluno1);
        System.out.println("Nota 1: " + nota1_aluno1);
        System.out.println("Nota 2: " + nota2_aluno1);
        System.out.println("Nota 3: " + nota3_aluno1);
        System.out.println("Total de notas: " + total_notas_aluno1);

        System.out.println("Aluno: " + nome_aluno2);
        System.out.println("RA: " + ra_aluno2);
        System.out.println("Nota 1: " + nota1_aluno2);
        System.out.println("Nota 2: " + nota2_aluno2);
        System.out.println("Nota 3: " + nota3_aluno2);
        System.out.println("Total de notas: " + total_notas_aluno2);


    }
}
