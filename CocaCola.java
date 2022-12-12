public class CocaCola extends Estocavel{
    
    public CocaCola(){
        super("Refrigerante Coca-Cola", 5.00);
    }

    @Override
    public void checarEstoque() throws EstoqueInsuficienteException{
        super.checarEstoque(super.getNome(), super.getCocaCola());
    }

    @Override
    public void retirar(){
        try {
            
            this.checarEstoque();

            super.setCocaCola(super.getCocaCola()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }

}
