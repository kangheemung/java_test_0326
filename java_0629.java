class Person {
    protected String name; // 名前
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
//  * Personを継承した、Teacherを定義します
//  */
class Teacher extends Person {
    private String subject; // 担当教科
    public String getSubject() {
        return this.subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
}

/**
 * 実行用クラス
 */
class Lesson {
    public static void main(String[] args) {
        // Teacherクラスのインスタンスを生成
        Teacher teacher = new Teacher();
        // スーパークラスのメソッドにもアクセスできる
        teacher.setName("太郎");
        // Teacherクラスのメソッドにアクセスする
        teacher.setSubject("数学");
        // フィールドの出力
        System.out.println("名前: " + teacher.getName());
        System.out.println("科目: " + teacher.getSubject());
    }
}