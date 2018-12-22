package team.redrock.messageBoard.been;

import lombok.Data;
import team.redrock.messageBoard.service.MessageBoardService;
import team.redrock.messageBoard.service.impl.MessageBoardServiceImpl;

import java.util.List;

/**
 * @Description 留言的实体
 * @Author 余歌
 * @Date 2018/12/16
 **/
@Data
public class Message {

    //这条留言的id
    private int id;

    //父节点的id
    private int pid;

    //用户名
    private String username;

    //留言的内容
    private String text;

    //子节点
    private List<Message> childContent;

    //自己实现了一个构造方法后编译器不提供默认的无参构造器，这里补上
    public Message() {
    }

    //构造方法
    public Message(String username, String text, int pid) {
        this.username = username;
        this.text = text;
        this.pid = pid;
    }

    public void setChildContent(List<Message> childList) {
        MessageBoardService messageBoardService = MessageBoardServiceImpl.getInstance();
        for (Message message:childList
             ) {
            messageBoardService.insertContent(message);
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
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
}
