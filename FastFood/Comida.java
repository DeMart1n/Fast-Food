enum TipoLanche{
    MacChicken,
    MacFeliz,
    BigMac
}

enum Acompanhamento{
    batata,
    frango
}

enum Tamanho{
    media,
    grande
}

class Lanche{
    private TipoLanche tipolanche;
    private Acompanhamento acompanhamento;
    private Tamanho tamanho;

    public Lanche(TipoLanche tipolanche, Acompanhamento acompanhamento, Tamanho tamanho){
        this.tipolanche = tipolanche;
        this.acompanhamento = acompanhamento;
        this.tamanho = tamanho;
    }
}