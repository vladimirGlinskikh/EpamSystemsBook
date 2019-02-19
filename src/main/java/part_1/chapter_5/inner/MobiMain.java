package part_1.chapter_5.inner;

public class MobiMain {
    public static void main(String[] args) {
        Abonent abonent = new Abonent(819002, "Vladimir Vladimirov");
        abonent.setTariffPlan("free");
        abonent.obtainPhoneNumber(375, 25);
        System.out.println(abonent);
    }
}
