package org.lan.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Dept {
    @TableId(
            value = "dept_id",
            type = IdType.NONE
    )
    private String deptId;

    private String deptName;

    private String address;

    private String contactNumber;

    private String supermarketId;

    public Dept(String deptId, String deptName, String address, String contactNumber, String supermarketId) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.supermarketId = supermarketId;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId='" + deptId + '\'' +
                ", deptName='" + deptName + '\'' +
                ", address='" + address + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", supermarketId='" + supermarketId + '\'' +
                '}';
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
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

    public String getSupermarketId() {
        return supermarketId;
    }

    public void setSupermarketId(String supermarketId) {
        this.supermarketId = supermarketId == null ? null : supermarketId.trim();
    }
}