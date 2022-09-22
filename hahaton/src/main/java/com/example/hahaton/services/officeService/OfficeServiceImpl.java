package com.example.hahaton.services.officeService;

import com.example.hahaton.DAO.OfficeDAO;
import com.example.hahaton.DAO.OrganisationDAO;
import com.example.hahaton.DTO.OfficeRegistrationDTO;
import com.example.hahaton.model.Office;
import com.example.hahaton.model.Organisation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class OfficeServiceImpl implements OfficeService {

    private final OfficeDAO officeDAO;
    private final OrganisationDAO organisationDAO;

    @Override
    public Office getOfficeById(Long officeId) {
        return officeDAO.findOfficeById(officeId);
    }

    @Override
    public Collection<Office> getAllOffices() {
        return officeDAO.findAll();
    }

    @Override
    public Collection<Office> findOfficesByOrganisationId(Long organisationId) {
        return officeDAO.findOfficesByOrganisationId(organisationId);
    }

    @Override
    public void saveNewOffice(OfficeRegistrationDTO dto) {
        Organisation org = organisationDAO.getOrganisationById(dto.getOrganisationId());
        Office newOffice = Office.builder()
                .officeAddress(dto.getOfficeAddress())
                .description(dto.getDescription())
                .organisation(org)
                .build();
        officeDAO.save(newOffice);
    }
}
