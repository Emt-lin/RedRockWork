package team.redrock.messageBoard.service.impl;

/**
 * 自定义异常
 * @author psl
 */
public class UserException extends Exception{
    public UserException() {
        super();
    }

    public UserException(String message) {
        super(message);
    }
}
