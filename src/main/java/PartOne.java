import java.util.*;

public class PartOne {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Александр");
        arr.add("Александр");
        arr.add("Петр");
        arr.add("Варвара");
        arr.add("Игорь");
        arr.add("Игорь");
        arr.add("Александр");
        arr.add("Александр");
        arr.add("Маша");
        arr.add("Анастасия");
        arr.add("Джон");
        arr.add("Майкл");
        arr.add("Александр");
        arr.add("ОЛьга");
        arr.add("Ольга");
        arr.add("Майкл");
        System.out.println(arr);

        for (String str : arr) {
            map.put(str, 0);
        }

        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> pair = iter.next();
            for (int i = 0; i < arr.size(); i++) {
                if (pair.getKey().equals(arr.get(i))) {
                    map.put(pair.getKey(), (pair.getValue() + 1));
                }
            }
        }
        Set<String> uniqKey = map.keySet();
        System.out.println(uniqKey);
        for (Map.Entry<String, Integer> o : map.entrySet()) {
            System.out.println(o.getKey() + " повторялся(лась) " + (o.getValue() -1)+ " раз(а)");
        }


    }
}






















