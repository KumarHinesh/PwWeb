package com.vpt.pw.demo.model.FormCrf3c;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "ABDOMINALCIRCUMFERENCE_CRF_3C")
public class AbdominalCircumferenceOfPWCrf3c {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    @Column(name = "reading_id")
    private Integer id;

    @Column(name = "reader1")
    private Float reader1;

    @Column(name = "reader2")
    private Float reader2;

    @Column(name = "code_of_reader_1")
    private String readerCode1;

    @Column(name = "code_of_reader_2")
    private String readerCode2;

    private Float difference;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "form_crf_3c_id")
    private FormCrf3c form;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getReader1() {
        return reader1;
    }

    public void setReader1(Float reader1) {
        this.reader1 = reader1;
    }

    public Float getReader2() {
        return reader2;
    }

    public void setReader2(Float reader2) {
        this.reader2 = reader2;
    }

    public Float getDifference() {
        return difference;
    }

    public void setDifference(Float difference) {
        this.difference = difference;
    }

    public FormCrf3c getForm() {
        return form;
    }

    public void setForm(FormCrf3c form) {
        this.form = form;
    }

    public String getReaderCode1() {
        return readerCode1;
    }

    public void setReaderCode1(String readerCode1) {
        this.readerCode1 = readerCode1;
    }

    public String getReaderCode2() {
        return readerCode2;
    }

    public void setReaderCode2(String readerCode2) {
        this.readerCode2 = readerCode2;
    }

}
