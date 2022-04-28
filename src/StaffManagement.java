import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StaffManagement {
    List<Staff> staffList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void show() {
        for (Staff s : staffList) {
            System.out.println(s);

        }
    }

    public void add(Staff staff) {
        staffList.add(staff);
    }


    public int findByName(String name) {
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getName().contains(name)) {
                return i;
            }
        }
        return -1;
    }

    public int findIndexById(String name) {
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getName().equals(name)) {
                return i;

            }
        }
        return -1;
    }

    public void editByName(String name, Staff staff) {

        int index = findIndexById(name); // chỉ số trả về từ search
        if (index != -1) {
            staffList.set(index, staff);
            System.out.println("Sửa thành công ");
        } else {
            System.out.println("Không có tên " +
                    name + " trong danh sách");
        }
    }

    public void removeByName(String name) {
        if (findIndexById(name) == -1) {
            System.out.println("Không Tìm thấy");
        } else {
            staffList.remove(findIndexById(name));
        }
//        int index = findIndexById(name);
//        if (index != -1 ) {
//            staffList.remove(index);
//            System.out.println("Xóa thành công   ");
//        } else
//            System.out.println(" Không có tên " + name + "trong ds");
    }

    public void update(String name) {
        int staff = findIndexById(name);
        if (staff == -1) {
            System.out.println("Lỗi");
        } else {
            staffList.get(staff).setStatus("Nghỉ");
        }

    }


    public void printAll() {
        for (Staff s : staffList) {
            System.out.println(s);
        }
    }

    public void calSalaryFulltime() {
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getType().equals("fulltime")) {
                System.out.println(staffList.get(i).getName() + " có lương " + staffList.get(i).getSalary());
            }
        }
    }

    public void calSalaryParttime() {
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getType().equals("parttime")) {
                System.out.println(staffList.get(i).getName() + " có lương " + staffList.get(i).getSalary());
            }

        }
    }


    public void filterFulltimeStaff() {
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getType().equals("fulltime")) {
                System.out.println(staffList.get(i));
            }
        }


    }
    public void filterPasttimeStaff() {
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getType().equals("parttime")) {
                System.out.println(staffList.get(i));
            }
        }

    }

    public void editByName(String name4, String type4, String status4, String salary4) {
    }
}
