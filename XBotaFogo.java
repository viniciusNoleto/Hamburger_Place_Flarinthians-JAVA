public class XBotaFogo extends Estocavel{

    public XBotaFogo(){
        super("X-Bota Fogo", 15.00);
    }

    @Override
    public void checarEstoque() throws EstoqueInsuficienteException{
        super.checarEstoque(super.getNome(), super.getPao(), super.getQueijo(), super.getCarne());
    }

    @Override
    public void retirar(){
        try {
            
            this.checarEstoque();

            super.setPao(super.getPao()-1);
            super.setQueijo(super.getQueijo()-1);
            super.setCarne(super.getCarne()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }
}
