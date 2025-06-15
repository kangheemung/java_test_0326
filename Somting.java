class Sample{
    public static void main(String[] args){
        something();
        showDiskArea();
        showDiskArea(10);
        showDiskArea(10,3141);
    }
    public static void showDiskArea() {
        int radius=20;
        double pi =3.14;
        System.out.println(radius * radius * pi);
    }
    public static void showDiskArea(int radius) {
        double pi =3.14;
        System.out.println(radius * radius * pi);
    }
    public static void showDiskArea(int radius,double pi) {
        System.out.println(radius * radius * pi);
    }

    public static void something() {
        System.out.println("Hello");
    }
    public static void something(int num){
        System.out.println(num);
    }
}