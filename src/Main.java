import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        int age2 = 17;
        if (age2 >= 18) {
            System.out.println("Если возраст человека равен " + age2 + ", то он совершеннолетний");
        }
        if (age2 < 18) {
            System.out.println("Если возраст человека равен " + age2 + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        int temperatura = 5;
        if (temperatura <= 5) {
            System.out.println("На улице ниже " + temperatura + " градусов, нужно надеть шапку");
        }
        if (temperatura >= 5) {
            System.out.println("На улице выше " + temperatura + " градусов, можно идти без шапки");
        }

        int speedLow = 59;
        if (speedLow <= 60) {
            System.out.println("Если скорость ниже 60 км/ч,то можно ездить спокойно.");
        }

        int speedHigh = 65;
        if (speedHigh > 60) {
            System.out.println("Если скорость выше 60 км/ч,то придётся заплатить штраф.");
        }


        int ageKids = 26;
        if (ageKids >= 2 && ageKids <= 6) {
            System.out.println("Если возраст человека равен от 2-х до 6-ти лет, то ему нужно ходить в детский сад");
        }
        if (ageKids >= 7 && ageKids <= 17) {
            System.out.println("Если возраст человека равен от 7-ми до 17-ти лет, то ему нужно ходить в школу");
        }
        if (ageKids >= 18 && ageKids <= 24) {
            System.out.println("Если возраст человека равен от 18-ти до 24-х лет, то ему нужно ходить в университет");
        }
        if (ageKids > 24) {
            System.out.println("Если возраст человека больше 24-х лет, то ему пора идти на работу");
        }

        int ageKids1 = 10;
        if (ageKids1 <= 5) {
            System.out.println("Если возраст ребенка равен меньше 5 лет, то ему нельзя кататься на аттракционе");
        } else if (ageKids1 >= 5 && ageKids1 < 14) {
            System.out.println("Если возраст ребенка равен 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (ageKids1 > 14) {
            System.out.println("Если возраст ребенка равен больше 14 лет, то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        int sittingPlace = 60;
        int standingPlace = 42;
        int totalPlace = sittingPlace + standingPlace;
        int busySittingPlace = 60;
        int busyStandingPlace = 42;
        int freeSittingPlace = sittingPlace - busySittingPlace;
        int freeStandingPlace = standingPlace - busyStandingPlace;
        if (busySittingPlace >= 1 && busySittingPlace <= 60) {
            System.out.println("Количество свободных сидячих мест в вагоне составляет " + freeSittingPlace);
        }
        if (busyStandingPlace >= 1 && busyStandingPlace <= 42) {
            System.out.println("Количество свободных стоячих мест в вагоне составляет " + freeStandingPlace);
        } else if (totalPlace >= busySittingPlace + busyStandingPlace) {
            System.out.println("К сожалению в вагоне нет свободных мест.");
        }
        int one = 1;
        int two = 2;
        int three = 3;
        boolean lagerNumber = three>two && one < two;
        if (lagerNumber) {
            System.out.println("Три больше двух");
        } else if (lagerNumber) {
            System.out.println("Один меньше двух");
        }


    }


}

