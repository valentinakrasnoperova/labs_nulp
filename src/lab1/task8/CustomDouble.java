package lab1.task8;

public class CustomDouble {
    private int wholePart;
    private double fractionPart;

    public CustomDouble(final int wholePart, final double fractionPart) {
        setWholePart(wholePart);
        setFractionPart(fractionPart);
    }

    public CustomDouble() {
    }

    public int getWholePart() {
        return wholePart;
    }

    public double getFractionPart() {
        return fractionPart;
    }


    public void setWholePart(final int wholePart) {
        this.wholePart = wholePart;
    }

    public void setFractionPart(final double fractionPart) {
        if (Math.abs(fractionPart) >= 1) {
            this.fractionPart = Math.abs(fractionPart) % 1;
            this.wholePart += (int) Math.abs(fractionPart);
        } else {
            this.fractionPart = fractionPart;
        }
    }


    public CustomDouble sum(final CustomDouble d) {
        final CustomDouble result = new CustomDouble();
        final double sum = this.toDouble() + d.toDouble();

        result.wholePart = (int) sum;
        result.fractionPart = sum % 1;

        return result;
    }

    public CustomDouble difference(final CustomDouble d) {
        final CustomDouble result = new CustomDouble();

        final double minus = this.toDouble() - d.toDouble();

        result.wholePart = (int) minus;
        result.fractionPart = minus % 1;

        return result;
    }

    public void comparison(final CustomDouble d) {
       if (this.toDouble() > d.toDouble()) {
            System.out.println("Number one is more than number two  ");
        } else if (this.toDouble() < d.toDouble()) {
            System.out.println("Number one is less than number two ");
        } else
            System.out.println("Number one is  equal to number two ");
    }


    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        final CustomDouble number = (CustomDouble) obj;
        return this.wholePart == number.wholePart && this.fractionPart == number.fractionPart;
    }

    @Override
    public int hashCode() {
        int result = 1;
        int prime = 31;
       result=prime*result+wholePart;
       result= (int) (result*prime+fractionPart);
       return result;
    }

    @Override
    public String toString() {
        return this.toDouble() + " ";
    }


    public double toDouble() {
        return this.wholePart + this.fractionPart;
    }
}
