public class Aluno {

    private String nomeAluno;
    private String raAluno;
    private int nota1Aluno;
    private int nota2Aluno;
    private int nota3Aluno;
    private int totalNotasAluno;


    public Aluno(String nomeAluno, String raAluno, int nota1Aluno, int nota2Aluno, int nota3Aluno) {
        this.nomeAluno = nomeAluno; 
        this.raAluno = raAluno;
        this.nota1Aluno = nota1Aluno;
        this.nota2Aluno = nota2Aluno;
        this.nota3Aluno = nota3Aluno;
        calcularTotalNotas();
    }

    // Método privado para calcular o total das notas
    private void calcularTotalNotas() {
        totalNotasAluno = nota1Aluno + nota2Aluno + nota3Aluno;
    }

    // Método para apresentar informações do aluno
    public String apresentar() {
        return  "- Aluno: " + this.nomeAluno + "\n" +
                "- RA: " + this.raAluno + "\n" +
                "- Nota 1: " + this.nota1Aluno + "\n" +
                "- Nota 2: " + this.nota2Aluno + "\n" +
                "- Nota 3: " + this.nota3Aluno + "\n" +
                "- Total de notas: " + this.totalNotasAluno + "\n";
    }
}