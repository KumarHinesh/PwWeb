package com.vpt.pw.demo.model.FormCrf5a;

import com.vpt.pw.demo.model.PregnantWoman;
import com.vpt.pw.demo.model.Studies;
import com.vpt.pw.demo.model.Team;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "FORM_CRF_5A")
public class FormCrf5a {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    @Column(name = "form_crf_5a_id")
    private Integer id;

    @Column(name = "followup_num")
    private Integer followupNumber = -1;

    @Column(name = "pw_crf5a_02")
    private String q02;

    @Column(name = "pw_crf5a_03")
    private String q03;

    @Column(name = "pw_crf5a_18")
    private String q18;

    @Column(name = "pw_crf5a_19")
    private String q19;

    @Column(name = "pw_crf5a_20")
    private String q20;

    @Column(name = "pw_crf5a_21")
    private String q21;

    @Column(name = "pw_crf5a_22")
    private String q22;

    @Column(name = "pw_crf5a_23")
    private String q23;

    @Column(name = "pw_crf5a_24")
    private String q24;

    @Column(name = "pw_crf5a_25")
    private String q25;

    @Column(name = "pw_crf5a_26")
    private String q26;

    @Column(name = "pw_crf5a_27a")
    private String q27a;

    @Column(name = "pw_crf5a_27b")
    private String q27b;

    @Column(name = "pw_crf5a_27c")
    private String q27c;

    @Column(name = "pw_crf5a_27d")
    private String q27d;

    @Column(name = "pw_crf5a_27e")
    private String q27e;

    @Column(name = "pw_crf5a_27f")
    private String q27f;

    @Column(name = "pw_crf5a_28")
    private String q28;

    @Column(name = "pw_crf5a_29a")
    private String q29a;

    @Column(name = "pw_crf5a_29b")
    private String q29b;

    @Column(name = "pw_crf5a_29c")
    private String q29c;

    @Column(name = "pw_crf5a_29d")
    private String q29d;

    @Column(name = "pw_crf5a_29e")
    private String q29e;

    @Column(name = "pw_crf5a_29f")
    private String q29f;

    @Column(name = "pw_crf5a_30")
    private String q30;

    @Column(name = "pw_crf5a_31")
    private String q31;

    @Column(name = "pw_crf5a_32a")
    private String q32a;

    @Column(name = "pw_crf5a_32b")
    private String q32b;

    @Column(name = "pw_crf5a_33a")
    private String q33a;

    @Column(name = "pw_crf5a_33b")
    private String q33b;

    @Column(name = "pw_crf5a_34")
    private String q34;

    @Column(name = "pw_crf5a_35")
    private String q35;

    @Column(name = "pw_crf5a_36")
    private String q36;

    @Column(name = "pw_crf5a_37")
    private String q37;

    @Column(name = "pw_crf5a_38")
    private String q38;

    @Column(name = "pw_crf5a_39a")
    private String q39a;

    @Column(name = "pw_crf5a_39b")
    private String q39b;

    @Column(name = "pw_crf5a_39c")
    private String q39c;

    @Column(name = "pw_crf5a_39d")
    private String q39d;

    @Column(name = "pw_crf5a_39e")
    private String q39e;

    @Column(name = "pw_crf5a_40")
    private String q40;

    @Column(name = "pw_crf5a_41")
    private String q41;

    @Column(name = "pw_crf5a_42")
    private String q42;

    @Column(name = "pw_crf5a_43")
    private String q43;

    @Column(name = "pw_crf5a_44")
    private String q44;

    @Column(name = "pw_crf5a_45")
    private String q45;

    @Column(name = "pw_crf5a_46")
    private String q46;

    @Column(name = "pw_crf5a_47")
    private String q47;

    @Column(name = "pw_crf5a_48")
    private String q48;

    @Column(name = "pw_crf5a_49")
    private String q49;

    @Column(name = "pw_crf5a_50")
    private String q50;

    @Column(name = "pw_crf5a_51")
    private String q51;

    @Column(name = "pw_crf5a_52")
    private String q52;

    @Column(name = "pw_crf5a_53")
    private String q53;

    @Column(name = "pw_crf5a_54")
    private String q54;

    @Column(name = "pw_crf5a_55")
    private String q55;

    @Column(name = "pw_crf5a_56")
    private String q56;

    @Column(name = "pw_crf5a_57")
    private String q57;

    @Column(name = "pw_crf5a_58")
    private String q58;

    @Column(name = "pw_crf5a_59")
    private String q59;

    @Column(name = "pw_crf5a_60")
    private String q60;

    @Column(name = "pw_crf5a_61")
    private String q61;

    @Column(name = "pw_crf5a_62")
    private String q62;

    @Column(name = "pw_crf5a_63")
    private String q63;

    @Column(name = "pw_crf5a_64")
    private String q64;

    @Column(name = "pw_crf5a_65")
    private String q65;

    @Column(name = "pw_crf5a_66")
    private String q66;

    @Column(name = "pw_crf5a_67")
    private String q67;

    @Column(name = "pw_crf5a_68")
    private String q68;

    @Column(name = "pw_crf5a_69")
    private String q69;

    @Column(name = "pw_crf5a_70")
    private String q70;

    @Column(name = "pw_crf5a_71")
    private String q71;

    @Column(name = "pw_crf5a_72a")
    private String q72a;

    @Column(name = "pw_crf5a_72b")
    private String q72b;

    @Column(name = "pw_crf5a_72c")
    private String q72c;

    @Column(name = "pw_crf5a_72d")
    private String q72d;

    @Column(name = "pw_crf5a_72e")
    private String q72e;

    @Column(name = "pw_crf5a_72f")
    private String q72f;

    @Column(name = "pw_crf5a_72g")
    private String q72g;

    @Column(name = "pw_crf5a_73")
    private String q73;

    @Column(name = "pw_crf5a_74")
    private String q74;

    @Column(name = "pw_crf5a_75")
    private String q75;

    @Column(name = "pw_crf5a_76a")
    private String q76a;

    @Column(name = "pw_crf5a_76b")
    private String q76b;

    @Column(name = "pw_crf5a_76c")
    private String q76c;

    @Column(name = "pw_crf5a_76d")
    private String q76d;

    @Column(name = "pw_crf5a_76e")
    private String q76e;

    @Column(name = "pw_crf5a_76f")
    private String q76f;

    @Column(name = "pw_crf5a_76g")
    private String q76g;

    @Column(name = "pw_crf5a_77")
    private String q77;

    @Column(name = "pw_crf5a_78")
    private String q78;

    @Column(name = "pw_crf5a_79")
    private String q79;

    @Column(name = "pw_crf5a_80")
    private String q80;

    @Column(name = "pw_crf5a_81")
    private String q81;

    @Column(name = "pw_crf5a_82")
    private String q82;

    @Column(name = "pw_crf5a_83")
    private String q83;

    @Column(name = "pw_crf5a_84")
    private String q84;

    @Column(name = "pw_crf5a_85")
    private String q85;

    @Column(name = "pw_crf5a_86a")
    private String q86a;

    @Column(name = "pw_crf5a_86b")
    private String q86b;

    @Column(name = "pw_crf5a_86c")
    private String q86c;

    @Column(name = "pw_crf5a_86d")
    private String q86d;

    @Column(name = "pw_crf5a_86e")
    private String q86e;

    @Column(name = "pw_crf5a_86f")
    private String q86f;

    @Column(name = "pw_crf5a_86g")
    private String q86g;

    @Column(name = "pw_crf5a_86h")
    private String q86h;

    @Column(name = "pw_crf5a_86i")
    private String q86i;

    @Column(name = "pw_crf5a_86j")
    private String q86j;

    @Column(name = "pw_crf5a_86k")
    private String q86k;

    @Column(name = "pw_crf5a_86l")
    private String q86l;

    @Column(name = "pw_crf5a_86m")
    private String q86m;

    @Column(name = "pw_crf5a_86n")
    private String q86n;

    @Column(name = "pw_crf5a_86o")
    private String q86o;

    @Column(name = "pw_crf5a_86p")
    private String q86p;

    @Column(name = "counsil_start_time")
    private String counsilStartTime;

    @Column(name = "counsil_end_time")
    private String counsilEndTime;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "team_id")
    private Team team;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "study_id")
    private Studies studies;

    @Transient
    private PregnantWoman pregnantWoman;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getQ27a() {
        return q27a;
    }

    public void setQ27a(String q27a) {
        this.q27a = q27a;
    }

    public String getQ27b() {
        return q27b;
    }

    public void setQ27b(String q27b) {
        this.q27b = q27b;
    }

    public String getQ27c() {
        return q27c;
    }

    public void setQ27c(String q27c) {
        this.q27c = q27c;
    }

    public String getQ27d() {
        return q27d;
    }

    public void setQ27d(String q27d) {
        this.q27d = q27d;
    }

    public String getQ27e() {
        return q27e;
    }

    public void setQ27e(String q27e) {
        this.q27e = q27e;
    }

    public String getQ27f() {
        return q27f;
    }

    public void setQ27f(String q27f) {
        this.q27f = q27f;
    }

    public String getQ28() {
        return q28;
    }

    public void setQ28(String q28) {
        this.q28 = q28;
    }

    public String getQ29a() {
        return q29a;
    }

    public void setQ29a(String q29a) {
        this.q29a = q29a;
    }

    public String getQ29b() {
        return q29b;
    }

    public void setQ29b(String q29b) {
        this.q29b = q29b;
    }

    public String getQ29c() {
        return q29c;
    }

    public void setQ29c(String q29c) {
        this.q29c = q29c;
    }

    public String getQ29d() {
        return q29d;
    }

    public void setQ29d(String q29d) {
        this.q29d = q29d;
    }

    public String getQ29e() {
        return q29e;
    }

    public void setQ29e(String q29e) {
        this.q29e = q29e;
    }

    public String getQ29f() {
        return q29f;
    }

    public void setQ29f(String q29f) {
        this.q29f = q29f;
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

    public String getQ33a() {
        return q33a;
    }

    public void setQ33a(String q33a) {
        this.q33a = q33a;
    }

    public String getQ33b() {
        return q33b;
    }

    public void setQ33b(String q33b) {
        this.q33b = q33b;
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

    public String getQ39a() {
        return q39a;
    }

    public void setQ39a(String q39a) {
        this.q39a = q39a;
    }

    public String getQ39b() {
        return q39b;
    }

    public void setQ39b(String q39b) {
        this.q39b = q39b;
    }

    public String getQ39c() {
        return q39c;
    }

    public void setQ39c(String q39c) {
        this.q39c = q39c;
    }

    public String getQ39d() {
        return q39d;
    }

    public void setQ39d(String q39d) {
        this.q39d = q39d;
    }

    public String getQ39e() {
        return q39e;
    }

    public void setQ39e(String q39e) {
        this.q39e = q39e;
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

    public String getQ49() {
        return q49;
    }

    public void setQ49(String q49) {
        this.q49 = q49;
    }

    public String getQ50() {
        return q50;
    }

    public void setQ50(String q50) {
        this.q50 = q50;
    }

    public String getQ51() {
        return q51;
    }

    public void setQ51(String q51) {
        this.q51 = q51;
    }

    public String getQ52() {
        return q52;
    }

    public void setQ52(String q52) {
        this.q52 = q52;
    }

    public String getQ53() {
        return q53;
    }

    public void setQ53(String q53) {
        this.q53 = q53;
    }

    public String getQ54() {
        return q54;
    }

    public void setQ54(String q54) {
        this.q54 = q54;
    }

    public String getQ55() {
        return q55;
    }

    public void setQ55(String q55) {
        this.q55 = q55;
    }

    public String getQ56() {
        return q56;
    }

    public void setQ56(String q56) {
        this.q56 = q56;
    }

    public String getQ57() {
        return q57;
    }

    public void setQ57(String q57) {
        this.q57 = q57;
    }

    public String getQ58() {
        return q58;
    }

    public void setQ58(String q58) {
        this.q58 = q58;
    }

    public String getQ59() {
        return q59;
    }

    public void setQ59(String q59) {
        this.q59 = q59;
    }

    public String getQ60() {
        return q60;
    }

    public void setQ60(String q60) {
        this.q60 = q60;
    }

    public String getQ61() {
        return q61;
    }

    public void setQ61(String q61) {
        this.q61 = q61;
    }

    public String getQ62() {
        return q62;
    }

    public void setQ62(String q62) {
        this.q62 = q62;
    }

    public String getQ63() {
        return q63;
    }

    public void setQ63(String q63) {
        this.q63 = q63;
    }

    public String getQ64() {
        return q64;
    }

    public void setQ64(String q64) {
        this.q64 = q64;
    }

    public String getQ65() {
        return q65;
    }

    public void setQ65(String q65) {
        this.q65 = q65;
    }

    public String getQ66() {
        return q66;
    }

    public void setQ66(String q66) {
        this.q66 = q66;
    }

    public String getQ67() {
        return q67;
    }

    public void setQ67(String q67) {
        this.q67 = q67;
    }

    public String getQ68() {
        return q68;
    }

    public void setQ68(String q68) {
        this.q68 = q68;
    }

    public String getQ69() {
        return q69;
    }

    public void setQ69(String q69) {
        this.q69 = q69;
    }

    public String getQ70() {
        return q70;
    }

    public void setQ70(String q70) {
        this.q70 = q70;
    }

    public String getQ71() {
        return q71;
    }

    public void setQ71(String q71) {
        this.q71 = q71;
    }

    public String getQ72a() {
        return q72a;
    }

    public void setQ72a(String q72a) {
        this.q72a = q72a;
    }

    public String getQ72b() {
        return q72b;
    }

    public void setQ72b(String q72b) {
        this.q72b = q72b;
    }

    public String getQ72c() {
        return q72c;
    }

    public void setQ72c(String q72c) {
        this.q72c = q72c;
    }

    public String getQ72d() {
        return q72d;
    }

    public void setQ72d(String q72d) {
        this.q72d = q72d;
    }

    public String getQ72e() {
        return q72e;
    }

    public void setQ72e(String q72e) {
        this.q72e = q72e;
    }

    public String getQ72f() {
        return q72f;
    }

    public void setQ72f(String q72f) {
        this.q72f = q72f;
    }

    public String getQ72g() {
        return q72g;
    }

    public void setQ72g(String q72g) {
        this.q72g = q72g;
    }

    public String getQ73() {
        return q73;
    }

    public void setQ73(String q73) {
        this.q73 = q73;
    }

    public String getQ74() {
        return q74;
    }

    public void setQ74(String q74) {
        this.q74 = q74;
    }

    public String getQ75() {
        return q75;
    }

    public void setQ75(String q75) {
        this.q75 = q75;
    }

    public String getQ76a() {
        return q76a;
    }

    public void setQ76a(String q76a) {
        this.q76a = q76a;
    }

    public String getQ76b() {
        return q76b;
    }

    public void setQ76b(String q76b) {
        this.q76b = q76b;
    }

    public String getQ76c() {
        return q76c;
    }

    public void setQ76c(String q76c) {
        this.q76c = q76c;
    }

    public String getQ76d() {
        return q76d;
    }

    public void setQ76d(String q76d) {
        this.q76d = q76d;
    }

    public String getQ76e() {
        return q76e;
    }

    public void setQ76e(String q76e) {
        this.q76e = q76e;
    }

    public String getQ76f() {
        return q76f;
    }

    public void setQ76f(String q76f) {
        this.q76f = q76f;
    }

    public String getQ76g() {
        return q76g;
    }

    public void setQ76g(String q76g) {
        this.q76g = q76g;
    }

    public String getQ77() {
        return q77;
    }

    public void setQ77(String q77) {
        this.q77 = q77;
    }

    public String getQ78() {
        return q78;
    }

    public void setQ78(String q78) {
        this.q78 = q78;
    }

    public String getQ79() {
        return q79;
    }

    public void setQ79(String q79) {
        this.q79 = q79;
    }

    public String getQ80() {
        return q80;
    }

    public void setQ80(String q80) {
        this.q80 = q80;
    }

    public String getQ81() {
        return q81;
    }

    public void setQ81(String q81) {
        this.q81 = q81;
    }

    public String getQ82() {
        return q82;
    }

    public void setQ82(String q82) {
        this.q82 = q82;
    }

    public String getQ83() {
        return q83;
    }

    public void setQ83(String q83) {
        this.q83 = q83;
    }

    public String getQ84() {
        return q84;
    }

    public void setQ84(String q84) {
        this.q84 = q84;
    }

    public String getQ85() {
        return q85;
    }

    public void setQ85(String q85) {
        this.q85 = q85;
    }

    public String getQ86a() {
        return q86a;
    }

    public void setQ86a(String q86a) {
        this.q86a = q86a;
    }

    public String getQ86b() {
        return q86b;
    }

    public void setQ86b(String q86b) {
        this.q86b = q86b;
    }

    public String getQ86c() {
        return q86c;
    }

    public void setQ86c(String q86c) {
        this.q86c = q86c;
    }

    public String getQ86d() {
        return q86d;
    }

    public void setQ86d(String q86d) {
        this.q86d = q86d;
    }

    public String getQ86e() {
        return q86e;
    }

    public void setQ86e(String q86e) {
        this.q86e = q86e;
    }

    public String getQ86f() {
        return q86f;
    }

    public void setQ86f(String q86f) {
        this.q86f = q86f;
    }

    public String getQ86g() {
        return q86g;
    }

    public void setQ86g(String q86g) {
        this.q86g = q86g;
    }

    public String getQ86h() {
        return q86h;
    }

    public void setQ86h(String q86h) {
        this.q86h = q86h;
    }

    public String getQ86i() {
        return q86i;
    }

    public void setQ86i(String q86i) {
        this.q86i = q86i;
    }

    public String getQ86j() {
        return q86j;
    }

    public void setQ86j(String q86j) {
        this.q86j = q86j;
    }

    public String getQ86k() {
        return q86k;
    }

    public void setQ86k(String q86k) {
        this.q86k = q86k;
    }

    public String getQ86l() {
        return q86l;
    }

    public void setQ86l(String q86l) {
        this.q86l = q86l;
    }

    public String getQ86m() {
        return q86m;
    }

    public void setQ86m(String q86m) {
        this.q86m = q86m;
    }

    public String getQ86n() {
        return q86n;
    }

    public void setQ86n(String q86n) {
        this.q86n = q86n;
    }

    public String getQ86o() {
        return q86o;
    }

    public void setQ86o(String q86o) {
        this.q86o = q86o;
    }

    public String getQ86p() {
        return q86p;
    }

    public void setQ86p(String q86p) {
        this.q86p = q86p;
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

    public PregnantWoman getPregnantWoman() {
        return pregnantWoman;
    }

    public void setPregnantWoman(PregnantWoman pregnantWoman) {
        this.pregnantWoman = pregnantWoman;
    }
}
