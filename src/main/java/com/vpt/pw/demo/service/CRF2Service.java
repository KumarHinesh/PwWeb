package com.vpt.pw.demo.service;

import com.vpt.pw.demo.dtos.FormCrf2DTO;
import com.vpt.pw.demo.dtos.PregnantWomanDTO;
import com.vpt.pw.demo.exceptions.RestException;
import com.vpt.pw.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class CRF2Service {

    @Autowired
    FormCrf2Repository formCrf2Repository;

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    PregnantWomanRepository pregnantWomanRepository;

    @Autowired
    MuacCrf2Repository muacCrf2Repository;

    @Autowired
    PwHeightCrf2Repository pwHeightCrf2Repository;

    @Autowired
    PwWeightCrf2Repository pwWeightCrf2Reposiitory;


/*
    @Autowired
    FormCrf1Repository formCrf1Repostiory;
*/


    public FormCrf2DTO saveData(FormCrf2DTO formCrf2DTO) {

        if (formCrf2DTO == null) {
            throw new RestException(HttpStatus.NOT_FOUND, "FormCrf2DTO is null");
        }

        PregnantWomanDTO pregnantWomanDTO = formCrf2DTO.getPregnantWomanDTO();
        if (pregnantWomanDTO == null || pregnantWomanDTO.getAssessmentId() == null || pregnantWomanDTO.getAssessmentId().isEmpty()) {
            throw new RestException(HttpStatus.NOT_FOUND, "PregnantWoman AssessmentId is required");
        }

      /*  PregnantWoman mPregnantWoman = pregnantWomanRepository.findByAssessmentId(pregnantWoman.getAssessmentId());

        if(mPregnantWoman == null) {
            throw new RestException(HttpStatus.NOT_FOUND, "PregnantWoman Data Not Found IN DB");
        }

        FormCrf2 formCrf2 = new FormCrf2();

        TeamDTO teamDTO = formCrf2DTO.getTeam();
        if(teamDTO != null) {
            Integer id = teamDTO.getId();
            Team team = teamRepository.findById(id).get();
            formCrf2.setTeam(team);
        }
*/
  /*      formCrf2.setDateOfAttempt(formCrf2DTO.getDateOfAttempt());
        formCrf2.setTimeOfAttempt(formCrf2DTO.getTimeOfAttempt());
        formCrf2.setTimeOfEnd(formCrf2DTO.getTimeOfEnd());
        formCrf2.setRefusedReason(formCrf2DTO.getRefusedReason());
        formCrf2.setPregnantWoman(mPregnantWoman);
        formCrf2.setQ8(formCrf2DTO.getQ8());
        formCrf2.setQ17(formCrf2DTO.getQ17());
        formCrf2.setQ18(formCrf2DTO.getQ18());
        formCrf2.setQ19(formCrf2DTO.getQ19());
        formCrf2.setQ20(formCrf2DTO.getQ20());
        formCrf2.setQ21(formCrf2DTO.getQ21());
        formCrf2.setQ22(formCrf2DTO.getQ22());
        formCrf2.setQ23(formCrf2DTO.getQ23());
        formCrf2.setQ24(formCrf2DTO.getQ24());
        formCrf2.setQ25(formCrf2DTO.getQ25());
        formCrf2.setQ26(formCrf2DTO.getQ26());
        formCrf2.setQ27(formCrf2DTO.getQ27());
        formCrf2.setQ28(formCrf2DTO.getQ28());
        formCrf2.setQ30(formCrf2DTO.getQ30());
        formCrf2.setQ31(formCrf2DTO.getQ31());
        formCrf2.setQ32(formCrf2DTO.getQ32());
        formCrf2.setQ34(formCrf2DTO.getQ34());
        formCrf2.setQ35(formCrf2DTO.getQ35());
        formCrf2.setQ36(formCrf2DTO.getQ36());
        formCrf2.setQ37(formCrf2DTO.getQ37());
        formCrf2.setQ38A(formCrf2DTO.getQ38A());
        formCrf2.setQ38B(formCrf2DTO.getQ38B());
        formCrf2.setQ39(formCrf2DTO.getQ39());
        formCrf2.setQ40(formCrf2DTO.getQ40());
        formCrf2.setQ41A(formCrf2DTO.getQ41A());
        formCrf2.setQ41B(formCrf2DTO.getQ41B());
        formCrf2.setQ41C(formCrf2DTO.getQ41C());
        formCrf2.setQ41D(formCrf2DTO.getQ41D());
        formCrf2.setQ41E(formCrf2DTO.getQ41E());
        formCrf2.setQ41F(formCrf2DTO.getQ41F());
        formCrf2.setQ41A(formCrf2DTO.getQ41A());
        formCrf2.setQ42(formCrf2DTO.getQ42());
        formCrf2.setQ43(formCrf2DTO.getQ43());
        formCrf2.setQ44(formCrf2DTO.getQ44());
        formCrf2.setQ45(formCrf2DTO.getQ45());
        formCrf2.setQ46(formCrf2DTO.getQ46());
        formCrf2.setQ47(formCrf2DTO.getQ47());
        formCrf2.setQ48(formCrf2DTO.getQ48());
        formCrf2.setQ49(formCrf2DTO.getQ49());
        formCrf2.setQ50(formCrf2DTO.getQ50());
        formCrf2.setQ51(formCrf2DTO.getQ51());
*/

  /*      if (formCrf2DTO.getChildWeights() != null ) {
            List<ChildWeightDTO> childWeightDTOs = formCrf2DTO.getChildWeights();

            List<ChildWeight> childWeights = new ArrayList<ChildWeight>();

            for(ChildWeightDTO tmpDto: childWeightDTOs) {

                ChildWeight childWeight = new ChildWeight();
                childWeight.setForm(formCrf2);
                childWeight.setDifference(tmpDto.getDifference());
                childWeight.setReader1(tmpDto.getReader1());
                childWeight.setReader2(tmpDto.getReader2());
                childWeight.setReaderCode1(tmpDto.getReaderCode1());
                childWeight.setReaderCode2(tmpDto.getReaderCode2());

                childWeights.add(childWeight);
                childWeight.setForm(formCrf2);
            }

            formCrf2.setChildWeights(childWeights);
        }

        if(formCrf2DTO.getArmReadings() != null) {
            List<ArmReadingDTO> armReadingDTOS = formCrf2DTO.getArmReadings();
            List<ArmReading> armReadings = new ArrayList<ArmReading>();

            for(ArmReadingDTO tmpDto: armReadingDTOS) {
                ArmReading armReading = new ArmReading();

                armReading.setDifference(tmpDto.getDifference());
                armReading.setReader1(tmpDto.getReader1());
                armReading.setReader2(tmpDto.getReader2());

                armReading.setReaderCode1(tmpDto.getReaderCode1());
                armReading.setReaderCode2(tmpDto.getReaderCode2());

                armReading.setForm(formCrf2);
                armReadings.add(armReading);
            }
            formCrf2.setArmReadings(armReadings);
        }

        formCrf2 = formCrf2Repository.save(formCrf2);

        if(formCrf2 != null) {
            formCrf2DTO.setId(formCrf2.getId());
        }

        if(formCrf2DTO.getFollowupStatus() == Constants.FOLLOWUP_COMPLETED) {
            Optional<Followups> byId = followupsRepository.findById(formCrf2DTO.getFollowupId());
            byId.ifPresent(f -> {
                f.setStatus(Constants.FOLLOWUP_COMPLETED);
                followupsRepository.save(f);
            });

            byId.orElseThrow(()-> new RestException(HttpStatus.FORBIDDEN, "Followup Id is Missing"));
        }

        generateFollowups(formCrf2, formCrf2DTO);*/
        return formCrf2DTO;
    }

   /* private void generateFollowups(FormCrf2 formCrf2, FormCrf2DTO formCrf2DTO) {
        Integer visitStatus = formCrf2DTO.getVisitStatus();
        if(formCrf2DTO.getFormStatus() == Constants.INCOMPLETE && (visitStatus == 1 || visitStatus == 2)) {
            Followups followups = new Followups();

            Integer teamId = formCrf2DTO.getTeam().getId();
            Team team = teamRepository.findById(teamId).get();

            Site site = team.getSite();
            FormCrf1 byAssistIdAndStatus = formCrf1Repostiory.findByAssistIdAndStatus(formCrf2.getPregnantWoman().getAssessmentId(), Constants.COMPLETED);

            String strCurrDate = "";
//            try {
                strCurrDate = formCrf2DTO.getQ27();
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }

            followups.setStatus(Constants.FOLLOWUP_PENDING);
            followups.setTeam(team);
            followups.setDescription("Visit to " +formCrf2DTO.getPregnantWoman().getName());
            followups.setSite(site);
            followups.setDate(strCurrDate);

            PregnantWomanDTO pregnantWoman = formCrf2DTO.getPregnantWoman();

            String json = Utils.convertToJson(
                    "assistId:" +pregnantWoman.getAssessmentId(),
                    "name:" +pregnantWoman.getName(),
                    "husbandName:" +pregnantWoman.getHusbandName(),
                    "site:" +pregnantWoman.getDssAddress().getSite(),
                    "para:"+pregnantWoman.getDssAddress().getPara(),
                    "block:"+pregnantWoman.getDssAddress().getBlock(),
                    "structure:" +pregnantWoman.getDssAddress().getStructure(),
                    "householdOrFamily:" +pregnantWoman.getDssAddress().getHouseholdOrFamily(),
                    "womanNumber:" +pregnantWoman.getDssAddress().getWomanNumber(),
                    "lmp:", byAssistIdAndStatus.getQ26()
            );
            followups.setDependsOn(json);

            followupsRepository.save(followups);
        }
    }*/
}
