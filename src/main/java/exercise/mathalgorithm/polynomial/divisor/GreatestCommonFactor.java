package exercise.mathalgorithm.polynomial.divisor;

/**
 * 최대 공약수 구하기
 */
public class GreatestCommonFactor {

    public int getGreatestCommonFactor(int num1, int num2) {
        int result = 0;

        //num1과 num2 중 작은 수를 찾는다.
        int minNumber = Math.min(num1, num2);

        //1부터 작은 수 만큼 반복문을 실행한다.
        for (int i = 1; i <= minNumber; i++) {

            //i로 num1과 num2를 나누었을 때 모두 나머지가 0이면 변수에 담는다.
            if ((num1 % i) == 0 && (num2 % i) == 0) {
                result = i;
            }
        }

        //변수의 값을 리턴한다.
        return result;
    }

}
