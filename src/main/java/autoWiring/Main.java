package autoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import resourcesJavaConfig.SpringConfigAutowiring;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigAutowiring.class);

        Student bean = context.getBean(Student.class);

        bean.display();

    }
}
