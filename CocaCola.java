public class CocaCola extends Estocavel{
    
    public CocaCola(){
        super("Refrigerante Coca-Cola", 5.00);
        this.retirar();
    }

    @Override
    public void retirar(){
        try {
            
            checarEstoque(super.getNome(), super.getCocaCola());

            super.setCocaCola(super.getCocaCola()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }

}
