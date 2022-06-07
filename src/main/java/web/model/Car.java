package web.model;

public class Car {
    private String model;
    private String color;
    private long year;

    private String condition;

    public Car(String model, String color, long year, String condition) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.condition = condition;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
