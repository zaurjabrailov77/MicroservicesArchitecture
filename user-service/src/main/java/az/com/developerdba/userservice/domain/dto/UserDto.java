package az.com.developerdba.userservice.domain.dto;

import lombok.Data;

@Data
public class UserDto {

    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private Long departmentId;
}
