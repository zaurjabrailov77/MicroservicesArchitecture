package az.com.developerdba.departmentservice.service;

import az.com.developerdba.departmentservice.domain.dto.DepartmentDto;
import az.com.developerdba.departmentservice.domain.entity.Department;
import az.com.developerdba.departmentservice.domain.repository.DepartmentRepository;
import az.com.developerdba.departmentservice.mapper.DepartmentMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class DepartmentServiceImpl implements DepartmentService{

    private final DepartmentRepository departmentRepository;
    private final DepartmentMapper departmentMapper;

    @Override
    public List<DepartmentDto> findAll() {
        List<Department> all = departmentRepository.findAll();
        return departmentMapper.toDepartmentDtoList(all);
    }

    @Override
    public Department save(DepartmentDto departmentDto) {
        log.info("Inside save Department method of DepartmentServiceImpl");
        return departmentRepository.save(departmentMapper.toDepartment(departmentDto));
    }

    @Override
    public DepartmentDto findById(Long id) {
        Department byId = departmentRepository.findById(id).orElseThrow(() ->
                new IllegalStateException("Id " + id +" dose not exit"));
        return departmentMapper.toDepartmentDto(byId);
    }
}
