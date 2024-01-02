import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD})
public @interface Tabela {
    String value();
}
