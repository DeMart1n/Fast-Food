package FastFood.Lanche;

public class ChickenMike extends Lanche {

    public ChickenMike(int id, String nome, String descricao, int preço) {
        super(id, nome, descricao, preço);
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
    public int getPreço() {
        return super.getPreço();
    }

    @Override
    public void setPreço(int preço) {
        super.setPreço(preço);
    }
}
