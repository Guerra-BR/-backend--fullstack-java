import java.lang.annotation.Documented;
import java.lang.reflect.Field;

public class Main {


    public static void main(String[] args) {
        Class clazz = ClassRandom.class;

        Field[] fs = clazz.getDeclaredFields();

        for(Field f: fs){
            if (f.isAnnotationPresent(Tabela.class)){
                String nomeTabela = f.getAnnotation(Tabela.class).value();
                System.out.println(nomeTabela);
                break;
            }
        }
    }
}