package exercise.mathalgorithm.polynomial.divisor;

import java.util.HashMap;
import java.util.Map;

/**
 * 소인수분해
 */
public class PrimeFactorization {

    /**
     * key - 인수
     * value - 인수의 개수(지수)
     */
    public Map<Integer, Integer> primeFactorize(int n) {
        //0. Map 선언
        Map<Integer, Integer> map = new HashMap<>();

        //1. 2부터 n까지 반복문을 실행한다.
        for (int i = 2; i <= n; i++) {
            //2. n을 2부터 n까지의 수로 나눠서 나머지가 없는지 확인한다.

            //5. n을 현재 수로 다시 나눠서 나머지가 없는지 확인한다.
            //6. 나눌 수와 나누는 수가 같아질 때까지 반복한다.
            while (n % i == 0) {
                //2-2. 나머지가 없다면
                if (map.containsKey(i)) {
                    //3-2. key가 있다면 map key에 value를 꺼내서 +1 해준다.
                    Integer count = map.get(i);
                    map.put(i, ++count);

                } else {
                    map.put(i, 1);
                    //3-1. map에 현재 수를 key로 가지고 있지 않다면 map의 key에 현재 수를 넣고 value로 1을 넣는다.
                }
                //4. n에 몫을 대입한다.
                n = n / i;
            }
            //2-1. 나머지가 있다면 다음 수로 넘어간다.

        }
        return map;
    }
}
