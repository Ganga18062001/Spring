package dependencyInjectionUsingAnnotationBasedCOnf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("101")
    private int rollno;
    @Value("ram")
    private String name;
    @Autowired
    private Address address;

//    public Student(int rollno, String name, Address address) {
//        this.rollno = rollno;
//        this.name = name;
//        this.address = address;
//    }

        public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        System.out.println("setter method pf setRollno");

        this.rollno = rollno;
    }

    public String getName() {


        return name;
    }

    public void setName(String name) {
        System.out.println("setter method pf setName");

        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {

        System.out.println("setter method pf setAddress");
        this.address = address;
    }
    public void display(){
        System.out.println("Rollno : "+rollno);
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);

    }
}
