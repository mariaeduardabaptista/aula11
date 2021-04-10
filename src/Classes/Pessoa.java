

public abstract class Pessoa {
    public String nome;
    public String telefone;
    public String cpf;

    public abstract String cumprimentar();


    public void atribuirDadosPadrao(){
        this.nome = "Maria";
        this.telefone = "122234";
        this.cpf = "12233455677";
    }
}
