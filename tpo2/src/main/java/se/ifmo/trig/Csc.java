package se.ifmo.trig;

import static java.lang.Double.POSITIVE_INFINITY;

public class Csc extends TrigFunction {

    private final Sin sin;

    public Csc() {
        this.sin = new Sin();
    }
    public Csc(Sin sin) {
        this.sin = sin;
    }

    @Override
    public Double calculate(Double x, Double eps) {
        x = checkX(x);

        double resultSin = sin.calculate(x,eps);
        double result = 1.0 / resultSin;

        if (result == POSITIVE_INFINITY)
            return POSITIVE_INFINITY;


        return result;
    }
}
