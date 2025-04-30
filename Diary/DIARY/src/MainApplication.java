import java.util.Scanner;

public class MainApplication {
    private static Diaries diaries = new Diaries();
    private static Scanner scanner = new Scanner(System.in);
    private static Diary currentDiary = null;
   // private static int nextId = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to the Diary Application");

        while (true) {
            if (currentDiary == null) {
                showMainMenu();
            } else {
                showDiaryMenu();
            }
        }
    }

    private static void showMainMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("1. Create New Diary");
        System.out.println("2. Login to Existing Diary");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");

        String input = scanner.nextLine();

        if (input.equals("1")) {
            createNewDiary();
        } else if (input.equals("2")) {
            loginToDiary();
        } else if (input.equals("3")) {
            System.out.println("Goodbye!");
            System.exit(0);
        } else {
            System.out.println("Invalid option. Please try again.");
        }
    }

    private static void showDiaryMenu() {
        System.out.println("\nDiary Menu (" + currentDiary.getUsername() + "):");
        System.out.println("1. Create New Entry");
        System.out.println("2. View Entry");
        System.out.println("3. Update Entry");
        System.out.println("4. Delete Entry");
        System.out.println("5. Lock Diary and Logout");
        System.out.print("Choose an option: ");

        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            createEntry();
        } else if (choice.equals("2")) {
            viewEntry();
        } else if (choice.equals("3")) {
            updateEntry();
        } else if (choice.equals("4")) {
            deleteEntry();
        } else if (choice.equals("5")) {
            lockDiary();
            currentDiary = null;
            //nextId = 0;
            System.out.println("Logged out successfully.");
        } else {
            System.out.println("Invalid option. Please try again.");
        }
    }

    private static void createNewDiary() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        Diary diary = new Diary(username, password);
        diaries.addDiary(diary);
        Diary found = diaries.findByUsername(username);
        if (found != null) {
            currentDiary = found;
            System.out.println("Diary created successfully!");
        } else {
            System.out.println("Failed to create diary. Username might already exist.");
        }
    }

    private static void loginToDiary() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        Diary diary = diaries.findByUsername(username);
        if (diary == null) {
            System.out.println("Diary not found!");
            return;
        }

        if (diary.isLocked()) {
            diary.unlockDiary(password);
            if (diary.isLocked()) {
                System.out.println("Incorrect password!");
                return;
            }
        }

        currentDiary = diary;
        System.out.println("Logged in successfully!");
    }

    private static void createEntry() {
        System.out.print("Enter entry title: ");
        String title = scanner.nextLine();
        System.out.print("Enter entry body: ");
        String body = scanner.nextLine();

        currentDiary.createEntry(title == null ? "" : title, body);
        int newId = currentDiary.getAllEntries().size() - 1;
        System.out.println("Entry saved! Its ID is: " + newId);
    }

    private static void viewEntry() {
        System.out.print("Enter entry ID: ");
        String input = scanner.nextLine();
        int id;
        try {
            id = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("ID must be a number.");
            return;
        }

        Entry entry = currentDiary.findEntryById(id);
        if (entry == null) {
            System.out.println("Entry not found!");
            return;
        }

        System.out.println("ID: " + entry.getId());
        System.out.println("Title: " + entry.getTitle());
        System.out.println("Body: " + entry.getBody());
        System.out.println("Date Created: " + entry.getDateCreated());
    }

    private static void updateEntry() {
        System.out.print("Enter entry ID: ");
        String input = scanner.nextLine();
        int id;
        try {
            id = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("ID must be a number.");
            return;
        }

        if (currentDiary.findEntryById(id) == null) {
            System.out.println("Entry not found!");
            return;
        }

        System.out.print("Enter new title: ");
        String title = scanner.nextLine();
        System.out.print("Enter new body: ");
        String body = scanner.nextLine();

        currentDiary.updateEntry(id, title, body);
        System.out.println("Entry updated successfully!");
    }

    private static void deleteEntry() {
        System.out.print("Enter entry ID: ");
        String  input = scanner.nextLine();
        int id;
        try {
            id = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("ID must be a number.");
            return;
        }

        if (currentDiary.findEntryById(id) == null) {
            System.out.println("Entry not found!");
            return;
        }

        currentDiary.deleteEntry(id);
        System.out.println("Entry deleted successfully!");
    }

    private static void lockDiary() {
        currentDiary.lockDiary();
        currentDiary = null;
        System.out.println("Diary locked and logged out successfully!");
    }
}
