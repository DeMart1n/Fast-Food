package FastFood.Acompanhamento;

/**
 * A classe Batata representa um tipo específico de Acompanhamento.
 */
public class Batata extends Acompanhamento {

    /**
     * Constrói um novo objeto Batata com os valores especificados.
     *
     * @param nome      O nome da batata.
     * @param descricao A descrição da batata.
     * @param id        O identificador único da batata.
     * @param tamanho   O tamanho da batata.
     * @param preco     O preço da batata.
     */
    public Batata(String nome, String descricao, int id, String tamanho, double preco) {
        super(nome, descricao, id, tamanho, preco);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao();
    }

    @Override
    public void setDescricao(String descricao) {
        super.setDescricao(descricao);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getTamanho() {
        return super.getTamanho();
    }

    @Override
    public void setTamanho(String tamanho) {
        super.setTamanho(tamanho);
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }

    @Override
    public void setPreco(double preco) {
        super.setPreco(preco);
    }
}
