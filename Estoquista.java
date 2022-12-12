public class Estoquista extends Funcionario {

    public Guardador guardador = new Guardador();

    public Estoquista(String nome, double salario){
        super(nome, salario, "Estoquista");
    }
}
