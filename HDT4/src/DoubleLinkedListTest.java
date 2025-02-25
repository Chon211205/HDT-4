import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoubleLinkedListTest{
    @Test
    public void testAdd(){
        DoubleLinkedList dLl = new DoubleLinkedList();
        int a = dLl.getSize();
        dLl.add(dLl.getValue());
        assertEquals(a+1, dLl.getSize());
    }

    @Test
    public void testRemove(){
        DoubleLinkedList dLl = new DoubleLinkedList();
        assertEquals(dLl.getValue(), dLl.remove());
    }
}
