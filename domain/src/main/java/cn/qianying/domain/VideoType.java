package cn.qianying.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 视频类型
 */
public class VideoType implements Serializable {
    /**
     * 主键
     */
    private Long id;
    /**
     * 类型名称
     */
    private String name;
    /**
     * 父类型id
     */
    private Long parentId;
    /**
     * 类型来源
     */
    private String source_;
    /**
     * 数据插入时间
     */
    private Date insertTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getSource_() {
        return source_;
    }

    public void setSource_(String source_) {
        this.source_ = source_;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}
