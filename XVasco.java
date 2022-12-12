public class XVasco extends Estocavel{

    public XVasco(){
        super("X-Vasco", 20.00);
    }

    @Override
    public void checarEstoque() throws EstoqueInsuficienteException{
        super.checarEstoque(super.getNome(), super.getPao(), super.getQueijo(), super.getCarne(), super.getTomate(), super.getOvo());
    }

    @Override
    public void retirar(){
        try {
            
            this.checarEstoque();

            super.setPao(super.getPao()-1);
            super.setQueijo(super.getQueijo()-1);
            super.setCarne(super.getCarne()-1);
            super.setTomate(super.getTomate()-1);
            super.setOvo(super.getOvo()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }
}
