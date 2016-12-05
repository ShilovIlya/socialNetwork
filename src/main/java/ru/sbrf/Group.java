package ru.sbrf;

import java.util.ArrayList;

public class Group {
    private final long groupId;
    private ArrayList<Long> members;

    public Group(long groupId) {
        this.groupId = groupId;
    }

    public void addMember(Long accountId) {
        members.add(accountId);
    }
}
