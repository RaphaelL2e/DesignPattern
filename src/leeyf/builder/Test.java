package leeyf.builder;

public class Test {
    public static void main(String[] args) {
        Student.Builder sb = new Student.Builder();
        Student s = sb.classroom("18")
                .age("22")
                .name("leeyf")
                .id("01")
                .build();
        System.out.println(s.toString());
    }

}
