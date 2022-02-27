package exercise.mathalgorithm.polynomial.divisor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * N의 전체 약수 구하기
 */
public class FindDivisor {

    public int[] findDivisor(int n) {
        //중복을 막기 위해 Set에 담는다.
        Set<Integer> set = new HashSet<>();

        //n의 수만큼 반복문을 실행한다.
        for (int i = 1; i <= n; i++) {

            //n을 1부터 n까지의 수로 나눠본다.
            if (!set.contains(i) && n % i == 0) {

                //나눈 결과의 나머지가 없을 경우 해당 수와 목을 Set에 저장한다.
                set.add(i);
                set.add(n / i);
            }
        }

        //Set의 값을 배열로 변환한다.
        Integer[] array = set.toArray(new Integer[0]);

        //결과 배열을 반환한다.
        return Arrays.stream(array).mapToInt(Integer::intValue).sorted().toArray();
    }

}
