public class Methods {

    //----------Вывод всех сотрудников со всеми данными
    public static void informationOfEmployees(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }
    }

    //-----------Расчет и вывод общей суммы зарплат всех сотрудников за месяц
    public static void sumOfMonth(Employee[] array) {
        System.out.println("Сумма затрат на зарплаты за месяц: " + String.format("%.2f", calculationOfSum(array)) + "руб.");
    }
    public static double calculationOfSum(Employee[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].getSalary();
        }
        return sum;
    }

    //--------------Расчет минимальной зарплаты и вывод сотрудников методом minMaxOfSalary()
    public static void minSalary(Employee[] array) {
        double min = array[0].getSalary();
        System.out.println("Сотрудники с минимальной зарплатой: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() <= min) {
                min = array[i].getSalary();
            }
        }
        minMaxOfSalary(min, array);
    }

    //----------------Расчет максимальной зарплаты и вывод сотрудников методом minMaxOfSalary()
    public static void maxSalary(Employee[] array) {
        double max = array[0].getSalary();
        System.out.println("Сотрудники с максимальной зарплатой: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() >= max) {
                max = array[i].getSalary();
            }
        }
        minMaxOfSalary(max, array);
    }

    //----------------Данный метод выводит список сотрудников по переданным параметрам зарплаты
    public static void minMaxOfSalary(double salary, Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() == salary) {
                System.out.println("ФИО: " + array[i].getSurName() + " " + array[i].getName() + " " + array[i].getFatherName() +
                        ", Зарплата: " + String.format("%.2f", array[i].getSalary()) + "руб.");
            }
        }
    }

    //-----------------Расчет и вывод среднего значения зарплат сотрудников. Внутри используется ранее созданный метод
    //-------------------calculationOfSum() для вычисления общей суммы зарплаты.
    public static void avgSalary(Employee[] array) {
        System.out.println("Среднее значение зарплат: " + String.format("%.2f", calculationOfSum(array) / array.length));
    }

    //--------------------Вывод всех сотрудников по ФИО
    public static void allFullNames(Employee[] array) {
        System.out.println("ФИО всех сотрудников: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getSurName() + " " + array[i].getName() + " " + array[i].getFatherName());
        }
    }
}
