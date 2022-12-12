public class SucoDeLaranja extends Estocavel{
    
    public SucoDeLaranja(){
        super("Suco de Laranja", 4.00);
    }

    @Override
    public void checarEstoque() throws EstoqueInsuficienteException{
        super.checarEstoque(super.getNome(), super.getSucoDeLaranja());
    }

    @Override
    public void retirar(){
        try {
            
            this.checarEstoque();

            super.setSucoDeLaranja(super.getSucoDeLaranja()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }

}
