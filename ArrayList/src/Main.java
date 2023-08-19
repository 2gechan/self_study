// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ArrayList arrList = new ArrayList();

        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        arrList.arrToString();
        arrList.findByIndex(1);

        arrList.remove(1);
        arrList.arrToString();
        System.out.println(arrList.size());
    }
}