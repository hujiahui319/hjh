package com.example.demo3.entity;

import java.sql.Timestamp;

public class UserBase {
    private Long ubIdN;
    private String ubNickNameV;
    private String ubNameV;
    private String ubMpV;
    private String ubEmailV;
    private String ubTypeC;
    private String ubStatusC;
    private String ubAuthStatusC;
    private String ubBindCardStatusC;
    private Long ubVersionN;
    private String ubUserTypeV;
    private Timestamp inserttime;
    private Timestamp updatetime;
    private String ubLevelC;
    private Short isactive = 1;
    private String ubAuthManually;

    public Long getUbIdN() {
        return ubIdN;
    }

    public void setUbIdN(Long ubIdN) {
        this.ubIdN = ubIdN;
    }

    public String getUbNickNameV() {
        return ubNickNameV;
    }

    public void setUbNickNameV(String ubNickNameV) {
        this.ubNickNameV = ubNickNameV;
    }

    public String getUbNameV() {
        return ubNameV;
    }

    public void setUbNameV(String ubNameV) {
        this.ubNameV = ubNameV;
    }

    public String getUbMpV() {
        return ubMpV;
    }

    public void setUbMpV(String ubMpV) {
        this.ubMpV = ubMpV;
    }

    public String getUbEmailV() {
        return ubEmailV;
    }

    public void setUbEmailV(String ubEmailV) {
        this.ubEmailV = ubEmailV;
    }

    public String getUbTypeC() {
        return ubTypeC;
    }

    public void setUbTypeC(String ubTypeC) {
        this.ubTypeC = ubTypeC;
    }

    public String getUbStatusC() {
        return ubStatusC;
    }

    public void setUbStatusC(String ubStatusC) {
        this.ubStatusC = ubStatusC;
    }

    public String getUbAuthStatusC() {
        return ubAuthStatusC;
    }

    public void setUbAuthStatusC(String ubAuthStatusC) {
        this.ubAuthStatusC = ubAuthStatusC;
    }

    public String getUbBindCardStatusC() {
        return ubBindCardStatusC;
    }

    public void setUbBindCardStatusC(String ubBindCardStatusC) {
        this.ubBindCardStatusC = ubBindCardStatusC;
    }

    public Long getUbVersionN() {
        return ubVersionN;
    }

    public void setUbVersionN(Long ubVersionN) {
        this.ubVersionN = ubVersionN;
    }

    public String getUbUserTypeV() {
        return ubUserTypeV;
    }

    public void setUbUserTypeV(String ubUserTypeV) {
        this.ubUserTypeV = ubUserTypeV;
    }

    public Timestamp getInserttime() {
        return inserttime;
    }

    public void setInserttime(Timestamp inserttime) {
        this.inserttime = inserttime;
    }

    public Timestamp getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Timestamp updatetime) {
        this.updatetime = updatetime;
    }

    public String getUbLevelC() {
        return ubLevelC;
    }

    public void setUbLevelC(String ubLevelC) {
        this.ubLevelC = ubLevelC;
    }

    public Short getIsactive() {
        return isactive;
    }

    public void setIsactive(Short isactive) {
        this.isactive = isactive;
    }

    public String getUbAuthManually() {
        return ubAuthManually;
    }

    public void setUbAuthManually(String ubAuthManually) {
        this.ubAuthManually = ubAuthManually;
    }
}
