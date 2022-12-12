import java.util.ArrayList;

public class Flarinthians {

    ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
    ArrayList<Cozinheiro> cozinheiros = new ArrayList<Cozinheiro>();
    ArrayList<Estoquista> estoquistas = new ArrayList<Estoquista>();
    ArrayList<Atendente> atendentes = new ArrayList<Atendente>();

    Guardador guardador =  new Guardador();

    public Flarinthians(){};

    public ArrayList<Integer> relatorio(){
        ArrayList<Integer> insumos = new ArrayList<Integer>();

        insumos.add(this.guardador.getPao());
        insumos.add(this.guardador.getBacon());
        insumos.add(this.guardador.getCarne());
        insumos.add(this.guardador.getOvo());
        insumos.add(this.guardador.getQueijo());
        insumos.add(this.guardador.getAlface());
        insumos.add(this.guardador.getCebola());
        insumos.add(this.guardador.getTomate());
        insumos.add(this.guardador.getAlho());
        insumos.add(this.guardador.getBarbecue());
        insumos.add(this.guardador.getCheddar());
        insumos.add(this.guardador.getCocaCola());
        insumos.add(this.guardador.getGuaranaAntartica());
        insumos.add(this.guardador.getSucoDeLaranja());

        return insumos;
    }
}
