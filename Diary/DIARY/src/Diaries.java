import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<Diary> diaries;

    public Diaries() {
        this.diaries = new ArrayList<>();
    }

    public void addDiary(Diary diary) {
        for (Diary existing : diaries) {
            if (existing.getUsername().equals(diary.getUsername())) {
                return;
            }
        }
        diaries.add(diary);
    }

    public Diary findByUsername(String username) {
        for (Diary diary : diaries) {
            if (diary.getUsername().equals(username)) {
                return diary;
            }
        }
        return null;
    }

    public void delete(String username) {
        diaries.removeIf(diary -> diary.getUsername().equals(username));
    }
}