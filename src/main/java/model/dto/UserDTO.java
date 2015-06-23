package model.dto;

import lombok.Data;

@Data
public class UserDTO {
    private int    id;
    private String firstName;
    private String bankAccountNumber;
    private String bankAccountType;
    private String bankName;
    private String fullName;
}
