class Practice {

    static String college = "RGP";
    int rollNo;
    String name;

    Practice(String name,int rollNo) {
        this.rollNo = rollNo;
        this.name = name;
    }

    
    void disp() {
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(college);
    }
    public static void main(String[] args) {
        Practice p1 = new Practice("Biswarup", 5);
        Practice p2 = new Practice("Hani", 10);

        p1.disp();
        p2.disp();
        Practice.college = "PPC";
        p1.disp();
        p2.disp();
        
    }
}