public class Article {
    // Instance variables (attributes)
    private String title;
    private String author;
    private String journalName;
    private int yearPublished;
    private int volume;
    private int issue;
    private String pages;
    private String doi;   // Digital Object Identifier

    // Constructor
    public Article(String title, String author, String journalName, int yearPublished,
                   int volume, int issue, String pages, String doi) {
        this.title = title;
        this.author = author;
        this.journalName = journalName;
        this.yearPublished = yearPublished;
        this.volume = volume;
        this.issue = issue;
        this.pages = pages;
        this.doi = doi;
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getJournalName() { return journalName; }
    public int getYearPublished() { return yearPublished; }
    public int getVolume() { return volume; }
    public int getIssue() { return issue; }
    public String getPages() { return pages; }
    public String getDoi() { return doi; }

    // Setters
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setJournalName(String journalName) { this.journalName = journalName; }
    public void setYearPublished(int yearPublished) { this.yearPublished = yearPublished; }
    public void setVolume(int volume) { this.volume = volume; }
    public void setIssue(int issue) { this.issue = issue; }
    public void setPages(String pages) { this.pages = pages; }
    public void setDoi(String doi) { this.doi = doi; }

    // Instance method to return formatted bibliographic info
    public String getBibliography() {
        return author + ". \"" + title + ".\" " + journalName + ", vol. " + volume +
               ", no. " + issue + ", " + yearPublished + ", pp. " + pages +
               ". DOI: " + doi;
    }

    // toString method
    @Override
    public String toString() {
        return getBibliography();
    }
}
