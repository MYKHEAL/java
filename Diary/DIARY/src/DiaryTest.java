import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DiaryTest {
    private Diary diary;
    private Diaries diaries;

    @Before
    public void setUp() {
        diary = new Diary("testuser", "testpass");
        diaries = new Diaries();
    }

    @Test
    public void testCreateDiary() {
        assertEquals("testuser", diary.getUsername());
        assertEquals("testpass", diary.getPassword());
        assertFalse(diary.isLocked());
    }

    @Test
    public void testLockAndUnlockDiary() {
        diary.lockDiary();
        assertTrue(diary.isLocked());
        diary.unlockDiary("testpass");
        assertFalse(diary.isLocked());
    }

    @Test
    public void testCreateAndFindEntry() {
        diary.createEntry("First Entry", "This is my first entry.");
        Entry entry = diary.findEntryById(0);
        assertNotNull(entry);
        assertEquals("First Entry", entry.getTitle());
        assertEquals("This is my first entry.", entry.getBody());
    }

    @Test
    public void testUpdateEntry() {
        diary.createEntry("First Entry", "This is my first entry.");
        diary.updateEntry(0, "Updated Entry", "This is updated.");
        Entry entry = diary.findEntryById(0);
        assertEquals("Updated Entry", entry.getTitle());
        assertEquals("This is updated.", entry.getBody());
    }

    @Test
    public void testDeleteEntry() {
        diary.createEntry("First Entry", "This is my first entry.");
        diary.deleteEntry(0);
        Entry entry = diary.findEntryById(0);
        assertNull(entry);
    }

    @Test
    public void testAddDiaryToDiaries() {
        diaries.addDiary(diary);
        Diary foundDiary = diaries.findByUsername("testuser");
        assertNotNull(foundDiary);
        assertEquals("testuser", foundDiary.getUsername());
    }

    @Test
    public void testDeleteDiaryFromDiaries() {
        diaries.addDiary(diary);
        diaries.delete("testuser");
        Diary foundDiary = diaries.findByUsername("testuser");
        assertNull(foundDiary);
    }
    @Test
    public void testUnlockDiaryWithWrongPassword() {
        diary.lockDiary();
        diary.unlockDiary("wrongpass");
        assertTrue(diary.isLocked());
    }

    @Test
    public void testFindNonExistentEntry() {
        assertNull(diary.findEntryById(999));
    }

    @Test
    public void testUpdateNonExistentEntry() {
        diary.updateEntry(999, "Invalid", "Should not update.");
        assertNull(diary.findEntryById(999));
    }

    @Test
    public void testAddDuplicateDiary() {
        diaries.addDiary(diary);
        Diary duplicate = new Diary("testuser", "newpass");
        diaries.addDiary(duplicate);
        Diary found = diaries.findByUsername("testuser");
        assertEquals("testuser", found.getUsername());

    }

    @Test
    public void testCreateEntryWithNullTitle() {
        diary.createEntry(null, "Body");
        Entry entry = diary.findEntryById(0);
        assertNotNull(entry);
        assertEquals("", entry.getTitle()); // Adjust based on expected behavior
    }
}