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

        for (int i = 0; i <= arr.size() - k; i++) {
            int distinctCount = 0;

            for (int j = i; j < i + k; j++) {
                boolean isFirstAppearance = true;
                
                for (int m = i; m < j; m++) {
                    if (arr.get(j).equals(arr.get(m))) {
                        isFirstAppearance = false;
                        break;
                    }
                }
                
               
                if (isFirstAppearance) {
                    distinctCount++;
                }
            }
            System.out.print(distinctCount + " ");
        }
    }
}