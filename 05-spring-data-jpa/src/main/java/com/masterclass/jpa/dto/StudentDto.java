package com.masterclass.jpa.dto;

import com.masterclass.jpa.entity.StudentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private Long id;
    private String name;
    private String email;
    private StudentStatus status;
    private Long departmentId;
    private String departmentName;
}
