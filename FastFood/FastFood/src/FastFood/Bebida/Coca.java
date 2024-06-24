package FastFood.Bebida;

public class Coca extends Bebida {

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
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
    public double getPreço() {
        return super.getPreço();
    }

    @Override
    public void setPreço(double preço) {
        super.setPreço(preço);
    }

    public Coca(String nome, int id, double preço) {
        super(nome, id, preço);
    }
}
