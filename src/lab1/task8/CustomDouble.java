package lab1.task8;

public class CustomDouble {
    private int wholePart;
    private double fractionPart;

    public int getWholePart() {
        return wholePart;
    }

    public void setWholePart(int wholePart) {
        this.wholePart = wholePart;
    }

    public double getFractionPart() {
        return fractionPart;
    }


    public void setFraction(final double fractionPart) {
        this.fractionPart = fractionPart;
    }

    public CustomDouble(final int wholePart, final double fractionPart) {
        setWholePart(wholePart);
        setFraction(fractionPart);
    }

    public CustomDouble(double res) {
        this.wholePart = (int) res;
        this.fractionPart = res - wholePart;
    }

    public CustomDouble() {
    }


    public CustomDouble sum(CustomDouble d) {
        double res = this.toDouble() + d.toDouble();

        return new CustomDouble(res);
    }

    public CustomDouble difference(CustomDouble d) {
        double res = this.toDouble() - d.toDouble();

        return new CustomDouble(res);
    }


    public CustomDouble division (CustomDouble d) {
        double res = this.toDouble() / d.toDouble();

        return new CustomDouble(res);
    }

    public CustomDouble multiplication (CustomDouble d) {
        double res = this.toDouble() * d.toDouble();

        return new CustomDouble(res);
    }

    public void comparison(CustomDouble d) {
        double res = this.toDouble() - d.toDouble();

        if (res > 0) {
            System.out.println("First number is larger than second");
        } else if (res == 0) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Second number is larger than first");
        }
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        CustomDouble customDouble = (CustomDouble) obj;
        return this.wholePart == customDouble.wholePart && this.fractionPart == customDouble.fractionPart;
    }

    @Override
    public int hashCode() {
        int result = 17;
        int prime = 31;
        result = prime * result + wholePart;
        result = (int) (prime * result + fractionPart);
        return result;
    }

    public double toDouble() {
        double result = this.wholePart + this.fractionPart;
        return result;
    }


    @Override
    public String toString() {
        return this.toDouble() + "";
    }


}
