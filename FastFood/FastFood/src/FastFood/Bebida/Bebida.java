package FastFood.Bebida;

public class Bebida {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public Bebida(String nome, int id, double preço) {
        this.nome = nome;
        this.id = id;
        this.preço = preço;
    }

    private String nome;
    private int id;
    private double preço;
}
