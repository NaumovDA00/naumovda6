package N62;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        Map<String,Integer> map = new HashMap<>();

        for (Auto a : Auto.values()) {
            if(sum > a.getCost()){
                map.put(a.getModel(),a.getMaxSpeed());
            }
        }

        ArrayList<Integer> valueOfMap = new ArrayList<>(map.values());
        ArrayList<Auto> result = new ArrayList<>();

        Collections.sort(valueOfMap);

        for (int num: valueOfMap) {
            for (Map.Entry<String,Integer> entry: map.entrySet()) {
                if(entry.getValue().equals(num)){
                    for (Auto a : Auto.values()) {
                        if (entry.getValue().equals(a.getMaxSpeed()))
                            result.add(a);
                    }

                }
            }
        }

        for (Auto a : result) {
            System.out.println(a.toString());
        }
    }
}
