import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public int solution(int[] topping) {
        int count = 0;
        HashSet<Integer> chulsooToppings = new HashSet<>();
        HashMap<Integer, Integer> siblingToppings = new HashMap<>();

        for (int top : topping) {
            siblingToppings.put(top, siblingToppings.getOrDefault(top, 0) + 1);
        }

        for (int i = 0; i < topping.length; i++) {
            int currentTop = topping[i];

            chulsooToppings.add(currentTop);

            siblingToppings.put(currentTop, siblingToppings.get(currentTop) - 1);
            if (siblingToppings.get(currentTop) == 0) {
                siblingToppings.remove(currentTop);
            }

            if (chulsooToppings.size() == siblingToppings.size()) {
                count++;
            }
        }
        
        return count;
    }
}
//