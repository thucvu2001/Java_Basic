package OOP_Basic;

public class Person {
    // datafield
    private String name;
    private String birth;
    private double gpa;
    // method (behavior)
    //constructor: ham khoi tao, co the nap chong
    public Person(){
        System.out.println("day la ham khoi tao, k co tham so");
    }
    public Person(String ten, String ngaySinh, double diem){
        System.out.println("day la ham khoi tao co tham so");
        name = ten;
        birth = ngaySinh;
        gpa = diem;
    }
    public void eat() {
        System.out.println("people can eat");
    }
    public String soSanh(Person x){
        if(this.name == x.name){
            return "bang nhau";
        } else {
            return "khac nhau";
        }
    }
//    public Person(String name, String birth, double gpa) {
//        this.name = name;
//        this.birth = birth;
//        this.gpa = gpa;
//    }
//    interface : getter, setter
//    public String getName(){
//        return this.name;
//    }
//    public String getBirth(){
//        return this.birth;
//    }
//    public double getGpa(){
//        return this.gpa;
//    }
//    public void setName (String name){
//        this.name = name;
//    }
//    public void setBirth(String birth){
//        this.birth = birth;
//    }
//    public void setGpa(double gpa){
//        this.gpa = gpa;
//    }

    // co the chuot phai chon Generate chon Getter & Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBirth() {
        return birth;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
