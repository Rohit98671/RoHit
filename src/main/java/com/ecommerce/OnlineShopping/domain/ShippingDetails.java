package com.ecommerce.OnlineShopping.domain;

import java.util.Date;

public class ShippingDetails {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shippingdetails.shpID
     *
     * @mbg.generated Mon May 25 10:16:09 NPT 2020
     */
    private Long shpid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shippingdetails.addID
     *
     * @mbg.generated Mon May 25 10:16:09 NPT 2020
     */
    private Long addid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shippingdetails.sName
     *
     * @mbg.generated Mon May 25 10:16:09 NPT 2020
     */
    private String sname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shippingdetails.shpAddress
     *
     * @mbg.generated Mon May 25 10:16:09 NPT 2020
     */
    private String shpaddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shippingdetails.shpDate
     *
     * @mbg.generated Mon May 25 10:16:09 NPT 2020
     */
    private Date shpdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shippingdetails.phNum
     *
     * @mbg.generated Mon May 25 10:16:09 NPT 2020
     */
    private String phnum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shippingdetails.shpID
     *
     * @return the value of shippingdetails.shpID
     *
     * @mbg.generated Mon May 25 10:16:09 NPT 2020
     */
    public Long getShpid() {
        return shpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shippingdetails.shpID
     *
     * @param shpid the value for shippingdetails.shpID
     *
     * @mbg.generated Mon May 25 10:16:09 NPT 2020
     */
    public void setShpid(Long shpid) {
        this.shpid = shpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shippingdetails.addID
     *
     * @return the value of shippingdetails.addID
     *
     * @mbg.generated Mon May 25 10:16:09 NPT 2020
     */
    public Long getAddid() {
        return addid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shippingdetails.addID
     *
     * @param addid the value for shippingdetails.addID
     *
     * @mbg.generated Mon May 25 10:16:09 NPT 2020
     */
    public void setAddid(Long addid) {
        this.addid = addid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shippingdetails.sName
     *
     * @return the value of shippingdetails.sName
     *
     * @mbg.generated Mon May 25 10:16:09 NPT 2020
     */
    public String getSname() {
        return sname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shippingdetails.sName
     *
     * @param sname the value for shippingdetails.sName
     *
     * @mbg.generated Mon May 25 10:16:09 NPT 2020
     */
    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shippingdetails.shpAddress
     *
     * @return the value of shippingdetails.shpAddress
     *
     * @mbg.generated Mon May 25 10:16:09 NPT 2020
     */
    public String getShpaddress() {
        return shpaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shippingdetails.shpAddress
     *
     * @param shpaddress the value for shippingdetails.shpAddress
     *
     * @mbg.generated Mon May 25 10:16:09 NPT 2020
     */
    public void setShpaddress(String shpaddress) {
        this.shpaddress = shpaddress == null ? null : shpaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shippingdetails.shpDate
     *
     * @return the value of shippingdetails.shpDate
     *
     * @mbg.generated Mon May 25 10:16:09 NPT 2020
     */
    public Date getShpdate() {
        return shpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shippingdetails.shpDate
     *
     * @param shpdate the value for shippingdetails.shpDate
     *
     * @mbg.generated Mon May 25 10:16:09 NPT 2020
     */
    public void setShpdate(Date shpdate) {
        this.shpdate = shpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shippingdetails.phNum
     *
     * @return the value of shippingdetails.phNum
     *
     * @mbg.generated Mon May 25 10:16:09 NPT 2020
     */
    public String getPhnum() {
        return phnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shippingdetails.phNum
     *
     * @param phnum the value for shippingdetails.phNum
     *
     * @mbg.generated Mon May 25 10:16:09 NPT 2020
     */
    public void setPhnum(String phnum) {
        this.phnum = phnum == null ? null : phnum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shippingdetails
     *
     * @mbg.generated Mon May 25 10:16:09 NPT 2020
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ShippingDetails other = (ShippingDetails) that;
        return (this.getShpid() == null ? other.getShpid() == null : this.getShpid().equals(other.getShpid()))
            && (this.getAddid() == null ? other.getAddid() == null : this.getAddid().equals(other.getAddid()))
            && (this.getSname() == null ? other.getSname() == null : this.getSname().equals(other.getSname()))
            && (this.getShpaddress() == null ? other.getShpaddress() == null : this.getShpaddress().equals(other.getShpaddress()))
            && (this.getShpdate() == null ? other.getShpdate() == null : this.getShpdate().equals(other.getShpdate()))
            && (this.getPhnum() == null ? other.getPhnum() == null : this.getPhnum().equals(other.getPhnum()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shippingdetails
     *
     * @mbg.generated Mon May 25 10:16:09 NPT 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getShpid() == null) ? 0 : getShpid().hashCode());
        result = prime * result + ((getAddid() == null) ? 0 : getAddid().hashCode());
        result = prime * result + ((getSname() == null) ? 0 : getSname().hashCode());
        result = prime * result + ((getShpaddress() == null) ? 0 : getShpaddress().hashCode());
        result = prime * result + ((getShpdate() == null) ? 0 : getShpdate().hashCode());
        result = prime * result + ((getPhnum() == null) ? 0 : getPhnum().hashCode());
        return result;
    }
}