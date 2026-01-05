import java.util.concurrent.ConcurrentHashMap;

public class Warehouse {

    private ConcurrentHashMap<Integer, Product> products = new ConcurrentHashMap<>();

    public void populateWarehouse() {
        for (int i = 0; i < 6; i++) {
            products.put(1, new Product(1, "Penna", 20));
            products.put(2, new Product(2, "Matita", 20));
            products.put(3, new Product(3, "Gomma", 20));
            products.put(4, new Product(4, "Riga", 20));
            products.put(5, new Product(5, "Diario", 20));
            products.put(6, new Product(6, "Quaderno", 20));
        }
    }

    boolean placeOrder(int productId, int quantity) {
        if (productId < 1 || productId > 6) {
            System.out.println("ID non valido");
            return false;
        }
        if (quantity > products.get(productId).getQuantity()) {
            Product product = products.get(productId);
            System.out.printf("Quantità %s non disponibile per oggetto %s\n", quantity, product.getName());
            return false;
        }

        Product product = products.get(productId);
        product.setQuantity(product.getQuantity() - quantity);
        products.put(productId, product);
        System.out.printf("Venduti %s oggetti %s\n", quantity, product.getName());
        return true;
    }

    public String get(int id) {
        Product product = products.get(id);
        return product.toString();
    }

    @Override
    public String toString() {
        return "Warehouse" + products ;
    }

}
