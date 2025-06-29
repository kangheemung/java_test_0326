// Personクラスを修正して、コンストラクタを追加する
class Person {
    protected String name; // 名前
    protected int age;

    // コンストラクタを定義
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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
}

class Lesson {
    public static void main(String[] args) {
        // コンストラクタを使用してTeacherクラスのインスタンスを生成
        Teacher teacher = new Teacher("太郎", "数学");
        System.out.println("名前: " + teacher.getName());
        System.out.println("科目: " + teacher.getSubject());
    }
}
