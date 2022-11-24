import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Employee[] employee = new Employee[15];
        employee[0] = new Employee("Роман", "Николаев", "Сергеевич", 1, 100000);
        employee[1] = new Employee("Василий", "Макаров", "Геннадиевич", 2, 95000);
        employee[2] = new Employee("Наталья", "Хвостова", "Владимировна", 3, 100000);
        employee[3] = new Employee("Денис", "Подгурский", "Иванович", 3, 90000);
        employee[4] = new Employee("Ирина", "Подольская", "Петровна", 4, 90000);
        employee[5] = new Employee("Иван", "Самохин", "Васильевич", 4, 90000);
        employee[6] = new Employee("Ирина", "Игнатова", "Сергеевна", 1, 90000);
        employee[7] = new Employee("Сергей", "Панкратов", "Николевич", 5, 100000);
        employee[8] = new Employee("Ольга", "Шамаева", "Вадимовна", 5, 80000);
        employee[9] = new Employee("Галина", "Кирьянова", "Дмитриевна", 2, 85000);
        employee[10] = new Employee("Андрей", "Грузинов", "Николаевич", 4, 80000);
        employee[11] = new Employee("Валентина", "Петрова", "Сергеевна", 1, 80000);
        employee[12] = new Employee("Евгений", "Беседин", "Андреевич", 5, 95000);
        employee[13] = new Employee("Дмитрий", "Тимошенко", "Анатолеьвич", 5, 80000);
        employee[14] = new Employee("Надежда", "Семенова", "Викторовна", 2, 95000);

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
                getInformation.informationOfEmployees(employee); //Список всех сотрудников
                break;
            case 2:
                getInformation.sumOfMonth(employee); //Рассчет суммы затрат на зарплаты в месяц
                break;
            case 3:
                getInformation.minSalary(employee); //Вывод сотрудников с минимальной зарплатой
                break;
            case 4:
                getInformation.maxSalary(employee); //Вывод сотрудников с максимальной зарплатой
                break;
            case 5:
                getInformation.avgSalary(employee); //Вычисление среднего значения всех зарпрат сотрудников
                break;
            case 6:
                getInformation.allFullNames(employee); //Все сотрудники по ФИО
                break;
            case 7:
                getInformation.indexInput(); //Текст с просьбой указать индекс
                    getInformation.indexOfSalary(employee, sc.nextDouble()); //Метод, вычисляющий рассчет индексации
                getInformation.indexFinish(); //Метод, который выводит текст о том, что индексация произведена, для получения результата списка всех сотрудников с новой зарплатой, предлагает нажать 1
                    if (sc.nextInt() == 1) {
                        getInformation.informationOfEmployees(employee); //При нажатии 1 срабатывает метод, который выводит список сотрудников.
                    }
                break;
            case 8:
                getInformation.departmentInput(); //Текст с просьбой указать номер отдела
                getInformation.minSalaryByDepartment(employee, sc.nextInt()); //Вывод сотрудников с минимальной зарплатой по отделу
                break;
            case 9:
                getInformation.departmentInput(); //Текст с просьбой указать номер отдела
                getInformation.maxSalaryByDepartment(employee, sc.nextInt()); //Вывод сотрудников с максимальной зарплатой по отделу
                break;
            case 10:
                getInformation.departmentInput(); //Текст с просьбой указать номер отдела
                getInformation.sumByDepartment(employee, sc.nextInt()); //Вывод общей суммы затрат на сотрудников в месяц по отделу
                break;
            case 11:
                getInformation.departmentInput(); //Текст с просьбой указать номер отдела
                getInformation.avgByDepartment(employee, sc.nextInt()); //Вычисление и вывод средней зарплаты по отделу
                break;
            case 12:
                getInformation.departmentInput(); //Текст с просьбой указать номер отдела
                int departmentNum = sc.nextInt();
                getInformation.indexInput(); //Текст с просьбой указать индекс
                double indexSalary = sc.nextDouble();
                getInformation.indexByDepartment(employee,departmentNum,indexSalary); //Метод, вычисляющий рассчет индексации внутри отдела
                getInformation.indexFinish(); //Метод, который выводит текст о том, что индексация произведена, для получения результата списка всех сотрудников с новой зарплатой, предлагает нажать 1
                if (sc.nextInt() == 1) {
                    getInformation.employeesByDepartment(employee, departmentNum); //При нажатии 1 срабатывает метод, который выводит список сотрудников отдела.
                }
                break;
            case 13:
                getInformation.departmentInput(); //Текст с просьбой указать номер отдела
                getInformation.employeesByDepartment(employee, sc.nextInt()); //Вывод всех сотрудников отдела
                break;
            case 14:
                getInformation.numInput(); //Текст с просьбой указать число
                getInformation.numEqual(employee,sc.nextInt()); //В данном методе сравнивается зарплата сотрдуников с числом и выводится информация сотрудников, у кого выше и у кого ниже зарплата.
                break;
            default:
                break;
        }
    }
}
