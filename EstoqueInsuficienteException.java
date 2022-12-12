public class EstoqueInsuficienteException extends Exception{
    public EstoqueInsuficienteException(String produto){
        super(": Infelizmente não temos " + produto + " no estoque");
    }
}
