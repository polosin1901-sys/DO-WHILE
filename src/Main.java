import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// 1 задача
        int firstDay = 2;
        int i = 1;
        for (; i <= 31; i++) {
            while (i == firstDay + 7) {
                System.out.println("Сегодня пятница " + i + "-е число. Необходимо подготовить отчет");
                firstDay += 7;
            }
        }
        // 2 задача
        int distance = 0;
        do {
            System.out.println("Держитесь! Осталось " + distance + " метров");
            distance += 500;
        } while (distance <= 42_195);
        // 2 задача - решение при помощи for
        int distance1 = 0;
        for (; distance1 <= 42_195; distance1 += 500) {
            System.out.println("Держитесь! Осталось " + distance1 + " метров");
        }
        // 3 задача
        int sumOfMoney = 3500;
        int currentDay = 1;
        while (sumOfMoney >= 100) {

            if (currentDay % 5 == 0) {
                currentDay += 1;
                continue;
            }
            sumOfMoney -= 100;
            currentDay += 1;
        }
        System.out.println("Вы можете оставить свою машину на " + (currentDay - 1) + " дней");
        // 3 задача - решение при помощи for
        int sumOfMoney1 = 3500;
        int currentDay1 = 1;
        for (; sumOfMoney1 >= 100; currentDay1++) {
            if (currentDay1 % 5 == 0) {
                continue;
            }
            sumOfMoney1 -= 100;
        }
        System.out.println("Вы можете оставить свою машину на " + (currentDay1 - 1) + " дней");
        // 4 задача
        int month = 0;
        int total = 0;
        while (true) {
            month += 1;
            total += 15_000;
            if (month % 6 == 0) {
                total += total / 100 * 7;
            }
            System.out.println("Номер месяца " + month + ", " + total + " сумма накоплений");
            if (total >= 12_000_000) {
                break;
            }
        }
        // 5 задача
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats <= 3) {
            minute += 1;
            charge += 2;
            if (minute % 10 == 0) {
                overheats += 1;
                System.out.println("Произошел перегрев");
                minute += 2;
                continue;
            }
            if (overheats == 3) {
                System.out.println("Досрочное прекращение зарядки в связи с 3 перегревами");
                break;
            }
        }
        System.out.println("Зарядка прекращена, текущий заряд " + charge + ". Время зарядки составило " + minute + " минут");
    }
}