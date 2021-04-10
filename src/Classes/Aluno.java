public class Aluno extends Pessoa{
    public String matricula;
    public String curso;
    public int periodoAtual;
    @Override
    public String cumprimentar() {
        return "\nOla aluno!!!";
    }
}