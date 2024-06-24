package FastFood.Bebida;

/**
 * A classe Fanta representa uma bebida específica, Fanta.
 */
public class Fanta extends Bebida {

    /**
     * Constrói um novo objeto Fanta com os valores especificados.
     *
     * @param nome   O nome da Fanta.
     * @param id     O identificador único da Fanta.
     * @param preço  O preço da Fanta.
     */
    public Fanta(String nome, int id, double preço) {
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
