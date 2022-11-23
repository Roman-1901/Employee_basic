public class Employee {
    private final String name;
    private final String surName;
    private final String fatherName;
    private int department;
    private double salary;
    private static int counter = 0;
    private final int id;

    public Employee(String name, String surName, String fatherName, int department, double salary) {
        counter++;
        id = counter;
        this.name = name;
        this.surName = surName;
        this.fatherName = fatherName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public  String getFatherName() {
        return fatherName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id сотрудника: " + id + ", ФИО: " + surName + " " + name + " " + fatherName +
                ", Зарплата: " + String.format("%.2f", salary) + "руб. Отдел: " + department;
    }

    public String toStringWithoutDepartment() {
        return "id сотрудника: " + id + ", ФИО: " + surName + " " + name + " " + fatherName +
                ", Зарплата: " + String.format("%.2f", salary) + "руб.";
    }
}
