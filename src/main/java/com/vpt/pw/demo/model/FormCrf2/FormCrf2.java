package com.vpt.pw.demo.model.FormCrf2;

import com.vpt.pw.demo.model.PregnantWoman;
import com.vpt.pw.demo.model.Team;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "FORM_CRF_2")
public class FormCrf2 {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    @Column(name = "form_crf_2")
    private Integer id;

    @Column(name = "pw_crf2_2")
    private String q02;

    @Column(name = "pw_crf2_3")
    private String q03;

    @Column(name = "pw_crf2_17")
    private String q17;

    @Column(name = "pw_crf2_18")
    private String q18;

    @Column(name = "pw_crf2_19")
    private String q19;

    @Column(name = "pw_crf2_20")
    private String q20;

    @Column(name = "pw_crf2_21")
    private String q21;

    @Column(name = "pw_crf2_22")
    private String q22;

    @Column(name = "pw_crf2_23")
    private String q23;

    @Column(name = "pw_crf2_27")
    private String q27;

    @Column(name = "pw_crf2_29")
    private String q29;

    @Column(name = "pw_crf2_31")
    private String q31;

    @Column(name = "pw_crf2_32")
    private String q32;

    @Column(name = "pw_crf2_33")
    private String q33;

    @Column(name = "pw_crf2_34")
    private String q34;

    @Column(name = "pw_crf2_35")
    private String q35;

    @Column(name = "pw_crf2_36")
    private String q36;

    @Column(name = "pw_crf2_37")
    private String q37;

    @Column(name = "pw_crf2_38_a")
    private String q38A;

    @Column(name = "pw_crf2_38_b")
    private String q38B;

    @Column(name = "pw_crf2_39")
    private String q39;

    @Column(name = "pw_crf2_40")
    private String q40;

    @Column(name = "pw_crf2_41_a")
    private String q41A;

    @Column(name = "pw_crf2_41_b")
    private String q41B;

    @Column(name = "pw_crf2_41_c")
    private String q41C;

    @Column(name = "pw_crf2_41_d")
    private String q41D;

    @Column(name = "pw_crf2_41_e")
    private String q41E;

    @Column(name = "pw_crf2_41_f")
    private String q41F;

    @Column(name = "pw_crf2_41_g")
    private String q41G;

    @Column(name = "pw_crf2_41_h")
    private String q41H;

    @Column(name = "pw_crf2_41_i")
    private String q41I;

    @Column(name = "pw_crf2_41_j")
    private String q41J;

    @Column(name = "pw_crf2_42")
    private String q42;

    @Column(name = "pw_crf2_43")
    private String q43;

    @Column(name = "pw_crf2_44")
    private String q44;

    @Column(name = "pw_crf2_45")
    private String q45;

    @Column(name = "pw_crf2_46")
    private String q46;

    @Column(name = "pw_crf2_47")
    private String q47;

    @Column(name = "pw_crf2_48")
    private String q48;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "form")
    private List<PwWeightCrf2> pwWeightCrf2;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "form")
    private List<MuacCrf2> muacCrf2;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "form")
    private List<PwHeightCrf2> pwHeightCrf2;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "pw_id")
    private PregnantWoman pregnantWoman;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "team_id")
    private Team team;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getQ27() {
        return q27;
    }

    public void setQ27(String q27) {
        this.q27 = q27;
    }

    public String getQ29() {
        return q29;
    }

    public void setQ29(String q29) {
        this.q29 = q29;
    }

    public String getQ31() {
        return q31;
    }

    public void setQ31(String q31) {
        this.q31 = q31;
    }

    public String getQ32() {
        return q32;
    }

    public void setQ32(String q32) {
        this.q32 = q32;
    }

    public String getQ33() {
        return q33;
    }

    public void setQ33(String q33) {
        this.q33 = q33;
    }

    public String getQ34() {
        return q34;
    }

    public void setQ34(String q34) {
        this.q34 = q34;
    }

    public String getQ35() {
        return q35;
    }

    public void setQ35(String q35) {
        this.q35 = q35;
    }

    public String getQ36() {
        return q36;
    }

    public void setQ36(String q36) {
        this.q36 = q36;
    }

    public String getQ37() {
        return q37;
    }

    public void setQ37(String q37) {
        this.q37 = q37;
    }

    public String getQ38A() {
        return q38A;
    }

    public void setQ38A(String q38A) {
        this.q38A = q38A;
    }

    public String getQ38B() {
        return q38B;
    }

    public void setQ38B(String q38B) {
        this.q38B = q38B;
    }

    public String getQ39() {
        return q39;
    }

    public void setQ39(String q39) {
        this.q39 = q39;
    }

    public String getQ40() {
        return q40;
    }

    public void setQ40(String q40) {
        this.q40 = q40;
    }

    public String getQ41A() {
        return q41A;
    }

    public void setQ41A(String q41A) {
        this.q41A = q41A;
    }

    public String getQ41B() {
        return q41B;
    }

    public void setQ41B(String q41B) {
        this.q41B = q41B;
    }

    public String getQ41C() {
        return q41C;
    }

    public void setQ41C(String q41C) {
        this.q41C = q41C;
    }

    public String getQ41D() {
        return q41D;
    }

    public void setQ41D(String q41D) {
        this.q41D = q41D;
    }

    public String getQ41E() {
        return q41E;
    }

    public void setQ41E(String q41E) {
        this.q41E = q41E;
    }

    public String getQ41F() {
        return q41F;
    }

    public void setQ41F(String q41F) {
        this.q41F = q41F;
    }

    public String getQ41G() {
        return q41G;
    }

    public void setQ41G(String q41G) {
        this.q41G = q41G;
    }

    public String getQ41H() {
        return q41H;
    }

    public void setQ41H(String q41H) {
        this.q41H = q41H;
    }

    public String getQ41I() {
        return q41I;
    }

    public void setQ41I(String q41I) {
        this.q41I = q41I;
    }

    public String getQ41J() {
        return q41J;
    }

    public void setQ41J(String q41J) {
        this.q41J = q41J;
    }

    public String getQ42() {
        return q42;
    }

    public void setQ42(String q42) {
        this.q42 = q42;
    }

    public String getQ43() {
        return q43;
    }

    public void setQ43(String q43) {
        this.q43 = q43;
    }

    public String getQ44() {
        return q44;
    }

    public void setQ44(String q44) {
        this.q44 = q44;
    }

    public String getQ45() {
        return q45;
    }

    public void setQ45(String q45) {
        this.q45 = q45;
    }

    public String getQ46() {
        return q46;
    }

    public void setQ46(String q46) {
        this.q46 = q46;
    }

    public String getQ47() {
        return q47;
    }

    public void setQ47(String q47) {
        this.q47 = q47;
    }

    public String getQ48() {
        return q48;
    }

    public void setQ48(String q48) {
        this.q48 = q48;
    }

    public List<PwWeightCrf2> getPwWeightCrf2() {
        return pwWeightCrf2;
    }

    public void setPwWeightCrf2(List<PwWeightCrf2> pwWeightCrf2) {
        this.pwWeightCrf2 = pwWeightCrf2;
    }

    public List<MuacCrf2> getMuacCrf2() {
        return muacCrf2;
    }

    public void setMuacCrf2(List<MuacCrf2> muacCrf2) {
        this.muacCrf2 = muacCrf2;
    }

    public List<PwHeightCrf2> getPwHeightCrf2() {
        return pwHeightCrf2;
    }

    public void setPwHeightCrf2(List<PwHeightCrf2> pwHeightCrf2) {
        this.pwHeightCrf2 = pwHeightCrf2;
    }

    public PregnantWoman getPregnantWoman() {
        return pregnantWoman;
    }

    public void setPregnantWoman(PregnantWoman pregnantWoman) {
        this.pregnantWoman = pregnantWoman;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
