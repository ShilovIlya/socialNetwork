package ru.sbrf.model;

import java.util.ArrayList;

public class Group {
    private final long groupId;
    private ArrayList<Long> members;
    private ArrayList<Chat> chats;

    public Group(long groupId) {
        this.groupId = groupId;
    }

    public void addMember(Long accountId) {
        members.add(accountId);
    }

    public void deleteMemeber(Long accountId) {
        members.remove(accountId);
    }

    public void addChat(Chat chat) {
        chats.add(chat);
    }
}
