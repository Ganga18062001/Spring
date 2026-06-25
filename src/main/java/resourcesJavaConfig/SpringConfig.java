package resourcesJavaConfig;

import dependencyInjectionUsingJavaFileCon.College;
import dependencyInjectionUsingJavaFileCon.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Teacher createObjTea(){

        Teacher tea = new Teacher("math",121);

//        tea.setSalary(25500);
//        tea.setSubject("Math");

        return tea;
    }

@Bean
    public College createCollObj(Teacher teacher){

        College co = new College("snndt","IT",createObjTea());

//        co.setName("SNDT");
//        co.setDepartment("Computer");
//        co.setTeacher(teacher);

        return co;
    }






}
