public class MolhoCariocao extends Estocavel{

    public MolhoCariocao(){
        super("Molho Libertadores", 0.00);
        this.retirar();
    }

    @Override
    public void retirar(){
        try {
            
            checarEstoque(super.getNome(), super.getCheddar());

            super.setCheddar(super.getCheddar()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }
}
