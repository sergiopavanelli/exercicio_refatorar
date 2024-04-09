public class Aluno {

    private String nomeAluno;
    private String ra_aluno;
    private int nota1Aluno;
    private int nota2Aluno;
    private int nota3Aluno;

    private int total_notas_aluno = (nota1Aluno + nota2Aluno + nota3Aluno);


    public Aluno (String nomeAluno, String ra_aluno, int nota1Aluno, int nota2Aluno, int nota3Aluno, int total_notas_aluno) {
        
        this.nomeAluno = nomeAluno;
        this.ra_aluno = ra_aluno;
        this.nota1Aluno = nota1Aluno;
        this.nota2Aluno = nota2Aluno;
        this.nota3Aluno = nota3Aluno;
        this.total_notas_aluno = total_notas_aluno;

    }

    public String apresentar() {

        return "-- Nome: " + this.nomeAluno + "\n" +
        "- RA: " + this.ra_aluno + "\n" +
        "- Nota 1: " + this.nota1Aluno + "\n" +
        "- Nota 2: " + this.nota2Aluno + "\n" +
        "- Nota 3: " + this.nota3Aluno + "\n" +
        "- Total de notas: " + this.total_notas_aluno;       

        
    }
}




