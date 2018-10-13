package com.vpt.pw.demo.Controllers;

import com.vpt.pw.demo.dtos.FormCrf2DTO;
import com.vpt.pw.demo.service.CRF2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/form/crf/2")
public class CRF2Controller {

    @Autowired
    CRF2Service crf2Service;

    @PostMapping(value = "/save", produces = "application/json", consumes = "application/json")
    public FormCrf2DTO saveData(@RequestBody FormCrf2DTO formCrf2DTO) {

        formCrf2DTO = crf2Service.saveData(formCrf2DTO);
        return formCrf2DTO;
    }
}
