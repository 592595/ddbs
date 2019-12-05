package com.pan.model;

import java.io.Serializable;

public class AdminBuyerMes implements Serializable {
    private String idBuyer;

    private String nameBuyer;

    private String passBuyer;

    private String adressBuyer;

    private String callBuyer;

    private Integer scoreBuyer;

    public String getIdBuyer() {
        return idBuyer;
    }

    public void setIdBuyer(String idBuyer) {
        this.idBuyer = idBuyer;
    }

    public String getNameBuyer() {
        return nameBuyer;
    }

    public void setNameBuyer(String nameBuyer) {
        this.nameBuyer = nameBuyer;
    }

    public String getPassBuyer() {
        return passBuyer;
    }

    public void setPassBuyer(String passBuyer) {
        this.passBuyer = passBuyer;
    }

    public String getAdressBuyer() {
        return adressBuyer;
    }

    public void setAdressBuyer(String adressBuyer) {
        this.adressBuyer = adressBuyer;
    }

    public String getCallBuyer() {
        return callBuyer;
    }

    public void setCallBuyer(String callBuyer) {
        this.callBuyer = callBuyer;
    }

    public Integer getScoreBuyer() {
        return scoreBuyer;
    }

    public void setScoreBuyer(Integer scoreBuyer) {
        this.scoreBuyer = scoreBuyer;
    }

}