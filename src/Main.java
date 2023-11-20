public class Main {
    public static void main(String[] args) {
//        int leftSide = 1, rightSide = 10;
//        int sum = 0;
//
//        int i = leftSide;
//
//        while (i <= rightSide) {
//            System.out.println(String.format("i = %d", i));
//
//            sum = sum + i;//sum+=i;
//
//            i += 2;
//        }
//
//        System.out.println(String.format("sum from %d to %d = %d", leftSide, rightSide, sum));

        double money, percent, targetMoney;
        int year;

        money = 2000;
        percent = 9.25;
        targetMoney = money * 20;
        year = 0;

        do {
            money = money + money * percent / 100.0;
            year++;

            System.out.println(String.format("money = %.2f year = %d", money, year));
        } while (money < targetMoney);

    }
}