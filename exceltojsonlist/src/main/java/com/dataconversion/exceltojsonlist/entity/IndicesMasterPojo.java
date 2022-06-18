package com.dataconversion.exceltojsonlist.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class IndicesMasterPojo {

    @Id
    private String tenor;
    private Double yearfracFromInceptionDate;
    private Date inceptionDate;
    private String indexType;
    private String indexCategory;
    private String indices;
    private String _1Day;
    private String _1Week;
    private String _1Month;
    private String _3Month;
    private String _6Month;
    private String _1Year;
    private String _2Year;
    private String _3Year;
    private String _5Year;
    private String _7Year;
    private String _10Year;
    private String sinceInception;
    private Double indexValuesAsOnNovember182020;
    private Double indexValuesAsOnNovember172020;

    public IndicesMasterPojo() {
    }

    public IndicesMasterPojo(String tenor, Double yearfracFromInceptionDate, Date inceptionDate, String indexType, String indexCategory, String indices, String _1Day, String _1Week, String _1Month, String _3Month, String _6Month, String _1Year, String _2Year, String _3Year, String _5Year, String _7Year, String _10Year, String sinceInception, Double indexValuesAsOnNovember182020, Double indexValuesAsOnNovember172020) {
        this.tenor = tenor;
        this.yearfracFromInceptionDate = yearfracFromInceptionDate;
        this.inceptionDate = inceptionDate;
        this.indexType = indexType;
        this.indexCategory = indexCategory;
        this.indices = indices;
        this._1Day = _1Day;
        this._1Week = _1Week;
        this._1Month = _1Month;
        this._3Month = _3Month;
        this._6Month = _6Month;
        this._1Year = _1Year;
        this._2Year = _2Year;
        this._3Year = _3Year;
        this._5Year = _5Year;
        this._7Year = _7Year;
        this._10Year = _10Year;
        this.sinceInception = sinceInception;
        this.indexValuesAsOnNovember182020 = indexValuesAsOnNovember182020;
        this.indexValuesAsOnNovember172020 = indexValuesAsOnNovember172020;
    }

    public String getTenor() {
        return tenor;
    }

    public void setTenor(String tenor) {
        this.tenor = tenor;
    }

    public Double getYearfracFromInceptionDate() {
        return yearfracFromInceptionDate;
    }

    public void setYearfracFromInceptionDate(Double yearfracFromInceptionDate) {
        this.yearfracFromInceptionDate = yearfracFromInceptionDate;
    }

    public Date getInceptionDate() {
        return inceptionDate;
    }

    public void setInceptionDate(Date inceptionDate) {
        this.inceptionDate = inceptionDate;
    }

    public String getIndexType() {
        return indexType;
    }

    public void setIndexType(String indexType) {
        this.indexType = indexType;
    }

    public String getIndexCategory() {
        return indexCategory;
    }

    public void setIndexCategory(String indexCategory) {
        this.indexCategory = indexCategory;
    }

    public String getIndices() {
        return indices;
    }

    public void setIndices(String indices) {
        this.indices = indices;
    }

    public String get_1Day() {
        return _1Day;
    }

    public void set_1Day(String _1Day) {
        this._1Day = _1Day;
    }

    public String get_1Week() {
        return _1Week;
    }

    public void set_1Week(String _1Week) {
        this._1Week = _1Week;
    }

    public String get_1Month() {
        return _1Month;
    }

    public void set_1Month(String _1Month) {
        this._1Month = _1Month;
    }

    public String get_3Month() {
        return _3Month;
    }

    public void set_3Month(String _3Month) {
        this._3Month = _3Month;
    }

    public String get_6Month() {
        return _6Month;
    }

    public void set_6Month(String _6Month) {
        this._6Month = _6Month;
    }

    public String get_1Year() {
        return _1Year;
    }

    public void set_1Year(String _1Year) {
        this._1Year = _1Year;
    }

    public String get_2Year() {
        return _2Year;
    }

    public void set_2Year(String _2Year) {
        this._2Year = _2Year;
    }

    public String get_3Year() {
        return _3Year;
    }

    public void set_3Year(String _3Year) {
        this._3Year = _3Year;
    }

    public String get_5Year() {
        return _5Year;
    }

    public void set_5Year(String _5Year) {
        this._5Year = _5Year;
    }

    public String get_7Year() {
        return _7Year;
    }

    public void set_7Year(String _7Year) {
        this._7Year = _7Year;
    }

    public String get_10Year() {
        return _10Year;
    }

    public void set_10Year(String _10Year) {
        this._10Year = _10Year;
    }

    public String getSinceInception() {
        return sinceInception;
    }

    public void setSinceInception(String sinceInception) {
        this.sinceInception = sinceInception;
    }

    public Double getIndexValuesAsOnNovember182020() {
        return indexValuesAsOnNovember182020;
    }

    public void setIndexValuesAsOnNovember182020(Double indexValuesAsOnNovember182020) {
        this.indexValuesAsOnNovember182020 = indexValuesAsOnNovember182020;
    }

    public Double getIndexValuesAsOnNovember172020() {
        return indexValuesAsOnNovember172020;
    }

    public void setIndexValuesAsOnNovember172020(Double indexValuesAsOnNovember172020) {
        this.indexValuesAsOnNovember172020 = indexValuesAsOnNovember172020;
    }

    @Override
    public String toString() {
        return "IndicesMasterPojo{" +
                "tenor='" + tenor + '\'' +
                ", yearfracFromInceptionDate=" + yearfracFromInceptionDate +
                ", inceptionDate='" + inceptionDate + '\'' +
                ", indexType='" + indexType + '\'' +
                ", indexCategory='" + indexCategory + '\'' +
                ", indices='" + indices + '\'' +
                ", _1Day='" + _1Day + '\'' +
                ", _1Week='" + _1Week + '\'' +
                ", _1Month='" + _1Month + '\'' +
                ", _3Month='" + _3Month + '\'' +
                ", _6Month='" + _6Month + '\'' +
                ", _1Year='" + _1Year + '\'' +
                ", _2Year='" + _2Year + '\'' +
                ", _3Year='" + _3Year + '\'' +
                ", _5Year='" + _5Year + '\'' +
                ", _7Year='" + _7Year + '\'' +
                ", _10Year='" + _10Year + '\'' +
                ", sinceInception='" + sinceInception + '\'' +
                ", indexValuesAsOnNovember182020=" + indexValuesAsOnNovember182020 +
                ", indexValuesAsOnNovember172020=" + indexValuesAsOnNovember172020 +
                '}';
    }

}