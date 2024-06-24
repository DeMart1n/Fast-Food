package FastFood.Acompanhamento;

/**
 * A classe Acompanhamento representa um acompanhamento em um pedido de fast food.
 * Ela contém atributos como nome, descrição, ID, tamanho e preço do acompanhamento.
 * Além disso, a classe fornece métodos para acessar e modificar esses atributos.
 */
public class Acompanhamento {
    private String nome;
    private String descricao;
    private int id;
    private String tamanho;
    private double preco;

    /**
     * Constrói um novo objeto Acompanhamento com os valores especificados para
     * nome, descricao, id, tamanho e preco.
     *
     * @param nome      O nome do acompanhamento.
     * @param descricao A descrição do acompanhamento.
     * @param id        O identificador único do acompanhamento.
     * @param tamanho   O tamanho do acompanhamento.
     * @param preco     O preço do acompanhamento.
     */
    public Acompanhamento(String nome, String descricao, int id, String tamanho, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.id = id;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    /**
     * Obtém o nome do acompanhamento.
     *
     * @return O nome do acompanhamento.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do acompanhamento.
     *
     * @param nome O novo nome do acompanhamento.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a descrição do acompanhamento.
     *
     * @return A descrição do acompanhamento.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do acompanhamento.
     *
     * @param descricao A nova descrição do acompanhamento.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém o identificador único do acompanhamento.
     *
     * @return O identificador único do acompanhamento.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o identificador único do acompanhamento.
     *
     * @param id O novo identificador único do acompanhamento.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o tamanho do acompanhamento.
     *
     * @return O tamanho do acompanhamento.
     */
    public String getTamanho() {
        return tamanho;
    }

    /**
     * Define o tamanho do acompanhamento.
     *
     * @param tamanho O novo tamanho do acompanhamento.
     */
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * Obtém o preço do acompanhamento.
     *
     * @return O preço do acompanhamento.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o preço do acompanhamento.
     *
     * @param preco O novo preço do acompanhamento.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
