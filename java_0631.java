class Main{
    public static void main(String[] args) {
        Person person1 = new Person("太郎");
        person1.setAge(10);

        Person person2 = new Person("花子1");

        person2.setAge(16);

        person1.showFields();
        person2.showFields();

        Person person_Kang = new Person("kang");
         person_Kang.setAge(35);
        person_Kang.showFields();
    }
}
class Person{
    public String name;
    public int age;

    public Person(String name){
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void showName(){
        System.out.println("名前"+ this.name);
    }
    public void showAge(){
        System.out.println("年齢： "+ this.age);
    }
    public void showFields() {
        this.showName();
        this.showAge();
    }
}
