package com.ecommerce.OnlineShopping.domain;

public class Users {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.username
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.Password
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.fName
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    private String fname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.lName
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    private String lname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.contactNum
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    private String contactnum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.Gender
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.CompanyName
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    private String companyname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.email
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.Country
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    private String country;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.City
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.Address
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.State
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    private String state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.username
     *
     * @return the value of users.username
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.username
     *
     * @param username the value for users.username
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.Password
     *
     * @return the value of users.Password
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.Password
     *
     * @param password the value for users.Password
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.fName
     *
     * @return the value of users.fName
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public String getFname() {
        return fname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.fName
     *
     * @param fname the value for users.fName
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.lName
     *
     * @return the value of users.lName
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public String getLname() {
        return lname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.lName
     *
     * @param lname the value for users.lName
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public void setLname(String lname) {
        this.lname = lname == null ? null : lname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.contactNum
     *
     * @return the value of users.contactNum
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public String getContactnum() {
        return contactnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.contactNum
     *
     * @param contactnum the value for users.contactNum
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public void setContactnum(String contactnum) {
        this.contactnum = contactnum == null ? null : contactnum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.Gender
     *
     * @return the value of users.Gender
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.Gender
     *
     * @param gender the value for users.Gender
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.CompanyName
     *
     * @return the value of users.CompanyName
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public String getCompanyname() {
        return companyname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.CompanyName
     *
     * @param companyname the value for users.CompanyName
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.email
     *
     * @return the value of users.email
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.email
     *
     * @param email the value for users.email
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.Country
     *
     * @return the value of users.Country
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.Country
     *
     * @param country the value for users.Country
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.City
     *
     * @return the value of users.City
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.City
     *
     * @param city the value for users.City
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.Address
     *
     * @return the value of users.Address
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.Address
     *
     * @param address the value for users.Address
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.State
     *
     * @return the value of users.State
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.State
     *
     * @param state the value for users.State
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
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
        Users other = (Users) that;
        return (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getFname() == null ? other.getFname() == null : this.getFname().equals(other.getFname()))
            && (this.getLname() == null ? other.getLname() == null : this.getLname().equals(other.getLname()))
            && (this.getContactnum() == null ? other.getContactnum() == null : this.getContactnum().equals(other.getContactnum()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getCompanyname() == null ? other.getCompanyname() == null : this.getCompanyname().equals(other.getCompanyname()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Sun May 31 16:28:25 NPT 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getFname() == null) ? 0 : getFname().hashCode());
        result = prime * result + ((getLname() == null) ? 0 : getLname().hashCode());
        result = prime * result + ((getContactnum() == null) ? 0 : getContactnum().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getCompanyname() == null) ? 0 : getCompanyname().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        return result;
    }
}