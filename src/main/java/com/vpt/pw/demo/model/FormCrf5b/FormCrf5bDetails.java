package com.vpt.pw.demo.model.FormCrf5b;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "FORM_CRF_5B_DETAILS")
public class FormCrf5bDetails {


    /*public FormCrf5bDetails(FormCrf5bDetails detail, FormCrf5b mForm) {

        this.form = mForm;
        this.id = detail.getId();
        this.q25From = detail.getQ25From();
        this.q25To = detail.getQ25To();
        this.q26 = detail.getQ26();
        this.q27 = detail.getQ27();
        this.q28 = detail.getQ28();
        this.q29 = detail.getQ29();
        this.q30 = detail.getQ30();
        this.q31 = detail.getQ31();
        this.q32 = detail.getQ32();
        this.q33 = detail.getQ33();
        this.q34 = detail.getQ34();
        this.q35 = detail.getQ35();
        this.q36 = detail.getQ36();
        this.q37 = detail.getQ37();
        this.q38 = detail.getQ38();
        this.q39 = detail.getQ39();
        this.q40 = detail.getQ40();
        this.q41 = detail.getQ41();
        this.q42 = detail.getQ42();
        this.q43 = detail.getQ43();
        this.q44 = detail.getQ44();
        this.q45 = detail.getQ45();
        this.q46 = detail.getQ46();
        this.q47 = detail.getQ47();
        this.q48 = detail.getQ48();
        this.q49 = detail.getQ49();

    }*/

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    @Column(name = "form_crf_5b_details_id")
    private Integer id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "form_crf_5b_id")
    private FormCrf5b form;

    @Column(name = "lw_crf5b_22_from")
    private String q22From;

    @Column(name = "lw_crf5b_22_to")
    private String q22To;

    @Column(name = "lw_crf5b_23")
    private String q23;

    @Column(name = "lw_crf5b_24")
    private String q24;

    @Column(name = "lw_crf5b_25")
    private String q25;

    @Column(name = "lw_crf5b_26")
    private String q26;

    @Column(name = "lw_crf5b_27")
    private String q27;

    @Column(name = "lw_crf5b_28")
    private String q28;

    @Column(name = "lw_crf5b_29")
    private String q29;

    @Column(name = "lw_crf5b_30")
    private String q30;

    @Column(name = "lw_crf5b_31")
    private String q31;

    @Column(name = "lw_crf5b_32")
    private String q32;

    @Column(name = "lw_crf5b_33")
    private String q33;

    @Column(name = "lw_crf5b_34")
    private String q34;

    @Column(name = "lw_crf5b_35")
    private String q35;

    @Column(name = "lw_crf5b_36")
    private String q36;

    @Column(name = "lw_crf5b_37")
    private String q37;

    @Column(name = "lw_crf5b_38")
    private String q38;

    @Column(name = "lw_crf5b_39")
    private String q39;

    @Column(name = "lw_crf5b_40")
    private String q40;

    @Column(name = "lw_crf5b_41")
    private String q41;

    @Column(name = "lw_crf5b_42")
    private String q42;

    @Column(name = "lw_crf5b_43")
    private String q43;

    @Column(name = "lw_crf5b_44")
    private String q44;

    @Column(name = "lw_crf5b_45")
    private String q45;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FormCrf5b getForm() {
        return form;
    }

    public void setForm(FormCrf5b form) {
        this.form = form;
    }

    public String getQ22From() {
        return q22From;
    }

    public void setQ22From(String q22From) {
        this.q22From = q22From;
    }

    public String getQ22To() {
        return q22To;
    }

    public void setQ22To(String q22To) {
        this.q22To = q22To;
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

    public String getQ38() {
        return q38;
    }

    public void setQ38(String q38) {
        this.q38 = q38;
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

    public String getQ41() {
        return q41;
    }

    public void setQ41(String q41) {
        this.q41 = q41;
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
}
