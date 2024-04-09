public class Aluno {

    private String nomeAluno;
    private String ra_aluno;
    private int total_notas_aluno;
    private int nota1Aluno;
    private int nota2Aluno;
    private int nota3Aluno;


    public Aluno (String nomeAluno, String ra_aluno, int nota1Aluno, int nota2Aluno, int nota3Aluno, int total_notas_aluno) {
        
        this.nomeAluno = nomeAluno;
        this.ra_aluno = ra_aluno;
        this.nota1Aluno = nota1Aluno;
        this.nota2Aluno = nota2Aluno;
        this.nota3Aluno = nota3Aluno;
        this.total_notas_aluno = total_notas_aluno;

    }

    public String apresentacao() {

        return "Nome: " + this.nomeAluno + ", RA: " + this.ra_aluno + ", Nota: " + this.nota1Aluno + ", Nota: " + this.nota2Aluno + ", Nota: " + this.nota3Aluno + ", Total de notas: " + this.total_notas_aluno;

        
    }
}




