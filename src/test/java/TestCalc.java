import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc {
    Calc calc = new Calc();

    @Test
    public void testPayment() {
        int sum = 1500000;
        double percent = 0.19;
        int creditPeriod = 48;
        float rate = (float) percent / 12;
        double pow = (Math.pow((1 + rate), creditPeriod));
        double coefficient = (rate * pow / (pow - 1));
        int testPayment = (int) (coefficient * sum);
        int payment = calc.payment(sum, percent, creditPeriod);
        assertEquals(testPayment,payment);
    }

    @Test
    public void testSumPays() {
        int sum = 1500000;
        double percent = 0.19;
        int creditPeriod = 48;
        float rate = (float) percent / 12;
        double pow = (Math.pow((1 + rate), creditPeriod));
        double coefficient = (rate * pow / (pow - 1));
        int testPayment = (int) (coefficient * sum);
        int testSumPays = testPayment * creditPeriod;
        int sumPays = calc.sumPays(sum, percent, creditPeriod);
        assertEquals(testSumPays, sumPays);
    }

    @Test
    public void testOverPay () {
        int sum = 1500000;
        double percent = 0.19;
        int creditPeriod = 48;
        float rate = (float) percent / 12;
        double pow = (Math.pow((1 + rate), creditPeriod));
        double coefficient = (rate * pow / (pow - 1));
        int testPayment = (int) (coefficient * sum);
        int testSumPays = testPayment * creditPeriod;
        int testOverPay  = testSumPays - sum;
        int overPay = calc.overPay(sum, percent, creditPeriod);
        assertEquals(testOverPay, overPay);
    }

}
