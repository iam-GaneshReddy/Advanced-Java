package Youtube.abhishekverma.Multithreading.demo1;

public class Employee {
    private int id;
    private String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + name + "]";
    }


    public static interface EmployeeRepository  {
        public void displayEmployees();
    }
}
