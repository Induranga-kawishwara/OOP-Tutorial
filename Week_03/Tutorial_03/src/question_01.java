public class question_01 {
    private int numCans;
    private int tokens;
    public question_01() {
        numCans = 10;
        tokens = 0;
    }
    public question_01(int cans) {
        numCans = cans;
        tokens = 0;
    }
    public void fillUp(int cans) {
        numCans = numCans + cans;
    }
    public void insertToken() {
        numCans = numCans - 1;
        tokens = tokens + 1;
    }
    public int getCanCount() {
        return numCans;
    }
    public int getTokenCount() {
        return tokens;
    }
}

