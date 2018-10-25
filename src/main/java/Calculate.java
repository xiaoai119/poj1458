import java.util.List;

/**
 * Created By xfj on 2018/10/25
 */
public class Calculate {
    public static Integer solve(List<String> s, Integer m, Integer n){
        //原子情况
        if(m<0||n<0){return 0;}
        assert(s.size()==2);
        String s1 = s.get(0);
        String s2 = s.get(1);
        //第一种情况
        if(s1.charAt(m)==s2.charAt(n)){
            return solve(s,m-1,n-1)+1;
        }else{
            //第二种情况
            return Math.max(solve(s,m,n-1),solve(s,m-1,n));
        }
    }
}
