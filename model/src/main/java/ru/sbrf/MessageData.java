package ru.sbrf;

public class MessageData {
    private String text;

    public MessageData() {
    }

    public MessageData(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
