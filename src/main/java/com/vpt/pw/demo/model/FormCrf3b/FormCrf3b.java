package com.vpt.pw.demo.model.FormCrf3b;

import com.vpt.pw.demo.model.PregnantWoman;
import com.vpt.pw.demo.model.Studies;
import com.vpt.pw.demo.model.Team;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "FORM_CRF_3B")
public class FormCrf3b {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    @Column(name = "form_crf_3b_id")
    private Integer id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "assis_id")
    private PregnantWoman pregnantWoman;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "study_id")
    private Studies studies;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "team_id")
    private Team team;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_2")
    private String q02;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_3")
    private String q03;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_13_a")
    private String q13a;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_13_b")
    private String q13b;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_13_c")
    private String q13c;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_13_d")
    private String q13d;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_13_e")
    private String q13e;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_13_f")
    private String q13f;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_13_g")
    private String q13g;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_13_h")
    private String q13h;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_13_i")
    private String q13i;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_13_j")
    private String q13j;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_13_k")
    private String q13k;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_13_l")
    private String q13l;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_13_m")
    private String q13m;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_13_n")
    private String q13n;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_13_o")
    private String q13o;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_14")
    private String q14;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_15_a")
    private String q15a;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_15_b")
    private String q15b;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_15_c")
    private String q15c;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_15_d")
    private String q15d;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_15_e")
    private String q15e;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_15_f")
    private String q15f;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_15_g")
    private String q15g;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_15_h")
    private String q15h;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_15_i")
    private String q15i;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_15_j")
    private String q15j;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_15_k")
    private String q15k;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_15_l")
    private String q15l;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_15_m")
    private String q15m;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_15_n")
    private String q15n;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_15_o")
    private String q15o;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_15_p")
    private String q15p;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_15_q")
    private String q15q;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_15_r")
    private String q15r;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_16")
    private String q16;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_17")
    private String q17;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_19")
    private String q19;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_20")
    private String q20;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_21")
    private String q21;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_22")
    private String q22;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_23")
    private String q23;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_24")
    private String q24;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_25")
    private String q25;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_26")
    private String q26;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_27")
    private String q27;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_28")
    private String q28;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_29")
    private String q29;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_30")
    private String q30;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_31")
    private String q31;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_32")
    private String q32;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_33")
    private String q33;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_34")
    private String q34;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_35")
    private String q35;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_36")
    private String q36;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_37")
    private String q37;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_38")
    private String q38;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_39")
    private String q39;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_40")
    private String q40;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_41")
    private String q41;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_42")
    private String q42;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_43a")
    private String q43a;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_43b")
    private String q43b;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_43c")
    private String q43c;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_43d")
    private String q43d;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_43e")
    private String q43e;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_43f")
    private String q43f;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_43g")
    private String q43g;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_43h")
    private String q43h;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_43i")
    private String q43i;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_43j")
    private String q43j;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_43k")
    private String q43k;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_44")
    private String q44;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_45")
    private String q45;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_46")
    private String q46;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_47")
    private String q47;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_48")
    private String q48;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_49")
    private String q49;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_50")
    private String q50;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_51")
    private String q51;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_52")
    private String q52;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_53")
    private String q53;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_54")
    private String q54;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_55")
    private String q55;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_56")
    private String q56;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_57")
    private String q57;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_58")
    private String q58;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_59")
    private String q59;

    @Column(columnDefinition = "TEXT", name = "pw_crf3b_60")
    private String q60;


}
