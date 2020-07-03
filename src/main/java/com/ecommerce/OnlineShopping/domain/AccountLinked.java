package com.ecommerce.OnlineShopping.domain;

public class AccountLinked {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accountlinked.accLinkID
     *
     * @mbg.generated Mon May 25 10:16:08 NPT 2020
     */
    private Long acclinkid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accountlinked.username
     *
     * @mbg.generated Mon May 25 10:16:08 NPT 2020
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accountlinked.AccName
     *
     * @mbg.generated Mon May 25 10:16:08 NPT 2020
     */
    private String accname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accountlinked.accLinkID
     *
     * @return the value of accountlinked.accLinkID
     *
     * @mbg.generated Mon May 25 10:16:08 NPT 2020
     */
    public Long getAcclinkid() {
        return acclinkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accountlinked.accLinkID
     *
     * @param acclinkid the value for accountlinked.accLinkID
     *
     * @mbg.generated Mon May 25 10:16:08 NPT 2020
     */
    public void setAcclinkid(Long acclinkid) {
        this.acclinkid = acclinkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accountlinked.username
     *
     * @return the value of accountlinked.username
     *
     * @mbg.generated Mon May 25 10:16:08 NPT 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accountlinked.username
     *
     * @param username the value for accountlinked.username
     *
     * @mbg.generated Mon May 25 10:16:08 NPT 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accountlinked.AccName
     *
     * @return the value of accountlinked.AccName
     *
     * @mbg.generated Mon May 25 10:16:08 NPT 2020
     */
    public String getAccname() {
        return accname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accountlinked.AccName
     *
     * @param accname the value for accountlinked.AccName
     *
     * @mbg.generated Mon May 25 10:16:08 NPT 2020
     */
    public void setAccname(String accname) {
        this.accname = accname == null ? null : accname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountlinked
     *
     * @mbg.generated Mon May 25 10:16:08 NPT 2020
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
        AccountLinked other = (AccountLinked) that;
        return (this.getAcclinkid() == null ? other.getAcclinkid() == null : this.getAcclinkid().equals(other.getAcclinkid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getAccname() == null ? other.getAccname() == null : this.getAccname().equals(other.getAccname()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountlinked
     *
     * @mbg.generated Mon May 25 10:16:08 NPT 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAcclinkid() == null) ? 0 : getAcclinkid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getAccname() == null) ? 0 : getAccname().hashCode());
        return result;
    }
}