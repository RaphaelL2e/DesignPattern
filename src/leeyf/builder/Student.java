package leeyf.builder;

public class Student {
    String id;
    String name;
    String age;
    String classroom;

    public Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.classroom = builder.classroom;
    }

    public static class Builder{
        String id;
        String name;
        String age;
        String classroom;

        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age(String age){
            this.age = age;
            return  this;
        }

        public Builder classroom(String classroom){
            this.classroom =classroom;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", classroom='" + classroom + '\'' +
                '}';
    }
}
