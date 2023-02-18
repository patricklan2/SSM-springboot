package org.lan.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Supermarket {
    @TableId(
            value = "supermarket_id",
            type = IdType.NONE
    )
    private String supermarketId;

    private String supermarketName;

    private String address;

    private String contactNumber;

    public Supermarket(String supermarketId, String supermarketName, String address, String contactNumber) {
        this.supermarketId = supermarketId;
        this.supermarketName = supermarketName;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Supermarket{" +
                "supermarketId='" + supermarketId + '\'' +
                ", supermarketName='" + supermarketName + '\'' +
                ", address='" + address + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }

    public String getSupermarketId() {
        return supermarketId;
    }

    public void setSupermarketId(String supermarketId) {
        this.supermarketId = supermarketId == null ? null : supermarketId.trim();
    }

    public String getSupermarketName() {
        return supermarketName;
    }

    public void setSupermarketName(String supermarketName) {
        this.supermarketName = supermarketName == null ? null : supermarketName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
    }
}