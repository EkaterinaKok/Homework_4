public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Задача 1");
        int age1 = 17;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age1 + ", то он несовершеннолетний, нужно немного подождать.");
        }
        System.out.println();

        //Task 2
        System.out.println("Задача 2");
        int temperature = -2;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
        System.out.println();

        //Task 3
        System.out.println("Задача 3");
        int speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }
        System.out.println();

        //Task 4
        System.out.println("Задача 4");
        int age4 = 17;
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский сад.");
        }
        if (age4 >= 7 && age4 <= 17) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу.");
        }
        if (age4 >= 18 && age4 <= 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то его место в университете.");
        }
        if (age4 > 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему пора ходить на работу.");
        }
        System.out.println();

        //Task 5
        System.out.println("Задача 5");
        int age5 = 14;
        if (age5 < 5) {
            System.out.println("Если возраст ребенка равен " + age5 + ", то ему нельзя кататься на аттракционе.");
        }
        if (age5 >= 5 && age5 < 14) {
            System.out.println("Если возраст ребенка равен " + age5 + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (age5 >= 14) {
            System.out.println("Если возраст ребенка равен " + age5 + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
        System.out.println();

        //Task 6
        System.out.println("Задача 6");
        byte maxPassengers = 102;
        byte sitSeats = 60;
        int standSeats = maxPassengers - sitSeats;
        byte currentPassengers = 102;
        if (currentPassengers < maxPassengers) {
            if (currentPassengers < sitSeats) {
                System.out.println("Есть свободные сидячие места.");
            } else {
                System.out.println("Свободных сидячих мест нет, но есть стоячие.");
            }
        } else {
            System.out.println("Вагон полностью заполнен.");
        }
        System.out.println();

        //Task 7
        System.out.println("Задача 7");
        int one = 25;
        int two = 100;
        int three = 15;
        if (one > two && one > three) {
            System.out.println("Среди чисел: " + one + ", " + two + ", " + three + ", число " + one + " является самым большим.");
        } else {
            if (two > one && two > three) {
                System.out.println("Среди чисел: " + one + ", " + two + ", " + three + ", число " + two + " является самым большим.");
            } else {
                System.out.println("Среди чисел: " + one + ", " + two + ", " + three + ", число " + three + " является самым большим.");
            }
        }
        System.out.println();

    }
}