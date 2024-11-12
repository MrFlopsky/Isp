package isp.lab3.exercise1;

public class Tree {
    public int height;

    public Tree() {
        this.height = 15;
    }

    public void grow(int meters) {
        if (meters >= 1) {
            this.height += meters;
        }
    }

    public String toString() {
        return Integer.toString(this.height);
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        System.out.println("Initial height: " + tree.toString());
        tree.grow(3);
        System.out.println("Height after growing by 3 meters: " + tree.toString());
    }
}
