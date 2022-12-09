public class MolhoLibertadores extends Estocavel{

    public MolhoLibertadores(){
        super("Molho Libertadores", 0.00);
        this.retirar();
    }

    @Override
    public void retirar(){
        try {
            
            checarEstoque(super.getNome(), super.getBarbecue());

            super.setBarbecue(super.getBarbecue()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }
}
