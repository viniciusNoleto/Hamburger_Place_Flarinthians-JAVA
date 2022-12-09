public class XPalmeiras extends Estocavel{

    public XPalmeiras(){
        super("X-Palmeiras", 35.00);
        this.retirar();
    }

    @Override
    public void retirar(){
        try {
            
            checarEstoque(super.getNome(), super.getPao(), super.getQueijo(), super.getBacon());

            super.setPao(super.getPao()-1);
            super.setQueijo(super.getQueijo()-1);
            super.setBacon(super.getBacon()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }
}