public class MolhoLibertadores extends Estocavel{

    public MolhoLibertadores(){
        super("Molho Libertadores", 0.00);
    }

    @Override
    public void checarEstoque() throws EstoqueInsuficienteException{
        super.checarEstoque(super.getNome(), super.getBarbecue());
    }

    @Override
    public void retirar(){
        try {
            
            this.checarEstoque();

            super.setBarbecue(super.getBarbecue()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }
}
