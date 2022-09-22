package com.example.hahaton.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfficeRegistrationDTO {

    private Long organisationId;
    private String description;
    private String officeAddress;
}
