import model.AccountType;
import model.Bank;
import model.BankAccount;
import model.User;
import model.dto.UserDTO;
import org.modelmapper.ModelMapper;

public class ModelMapperExample {

    public static void main(String[] args) {
        User user = createUser();
        ModelMapper mapper = new ModelMapper();

        System.out.println("# Original user");
        System.out.println(user);

        UserDTO userDTO = mapper.map(user, UserDTO.class);
        System.out.println(">>> Original user converted to TO object");
        System.out.println(userDTO);

        User user2 = mapper.map(userDTO, User.class);
        System.out.println("<<< TO object converted back to User object");
        System.out.println(user2);
    }

    private static User createUser() {
        return User.builder()
                    .id(1L)
                    .firstName("Jasper")
                    .lastName("Huzen")
                    .bankAccount(new BankAccount(new Bank("Rabobank"), "1209661234", AccountType.TYPE2))
                    .build();
    }

}
