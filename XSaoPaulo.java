public class XSaoPaulo extends Estocavel{

    public XSaoPaulo(){
        super("X-São Paulo", 22.00);
        this.retirar();
    }

    @Override
    public void retirar(){
        try {
            
            checarEstoque(super.getNome(), super.getPao(), super.getQueijo(), super.getCebola(), super.getTomate(), super.getAlface());

            super.setPao(super.getPao()-1);
            super.setQueijo(super.getQueijo()-1);
            super.setCebola(super.getCebola()-1);
            super.setTomate(super.getTomate()-1);
            super.setAlface(super.getAlface()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }
}
