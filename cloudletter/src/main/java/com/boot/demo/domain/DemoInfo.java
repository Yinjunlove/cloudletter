package com.boot.demo.domain;

import java.util.Date;

public class DemoInfo {
    int id;              // id
    String uuid;         // uuid 16位
    String creater;      // 创建人
    String editor;       //编辑人
    Date create_date;    // 创建时间
    Date edit_date;      //编辑时间
    int record_status;   // 记录状态 0：未删除  1：删除
    int sort;            // 排序
    String content;      // 记录内容
    String comment;      //备注

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getEdit_date() {
        return edit_date;
    }

    public void setEdit_date(Date edit_date) {
        this.edit_date = edit_date;
    }

    public int getRecord_status() {
        return record_status;
    }

    public void setRecord_status(int record_status) {
        this.record_status = record_status;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
