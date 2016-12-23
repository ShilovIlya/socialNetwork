package ru.sbrf;

import ru.sbrf.Group;

public interface GroupDao {

    Long create(Group group);

    Group getGroupById(long id);
}
