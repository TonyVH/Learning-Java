package series;

public interface Series {
    int getNext();  // return next number in series
    void restart(); // reset values
    void setStart(int x);   // set starting value
}
