package Seminars.Seminar2.task_1;

public class Test implements INumeric {
    int start;
    int val;

    public Test() {
        start = 0;
        val = 0;
    }

    @Override
    public int getNext() {
        val +=2;
        return val;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;

    }

    @Override
    public void reset() {
        start = 0;
        val = 0;

    }

}
