package ru.loggers;

import ru.beans.Event;

public interface EventLogger {

    public void logEvent(Event event);

    public String getName();

}
