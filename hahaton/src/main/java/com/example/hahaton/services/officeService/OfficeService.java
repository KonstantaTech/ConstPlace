package com.example.hahaton.services.officeService;

import com.example.hahaton.DTO.OfficeRegistrationDTO;
import com.example.hahaton.model.Office;

import java.util.Collection;

public interface OfficeService {

    Collection<Office> findOfficesByOrganisationId(Long organisationId);
    Office getOfficeById(Long officeId);
    Collection<Office> getAllOffices();
    void saveNewOffice(OfficeRegistrationDTO dto);
}
