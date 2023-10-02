package com.dto;

public class CSV_DTO {
    //1. ID
    //2. Name
    //3. Foundation Date
    //4. Capital
    //5 Country
    //6. isHeadQuarter
    private int id;
    private String name;
    private String foundationDate;
    private long capital;
    private String country;
    private boolean isHeadQuarter;

    public CSV_DTO() {
    }

    public CSV_DTO(int id, String name, String foundationDate, long capital, String country, boolean isHeadQuarter) {
        this.id = id;
        this.name = name;
        this.foundationDate = foundationDate;
        this.capital = capital;
        this.country = country;
        this.isHeadQuarter = isHeadQuarter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(String foundationDate) {
        this.foundationDate = foundationDate;
    }

    public long getCapital() {
        return capital;
    }

    public void setCapital(long capital) {
        this.capital = capital;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isHeadQuarter() {
        return isHeadQuarter;
    }

    public void setHeadQuarter(boolean headQuarter) {
        isHeadQuarter = headQuarter;
    }

    @Override
    public String toString() {
        return "CSV_DTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", foundationDate='" + foundationDate + '\'' +
                ", capital=" + capital +
                ", country='" + country + '\'' +
                ", isHeadQuarter=" + isHeadQuarter +
                '}';
    }
}

