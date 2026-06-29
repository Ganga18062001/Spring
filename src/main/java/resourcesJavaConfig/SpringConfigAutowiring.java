package resourcesJavaConfig;

import autoWiring.Address;
import autoWiring.Student;
import autoWiring.Subject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SpringConfigAutowiring {

    @Bean
    @Primary
    public Address createAddrObj1(){

        Address add = new Address();
        add.setHouseno(100);
        add.setCity("Parbhani");
        add.setPincode(431405);

        return add;
    }
    @Bean
   // @Primary
    public Address createAddrObj2(){

        Address add = new Address();
        add.setHouseno(200);
        add.setCity("pune");
        add.setPincode(431400);

        return add;
    }

    @Bean
    public Student createStuObj(){

        Student st = new Student();
        st.setName("rani");
        st.setRollno(52);
        //st.setAddress(address);  ------aoutowiring
       // st.setSubject(createSubject());----aiutoWired

        return st;
    }

    @Bean
    public Subject createSubject(){

        Subject sb = new Subject();

        List<String> list = new ArrayList<>();

        list.add("math");
        list.add("english");
        list.add("Java");
        list.add("Python");
        sb.setGetSubject(list);

        return sb;
    }
}
