package exercise.mathalgorithm.polynomial.divisor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindDivisorTest {

    FindDivisor solution = new FindDivisor();

    @Test
    void findDivisor1() {
        //given
        int n = 12;
        //when
        int[] result = solution.findDivisor(n);
        //then
        assertThat(result).containsExactly(1, 2, 3, 4, 6, 12);
    }

    @Test
    void findDivisor2() {
        //given
        int n = 2;
        //when
        int[] result = solution.findDivisor(n);
        //then
        assertThat(result).containsExactly(1, 2);
    }
}