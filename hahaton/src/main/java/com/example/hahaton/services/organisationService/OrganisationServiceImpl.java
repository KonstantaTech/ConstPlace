package com.example.hahaton.services.organisationService;

import com.example.hahaton.DAO.OrganisationDAO;
import com.example.hahaton.DTO.RegistrationOrganisationDTO;
import com.example.hahaton.model.Organisation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class OrganisationServiceImpl implements OrganisationService {

    private final OrganisationDAO organisationDAO;

    @Override
    public void editOrganisation() {

    }

    @Override
    public void createNewOrganisation(RegistrationOrganisationDTO dto) {
        Organisation newOrganisation = Organisation.builder()
                .legalAddress(dto.getLegalAddress())
                .description(dto.getDescription())
                .build();
        organisationDAO.save(newOrganisation);
    }

    @Override
    public Organisation getOrganisationById(Long organisationId) {
        return organisationDAO.getOrganisationById(organisationId);
    }

    @Override
    public Collection<Organisation> getAllOrganisations() {
        return organisationDAO.findAll();
    }
}
