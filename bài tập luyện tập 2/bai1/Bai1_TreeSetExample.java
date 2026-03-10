import java.util.TreeSet;
public class Bai1_TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");
        System.out.println("Danh sách tên (đã sắp xếp): " + names);
        String first = names.first();
        String last = names.last();

        System.out.println("Phần tử đầu tiên (nhỏ nhất): " + first);
        System.out.println("Phần tử cuối cùng (lớn nhất): " + last);
    }
}