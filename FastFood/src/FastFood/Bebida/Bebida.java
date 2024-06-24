package FastFood.Bebida;

/**
 * A classe Bebida representa uma bebida no sistema de fast food.
 */
public class Bebida {
    private String nome;
    private int id;
    private double preço;

    /**
     * Constrói um novo objeto Bebida com os valores especificados.
     *
     * @param nome   O nome da bebida.
     * @param id     O identificador único da bebida.
     * @param preço  O preço da bebida.
     */
    public Bebida(String nome, int id, double preço) {
        this.nome = nome;
        this.id = id;
        this.preço = preço;
    }

    /**
     * Obtém o nome da bebida.
     *
     * @return O nome da bebida.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da bebida.
     *
     * @param nome O novo nome da bebida.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o identificador único da bebida.
     *
     * @return O identificador único da bebida.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o identificador único da bebida.
     *
     * @param id O novo identificador único da bebida.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o preço da bebida.
     *
     * @return O preço da bebida.
     */
    public double getPreço() {
        return preço;
    }

    /**
     * Define o preço da bebida.
     *
     * @param preço O novo preço da bebida.
     */
    public void setPreço(double preço) {
        this.preço = preço;
    }
}
