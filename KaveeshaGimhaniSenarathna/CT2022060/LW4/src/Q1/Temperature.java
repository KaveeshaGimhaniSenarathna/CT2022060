package Q1;

public class Temperature {

    private double celsius;

    // No-Arg Constructor
    public Temperature() {
        celsius = 0;
    }

    // Parameterized Constructor
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Getter Methods
    public double toCelsius() {
        return celsius;
    }

    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    // Setter Methods
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        celsius = (fahrenheit - 32) * 5 / 9;
    }
}
