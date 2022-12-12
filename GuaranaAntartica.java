public class GuaranaAntartica extends Estocavel{
    
    public GuaranaAntartica(){
        super("Refrigerante Coca-Cola", 5.00);
    }

    @Override
    public void checarEstoque() throws EstoqueInsuficienteException{
        super.checarEstoque(super.getNome(), super.getGuaranaAntartica());
    }

    @Override
    public void retirar(){
        try {
            
            this.checarEstoque();

            super.setGuaranaAntartica(super.getGuaranaAntartica()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }

}
