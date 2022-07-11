public class Main {
    public static void main(String[] args) {
        //  Задача 1
        byte a = 1;
        short b = 12346;
        int c = 12345678;
        long d = 46578L;
        float e = 1.215f;
        double f = 12.44548;

        // Задача 2
        double weightFirstBoxer = 78.2;
        double weightSecondBoxer = 82.7;
        double commWeight = weightFirstBoxer + weightSecondBoxer;
        double changeWeight = weightSecondBoxer - weightFirstBoxer;
        System.out.println(commWeight);
        System.out.println(changeWeight);

        // Задача 3
        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        float breakFast = (5 * banana) + (2 * milk) + (2 * iceCream) + (4 * egg);
        System.out.println(breakFast / 1000 + " кг");

        // Задача 4
        double sbrosit = 7;
        double vDay = 0.25;
        double quantityDay = sbrosit / vDay;
        System.out.println(quantityDay);

        // Задача 5
        int SallMasha = 67760;
        int SllDenis = 83690;
        int sallKristina = 76230;
        double increaseMasha = SallMasha * 0.1;
        double finMasha = SallMasha + increaseMasha;
        double increaseDenis = SllDenis * 0.1;
        double finDenis = SllDenis + increaseDenis;
        double increaseKristina = sallKristina * 0.1;
        double finKristina = sallKristina + increaseKristina;
        System.out.println("с надбавкой Маша будет получать: " + finMasha);
        System.out.println("с надбавкой Денис будет получать: " + finDenis);
        System.out.println("с надбавкой Кристина будет получать: " + finKristina);
        double changeMasha = (finMasha * 12) - (SallMasha * 12);
        double changeDenis = (finDenis * 12) - (SllDenis * 12);
        double changeKristina = (finKristina * 12) - (sallKristina * 12);
        System.out.println("разница годовога дохода после надбавки у Маши: " + changeMasha);
        System.out.println("разница годовога дохода после надбавки у Дениса: " + changeDenis);
        System.out.println("разница годовога дохода после надбавки у Кристины: " + changeKristina);

    }
}