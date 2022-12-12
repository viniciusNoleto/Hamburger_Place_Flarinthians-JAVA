public class MolhoCariocao extends Estocavel{

    public MolhoCariocao(){
        super("Molho Libertadores", 0.00);
    }

    @Override
    public void checarEstoque() throws EstoqueInsuficienteException{
        super.checarEstoque(super.getNome(), super.getCheddar());
    }    

    @Override
    public void retirar(){
        try {
            
            this.checarEstoque();

            super.setCheddar(super.getCheddar()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }
}
