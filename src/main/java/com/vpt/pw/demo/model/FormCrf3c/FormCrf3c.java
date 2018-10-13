package com.vpt.pw.demo.model.FormCrf3c;

import com.vpt.pw.demo.model.Studies;
import com.vpt.pw.demo.model.Team;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "FORM_CRF_3C")
public class FormCrf3c {

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "team_id")
    private Team team;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "study_id")
    private Studies studies;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "formCrf3c")
    private List<MuacCrf3c> heightLwCrf3c;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "formCrf3c")
    private List<AbdominalCircumferenceOfPWCrf3c> weightLwCrf3c;

    /*@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "formCrf3c")
    private List<BabyLengthCrf3c> babyLengthCrf3c;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "formCrf3c")
    private List<MuacBabyCrf3c> muacBabyCrf3c;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "formCrf3c")
    private List<ChildWeightCrf3c> childWeightCrf3c;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "formCrf3c")
    private List<FrontHeadCircumferenceCrf3c> frontHeadCircumferenceCrf3c;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "formCrf3c")
    private List<MuacLwCrf3c> muacLwCrf3c;
*/
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    @Column(name = "form_crf_3c_id")
    private Integer id;

    @Column(name = "c_start_time")
    private String counsilStartTime;

    @Column(name = "c_end_time")
    private String counsilEndTime;

    @Column(name = "lw_crf3c_2")
    private String q2;

    @Column(name = "lw_crf3c_3")
    private String q3;

    @Column(name = "lw_crf3c_14")
    private String q14;

    @Column(name = "lw_crf3c_16")
    private String q16;

    @Column(name = "lw_crf3c_17")
    private String q17;

    @Column(name = "lw_crf3c_18")
    private String q18;

    @Column(name = "lw_crf3c_19")
    private String q19;

    @Column(name = "lw_crf3c_23")
    private String q23;

    @Column(name = "lw_crf3c_24")
    private String q24;

    @Column(name = "lw_crf3c_25")
    private String q25;

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

    public List<MuacCrf3c> getHeightLwCrf3c() {
        return heightLwCrf3c;
    }

    public void setHeightLwCrf3c(List<MuacCrf3c> heightLwCrf3c) {
        this.heightLwCrf3c = heightLwCrf3c;
    }

    public List<AbdominalCircumferenceOfPWCrf3c> getWeightLwCrf3c() {
        return weightLwCrf3c;
    }

    public void setWeightLwCrf3c(List<AbdominalCircumferenceOfPWCrf3c> weightLwCrf3c) {
        this.weightLwCrf3c = weightLwCrf3c;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public String getQ3() {
        return q3;
    }

    public void setQ3(String q3) {
        this.q3 = q3;
    }

    public String getQ14() {
        return q14;
    }

    public void setQ14(String q14) {
        this.q14 = q14;
    }

    public String getQ16() {
        return q16;
    }

    public void setQ16(String q16) {
        this.q16 = q16;
    }

    public String getQ17() {
        return q17;
    }

    public void setQ17(String q17) {
        this.q17 = q17;
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
}
