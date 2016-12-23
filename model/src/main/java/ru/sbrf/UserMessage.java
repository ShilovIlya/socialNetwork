package ru.sbrf;

public class UserMessage {
    private Account sender;
    private MessageData data;

    public UserMessage(Account sender) {
        this.sender = sender;
    }

    public UserMessage(Account sender, MessageData data) {
        this.sender = sender;
        this.data = data;
    }

    public MessageData getData() {
        return data;
    }

    public void setData(MessageData data) {
        this.data = data;
    }
}
