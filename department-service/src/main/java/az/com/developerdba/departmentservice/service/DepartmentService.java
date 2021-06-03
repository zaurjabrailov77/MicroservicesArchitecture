package az.com.developerdba.departmentservice.service;

import az.com.developerdba.departmentservice.domain.dto.DepartmentDto;
import az.com.developerdba.departmentservice.domain.entity.Department;

import java.util.List;

public interface DepartmentService {
    List<DepartmentDto> findAll();
    Department save(DepartmentDto departmentDto);
    DepartmentDto findById(Long id);

}
