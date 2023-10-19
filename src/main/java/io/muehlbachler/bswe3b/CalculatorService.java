package io.muehlbachler.bswe3b;

import org.springframework.stereotype.Service;

/**
 * Service class for calculator operations
 */
@Service
public class CalculatorService {

    /**
     * Divides the first argument by the second argument
     *
     * @param a the dividend
     * @param b the divisor
     * @return the result of the division, or 0 if b is less than 0
     */
    public int divide(final int a, final int b) {
        if (b < 0) {
            return 0;
        }
        return a / b;
    }
}
