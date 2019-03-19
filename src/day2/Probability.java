package day2;

public class Probability {
    private final double value;

    Probability(double probability) throws InvalidProbabilityException {
        if (probability < 0 || probability > 1)throw new InvalidProbabilityException();
            this.value = probability;
    }

    Probability not() throws InvalidProbabilityException {
        return new Probability(1-this.value);
    }

    Probability and(Probability probability) throws InvalidProbabilityException {
        return new Probability(probability.value *this.value);
    }


    Probability or(Probability probability) throws InvalidProbabilityException {
       return this.not().and(probability.not()).not();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Probability)) return false;
        Probability that = (Probability) o;
        return Double.compare(that.value, value) == 0;
    }

}
