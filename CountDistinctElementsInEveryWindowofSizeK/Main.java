import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        
        String a = sc.nextLine();
        String[] numbers = a.split("\\s+");
        for (int i = 0; i < numbers.length; i++) {
            arr.add(Integer.parseInt(numbers[i]));
        }

        System.out.print("Enter window size (k): ");
        int k = sc.nextInt();

        printDistinctInWindow(arr, k);
    }

    public static void printDistinctInWindow(ArrayList<Integer> arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);
        }
        System.out.print(map.size() + " ");

        for (int i = k; i < arr.size(); i++) {
            int prevElement = arr.get(i - k);
            if (map.get(prevElement) == 1) {
                map.remove(prevElement);
            } else {
                map.put(prevElement, map.get(prevElement) - 1);
            }

            int newElement = arr.get(i);
            map.put(newElement, map.getOrDefault(newElement, 0) + 1);

            System.out.print(map.size() + " ");
        }
    }
}