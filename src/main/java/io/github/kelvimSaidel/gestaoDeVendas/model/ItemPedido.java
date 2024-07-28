package io.github.kelvimSaidel.gestaoDeVendas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;
import org.springframework.objenesis.instantiator.perc.PercInstantiator;

import java.util.List;

@Entity
@Data
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    private Pedido pedido;

    @NonNull
    private List<Produto> produto;

    public ItemPedido (Pedido pedido, List<Produto> produto) {
        this.pedido = pedido;
        this.produto = produto;
    }


}
