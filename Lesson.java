// Personクラスを修正して、コンストラクタを追加する
class Person {
    public String name; // 名前
    public int age;

    // コンストラクタを定義
    public Person(String name) {
        this.name = name;
    }
    public void method(String name) {
        // 引数に再代入する
        name = name;
        int age = 10;
        // ローカル変数に再代入する
        age = age;
        // フィールドに引数を代入する
        this.name = name;
        // フィールドにローカル変数を代入する
        this.age = age;
        // コンパイルエラー
        this = new Person();
    }

    public String getName() {
        return this.name;
    }
    public void show() {
        // this.get()のようにメソッドを呼び出します
        System.out.println("名前: " + this.get());
    }
    public void showMessage(String message) {
        System.out.println(message);
    }
}

class Teacher extends Person {
    private String subject; // 担当教科
    // Teacherクラスのコンストラクタを定義
    public Teacher(String name, String subject) {
        super(name); // スーパークラスのコンストラクタを呼び出す
        this.subject = subject;
    }
    public String getSubject() {
        return this.subject;
    }
    public void setSubject(String subject) {
    this.subject = subject;
    }
    public void showMessage(String message) {
        System.out.println("Teacher says: " + message);
    }
}

class Lesson {
    public static void main(String[] args) {
        // コンストラクタを使用してTeacherクラスのインスタンスを生成
        Person person1 = new Person();
        person1.set("太郎");
        Person person2 = new Person();
        person2.set("花子");
        Teacher teacher = new Teacher("太郎", "数学");
        teacher.showMessage("Hello student");
        person1.show(); // 太郎
        person2.show(); // 花子
        System.out.println("名前: " + teacher.getName());
        System.out.println("科目: " + teacher.getSubject());
    }
}
