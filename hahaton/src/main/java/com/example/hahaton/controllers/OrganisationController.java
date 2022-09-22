package com.example.hahaton.controllers;

import com.example.hahaton.DTO.RegistrationOrganisationDTO;
import com.example.hahaton.model.Office;
import com.example.hahaton.model.Organisation;
import com.example.hahaton.services.officeService.OfficeService;
import com.example.hahaton.services.organisationService.OrganisationService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Collection;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/organisation")
@RequiredArgsConstructor
@Api(value = "Organisations controllers", description = "Controllers for managing organisations")
public class OrganisationController {

    private final OrganisationService organisationService;
    private final OfficeService officeService;

    @PutMapping(value = "/createOrganisation")
    private void createOrganisation(@RequestBody RegistrationOrganisationDTO dto){
        organisationService.createNewOrganisation(dto);
    }

    //TODO fix problem with offices and owners
    @GetMapping("/all")
    private @ResponseBody Collection<Organisation> getAllOrganisations(){
        List<Organisation> all = (List<Organisation>) organisationService.getAllOrganisations();
        return all;
    }

    @GetMapping("/{organisation_id}")
    private @ResponseBody Organisation showOrganisation(@PathVariable("organisation_id") Long organisationId){
        return organisationService.getOrganisationById(organisationId);
    }

    @GetMapping("/{organisation_id}/offices")
    private @ResponseBody Collection<Office> getOrganisationOffices(@PathVariable("organisation_id") Long organisationId){
        return officeService.findOfficesByOrganisationId(organisationId);
    }
}
