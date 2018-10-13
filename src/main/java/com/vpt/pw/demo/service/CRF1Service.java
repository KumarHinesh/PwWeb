package com.vpt.pw.demo.service;


import com.vpt.pw.demo.Constants.ConstantValues;
import com.vpt.pw.demo.dtos.UltrasoundExaminationDTO;
import com.vpt.pw.demo.dtos.crf1DTO.FormCrf1DTO;
import com.vpt.pw.demo.model.*;
import com.vpt.pw.demo.model.FormCrf1.FormCrf1;
import com.vpt.pw.demo.model.FormCrf1.UltrasoundExamination;
import com.vpt.pw.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CRF1Service {

    @Autowired
    FormCrf1Repository formCrf1Repository;

    @Autowired
    PregnantWomanRepository pregnantWomanRepository;

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    UltrasoundExaminationRepository ultrasoundExaminationRepository;

    @Autowired
    GroupTitleRepository groupTitleRepository;

    @Autowired
    SiteRepository siteRepository;

    @Autowired
    FollowupRepository followupRepository;

    @Transactional
    public String registerPw(FormCrf1DTO formCrf1DTO) {
        Boolean registered = false;

        FormCrf1 form = new FormCrf1();
        Integer attempts = -1;

        PregnantWoman pregnantWoman = new PregnantWoman();
        PregnantWoman mPregnantWoman = null;

        if (formCrf1DTO.getPregnantWomanDTO() != null) {

            pregnantWoman.setName(formCrf1DTO.getPregnantWomanDTO().getName());
            pregnantWoman.setHusbandName(formCrf1DTO.getPregnantWomanDTO().getHusbandName());
            pregnantWoman.setSite(formCrf1DTO.getPregnantWomanDTO().getSite());
            pregnantWoman.setPara(formCrf1DTO.getPregnantWomanDTO().getPara());
            pregnantWoman.setBlock(formCrf1DTO.getPregnantWomanDTO().getBlock());
            pregnantWoman.setStructure(formCrf1DTO.getPregnantWomanDTO().getStructure());
            pregnantWoman.setHouseholdOrFamily(formCrf1DTO.getPregnantWomanDTO().getHouseholdOrFamily());
            pregnantWoman.setWomanNumber(formCrf1DTO.getPregnantWomanDTO().getWomanNumber());

            mPregnantWoman = pregnantWomanRepository.save(pregnantWoman);

            String assId = "EMP" + formCrf1DTO.getTeamDTO().getId() + ":" + pregnantWoman.getSite() + ":" + mPregnantWoman.getId();

            mPregnantWoman.setAssessmentId(assId);

            mPregnantWoman = pregnantWomanRepository.saveAndFlush(mPregnantWoman);
        }

        /*Site site = new Site();
        site.setId(formCrf1DTO.getTeamDTO().getSite().getId());
        site.setSite(formCrf1DTO.getTeamDTO().getSite().getSite());

        GroupTitle teamTitle = new GroupTitle();
        teamTitle.setId(formCrf1DTO.getTeamDTO().getGroupTitle().getId());
        teamTitle.setTitle(formCrf1DTO.getTeamDTO().getGroupTitle().getTitle());

        Team team = new Team();

        team.setId(formCrf1DTO.getTeamDTO().getId());
        team.setPassword(formCrf1DTO.getTeamDTO().getPassword());
        team.setSraName(formCrf1DTO.getTeamDTO().getSraName());
        team.setUserName(formCrf1DTO.getTeamDTO().getUserName());
        team.setGroupTitle(teamTitle);
        team.setSite(site);
        team.setStatus(formCrf1DTO.getTeamDTO().getStatus());
*/

        Optional<Team> teamEntity = teamRepository.findById(formCrf1DTO.getTeamDTO().getId());
        form.setTeam(teamEntity.get());
        form.setPregnantWoman(mPregnantWoman);
        form.setId(formCrf1DTO.getId());
        form.setQ02(formCrf1DTO.getQ02());
        form.setQ03(formCrf1DTO.getQ03());
        form.setQ17(formCrf1DTO.getQ17());
        form.setQ18(formCrf1DTO.getQ18());
        form.setQ19(formCrf1DTO.getQ19());
        form.setQ38(formCrf1DTO.getQ38());

        FormCrf1 mformCrf1 = formCrf1Repository.save(form);

        if (formCrf1DTO.getUltrasoundExaminationDTOS() != null && !formCrf1DTO.getUltrasoundExaminationDTOS().isEmpty()) {
            List<UltrasoundExaminationDTO> ultrasoundExaminationDTO = formCrf1DTO.getUltrasoundExaminationDTOS();
            for (UltrasoundExaminationDTO tmp : ultrasoundExaminationDTO) {
                UltrasoundExamination ultrasoundExamination = new UltrasoundExamination();
                ultrasoundExamination.setFormCrf1(mformCrf1);
                ultrasoundExamination.setQ20(tmp.getQ20());
                ultrasoundExamination.setQ21(tmp.getQ21());
                ultrasoundExamination.setQ22(tmp.getQ22());
                ultrasoundExamination.setQ23(tmp.getQ23());
                ultrasoundExamination.setQ24(tmp.getQ24());
                ultrasoundExamination.setQ25(tmp.getQ25());
                ultrasoundExamination.setQ26(tmp.getQ26());
                ultrasoundExamination.setQ27(tmp.getQ27());
                ultrasoundExamination.setQ28(tmp.getQ28());
                ultrasoundExamination.setQ29(tmp.getQ29());
                ultrasoundExamination.setQ30(tmp.getQ30());
                ultrasoundExamination.setQ31(tmp.getQ31());
                ultrasoundExamination.setQ32(tmp.getQ32());
                ultrasoundExamination.setQ33(tmp.getQ33());
                ultrasoundExamination.setQ34(tmp.getQ34());
                ultrasoundExamination.setQ35(tmp.getQ35());
                ultrasoundExamination.setQ36(tmp.getQ36());
                ultrasoundExamination.setQ37(tmp.getQ37());

                ultrasoundExaminationRepository.save(ultrasoundExamination);
            }
        }


        // genrating the followUp for group_2
        Followups followups = new Followups();
        followups.setCrf("ANC");
        followups.setStartDate(form.getQ02());
        followups.setFollowUpNo("1");
        followups.setPregnantWoman(mPregnantWoman);

        Optional<GroupTitle> groupEntity = groupTitleRepository.findById(ConstantValues.GROUP_2_ID);
        followups.setGroupTitle(groupEntity.get());

        Optional<Site> siteEntity = siteRepository.findById(1);
        followups.setSite(siteEntity.get());
        followupRepository.save(followups);


        // genrating the followUp for group_2
        followups = new Followups();
        followups.setCrf("crf-2");
        followups.setStartDate(form.getQ02());

//           Integer days = Integer.parseInt(formCrf1DTO.getUltrasoundExaminationDTOS().get(0).getQ30());

        followups.setEndDate("20-11-2018");
        followups.setFollowUpNo("1");
        followups.setPregnantWoman(mPregnantWoman);

        groupEntity = groupTitleRepository.findById(ConstantValues.GROUP_3_ID);
        followups.setGroupTitle(groupEntity.get());
        followups.setSite(siteEntity.get());
        followupRepository.save(followups);


        if (mformCrf1 != null)
            return "sended data";
        else
            return "Sorry data not send";

    }

    public String getEndDate(Integer days) {
        String endDate = "";

        double weeks = days / 7;

        return endDate;
    }

}
