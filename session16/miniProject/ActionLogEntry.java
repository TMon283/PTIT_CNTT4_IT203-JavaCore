package session16.miniProject;

import java.time.LocalDateTime;

public class ActionLogEntry {
    private final LocalDateTime timestamp;
    private final String description;

    public ActionLogEntry(String description) {
        this.timestamp = LocalDateTime.now();
        this.description = description;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "[" + timestamp + "] " + description;
    }
}

