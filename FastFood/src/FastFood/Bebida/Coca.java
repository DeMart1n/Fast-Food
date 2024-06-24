package FastFood.Bebida;

/**
 * A classe Coca representa uma bebida específica, Coca-Cola.
 */
public class Coca extends Bebida {

    /**
     * Constrói um novo objeto Coca com os valores especificados.
     *
     * @param nome   O nome da Coca-Cola.
     * @param id     O identificador único da Coca-Cola.
     * @param preço  O preço da Coca-Cola.
     */
    public Coca(String nome, int id, double preço) {
        super(nome, id, preço);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getNome() {
        return super.getNome();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getId() {
        return super.getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setId(int id) {
        super.setId(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getPreço() {
        return super.getPreço();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setPreço(double preço) {
        super.setPreço(preço);
    }
}
