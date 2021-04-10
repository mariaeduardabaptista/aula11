

public class Funcionario extends Pessoa{
    public String ctps;
    public double salario;


    @Override
    public String cumprimentar() {
        return "\nOla funcionario";
    }
    
}
