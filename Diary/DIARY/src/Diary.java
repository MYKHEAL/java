import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String username;
    private String password;
    private boolean locked;
    private List<Entry> entries;
    private int nextId;

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
        this.locked = false;
        this.entries = new ArrayList<>();
        this.nextId = 0;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isLocked() {
        return locked;
    }

    public void lockDiary() {
        this.locked = true;
    }

    public void unlockDiary(String password) {
        if (this.password.equals(password)) {
            this.locked = false;
        }
    }

    public void createEntry(String title, String body) {
        entries.add(new Entry(nextId++, title, body));
    }

    public Entry findEntryById(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                return entry;
            }
        }
        return null;
    }

    public void updateEntry(int id, String title, String body) {
        Entry entry = findEntryById(id);
        if (entry != null) {
            entry.setTitle(title);
            entry.setBody(body);
        }
    }

    public void deleteEntry(int id) {
        entries.removeIf(entry -> entry.getId() == id);
    }

    public List<Entry> getAllEntries() {
        return new ArrayList<>(entries);
    }
}