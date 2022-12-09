public class Cliente {

    private String nome;
    private double dinheiro;
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
    
    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public double getDinheiro() {
        return this.dinheiro;
    }

    public Cliente(String nome, double dinheiro) {
        this.nome = nome;
        this.dinheiro = dinheiro;
    }

}
