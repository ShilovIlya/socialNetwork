package ru.sbrf;

import java.util.ArrayList;

public class Chat {
    private final long chatId;
    private ArrayList<Long> members;
    private ArrayList<UserMessage> messages;

    public Chat(long chatId) {
        this.chatId = chatId;
    }

    public void addMember(Long accountId) {
        members.add(accountId);
    }

    public void deleteMemeber(Long accountId) {
        members.remove(accountId);
    }

    public void addMessage(UserMessage message) {
        messages.add(message);
    }

    public ArrayList<UserMessage> getMessages() {
        return messages;
    }

    public ArrayList<Long> getMembers() {
        return members;
    }
}
