package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private BankAccount bankAccount;

    public String getFullName() {
        return this.getFirstName() + " " + this.getLastName();
    }
}
