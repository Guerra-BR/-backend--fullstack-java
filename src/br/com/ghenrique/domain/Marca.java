package br.com.ghenrique.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_MARCA")
public class Marca {
    @Id
    @Column(name = "NOME", nullable = false)
    private String nome;

    @OneToMany
    @JoinColumn(
            name = "id_marca_id",
            foreignKey = @ForeignKey(name = "fk_carro_marca"),
            referencedColumnName = "codigo_serial", nullable = false
    )
    private List<Carro> carros;
}
