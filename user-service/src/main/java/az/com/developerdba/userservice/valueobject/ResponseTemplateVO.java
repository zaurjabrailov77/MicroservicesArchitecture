package az.com.developerdba.userservice.valueobject;

import az.com.developerdba.userservice.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {

    private User user;
    private Department department;
}
