package com.userbank.demo.dao.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "banks")
public class Bank implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "bank_id")
    private long id;

    @Column(name = "bank_name")
    private String bname;

    @Column(name = "bank_account")
    private String baccount;

    @Column(name = "user_id")
    private long user_id;

    @ManyToOne
    @JoinColumn(name = "user_id")

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBaccount() {
        return baccount;
    }

    public void setBaccount(String baccount) {
        this.baccount = baccount;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }


}
