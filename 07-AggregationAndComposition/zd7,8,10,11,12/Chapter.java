public class Chapter{
    private String chapterTitle;
    private int numberOfPages;
    private int startingPageNumber;
    
    public String toString(){
        return "\nChapter title: "+this.chapterTitle+"\nNumber of pages: "+this.numberOfPages+"\nStarting page number: "+this.startingPageNumber; 
    }
    
    public Chapter(String chapterTitle, int numberOfPages, int startingPageNumber){
        this.chapterTitle=chapterTitle;
        this.numberOfPages=numberOfPages;
        this.startingPageNumber=startingPageNumber;
    }
}
