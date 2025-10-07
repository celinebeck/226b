public interface MenuItem {
    abstract double calculatePrice();
    abstract String getDescription();
    abstract int getPreparationTime();
    abstract String getName();
}
