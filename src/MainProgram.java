import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Роман", "Николаев", "Сергеевич", 1, 100000);
        employee[1] = new Employee("Василий", "Макаров", "Геннадиевич", 2, 95000);
        employee[2] = new Employee("Наталья", "Хвостова", "Владимировна", 3, 100000);
        employee[3] = new Employee("Денис", "Подгурский", "Иванович", 3, 90000);
        employee[4] = new Employee("Ирина", "Подольская", "Петровна", 4, 90000);
        employee[5] = new Employee("Иван", "Самохин", "Васильевич", 4, 85000);
        employee[6] = new Employee("Ирина", "Игнатова", "Сергеевна", 1, 90000);
        employee[7] = new Employee("Сергей", "Панкратов", "Николевич", 5, 100000);
        employee[8] = new Employee("Ольга", "Шамаева", "Вадимовна", 5, 85000);
        employee[9] = new Employee("Галина", "Кирьянова", "Дмитриевна", 2, 85000);


        Scanner sc = new Scanner(System.in);
        System.out.println("Базовая сложность");
        System.out.println("Получить список всех сотрудников со всеми имеющимися по ним данными - 1");
        System.out.println("Посчитать сумму затрат на зарплаты в месяц - 2");
        System.out.println("Сотрудники с минимальной зарплатой - 3");
        System.out.println("Сотрудники с максимальной зарплатой - 4");
        System.out.println("Среднее значение зарплат - 5");
        System.out.println("Ф. И. О. всех сотрудников - 6");
        System.out.println(" ");
        System.out.println("Повышенная сложность");
        System.out.println("Проиндексировать зарплату всех сотрудников - 7");
        System.out.println("Сотрудники с минимальной зарплатой по отделу - 8");
        System.out.println("Сотрудники с максимальной зарплатой по отделу - 9");
        System.out.println("Сумма затрат на зарплату по отделу - 10");
        System.out.println("Средняя зарплата по отделу - 11");
        System.out.println("Индексация всех сотрудников отдела - 12");
        System.out.println("Все сотрудники отдела - 13");
        System.out.println("Сравнение зарплаты сотрудников с произвольным числом - 14");
        int num = sc.nextInt();
        Methods getInformation = new Methods();
        switch (num) {
            case 1:
                getInformation.informationOfEmployees(employee);
                break;
            case 2:
                getInformation.sumOfMonth(employee);
                break;
            case 3:
                getInformation.minSalary(employee);
                break;
            case 4:
                getInformation.maxSalary(employee);
                break;
            case 5:
                getInformation.avgSalary(employee);
                break;
            case 6:
                getInformation.allFullNames(employee);
                break;
            case 7:
                getInformation.indexInput();
                    getInformation.indexOfSalary(employee, sc.nextDouble());
                getInformation.indexFinish();
                    if (sc.nextInt() == 1) {
                        getInformation.informationOfEmployees(employee);
                    }
                break;
            case 8:
                getInformation.departmentInput();
                getInformation.minSalaryByDepartment(employee, sc.nextInt());
                break;
            case 9:
                getInformation.departmentInput();
                getInformation.maxSalaryByDepartment(employee, sc.nextInt());
                break;
            case 10:
                getInformation.departmentInput();
                getInformation.sumByDepartment(employee, sc.nextInt());
                break;
            case 11:
                getInformation.departmentInput();
                getInformation.avgByDepartment(employee, sc.nextInt());
                break;
            case 12:
                getInformation.departmentInput();
                int departmentNum = sc.nextInt();
                getInformation.indexInput();
                double indexSalary = sc.nextDouble();
                getInformation.indexByDepartment(employee,departmentNum,indexSalary);
                getInformation.indexFinish();
                if (sc.nextInt() == 1) {
                    getInformation.employeesByDepartment(employee, departmentNum);
                }
                break;
            case 13:
                getInformation.departmentInput();
                getInformation.employeesByDepartment(employee, sc.nextInt());
                break;
            case 14:
                getInformation.numInput();
                getInformation.numEqual(employee,sc.nextInt());
                break;
            default:
                break;
        }
    }
}
