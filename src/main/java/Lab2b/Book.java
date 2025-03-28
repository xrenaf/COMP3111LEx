package Lab2b;

public class Book {
    private String chapters[];
    private static final int DEFAULT_CHAPTERS = 10;

    public Book() {
        chapters = new String[DEFAULT_CHAPTERS];
        for (int i = 0; i<chapters.length; ++i)
            chapters[i] = "n/a";
    }

    public Book(String argument[]) {
        // System.out.println(argument.length);
        if (argument.length <= DEFAULT_CHAPTERS) {
            chapters = new String[argument.length];
            for (int i = 0; i < argument.length; i++) {
                chapters[i] = argument[i];
            }
        } else {
            System.out.println("Too many chapters provided.");
        }
    }

    public String getChapter(int i) {
        if (i >= 0 && i < chapters.length) {
            return chapters[i];
        } else {
            throw new IndexOutOfBoundsException("Chapter index out of bounds.");
        }
    }

    public String[] getChapters() {
        return chapters;
    }
}
