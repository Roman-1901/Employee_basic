public class MainProgram {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Роман", "Николаев", "Сергеевич", 1, 100000);
        employee[1] = new Employee("Василий", "Макаров", "Геннадиевич", 2, 95000);
        employee[2] = new Employee("Наталья", "Хвостова", "Владимировна", 3, 100000);
        employee[3] = new Employee("Денис", "Подгурский", "Иванович", 2, 90000);
        employee[4] = new Employee("Ирина", "Подольская", "Петровна", 4, 90000);
        employee[5] = new Employee("Иван", "Самохин", "Васильевич", 4, 85000);
        employee[6] = new Employee("Ирина", "Игнатова", "Сергеевна", 1, 90000);
        employee[7] = new Employee("Сергей", "Панкратов", "Николевич", 5, 100000);
        employee[8] = new Employee("Ольга", "Шамаева", "Вадимовна", 5, 85000);
        employee[9] = new Employee("Галина", "Кирьянова", "Дмитриевна", 3, 85000);

        Methods getInformation = new Methods();
        getInformation.informationOfEmployees(employee);
        System.out.println("");
        getInformation.sumOfMonth(employee);
        System.out.println("");
        getInformation.minSalary(employee);
        System.out.println("");
        getInformation.maxSalary(employee);
        System.out.println("");
        getInformation.avgSalary(employee);
        System.out.println("");
        getInformation.allFullNames(employee);
    }
}
