package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class Emp implements Serializable {
    /**
     * 员工ID
     */
    @Id
    private Integer id;

    /**
     * 员工名
     */
    private String name;

    /**
     * 员工性别
     */
    private String sex;

    /**
     * 员工年龄
     */
    private Integer age;

    /**
     * 员工住址
     */
    private String address;

    /**
     * 员工头像
     */
    private String img;

    /**
     * 员工出生日期
     */
    private Date birthday;

    /**
     * 员工所在地省id
     */
    private Integer shengid;

    /**
     * 员工所在地市id
     */
    private Integer sid;

    /**
     * 员工所在地县id
     */
    private Integer xid;

    /**
     * 员工所属部门id
     */
    private Integer did;

    private static final long serialVersionUID = 1L;

    /**
     * 获取员工ID
     *
     * @return id - 员工ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置员工ID
     *
     * @param id 员工ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取员工名
     *
     * @return name - 员工名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置员工名
     *
     * @param name 员工名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取员工性别
     *
     * @return sex - 员工性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置员工性别
     *
     * @param sex 员工性别
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 获取员工年龄
     *
     * @return age - 员工年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置员工年龄
     *
     * @param age 员工年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取员工住址
     *
     * @return address - 员工住址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置员工住址
     *
     * @param address 员工住址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取员工头像
     *
     * @return img - 员工头像
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置员工头像
     *
     * @param img 员工头像
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * 获取员工出生日期
     *
     * @return birthday - 员工出生日期
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置员工出生日期
     *
     * @param birthday 员工出生日期
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取员工所在地省id
     *
     * @return shengid - 员工所在地省id
     */
    public Integer getShengid() {
        return shengid;
    }

    /**
     * 设置员工所在地省id
     *
     * @param shengid 员工所在地省id
     */
    public void setShengid(Integer shengid) {
        this.shengid = shengid;
    }

    /**
     * 获取员工所在地市id
     *
     * @return sid - 员工所在地市id
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * 设置员工所在地市id
     *
     * @param sid 员工所在地市id
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * 获取员工所在地县id
     *
     * @return xid - 员工所在地县id
     */
    public Integer getXid() {
        return xid;
    }

    /**
     * 设置员工所在地县id
     *
     * @param xid 员工所在地县id
     */
    public void setXid(Integer xid) {
        this.xid = xid;
    }

    /**
     * 获取员工所属部门id
     *
     * @return did - 员工所属部门id
     */
    public Integer getDid() {
        return did;
    }

    /**
     * 设置员工所属部门id
     *
     * @param did 员工所属部门id
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", address=").append(address);
        sb.append(", img=").append(img);
        sb.append(", birthday=").append(birthday);
        sb.append(", shengid=").append(shengid);
        sb.append(", sid=").append(sid);
        sb.append(", xid=").append(xid);
        sb.append(", did=").append(did);
        sb.append("]");
        return sb.toString();
    }
}