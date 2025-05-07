class Complex {
    private double real;
    private double imag;

    public Complex(double r, double i) {
        real = r;
        imag = i;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    public void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(2.5, 3.5);
        Complex c2 = new Complex(1.5, 2.5);

        Complex result = c1.add(c2);
        result.display();
    }
}
