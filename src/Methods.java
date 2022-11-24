import java.util.Arrays;
import java.util.Comparator;

public class Methods {


    //----------Вывод всех сотрудников со всеми данными
    public static void informationOfEmployees(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            System.out.println(array[i]);
        }
    }

    //-----------Расчет и вывод общей суммы зарплат всех сотрудников за месяц
    public static void sumOfMonth(Employee[] array) {
        System.out.println("Сумма затрат на зарплаты за месяц: " + String.format("%.2f", calculationOfSum(array)) + "руб.");
    }

    public static double calculationOfSum(Employee[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            sum += array[i].getSalary();
        }
        return sum;
    }


    //--------------Расчет минимальной зарплаты
    public static void minSalary(Employee[] array) {
        double min = array[0].getSalary();
        System.out.println("Сотрудники с минимальной зарплатой: ");
        for (int j = 0; j < array.length; j++) {
            if (array[j] == null) {
                continue;
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    continue;
                }
                min = Double.min(min, array[i].getSalary());
            }
            if (array[j].getSalary() == min) {
                System.out.println("ФИО: " + array[j].getSurName() + " " + array[j].getName() + " " + array[j].getFatherName() +
                        ", Зарплата: " + String.format("%.2f", array[j].getSalary()) + "руб.");
            }
        }
    }

    //----------------Расчет максимальной зарплаты
    public static void maxSalary(Employee[] array) {
        double max = array[0].getSalary();
        System.out.println("Сотрудники с максимальной зарплатой: ");
        for (int j = 0; j < array.length; j++) {
            if (array[j] == null) {
                continue;
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    continue;
                }
                max = Double.max(max, array[i].getSalary());
            }
            if (array[j].getSalary() == max) {
                System.out.println("ФИО: " + array[j].getSurName() + " " + array[j].getName() + " " + array[j].getFatherName() +
                        ", Зарплата: " + String.format("%.2f", array[j].getSalary()) + "руб.");
            }
        }
    }


    //-----------------Расчет и вывод среднего значения зарплат сотрудников. Внутри используется ранее созданный метод
    //-------------------calculationOfSum() для вычисления общей суммы зарплаты.
    public static void avgSalary(Employee[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            count++;
        }
        double avgSum = calculationOfSum(array) / count;
        System.out.println("Среднее значение зарплат: " + String.format("%.2f", avgSum));
    }

    //--------------------Вывод всех сотрудников по ФИО
    public static void allFullNames(Employee[] array) {
        System.out.println("ФИО всех сотрудников: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            System.out.println(array[i].getSurName() + " " + array[i].getName() + " " + array[i].getFatherName());
        }
    }


    //------------Методы задания повышенной сложности

    //-----------Индексация зарплаты
    public static void indexOfSalary(Employee[] array, double percent) {
        if (percent >= 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    continue;
                }
                array[i].setSalary(array[i].getSalary() + array[i].getSalary() / 100 * percent);
            }
        } else {
            throw new IllegalArgumentException("Индексация не может быть произведена с отрицательным значением");
        }
    }


    //----------Сотрудники с минимальной зарплатой внутри отдела
    public static void minSalaryByDepartment(Employee[] array, int numDepartment) {
        double min = Integer.MAX_VALUE;
        System.out.println("Сотрудники отдела " + numDepartment + " с минимальной зарплатой:");
        for (int j = 0; j < array.length; j++) {
            if (array[j] == null) {
                continue;
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    continue;
                }
                if (array[i].getDepartment() == numDepartment) {
                    min = Double.min(min, array[i].getSalary());
                }
            }
            if (array[j].getDepartment() == numDepartment && array[j].getSalary() == min) {
                System.out.println("ФИО: " + array[j].getSurName() + " " + array[j].getName() + " " + array[j].getFatherName() +
                        ", Зарплата: " + String.format("%.2f", array[j].getSalary()) + "руб.");
            }
        }
        if (min == Integer.MAX_VALUE) {
            departmentMissing();
        }
    }


    //----------Сотрудники с максимальной зарплатой внутри отдела
    public static void maxSalaryByDepartment(Employee[] array, int numDepartment) {
        double max = 0;
        System.out.println("Сотрудники отдела " + numDepartment + " с максимальной зарплатой:");
        for (int j = 0; j < array.length; j++) {
            if (array[j] == null) {
                continue;
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    continue;
                }
                if (array[i].getDepartment() == numDepartment) {
                    max = Double.max(max, array[i].getSalary());
                }
            }
            if (array[j].getDepartment() == numDepartment && array[j].getSalary() == max) {
                System.out.println("ФИО: " + array[j].getSurName() + " " + array[j].getName() + " " + array[j].getFatherName() +
                        ", Зарплата: " + String.format("%.2f", array[j].getSalary()) + "руб.");
            }
        }
        if (max == 0) {
            departmentMissing();
        }
    }


    //--------------Сумма затрат на зарплату по отделу
    public static void sumByDepartment(Employee[] array, int numDepartment) {
        if (calculationOfSumByDepartment(array, numDepartment) != 0) {
            System.out.println("Сумма затрат на зарплаты по отделу " + numDepartment + ": " + String.format("%.2f", calculationOfSumByDepartment(array, numDepartment)) + "руб.");
        } else {
            departmentMissing();
        }
    }

    public static double calculationOfSumByDepartment(Employee[] array, int numDepartment) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            if (array[i].getDepartment() == numDepartment) {
                sum += array[i].getSalary();
            }
        }
        return sum;
    }

    //-------------Средняя зарплата по отделу
    public static void avgByDepartment(Employee[] array, int numDepartment) {
        double sum = calculationOfSumByDepartment(array, numDepartment);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            if (array[i].getDepartment() == numDepartment) {
                count ++;
            }
        }
        if (count == 0) {
            departmentMissing();
        } else {
            double avg = sum / count;
            System.out.println("Средняя зарплата по отделу " + numDepartment + " равна " + String.format("%.2f", avg));
        }

    }

    //-------------------Индексация зарплаты по отделу
    public static void indexByDepartment(Employee[] array, int numDepartment, double percent) {
        boolean item = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            if (array[i].getDepartment() == numDepartment && percent >= 0) {
                array[i].setSalary(array[i].getSalary() + array[i].getSalary() / 100 * percent);
                item = true;
            }
        }
        if (!item) {
            System.out.println("Указан неверный отдел, либо отрицательный индекс");
        }
    }

    //-------------------Список сотрудников внутри отдела
    public static void employeesByDepartment(Employee[] array, int numDepartment) {
        boolean item = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            if (array[i].getDepartment() == numDepartment) {
                System.out.println(array[i].toStringWithoutDepartment());
                item = true;
            }
        }
        if (!item) {
            departmentMissing();
        }
    }


    //----------------Введение в качестве параметра определенное число и вывод сотрудников с зарплатой меньше и больше данного числа
    public static void numEqual(Employee[] array, int num) {
        System.out.println("Сотрудники с зарплатой меньше " + num);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            if (array[i].getSalary() < num) {
                System.out.println(array[i].toStringWithoutDepartment());
            }
        }
        System.out.println("Сотрудники с зарплатой больше либо равно " + num);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            if (array[i].getSalary() >= num) {
                System.out.println(array[i].toStringWithoutDepartment());
            }
        }
    }


    //---------------Дополнительные методы выводов
    public static void departmentInput() {
        System.out.println("Укажите номер отдела 1-5");
    }

    public static void indexInput() {
        System.out.println("Введите процент индексации");
    }

    public static void numInput() {
        System.out.println("Введите число");
    }

    public static void indexFinish() {
        System.out.println("Индексация произведена. Нажмите 1, чтобы вывести всех сотрудников с проиндексированной зарплатой. В ином же случае программа будет завершена");
    }

    public static void departmentMissing() {
        System.out.println("Данный отдел отсутствует.");
    }

}