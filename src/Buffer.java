import java.util.ArrayList;
import java.util.List;

public class Buffer {

    public Buffer(int count){
        data = new ArrayList<Integer>(count);
        for (int i = 0; i < count; i++){
            data.add(null);
        }
    }

    public void push(int element){
        data.set(pointer, element);
        pointer = (pointer + 1) % data.size();
        if (count != data.size())
            count++;
    }

    public void delete(int count) throws Exception {
        if (count > data.size())
            throw new Exception("count is more than size");
        for (int i=0; i<count; i++){
            delete();
        }
    }

    public void delete() throws Exception {
        if (count == 0)
            throw new Exception("Buffer is already empty");
        data.set(((pointer - count + data.size()) % data.size()), null);
        count--;
    }

    public int pop(){
        return data.get((pointer - 1 + data.size())%data.size());
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == data.size();
    }

    @Override
    public String toString(){
        return data.toString();
    }
    private List<Integer> data;

    private int pointer = 0;

    private int count = 0;

}
