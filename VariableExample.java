public class VariableExample {
    public static void main(String[] args) {
        //1.1 ตัวแปรที่ใช้เก็บค่าของขนาดเสื้อผ้า ซึ่งเป็นขนาด s , m หรือ l
            char clothingSize = 's';//สามารถเป็น 's' , 'm' หรือ 'l'

        //1.2 ตัวแปรที่ใช้เก็บค่าคนที่เข้าชมเว็ปไซต์
        int websiteVisitor = 0; // จำนวนคนที่เข้าชมเว็ปไซต์

        //1.3 ตัวแปรที่ใช้เก็บเกรดของนักศึกษา(A,B,C,D,E)
        char studentGrade = 'A';// สามารถเป็น 'A','B','C','D' หรือ 'E'

        //1.4 ตัวแปรที่เก็บเกรดเฉลี่ยของนักศึกษา
        double studentGPA = 4.0;// ค่าเกรดเฉลี่ยของนักศึกษา

        //1.5 ตัวแปรเก็บค่า  Pi(ค่าที่ใช้หาในพิ้นที่วงกลม)
        final double Pi = 3.14159;//ค่าของ Pi ควรเป็นค่าคงที่

        //1.6 ตัวแปรที่เก็บค่าใช้จ่ายรายปีของนักศึกษา
        float annualExpenses = 15000.00f; //ค่าใช่จ่ายรายปีของนักศึกษา

        //1.7 ตัวแปรที่ใช้เก็บค่าจำนวนของเดือนที่มีในหนึ่งปี
        final int MONTHS_IN_YEAR = 12; //จำนวนเดือนในหนึ่งปี ควรเป็นค่าคงที

        // ตัวอย่างการแสดงผลค่าตัวแปร
        System.out.println("Clothing Size: " + clothingSize);
        System.out.println("Website Visitor: " + websiteVisitor);
        System.out.println("Student Grade: " + studentGrade);
        System.out.println("Student GPA: " + studentGPA);
        System.out.println("Value of Pi: " + Pi);
        System.out.println("Annual Expenses: " + annualExpenses);
        System.out.println("Months in a Year: " + MONTHS_IN_YEAR);

    }
}
