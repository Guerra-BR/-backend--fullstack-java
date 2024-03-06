import javax.persistence.*;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto {

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_codigo")
    @SequenceGenerator(name = "seq_codigo", sequenceName = "sq_produto", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "CODIGO", nullable = false, unique = true, length = 10)
    private String codigo;

    @Column(name = "VALOR", nullable = false, unique = false)
    private Double valor;
}