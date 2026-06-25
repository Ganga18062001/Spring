package dependencyInjectionUsingAnnotationBasedCOnf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import resourcesJavaConfig.SpringConfig;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student bean = context.getBean(Student.class);
        bean.display();


    }
}
