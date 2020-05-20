import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class SumAddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = createList();
        Sum(numbers);
        List(numbers);
        int max = max(numbers);
        System.out.println("Największa wpisana liczba  to " + max);
        int min = min(numbers);
        System.out.println("Najmniejsza wpisana liczba  to: " + min);
    }
    private static int max(List<Integer> numbers) {
        int max = 0;
        for (Integer number : numbers) {
            if (number > max)
                max = number;
        }
        return max;
    }
    private static int min(List<Integer> numbers) {
        int min = numbers.get(0);
        for (Integer number : numbers) {
            if (number < min)
                min = number;
        }
        return min;
    }
    private static void List(List<Integer> numbers) {
        System.out.println("Odwrotna kolejność wpisanych liczb:");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + ", ");
        }
        System.out.println();
    }
    private static void Sum(List<Integer> numbers) {
        System.out.println("Obliczona suma wpisanych liczb to:");
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            if (i < numbers.size() - 1)
                System.out.print(numbers.get(i) + " + ");
            else
                System.out.print(numbers.get(i) + " = ");
        }
        System.out.println(sum);
    }
    private static List<Integer> createList() {
        Scanner sc = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();
        int number;
        do {
            System.out.println("Podaj liczbę dodatnią:");
            number = sc.nextInt();
            if (number >= 0)
                result.add(number);
        } while (number >= 0);
        return result;
    }
}
