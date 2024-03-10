package br.com.ghenrique.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_ACESSORIO")
public class Acessorio {
    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "CODIGO", nullable = false)
    private String codigo;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_codigo_acessorio")
    @SequenceGenerator(name = "seq_codigo_acessorio", sequenceName = "sq_acessorio", initialValue = 1, allocationSize = 1)
    private Long codigoSerial;

    @ManyToMany(mappedBy = "acessorios")
    private List<Carro> carros;
}
