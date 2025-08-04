public class Employee {

    private String employeeName;
    private String employeeDesignation;
    private double employeeSalary;
    private String employeeDob;
    private String employeeAddress;
    private int age;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public void setAge(int age){
        this.age=age;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeDob() {
        return employeeDob;
    }

    public void setEmployeeDob(String employeeDob) {
        this.employeeDob = employeeDob;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Employee(){
        this.employeeName = "Niharika Singh";
        this.employeeDesignation = "Associate Manager";
        this.employeeSalary = 9500000;
        this.employeeDob = "09/01/2022";
        this.employeeAddress = "Uttar Pradesh";
        this.age = 24;
    }

//

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeDesignation='" + employeeDesignation + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeDob='" + employeeDob + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", age=" + age +
                '}';
    }


//    public void displayEmployeeDetails() {
//        System.out.println("EmployeeName :"+employeeName);
//        System.out.println("employeeDesignation :"+employeeDesignation);
//        System.out.println("EmployeeSalary :"+employeeSalary);
//        System.out.println("EmployeeDob :"+employeeDob);
//        System.out.println("EmployeeAddress :"+employeeAddress);

//        System.out.println("Name: "+employeeName+" Designation: "+employeeDesignation);
//    }
}
