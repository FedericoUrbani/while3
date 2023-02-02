import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        int i=0;
        while (i<=150){
            int a=fibonacci.get(fibonacci.size()-1);
            int b=fibonacci.get(fibonacci.size()-2);
            if (i==a+b){
                fibonacci.add(i);
            }
            i++;
        }
        System.out.println(fibonacci);
    }
}