package vk_skuf.vanya.lab2;

import java.util.Scanner;

public class Main {
    /**
     * Программа для расчета требуемого количества продавцов в супермаркете:
     * 1) если меньше 30 покупателей в час, то достаточно  N продавцов;
     * 2) если больше или равно 30 и меньше или равно 50 покупателей в час, то достаточно  1,5N продавцов;
     * 3) если больше 50 покупателей в час, то достаточно   2N продавцов.
     * Для случая, когда среднее время обслуживания покупателя на кассе больше или равно 5 мин, полученное значение увеличивается на 60%.
     * <p>
     * Входные данные, вводимые пользователем:
     * минимальное количество продавцов;
     * количество покупателей в час;
     * среднее время обслуживания покупателя на кассе.
     * В результате вычислений на экран выводится требуемое количество продавцов
     * (если при расчете получается не целое число, то его необходимо округлить до целого в большую сторону).
     */
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);


            System.out.println("Введите минимальное количество продавцов");
            int minSellers = scanner.nextInt();
            System.out.println("Введите количество покупателей в час");
            int sumBuyerInHour = scanner.nextInt();
            System.out.println("Введите среднее время обслуживания покупателя на кассе");
            double avgServiceTime = scanner.nextDouble();

            double res = sumBuyerInHour < 30 ? minSellers :
                    sumBuyerInHour >= 30 && sumBuyerInHour <= 50 ? minSellers * 1.5 :
                            sumBuyerInHour > 50 ? minSellers * 2 :
                                    -1;
            res = avgServiceTime >= 5 ? res * 1.6 : res;

            System.out.printf("Требуемое количество продавцов:%s\n", ((int) Math.ceil(res)));

        }
    }
}
