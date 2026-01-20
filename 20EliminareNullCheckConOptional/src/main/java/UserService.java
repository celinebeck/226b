import java.util.Optional;

public class UserService {

    public String getUsername(User user) {
        return user == null ? "Unknown" : user.getName();
    }

    public String getCityName(User user) {

        Optional<User> userOpt = Optional.ofNullable(user);
        if (userOpt.isEmpty()) {
            return "Unknown";
        }

        Optional<Address> addrOpt = Optional.ofNullable(user.getAddress());
        if (addrOpt.isEmpty()) {
            return "Unknown";
        }

        Optional<City> cityOpt = Optional.ofNullable(addrOpt.get().getCity());
        if (cityOpt.isEmpty()) {
            return "Unknown";
        }

        Optional<String> cityNameOpt = Optional.ofNullable(cityOpt.get().getName());
        if (cityNameOpt.isEmpty()) {
            return "Unknown";
        }
        return user.getAddress().getCity().getName();
    }
}
