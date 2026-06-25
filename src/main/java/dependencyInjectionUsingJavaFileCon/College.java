package dependencyInjectionUsingJavaFileCon;

public class College {

    private String name;
    private String department ;
    private Teacher teacher;

    public College(String name, String department, Teacher teacher) {
        this.name = name;
        this.department = department;
        this.teacher = teacher;
    }

    //using setter method we acchive dependency injection


//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//    public Teacher getTeacher() {
//        return teacher;
//    }
//
//    public void setTeacher(Teacher teacher) {
//        this.teacher = teacher;
//        }

    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Department : "+department);
        System.out.println("Teacher : "+teacher);
    }
}
