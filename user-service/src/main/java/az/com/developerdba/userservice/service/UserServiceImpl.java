package az.com.developerdba.userservice.service;


import az.com.developerdba.userservice.domain.dto.UserDto;
import az.com.developerdba.userservice.domain.entity.User;
import az.com.developerdba.userservice.domain.repository.UserRepository;
import az.com.developerdba.userservice.mapper.UserMapper;
import az.com.developerdba.userservice.valueobject.Department;
import az.com.developerdba.userservice.valueobject.ResponseTemplateVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final RestTemplate restTemplate;

    @Override
    public List<UserDto> findAll() {
        List<User> all = userRepository.findAll();
        return userMapper.toUserDtoList(all);
    }

    @Override
    public User save(UserDto userDto) {
        log.info("Inside save User method of UserServiceImpl");
        return userRepository.save(userMapper.toUser(userDto));
    }

    @Override
    public UserDto findById(Long id) {
        User byId = userRepository.findById(id).orElseThrow(() ->
                new IllegalStateException("Id " + id +" dose not exit"));
        return userMapper.toUserDto(byId);
    }

    @Override
    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        log.info("Inside getUserWithDepartment of UserServiceImpl");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);

        Department department = restTemplate
                .getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(),
//                .getForObject("http://localhost:9001/departments/" + user.getDepartmentId(),
                        Department.class);
        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }
}
