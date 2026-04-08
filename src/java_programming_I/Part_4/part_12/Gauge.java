package java_programming_I.Part_4.part_12;

public class Gauge {
    private int value;
    public Gauge()
    {
        value = 0;
    }
    public void increase()
    {
        value+=1;
    }
    public void decrease()
    {
        if(value-1>=0)
        value-=1;
    }
    public int value()
    {
        return value;
    }
    public boolean full()
    {
        if(value == 5)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Gauge g = new Gauge();

        while(!g.full()) {
            System.out.println("Not full! Value: " + g.value());
            g.increase();
        }

        System.out.println("Full! Value: " + g.value());
        g.decrease();
        System.out.println("Not full! Value: " + g.value());
    }
}
