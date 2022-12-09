public class EstoqueInsuficienteException extends Exception{
    public EstoqueInsuficienteException(String produto){
        super("Insumo insuficiente entregar o produto: " + produto);
    }
}
