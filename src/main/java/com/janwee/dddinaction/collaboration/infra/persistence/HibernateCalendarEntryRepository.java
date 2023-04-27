package com.janwee.dddinaction.collaboration.infra.persistence;

import com.janwee.dddinaction.collaboration.domain.calendar.CalendarEntry;
import com.janwee.dddinaction.collaboration.domain.calendar.CalendarEntryRepository;
import com.janwee.dddinaction.collaboration.domain.calendar.TimeSpan;
import com.janwee.dddinaction.identityaccess.domain.Tenant;

import java.util.Collection;

//为了将领域概念与持久化相关概念分离开来，将CalendarEntry仓库接口的实现类放在基础设施层中
public class HibernateCalendarEntryRepository implements CalendarEntryRepository {
    public void add(CalendarEntry entry) {

    }

    public void addAll(Collection<CalendarEntry> entryCollection) {

    }

    public void remove(CalendarEntry entry) {

    }

    public void removeAll(Collection<CalendarEntry> entryCollection) {

    }

    public CalendarEntry entryOfId(Tenant tenant, String calendarId) {
        return null;
    }

    public Collection<CalendarEntry> entriesOfCalendar(Tenant tenant, String calendarId) {
        return null;
    }

    public Collection<CalendarEntry> overlappingEntries(Tenant tenant, String calendarId, TimeSpan timeSpan) {
        return null;
    }

    public String nextId() {
        return null;
    }
}
