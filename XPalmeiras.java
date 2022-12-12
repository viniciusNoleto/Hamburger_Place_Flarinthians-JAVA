public class XPalmeiras extends Estocavel{

    public XPalmeiras(){
        super("X-Palmeiras", 35.00);
    }

    @Override
    public void checarEstoque() throws EstoqueInsuficienteException{
        super.checarEstoque(super.getNome(), super.getPao(), super.getQueijo(), super.getBacon());
    }

    @Override
    public void retirar(){
        try {
            
            this.checarEstoque();

            super.setPao(super.getPao()-1);
            super.setQueijo(super.getQueijo()-1);
            super.setBacon(super.getBacon()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }
}