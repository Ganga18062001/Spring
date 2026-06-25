package dependencyInjectionUsingJavaFileCon;

public class Teacher {

    private String subject;
    private int salary;

    public Teacher(String subject, int salary) {
        this.subject = subject;
        this.salary = salary;
    }

    //using setter method we acchive dependency injection

    //    public String getSubject() {
//        return subject;
//    }
//
//    public void setSubject(String subject) {
//       this. subject = subject;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    public void display(){
//        System.out.println("Salary : "+salary);
//        System.out.println("Subject : "+subject);
//    }
    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                ", salary=" + salary +
                '}';
    }
}
