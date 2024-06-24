package FastFood.Lanche;

public class Lanche {
    private int id;
    private String nome;
    private String descricao;
    private int preço;

    public Lanche(int id, String nome, String descricao, int preço) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preço = preço;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getPreço() {
        return preço;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }
}
