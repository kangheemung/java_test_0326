class Main{
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("太郎");
        person1.setAge(10);
    }
}
class Person{
    public String name;
    public int age;
    public void setName(String name){
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
