public class Calc {

    public int payment(int sum, double percent, int creditPeriod) {
        float rate = (float) (percent / 12);
        double pow = (Math.pow((1 + rate), creditPeriod));
        double coefficient = (rate * pow / (pow - 1));
        return (int) (coefficient * sum);
    }

    public int sumPays(int sum, double percent, int creditPeriod) {
        float rate = (float) (percent / 12);
        double pow = (Math.pow((1 + rate), creditPeriod));
        double coefficient = (rate * pow / (pow - 1));
        int testPayment = (int) (coefficient * sum);
        return testPayment * creditPeriod;
    }

    public int overPay(int sum, double percent, int creditPeriod) {
        float rate = (float) (percent / 12);
        double pow = (Math.pow((1 + rate), creditPeriod));
        double coefficient = (rate * pow / (pow - 1));
        int testPayment = (int) (coefficient * sum);
        int testSumPays = testPayment * creditPeriod;
        return testSumPays - sum;
    }
}
