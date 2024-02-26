package Item7EliminateObsoleteObjectReferences;

public class Item7Test3 {
   // @GetMapping("/hello3")
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i=0;i<1000000;i++){
            stack.push(i);
        }
        for (int i = 0;i<1000000;i++){
            stack.pop();
        }
        System.out.println("Hello");

    }
}
