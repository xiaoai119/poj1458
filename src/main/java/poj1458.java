/**
 * Created By xfj on 2018/10/25
 */

import java.util.*;
import java.util.stream.Collectors;

public class poj1458 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] split = line.split(" ");
            assert (split.length == 2);
            List<String> collect = Arrays.stream(split).filter(s -> !s.equals("")).collect(Collectors.toList());
            System.out.println(Calculate.solve(collect,collect.get(0).length()-1,collect.get(1).length()-1));
        }
    }
}
