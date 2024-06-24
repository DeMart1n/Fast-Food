package FastFood;

import FastFood.Acompanhamento.Acompanhamento;
import FastFood.Bebida.Bebida;
import FastFood.Lanche.Lanche;

class Pedido {
    private static int proximoNumero = 1;
    private int numero;
    private Lanche lanche;
    private Acompanhamento acompanhamento;
    private Bebida bebida;

    public Pedido(Lanche lanche, Acompanhamento acompanhamento, Bebida bebida) {
        this.numero = proximoNumero++;
        this.lanche = lanche;
        this.acompanhamento = acompanhamento;
        this.bebida = bebida;
    }

    public int getNumero() {
        return numero;
    }

    public Lanche getLanche() {
        return lanche;
    }

    public Acompanhamento getAcompanhamento() {
        return acompanhamento;
    }

    public Bebida getBebida() {
        return bebida;
    }

    // Calcular preço dos pedidos
    public double calcularTotal() {
        double total = 0.0;

        // Verifica se tem lanche
        if (lanche != null) {
            total += lanche.getPreço();
        } else {
            System.out.println("Atenção: Lanche não foi adicionado ao pedido #" + numero);
            return total;
        }

        // Verifica se tem acompanhamento
        if (acompanhamento != null) {
            total += acompanhamento.getPreco();
        } else {
            System.out.println("Atenção: Acompanhamento não foi adicionado ao pedido #" + numero);
            return total;
        }

        // Verifica se tem bebida
        if (bebida != null) {
            total += bebida.getPreço();
        } else {
            System.out.println("Atenção: Bebida não foi adicionada ao pedido #" + numero);
            return total;
        }

        return total;
    }
}

public static void imprimirPedido(Pedido pedido) {
    System.out.println("----- Pedido #" + pedido.getNumero() + " -----");

    if (pedido.getLanche() != null) {
        System.out.println("Lanche: " + pedido.getLanche().getNome() + " - R$" + pedido.getLanche().getPreco());
    } else {
        System.out.println("Atenção: Lanche não foi adicionado ao pedido #" + pedido.getNumero());
    }

    if (pedido.getAcompanhamento() != null) {
        System.out.println("Acompanhamento: " + pedido.getAcompanhamento().getNome() + " - R$" + pedido.getAcompanhamento().getPreco());
    } else {
        System.out.println("Atenção: Acompanhamento não foi adicionado ao pedido #" + pedido.getNumero());
    }

    if (pedido.getBebida() != null) {
        System.out.println("Bebida: " + pedido.getBebida().getNome() + " - R$" + pedido.getBebida().getPreco());
    } else {
        System.out.println("Atenção: Bebida não foi adicionada ao pedido #" + pedido.getNumero());
    }

    double total = pedido.calcularTotal();
    if (total > 0.0) {
        System.out.println("Total: R$" + total);
    } else {
        System.out.println("Total não disponível devido a itens ausentes.");
    }

    System.out.println("-------------------------");
}
}