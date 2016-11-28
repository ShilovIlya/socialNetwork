package ru.sbrf.model;

import java.util.ArrayList;

/**
 * Created by Wais on 28.11.2016.
 */
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
