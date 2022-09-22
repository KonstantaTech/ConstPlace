package com.example.hahaton.services.organisationService;

import com.example.hahaton.DTO.RegistrationOrganisationDTO;
import com.example.hahaton.model.Organisation;

import java.util.Collection;

public interface OrganisationService {

    void editOrganisation();
    void createNewOrganisation(RegistrationOrganisationDTO dto);
    Organisation getOrganisationById(Long organisationId);
    Collection<Organisation> getAllOrganisations();
}
