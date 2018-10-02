public class Median {

    static int med3(int a, int b, int c){
        if(a >= b)
            if (b >= c)
                return b;
            else if(a <= c)
                return a;
            else
                return c;
        else if(a > c)
            return a;
        else if(b > c)
            return c;
        else
            return b;
    }



    /*
        if((b > a && c <= a) || (b <= a && c >= a))
            return a;
        else if((a > b && c < b || (a < b && c > b))
            return b;
        return c;

        위 소스와 비교해서 효율이 떨어지는 이유 =
     */

}
