package com.example.hahaton.controllers;

import com.example.hahaton.DTO.OfficeRegistrationDTO;
import com.example.hahaton.model.Office;
import com.example.hahaton.services.officeService.OfficeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/offices")
@RequiredArgsConstructor
public class OfficeController {

    private final OfficeService officeService;

    @GetMapping("/{office_id}")
    private @ResponseBody Office getOfficeById(@PathVariable(name = "office_id") Long officeId){
        return officeService.getOfficeById(officeId);
    }

    @GetMapping("/all")
    private @ResponseBody Collection<Office> getAllOffices(){
        return officeService.getAllOffices();
    }

    @PutMapping(value = "/create")
    private void createOffice(@RequestBody OfficeRegistrationDTO dto){
        officeService.saveNewOffice(dto);
    }
}
