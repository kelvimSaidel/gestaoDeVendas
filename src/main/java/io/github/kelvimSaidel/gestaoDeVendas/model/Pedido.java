package io.github.kelvimSaidel.gestaoDeVendas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Entity
@Data
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    @NonNull
    private Cliente cliente;

    private List<ItemPedido> itemPedido;

    public Pedido (Cliente cliente, List<ItemPedido> itemPedido) {
        this.cliente = cliente;
        this.itemPedido = itemPedido;
    }


    public Pedido (Cliente cliente) {
        this.cliente = cliente;
    }


}
