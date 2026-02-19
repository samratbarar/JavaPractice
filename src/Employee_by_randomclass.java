class Employee {
    int salary;
    String name;
public int getSalary() {
    return salary;
}
public String getName() {
    return name;
}
public void setname(String n) {
    name = n;
}
}
public class Employee_by_randomclass {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.salary = 20000000;
        e.name = "samrat";
        e.setname("Samrat Barar");
        System.out.println(e.getName());
        System.out.println(e.getSalary());
        System.out.println(e.salary);
    }
}
