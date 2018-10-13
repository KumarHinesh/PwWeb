package com.vpt.pw.demo.model;

import com.vpt.pw.demo.model.FormCrf1.FormCrf1;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TEAM")
public class Team {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    @Column(name = "team_id")
    private Integer id;

    @Column(name = "sra_name")
    private String sraName;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "team_title_id")
    private GroupTitle groupTitle;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "site_id")
    private Site site;

    @OneToMany(mappedBy = "team")
    private List<FormCrf1> formCrf1;

    @Column(name = "status")
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public List<FormCrf1> getFormCrf1() {
        return formCrf1;
    }

    public void setFormCrf1(List<FormCrf1> formCrf1) {
        this.formCrf1 = formCrf1;
    }

    public String getSraName() {
        return sraName;
    }

    public void setSraName(String sraName) {
        this.sraName = sraName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
