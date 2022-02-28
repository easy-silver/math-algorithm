package exercise.mathalgorithm.polynomial.divisor;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class PrimeFactorizationTest {

    PrimeFactorization solution = new PrimeFactorization();

    @Test
    void primeFactorize() {
        //given
        int n = 108;

        //when
        Map<Integer, Integer> result = solution.primeFactorize(n);

        //then
        assertThat(result.containsKey(2)).isTrue();
        assertThat(result.get(2)).isEqualTo(2);
        assertThat(result.containsKey(3)).isTrue();
        assertThat(result.get(3)).isEqualTo(3);
    }

    @Test
    void primeFactorize2() {
        //given
        int n = 12;

        //when
        Map<Integer, Integer> result = solution.primeFactorize(n);

        //then
        assertThat(result.containsKey(2)).isTrue();
        assertThat(result.containsKey(3)).isTrue();
        assertThat(result.get(2)).isEqualTo(2);
        assertThat(result.get(3)).isEqualTo(1);
    }

}