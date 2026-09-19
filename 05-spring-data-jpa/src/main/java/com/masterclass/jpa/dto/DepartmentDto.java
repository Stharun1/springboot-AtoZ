package com.masterclass.jpa.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {
    private Long id;
    private String name;
    private String deptCode;
    private List<StudentDto> students;
}
