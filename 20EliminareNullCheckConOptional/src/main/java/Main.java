public class Main {

    public static void main(String[] args) {

        UserService service = new UserService();
        User user = new User("Andrea", new Address(new City("Lugano")));
        System.out.println("User: " + service.getUsername(user) + " - City: " + service.getCityName(user));
    }
}
