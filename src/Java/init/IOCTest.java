package init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);

    }
}
