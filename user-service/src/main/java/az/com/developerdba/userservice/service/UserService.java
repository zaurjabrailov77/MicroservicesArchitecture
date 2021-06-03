package az.com.developerdba.userservice.service;


import az.com.developerdba.userservice.domain.dto.UserDto;
import az.com.developerdba.userservice.domain.entity.User;
import az.com.developerdba.userservice.valueobject.ResponseTemplateVO;

import java.util.List;

public interface UserService {
    List<UserDto> findAll();
    User save(UserDto userDto);
    UserDto findById(Long id);

    ResponseTemplateVO getUserWithDepartment(Long userId);

}
