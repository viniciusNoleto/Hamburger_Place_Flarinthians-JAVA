public class MolhoMundial extends Estocavel{

    public MolhoMundial(){
        super("Molho Libertadores", 0.00);
        this.retirar();
    }

    @Override
    public void retirar(){
        try {
            
            checarEstoque(super.getNome(), super.getAlho());

            super.setAlho(super.getAlho()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }
}
