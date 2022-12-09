public class XBrasileirao extends Estocavel{

    public XBrasileirao(){
        super("X-Brasileirão", 35.00);
        this.retirar();
    }

    @Override
    public void retirar(){
        try {
            
            checarEstoque(super.getNome(), super.getPao(), super.getQueijo(), super.getCarne(), super.getBacon(), super.getCebola(), super.getTomate(), super.getAlface(), super.getOvo(), super.getBarbecue(), super.getCheddar(), super.getAlho());

            super.setPao(super.getPao()-1);
            super.setQueijo(super.getQueijo()-1);
            super.setCarne(super.getCarne()-1);
            super.setBacon(super.getBacon()-1);
            super.setCebola(super.getCebola()-1);
            super.setTomate(super.getTomate()-1);
            super.setAlface(super.getAlface()-1);
            super.setOvo(super.getOvo()-1);
            super.setBarbecue(super.getBarbecue()-1);
            super.setCheddar(super.getCheddar()-1);
            super.setAlho(super.getAlho()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }
}
