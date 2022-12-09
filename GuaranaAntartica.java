public class GuaranaAntartica extends Estocavel{
    
    public GuaranaAntartica(){
        super("Refrigerante Coca-Cola", 5.00);
        this.retirar();
    }

    @Override
    public void retirar(){
        try {
            
            checarEstoque(super.getNome(), super.getGuaranaAntartica());

            super.setGuaranaAntartica(super.getGuaranaAntartica()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }

}
