public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            Buffer buffer = new Buffer(5);
            for (int i=0; i < 9; i++){
//                System.out.println(buffer.isEmpty());
                buffer.push(i);
                System.out.println(buffer.toString());
//                System.out.println(buffer.isFull());

            }
            for (int i=0; i < 5; i++){
//                System.out.println(buffer.delete());
                buffer.delete();
                System.out.println(buffer.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
