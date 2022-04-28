public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff("Hoa","fulltime","đang làm","1414");
        Staff staff1 = new Staff("Huy ","parttime","nghỉ làm","1287");
        Staff staff2 = new Staff("Hường","fulltime","đang làm","1858");
        Staff staff3 = new Staff("Hưng","parttime","nghỉ làm","15585");
        Staff staff4 = new Staff("Hùng","fulltime","đang làm","16747");

        StaffManagement management = new StaffManagement();
        //Thêm
        System.out.println("Sau khi thêm :");
        management.add(staff);
        management.add(staff1);
        management.add(staff2);
        management.add(staff3);
        management.add(staff4);
        management.printAll();

        //Xóa
        System.out.println("Sau khi xóa : ");
        management.findIndexById("Hoa");
        management.removeByName("Hoa");
        management.printAll();
         //Sửa
        System.out.println("Sau khi sửa : ");
        management.findIndexById("Hường ");
        management.editByName("Hường ",new Staff("hoa2","1","1", "1"));
        management.printAll();
        //update
        System.out.println("Cập nhật : ");
        System.out.println(management.findByName("Hưng"));
        management.update("Hường");
        management.printAll();
        //in lương ;
        System.out.println("In Lương : ");
        management.calSalaryFulltime();
        System.out.println("parttime");
        management.calSalaryParttime();
        // infull part
        management.filterPasttimeStaff();
        System.out.println("==");
        management.filterFulltimeStaff();
        //Ghi file






    }

}
