public class Main {
    public static void main(String[] args) {
        DynamicArray<String> words = new DynamicArray<>();

        System.out.println("Adding elements...");
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("date");

        System.out.println("Size: " + words.size());
        System.out.println("Item at index 1: " + words.get(1)); // banana

        System.out.println("\nRemoving index 2...");
        String removed = words.remove(2); // cherry
        System.out.println("Removed: " + removed);

        System.out.println("Size now: " + words.size());
        System.out.println("Items now:");
        for (int i = 0; i < words.size(); i++) {
            System.out.println(i + ": " + words.get(i));
        }

        System.out.println("\nAdding more to trigger resize...");
        for (int i = 0; i < 20; i++) {
            words.add("x" + i);
        }
        System.out.println("Final size: " + words.size());
        System.out.println("Last item: " + words.get(words.size() - 1));
    }
}
