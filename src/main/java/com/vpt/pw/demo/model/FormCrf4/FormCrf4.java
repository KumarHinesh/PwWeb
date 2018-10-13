package com.vpt.pw.demo.model.FormCrf4;

import com.vpt.pw.demo.model.Studies;
import com.vpt.pw.demo.model.Team;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "FORM_CRF_4")
public class FormCrf4 {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    @Column(name = "form_crf_4_id")
    private Integer id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "team_id")
    private Team team;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "study_id")
    private Studies studies;

    @Column(name = "followup_num")
    private Integer followupNumber = -1;

    @Column(name = "pw_crf4_2")
    private String q02;

    @Column(name = "pw_crf4_3")
    private String q03;

    @Column(name = "pw_crf4_18")
    private String q18;

    @Column(name = "pw_crf4_19")
    private String q19;

    @Column(name = "pw_crf4_20")
    private String q20;

    @Column(name = "pw_crf4_21")
    private String q21;

    @Column(name = "pw_crf4_22")
    private String q22;

    @Column(name = "pw_crf4_23")
    private String q23;

    @Column(name = "pw_crf4_24")
    private String q24;

    @Column(name = "pw_crf4_25")
    private String q25;

    @Column(name = "pw_crf4_26")
    private String q26;

    @Column(name = "pw_crf4_27")
    private String q27;

    @Column(name = "pw_crf4_28")
    private String q28;

    @Column(name = "pw_crf4_29")
    private String q29;

    @Column(name = "pw_crf4_30")
    private String q30;

    @Column(name = "pw_crf4_31")
    private String q31;

    @Column(name = "pw_crf4_32a")
    private String q32a;

    @Column(name = "pw_crf4_32b")
    private String q32b;

    @Column(name = "pw_crf4_32c")
    private String q32c;

    @Column(name = "pw_crf4_32d")
    private String q32d;

    @Column(name = "pw_crf4_32e")
    private String q32e;

    @Column(name = "pw_crf4_32f")
    private String q32f;

    @Column(name = "pw_crf4_33")
    private String q33;

    @Column(name = "pw_crf4_34a")
    private String q34a;

    @Column(name = "pw_crf4_34b")
    private String q34b;

    @Column(name = "pw_crf4_34c")
    private String q34c;

    @Column(name = "pw_crf4_34d")
    private String q34d;

    @Column(name = "pw_crf4_34e")
    private String q34e;

    @Column(name = "pw_crf4_35a")
    private String q35a;

    @Column(name = "pw_crf4_35b")
    private String q35b;

    @Column(name = "pw_crf4_35c")
    private String q35c;

    @Column(name = "pw_crf4_35d")
    private String q35d;

    @Column(name = "pw_crf4_35e")
    private String q35e;

    @Column(name = "pw_crf4_35f")
    private String q35f;

    @Column(name = "pw_crf4_35g")
    private String q35g;

    @Column(name = "pw_crf4_35h")
    private String q35h;

    @Column(name = "pw_crf4_35i")
    private String q35i;

    @Column(name = "pw_crf4_35j")
    private String q35j;

    @Column(name = "pw_crf4_35k")
    private String q35k;

    @Column(name = "pw_crf4_35l")
    private String q35l;

    @Column(name = "pw_crf4_36")
    private String q36;

    @Column(name = "pw_crf4_39")
    private String q39;

    @Column(name = "counsil_start_time")
    private String counsilStartTime;

    @Column(name = "counsil_end_time")
    private String counsilEndTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Studies getStudies() {
        return studies;
    }

    public void setStudies(Studies studies) {
        this.studies = studies;
    }

    public Integer getFollowupNumber() {
        return followupNumber;
    }

    public void setFollowupNumber(Integer followupNumber) {
        this.followupNumber = followupNumber;
    }

    public String getQ02() {
        return q02;
    }

    public void setQ02(String q02) {
        this.q02 = q02;
    }

    public String getQ03() {
        return q03;
    }

    public void setQ03(String q03) {
        this.q03 = q03;
    }

    public String getQ18() {
        return q18;
    }

    public void setQ18(String q18) {
        this.q18 = q18;
    }

    public String getQ19() {
        return q19;
    }

    public void setQ19(String q19) {
        this.q19 = q19;
    }

    public String getQ20() {
        return q20;
    }

    public void setQ20(String q20) {
        this.q20 = q20;
    }

    public String getQ21() {
        return q21;
    }

    public void setQ21(String q21) {
        this.q21 = q21;
    }

    public String getQ22() {
        return q22;
    }

    public void setQ22(String q22) {
        this.q22 = q22;
    }

    public String getQ23() {
        return q23;
    }

    public void setQ23(String q23) {
        this.q23 = q23;
    }

    public String getQ24() {
        return q24;
    }

    public void setQ24(String q24) {
        this.q24 = q24;
    }

    public String getQ25() {
        return q25;
    }

    public void setQ25(String q25) {
        this.q25 = q25;
    }

    public String getQ26() {
        return q26;
    }

    public void setQ26(String q26) {
        this.q26 = q26;
    }

    public String getQ27() {
        return q27;
    }

    public void setQ27(String q27) {
        this.q27 = q27;
    }

    public String getQ28() {
        return q28;
    }

    public void setQ28(String q28) {
        this.q28 = q28;
    }

    public String getQ29() {
        return q29;
    }

    public void setQ29(String q29) {
        this.q29 = q29;
    }

    public String getQ30() {
        return q30;
    }

    public void setQ30(String q30) {
        this.q30 = q30;
    }

    public String getQ31() {
        return q31;
    }

    public void setQ31(String q31) {
        this.q31 = q31;
    }

    public String getQ32a() {
        return q32a;
    }

    public void setQ32a(String q32a) {
        this.q32a = q32a;
    }

    public String getQ32b() {
        return q32b;
    }

    public void setQ32b(String q32b) {
        this.q32b = q32b;
    }

    public String getQ32c() {
        return q32c;
    }

    public void setQ32c(String q32c) {
        this.q32c = q32c;
    }

    public String getQ32d() {
        return q32d;
    }

    public void setQ32d(String q32d) {
        this.q32d = q32d;
    }

    public String getQ32e() {
        return q32e;
    }

    public void setQ32e(String q32e) {
        this.q32e = q32e;
    }

    public String getQ32f() {
        return q32f;
    }

    public void setQ32f(String q32f) {
        this.q32f = q32f;
    }

    public String getQ33() {
        return q33;
    }

    public void setQ33(String q33) {
        this.q33 = q33;
    }

    public String getQ34a() {
        return q34a;
    }

    public void setQ34a(String q34a) {
        this.q34a = q34a;
    }

    public String getQ34b() {
        return q34b;
    }

    public void setQ34b(String q34b) {
        this.q34b = q34b;
    }

    public String getQ34c() {
        return q34c;
    }

    public void setQ34c(String q34c) {
        this.q34c = q34c;
    }

    public String getQ34d() {
        return q34d;
    }

    public void setQ34d(String q34d) {
        this.q34d = q34d;
    }

    public String getQ34e() {
        return q34e;
    }

    public void setQ34e(String q34e) {
        this.q34e = q34e;
    }

    public String getQ35a() {
        return q35a;
    }

    public void setQ35a(String q35a) {
        this.q35a = q35a;
    }

    public String getQ35b() {
        return q35b;
    }

    public void setQ35b(String q35b) {
        this.q35b = q35b;
    }

    public String getQ35c() {
        return q35c;
    }

    public void setQ35c(String q35c) {
        this.q35c = q35c;
    }

    public String getQ35d() {
        return q35d;
    }

    public void setQ35d(String q35d) {
        this.q35d = q35d;
    }

    public String getQ35e() {
        return q35e;
    }

    public void setQ35e(String q35e) {
        this.q35e = q35e;
    }

    public String getQ35f() {
        return q35f;
    }

    public void setQ35f(String q35f) {
        this.q35f = q35f;
    }

    public String getQ35g() {
        return q35g;
    }

    public void setQ35g(String q35g) {
        this.q35g = q35g;
    }

    public String getQ35h() {
        return q35h;
    }

    public void setQ35h(String q35h) {
        this.q35h = q35h;
    }

    public String getQ35i() {
        return q35i;
    }

    public void setQ35i(String q35i) {
        this.q35i = q35i;
    }

    public String getQ35j() {
        return q35j;
    }

    public void setQ35j(String q35j) {
        this.q35j = q35j;
    }

    public String getQ35k() {
        return q35k;
    }

    public void setQ35k(String q35k) {
        this.q35k = q35k;
    }

    public String getQ35l() {
        return q35l;
    }

    public void setQ35l(String q35l) {
        this.q35l = q35l;
    }

    public String getQ36() {
        return q36;
    }

    public void setQ36(String q36) {
        this.q36 = q36;
    }

    public String getQ39() {
        return q39;
    }

    public void setQ39(String q39) {
        this.q39 = q39;
    }

    public String getCounsilStartTime() {
        return counsilStartTime;
    }

    public void setCounsilStartTime(String counsilStartTime) {
        this.counsilStartTime = counsilStartTime;
    }

    public String getCounsilEndTime() {
        return counsilEndTime;
    }

    public void setCounsilEndTime(String counsilEndTime) {
        this.counsilEndTime = counsilEndTime;
    }
}
