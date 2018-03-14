package com.logictech.entity.po;

import javax.persistence.*;

/**
 * @author JG.Hannibal
 * @since 2017/11/9 下午12:20
 */
@Table(name = "country")
public class CountryPO {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 国家名称
     */
    private String countryName;

    /**
     * 编号
     */
    private String countryCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public CountryPO() {

    }

    public CountryPO(String countryName, String countryCode) {

        this.countryName = countryName;
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "CountryPO{" +
                "id=" + id +
                ", countryName='" + countryName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }
}
    