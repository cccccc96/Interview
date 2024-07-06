import java.math.BigInteger;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        List<Integer> r = new ArrayList<>();
        for(int o=0;o<p;o++){
            int n = in.nextInt();
            List<BigInteger> nums = new ArrayList<>();
            for(int i=0;i<n;i++) {
                String x = in.next();
                BigInteger num = new BigInteger(x);
                nums.add(num);

            }
            int res = 1;
            for(int i=0;i<n;i++){
                BigInteger t = new BigInteger("0");
                for(int j =i+1;j<=i+4&&j<n;j++){
                    t = t.add(nums.get(j));
                    if(j==i+4&&(t.compareTo(new BigInteger("60"))>0)){

                        res = 0;
                    }
                }
                if(res==0){
                    break;
                }
            }
            System.out.println(res);

        }

    }
}
