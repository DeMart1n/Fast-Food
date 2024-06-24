package FastFood.Lanche;

/**
 * A classe ChickenMike representa um tipo específico de lanche, Chicken Mike.
 * É uma subclasse de Lanche e herda todos os seus atributos e métodos.
 */
public class ChickenMike extends Lanche {

    /**
     * Constrói um novo objeto ChickenMike com os valores especificados.
     *
     * @param id        O identificador único do Chicken Mike.
     * @param nome      O nome do Chicken Mike.
     * @param descricao A descrição do Chicken Mike.
     * @param preço     O preço do Chicken Mike.
     */
    public ChickenMike(int id, String nome, String descricao, int preço) {
        super(id, nome, descricao, preço);
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
    public String getDescricao() {
        return super.getDescricao();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setDescricao(String descricao) {
        super.setDescricao(descricao);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPreço() {
        return super.getPreço();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setPreço(int preço) {
        super.setPreço(preço);
    }
}
