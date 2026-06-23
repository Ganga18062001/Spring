package usingAnnotationWithJavaConfigFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import resourcesJavaConfig.SpringConfig;

public class MainClass {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Student1 bean = context.getBean(Student1.class);
        bean.display();

    }
}
