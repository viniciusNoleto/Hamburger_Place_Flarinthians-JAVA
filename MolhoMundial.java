public class MolhoMundial extends Estocavel{

    public MolhoMundial(){
        super("Molho Libertadores", 0.00);
    }

    @Override
    public void checarEstoque() throws EstoqueInsuficienteException{
        super.checarEstoque(super.getNome(), super.getAlho());
    }

    @Override
    public void retirar(){
        try {
            
            this.checarEstoque();

            super.setAlho(super.getAlho()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }
}
