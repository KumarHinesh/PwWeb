package com.vpt.pw.demo.Controllers;


import com.vpt.pw.demo.dtos.crf1DTO.FormCrf1DTO;
import com.vpt.pw.demo.service.CRF1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/form/crf3b")
public class CRF3bController {

    @Autowired
    private CRF1Service crf1Service;

    //@PostMapping(value = "/register", produces="application/json", consumes="application/json")
    @PostMapping("/save")
    public String registerPW(@RequestBody FormCrf1DTO form) {
        String resp = crf1Service.registerPw(form);

        return resp;
    }


    /*// show data
    @PostMapping("/show")
    public String showCrf1All(@RequestBody String str) {
        String resp =  crf1Service.registerPw(form);

        return resp;
    }*/

}
