package com.shagi.vetinary;

public class RegisterConstructor {

    String Name,Address,District,Taluk,Panchayath,Ward_no,House_no,Rationcard_no,Adhaar_no,Email,Phone_no,Password;

    public RegisterConstructor() {
    }

    public RegisterConstructor(String name, String address, String district, String taluk, String panchayath, String ward_no, String house_no, String rationcard_no, String adhaar_no, String email, String phone_no, String password) {
        Name = name;
        Address = address;
        District = district;
        Taluk = taluk;
        Panchayath = panchayath;
        Ward_no = ward_no;
        House_no = house_no;
        Rationcard_no = rationcard_no;
        Adhaar_no = adhaar_no;
        Email = email;
        Phone_no = phone_no;
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getTaluk() {
        return Taluk;
    }

    public void setTaluk(String taluk) {
        Taluk = taluk;
    }

    public String getPanchayath() {
        return Panchayath;
    }

    public void setPanchayath(String panchayath) {
        Panchayath = panchayath;
    }

    public String getWard_no() {
        return Ward_no;
    }

    public void setWard_no(String ward_no) {
        Ward_no = ward_no;
    }

    public String getHouse_no() {
        return House_no;
    }

    public void setHouse_no(String house_no) {
        House_no = house_no;
    }

    public String getRationcard_no() {
        return Rationcard_no;
    }

    public void setRationcard_no(String rationcard_no) {
        Rationcard_no = rationcard_no;
    }

    public String getAdhaar_no() {
        return Adhaar_no;
    }

    public void setAdhaar_no(String adhaar_no) {
        Adhaar_no = adhaar_no;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone_no() {
        return Phone_no;
    }

    public void setPhone_no(String phone_no) {
        Phone_no = phone_no;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
