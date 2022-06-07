package com.wule.pojo;

public class Brand
{
    private Integer id;
    private String brandName;
    private String companyName;
    private Integer ordered;
    private String description;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Integer getOrdered() {
        return ordered;
    }

    public String getDescription() {
        return description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", order=" + ordered +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
