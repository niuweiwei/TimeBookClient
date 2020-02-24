package cn.edu.hebtu.software.timebookclient.Bean;

import java.sql.Timestamp;
import java.util.Date;

public class Task {

    private Long id;
    private String title;
    private Integer count;     //番茄数
    private Integer flag;      //0:未开始  1:已完成  2:中途放弃
    private Integer priority;  //任务优先级
    private Date createDate;   //任务创建日期
    private Date expireDate; //任务截止日期
    private Timestamp startDateTime;  //任务开始时间
   private Timestamp completeDateTime;//任务完成时间
    private String repeat;    //重复次数
    private String remark;    //备注
    private Long userId;//创建任务的用户
    private Long checkListId; //所属任务的任务清单

    public Task() {
    }

    public Task(Long id, String title, Integer count, Integer flag, Integer priority, Date createDate, Date expireDate, Timestamp startDateTime, Timestamp completeDateTime, String repeat, String remark, Long userId, Long checkListId) {
        this.id = id;
        this.title = title;
        this.count = count;
        this.flag = flag;
        this.priority = priority;
        this.createDate = createDate;
        this.expireDate = expireDate;
        this.startDateTime = startDateTime;
        this.completeDateTime = completeDateTime;
        this.repeat = repeat;
        this.remark = remark;
        this.userId = userId;
        this.checkListId = checkListId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Timestamp getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Timestamp startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Timestamp getCompleteDateTime() {
        return completeDateTime;
    }

    public void setCompleteDateTime(Timestamp completeDateTime) {
        this.completeDateTime = completeDateTime;
    }

    public String getRepeat() {
        return repeat;
    }

    public void setRepeat(String repeat) {
        this.repeat = repeat;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCheckListId() {
        return checkListId;
    }

    public void setCheckListId(Long checkListId) {
        this.checkListId = checkListId;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", count=" + count +
                ", flag=" + flag +
                ", priority=" + priority +
                ", createDate=" + createDate +
                ", expireDate=" + expireDate +
                ", startDateTime=" + startDateTime +
                ", completeDateTime=" + completeDateTime +
                ", repeat='" + repeat + '\'' +
                ", remark='" + remark + '\'' +
                ", userId=" + userId +
                ", checkListId=" + checkListId +
                '}';
    }
}
