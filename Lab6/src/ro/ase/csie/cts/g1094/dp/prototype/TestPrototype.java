package ro.ase.csie.cts.g1094.dp.prototype;

public class TestPrototype {

    public static void main(String[] args) {

        Tree3DModel tree1 = new Tree3DModel("green",100);

        try {
            Tree3DModel tree2 = (Tree3DModel) tree1.clone();
            Tree3DModel tree3 = (Tree3DModel) tree1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
