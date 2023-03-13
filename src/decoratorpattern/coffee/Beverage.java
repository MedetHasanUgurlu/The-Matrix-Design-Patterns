package decoratorpattern.coffee;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public abstract double cost();

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
