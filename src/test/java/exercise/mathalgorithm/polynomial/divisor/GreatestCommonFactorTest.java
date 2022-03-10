package exercise.mathalgorithm.polynomial.divisor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GreatestCommonFactorTest {

    GreatestCommonFactor solution = new GreatestCommonFactor();

    @Test
    void greatestCommonFactor() {
        //given
        int num1 = 12;
        int num2 = 16;

        //when
        int result = solution.getGreatestCommonFactor(num1, num2);

        //then
        assertThat(result).isEqualTo(4);
    }

    @Test
    void greatestCommonFactor2() {
        //given
        int num1 = 3;
        int num2 = 11;

        //when
        int result = solution.getGreatestCommonFactor(num1, num2);

        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void greatestCommonFactor3() {
        //given
        int num1 = 200;
        int num2 = 300;

        //when
        int result = solution.getGreatestCommonFactor(num1, num2);

        //then
        assertThat(result).isEqualTo(100);
    }

}