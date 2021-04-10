public class Programa{

    public static void main(String[] args) {
    Pessoa pessoa = new Funcionario();

    pessoa.atribuirDadosPadrao();
    System.out.println(pessoa.cumprimentar());
    

    if (pessoa instanceof Professor){
    ((Professor)pessoa).disciplina = "ooo";
    ((Professor)pessoa).totalTrabMensal = 9;
    ((Professor)pessoa).salario = 1000;
    System.out.printf("\n%s é professor na instituicao e ganha %.2f.2   1' ", pessoa.nome,((Professor)pessoa).salario);

    }else 
    if (pessoa instanceof Aluno){
        ((Aluno)pessoa).curso = "medicina";
        ((Aluno)pessoa).matricula = "1234";
        ((Aluno)pessoa).periodoAtual = 2;
        System.out.printf("\n%s é aluno do curso %s e estar no %d° periodo. ", pessoa.nome,((Aluno)pessoa).curso,((Aluno)pessoa).periodoAtual);
    
    }else 
     if (pessoa instanceof Funcionario){
        System.out.printf("\n%s é um funcionario de serviços.  ", pessoa.nome);
    }
}
}