package factorypattern.pizza;



public abstract class Pizza {
    private String name = "Default Pizza";
    public abstract void pizzaProcess();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
