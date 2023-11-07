package com.iftm.companycalculations.controller;

import com.iftm.companycalculations.model.dto.AnnualWageDTO;
import com.iftm.companycalculations.model.dto.EmployeeDTO;
import com.iftm.companycalculations.services.CalculationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class CalculationController {
    @Autowired
    private CalculationsService service;

    @GetMapping("/response")
    public ResponseEntity<AnnualWageDTO> getResponse(@RequestBody EmployeeDTO employee) {
        return service.calculateAnnualWage(employee);
    }
}
