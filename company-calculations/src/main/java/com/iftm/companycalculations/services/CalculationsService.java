package com.iftm.companycalculations.services;

import com.iftm.companycalculations.model.dto.AnnualWageDTO;
import com.iftm.companycalculations.model.dto.EmployeeDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CalculationsService {



//    public ResponseEntity<?> getMasterMessage(String id) {
//        var response = feignConsumer.getResponse(id);
//        if(response.getBody() == null)
//            ResponseEntity.internalServerError();
//
//        var title = "Master Message of [" + instaceId + "].";
////        var masterMessage = new MasterMessage(title, new Date(), response.getBody());
//        return ResponseEntity.ok().body("");
//    }

    public ResponseEntity<AnnualWageDTO> calculateAnnualWage(EmployeeDTO employee) {
        return ResponseEntity.ok(new AnnualWageDTO(employee.getFirstName(), employee.getWage()*12));
    }
}
