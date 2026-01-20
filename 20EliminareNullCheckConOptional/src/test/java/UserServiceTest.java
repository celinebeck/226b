import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    private final UserService service = new UserService();

    @Test
    void userWithCompleteData_returnsCityName() {
        User user = new User(
                "Luigi",
                new Address(new City("Roma"))
        );
        assertEquals("Luigi", service.getUsername(user));
        assertEquals("Roma", service.getCityName(user));
    }

    @Test
    void userWithNullAddress_returnsUnknown() {
        User user = new User("Luigi", null);

        assertEquals("Luigi", service.getUsername(user));
        assertEquals("Unknown", service.getCityName(user));
    }

    @Test
    void userWithNullCity_returnsUnknown() {
        User user = new User(
                "Luigi",
                new Address(null)
        );

        assertEquals("Luigi", service.getUsername(user));
        assertEquals("Unknown", service.getCityName(user));
    }

    @Test
    void userWithNullCityName_returnsUnknown() {
        User user = new User(
                "Luigi",
                new Address(new City(null))
        );

        assertEquals("Luigi", service.getUsername(user));
        assertEquals("Unknown", service.getCityName(user));
    }

    @Test
    void nullUser_returnsUnknown() {
        assertEquals("Unknown", service.getCityName(null));
    }
}
