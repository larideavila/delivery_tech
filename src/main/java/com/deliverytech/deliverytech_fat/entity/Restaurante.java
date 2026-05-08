package com.deliverytech.deliverytech_fat.entity;
 
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String telefone;
    private String endereco;
    private String categoria;
    private boolean ativo;

    @OneToMany(mappedBy = "restaurante")
    private List<Pedido> pedidos;
    
    @OneToMany(mappedBy = "restaurante")
    private List<Produto> produtos;

}
