// Last updated: 7/10/2026, 9:30:42 AM
class Solution {
    public double[] convertTemperature(double cels) {
        double kel=cels+273.15;
        double fahr=cels*1.80+32.00;
        return new double[]{kel,fahr};
    }
}