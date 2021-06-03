package az.com.developerdba.departmentservice.domain.dto;

import lombok.Data;

@Data
public class DepartmentDto {

    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
