package annotationBasedUsingXmlCon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        String resouces_file_path = "applicationContext.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student std = (Student) context.getBean(Student.class);
        std.display();
    }
}
