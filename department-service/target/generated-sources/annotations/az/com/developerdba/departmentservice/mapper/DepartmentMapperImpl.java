package az.com.developerdba.departmentservice.mapper;

import az.com.developerdba.departmentservice.domain.dto.DepartmentDto;
import az.com.developerdba.departmentservice.domain.entity.Department;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)
@Component
public class DepartmentMapperImpl implements DepartmentMapper {

    @Override
    public List<DepartmentDto> toDepartmentDtoList(List<Department> departments) {
        if ( departments == null ) {
            return null;
        }

        List<DepartmentDto> list = new ArrayList<DepartmentDto>( departments.size() );
        for ( Department department : departments ) {
            list.add( toDepartmentDto( department ) );
        }

        return list;
    }

    @Override
    public DepartmentDto toDepartmentDto(Department department) {
        if ( department == null ) {
            return null;
        }

        DepartmentDto departmentDto = new DepartmentDto();

        departmentDto.setDepartmentId( department.getDepartmentId() );
        departmentDto.setDepartmentName( department.getDepartmentName() );
        departmentDto.setDepartmentAddress( department.getDepartmentAddress() );
        departmentDto.setDepartmentCode( department.getDepartmentCode() );

        return departmentDto;
    }

    @Override
    public Department toDepartment(DepartmentDto departmentDto) {
        if ( departmentDto == null ) {
            return null;
        }

        Department department = new Department();

        department.setDepartmentId( departmentDto.getDepartmentId() );
        department.setDepartmentName( departmentDto.getDepartmentName() );
        department.setDepartmentAddress( departmentDto.getDepartmentAddress() );
        department.setDepartmentCode( departmentDto.getDepartmentCode() );

        return department;
    }
}
