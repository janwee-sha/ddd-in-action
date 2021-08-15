package com.janwee.dddinaction.com.janwee.collaboration.infra.persistence;

import com.janwee.dddinaction.com.janwee.collaboration.domain.model.calendar.CalendarEntry;
import com.janwee.dddinaction.com.janwee.collaboration.domain.model.calendar.CalendarEntryRepository;
import com.janwee.dddinaction.com.janwee.collaboration.domain.model.calendar.TimeSpan;
import com.janwee.dddinaction.com.janwee.collaboration.domain.model.collaborator.Tenant;

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
