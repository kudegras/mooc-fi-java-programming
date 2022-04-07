

public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private ChangeHistory productHistory = new ChangeHistory();

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        productHistory.add(initialBalance);
    }

    public String history() {
        return this.productHistory.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        double result = 0.0;
        result = 1.0 * super.getBalance() + amount;
        this.productHistory.add(result);
        super.addToWarehouse(amount);
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double result = 0.0;
        result = 1.0 * super.getBalance() - amount;
        this.productHistory.add(result);
        return super.takeFromWarehouse(amount);
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.productHistory);
        System.out.println("Largest amount of product: " + this.productHistory.maxValue());
        System.out.println("Smallest amount of product: " + this.productHistory.minValue());
        System.out.println("Average: " + this.productHistory.average());
        
    }
}
