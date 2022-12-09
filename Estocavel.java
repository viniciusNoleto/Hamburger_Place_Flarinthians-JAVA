public abstract class Estocavel implements Retiravel{

    // ATRIBUTOS

    // Insumos no estoque
    private static int carne = 0;
    private static int pao = 0;
    private static int queijo = 0;
    private static int bacon = 0;
    private static int cebola = 0;
    private static int tomate = 0;
    private static int ovo = 0;
    private static int alface = 0;
    private static int barbecue = 0;
    private static int cheddar = 0;
    private static int alho = 0;
    private static int cocaCola = 0;
    private static int guaranaAntartica = 0;
    private static int sucoDeLaranja = 0;

    // Características do Estocável
    private String nome;
    private double valor;


    // MÉTODOS

    // Métodos de encapsulamento
    public void setCarne(int carne) {
        Estocavel.carne = carne;
    }

    public int getCarne() {
        return Estocavel.carne;
    }
    
    public void setPao(int pao) {
        Estocavel.pao = pao;
    }

    public int getPao() {
        return Estocavel.pao;
    }
    
    public void setQueijo(int queijo) {
        Estocavel.queijo = queijo;
    }

    public int getQueijo() {
        return Estocavel.queijo;
    }
    
    public void setBacon(int bacon) {
        Estocavel.bacon = bacon;
    }

    public int getBacon() {
        return Estocavel.bacon;
    }
    
    public void setCebola(int cebola) {
        Estocavel.cebola = cebola;
    }

    public int getCebola() {
        return Estocavel.cebola;
    }
    
    public void setTomate(int tomate) {
        Estocavel.tomate = tomate;
    }

    public int getTomate() {
        return Estocavel.tomate;
    }
    
    public void setOvo(int ovo) {
        Estocavel.ovo = ovo;
    }

    public int getOvo() {
        return Estocavel.ovo;
    }
    
    public void setAlface(int alface) {
        Estocavel.alface = alface;
    }

    public int getAlface() {
        return Estocavel.alface;
    }
    
    public void setBarbecue(int barbecue) {
        Estocavel.barbecue = barbecue;
    }

    public int getBarbecue() {
        return Estocavel.barbecue;
    }
    
    public void setCheddar(int cheddar) {
        Estocavel.cheddar = cheddar;
    }

    public int getCheddar() {
        return Estocavel.cheddar;
    }
    
    public void setAlho(int alho) {
        Estocavel.alho = alho;
    }

    public int getAlho() {
        return Estocavel.alho;
    }
    
    public void setCocaCola(int cocaCola) {
        Estocavel.cocaCola = cocaCola;
    }

    public int getCocaCola() {
        return Estocavel.cocaCola;
    }
    
    public void setGuaranaAntartica(int guaranaAntartica) {
        Estocavel.guaranaAntartica = guaranaAntartica;
    }

    public int getGuaranaAntartica() {
        return Estocavel.guaranaAntartica;
    }
    
    public void setSucoDeLaranja(int sucoDeLaranja) {
        Estocavel.sucoDeLaranja = sucoDeLaranja;
    }

    public int getSucoDeLaranja() {
        return Estocavel.sucoDeLaranja;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    // Métodos de Controle
    public void checarEstoque(String produto ,int ...insumos) throws EstoqueInsuficienteException{
        int errors = 0;
        for (int i = 0; i < insumos.length; i++) {
            if(insumos[i] - 1 < 0){
                errors++;
            }
        }

        if(errors > 0){
            throw new EstoqueInsuficienteException(produto);
        }
    }

    // CONSTRUTORES
    public Estocavel(int carne, int pao, int queijo, int bacon, int cebola, int tomate, int ovo, int alface, int barbecue, int cheddar, int alho, int cocaCola, int guaranaAntartica, int sucoDeLaranja) {
        Estocavel.carne = carne;
        Estocavel.pao = pao;
        Estocavel.queijo = queijo;
        Estocavel.bacon = bacon;
        Estocavel.cebola = cebola;
        Estocavel.tomate = tomate;
        Estocavel.ovo = ovo;
        Estocavel.alface = alface;
        Estocavel.barbecue = barbecue;
        Estocavel.cheddar = cheddar;
        Estocavel.alho = alho;
        Estocavel.cocaCola = cocaCola;
        Estocavel.guaranaAntartica = guaranaAntartica;
        Estocavel.sucoDeLaranja = sucoDeLaranja;
    }

    public Estocavel(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

}
