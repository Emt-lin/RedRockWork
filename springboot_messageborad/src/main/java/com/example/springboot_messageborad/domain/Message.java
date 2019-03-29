package com.example.springboot_messageborad.domain;



import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author psl
 * @date 2019/3/29
 */
@Data
public class Message {
    private Integer id;
    private Integer pid;
    private String username;
    private String text;
    private List<Message> childContent = new ArrayList<>();
    public Message(){
    }
    //构造方法
    public Message(String username, String text, int pid) {
        this.username = username;
        this.text = text;
        this.pid = pid;
    }
    public void setChildContent(List<Message> childContent) {
        this.childContent.addAll(childContent);
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Message> getChildContent() {
        return childContent;
    }



    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", pid=" + pid +
                ", username='" + username + '\'' +
                ", text='" + text + '\'' +
                ", childContent=" + childContent +
                '}';
    }
}
