package person.consciousness;

public class Knowledge {
    private int level;

    public Knowledge() {
        level = 0;
    }
    public Knowledge(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
    /*
        The implementation of the setLevel(int level) method needs to be changed according to
        the way the level of knowledge is defined.
     */
    public void setLevel(int level) {
        this.level = level;
    }
}