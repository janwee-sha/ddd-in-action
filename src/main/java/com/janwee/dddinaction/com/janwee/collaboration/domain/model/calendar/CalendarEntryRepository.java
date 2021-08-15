package com.janwee.dddinaction.com.janwee.collaboration.domain.model.calendar;

import com.janwee.dddinaction.com.janwee.collaboration.domain.model.collaborator.Tenant;

import java.util.Collection;

//将聚合仓库的接口与对应的聚合放在相同的模块（Java包）中
public interface CalendarEntryRepository {
    void add(CalendarEntry entry);

    void addAll(Collection<CalendarEntry> entryCollection);

    void remove(CalendarEntry entry);

    void removeAll(Collection<CalendarEntry> entryCollection);

    CalendarEntry entryOfId(Tenant tenant, String calendarId);

    Collection<CalendarEntry> entriesOfCalendar(Tenant tenant, String calendarId);

    Collection<CalendarEntry> overlappingEntries(Tenant tenant, String calendarId, TimeSpan timeSpan);

    //通过资源库的公共接口获取CalendarEntry的全局唯一标识
    String nextId();
}
