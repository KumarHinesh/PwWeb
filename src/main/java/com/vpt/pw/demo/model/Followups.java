package com.vpt.pw.demo.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "FOLLOWUPS")
public class Followups {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    @Column(name = "followup_ID")
    private Long id;

    @Column(name = "start_date")
    private String startDate;

    @Column(name = "end_date")
    private String endDate;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "pw_assis_id")
    private PregnantWoman pregnantWoman;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "group_title")
    private GroupTitle groupTitle;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "site")
    private Site site;

    @Column(name = "followup_no")
    private String followUpNo;

    @Column(name = "for_crf")
    private String crf;

    @Column(name = "status")
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public PregnantWoman getPregnantWoman() {
        return pregnantWoman;
    }

    public void setPregnantWoman(PregnantWoman pregnantWoman) {
        this.pregnantWoman = pregnantWoman;
    }

    public GroupTitle getGroupTitle() {
        return groupTitle;
    }

    public void setGroupTitle(GroupTitle groupTitle) {
        this.groupTitle = groupTitle;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public String getFollowUpNo() {
        return followUpNo;
    }

    public void setFollowUpNo(String followUpNo) {
        this.followUpNo = followUpNo;
    }

    public String getCrf() {
        return crf;
    }

    public void setCrf(String crf) {
        this.crf = crf;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
