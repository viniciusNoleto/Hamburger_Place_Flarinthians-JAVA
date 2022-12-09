public class XBotaFogo extends Estocavel{

    public XBotaFogo(){
        super("X-Bota Fogo", 15.00);
        this.retirar();
    }

    @Override
    public void retirar(){
        try {
            
            checarEstoque(super.getNome(), super.getPao(), super.getQueijo(), super.getCarne());

            super.setPao(super.getPao()-1);
            super.setQueijo(super.getQueijo()-1);
            super.setCarne(super.getCarne()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }
}
