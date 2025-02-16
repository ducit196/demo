package com.duc.demo.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private String role;
}
