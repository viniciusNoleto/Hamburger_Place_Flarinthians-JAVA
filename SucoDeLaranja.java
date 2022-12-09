public class SucoDeLaranja extends Estocavel{
    
    public SucoDeLaranja(){
        super("Suco de Laranja", 4.00);
        this.retirar();
    }

    @Override
    public void retirar(){
        try {
            
            checarEstoque(super.getNome(), super.getSucoDeLaranja());

            super.setSucoDeLaranja(super.getSucoDeLaranja()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }

}
