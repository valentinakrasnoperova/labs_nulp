package lab2.task3;

public class Mark {
    private String mark;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Mark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return mark;
    }
}

