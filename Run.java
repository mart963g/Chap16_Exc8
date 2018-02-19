package Exc_8;

public class Run
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        list.add(3);
        list.add(7);
        list.add(12);
        list.add(13);
        list.add(15);
        list.add(17);
        list.add(18);
        list.add(19);
        System.out.println(list);
        list.switchPairs();
        System.out.println(list);
    }
}
