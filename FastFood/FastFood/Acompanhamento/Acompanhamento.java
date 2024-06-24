package FastFood.Acompanhamento;

public class Acompanhamento {
    private String nome;
    private String descricao;
    private int id;
    private String tamanho;
    private double preco;

    public Acompanhamento(String nome, String descricao, int id, String tamanho, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.id = id;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
