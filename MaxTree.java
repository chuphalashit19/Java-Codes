import java.util.Arrays;
public class MaxTree {
    private class Node {
        int element;
        public Node(int element) { this.element = element; }
        public String toString() { return String.valueOf(element); }
    }
    Node root;
    
    // Build a maximum tree out of an array.
    public MaxTree(int[] a) {
        int n = a.length;
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(a[i]);
        }
        while (n > 1) {
            for (int i = 0; i < n / 2; i++) {
                int max = Math.max(nodes[i * 2].element, nodes[i * 2 + 1].element);
                Node newNode = new Node(max);
                nodes[i] = newNode; // why it's safe to resue the space?
            }
            // n might be odd.
            if (n % 2 != 0)  {
                nodes[n/2] = new Node(nodes[n - 1].element);
            }
            
            n = (n + 1) / 2;
        }
        root = nodes[0];
    }

    // implement this
    // The running time of deleteMax is O(log n ).
    

   public static void main(String[] args) {
//      int size = 10;
//      int[] a = new int[size];
//      SecureRandom random = new SecureRandom();
//      for (int i = 0; i < size; i++)
//          a[i] = random.nextInt(size);

        int[] a = {3, 2, 6, 13, 8, 4, 10, 7, 14, 11, 12, 5, 9};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a));
   }
}