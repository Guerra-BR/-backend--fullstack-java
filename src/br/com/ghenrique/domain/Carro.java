package br.com.ghenrique.domain;

import org.hibernate.annotations.Columns;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_CARRO")
public class Carro {
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "TB_CARRO_ACESSORIO",
            joinColumns = @JoinColumn(name = "id_aluno_fk"),
            inverseJoinColumns = @JoinColumn(name = "id_acessorio_fk")
    )
    private List<Acessorio> acessorios;

    @OneToMany(mappedBy = "carros")
    private Marca marca;

    @Column(name = "modelo", nullable = false)
    private String modelo;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_codigo_carro")
    @SequenceGenerator(name = "seq_codigo_carro", sequenceName = "sq_carro", initialValue = 1, allocationSize = 1)
    private String codigo_serial;
}
