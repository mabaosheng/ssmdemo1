package cn.bdqn.tangcco.entity;

import java.util.Date;

/**
 * Created by thinkpad on 2017/6/27.
 */
public class Grade {

    private Integer id;
    private String gradeName;
    private Date createDate;
    private String details;

    public Grade() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
