package resourcesJavaConfig;

import autoWiring.Address;
import autoWiring.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigAutowiring {

    @Bean
    public Address createAddrObj(){

        Address add = new Address();
        add.setHouseno(100);
        add.setCity("Parbhani");
        add.setPincode(431405);

        return add;
    }

    @Bean
    public Student createStuObj(Address address){

        Student st = new Student();
        st.setName("rani");
        st.setRollno(52);
        //st.setAddress(address);  ------aoutowiring

        return st;
    }
}
