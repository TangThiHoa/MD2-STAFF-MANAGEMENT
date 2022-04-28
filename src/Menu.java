import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        StaffManagement staffManagement = new StaffManagement();
        int choice;
        while (true) {
            System.out.println("=====QUẢN LÍ DANH BẠ=====\n" +
                    "Chọn chức năng theo số : \n" +
                    "1. Show : \n" +
                    "2. AddStaff \n" +
                    "3. Updade \n" +
                    "4.Search \n" +
                    "5.Print Fulltime \n" +
                    "6.Edit \n" +
                    "7. CalTotalsaly \n" +
                    "8.Readfile\n" +
                     "9. Thoát");
            System.out.println("Chọn đi bạn :");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    staffManagement.printAll();
                    break;
                case 2:
                    System.out.println("Nhập tên :");
                    String name = sc.nextLine();
                    System.out.println("Nhập type :");
                    String type = sc.nextLine();
                    System.out.println("Nhập tình trạng làm việc  :");
                    String status = sc.nextLine();
                    System.out.println("Nhập lương :");
                    String salary = sc.nextLine();
                    staffManagement.add(new Staff(name, type, status, salary));
                    System.out.println(" Thêm thành công ! ");
                    break;
                case 3:
                    System.out.println("Nhập tên người muốn update : ");
                    String name1 = sc.nextLine();
                    if (staffManagement.findByName(name1) != -1) {
                        staffManagement.update(name1);
                        System.out.println("update thành công ");
                    }
                    break;
                case 4:
                    System.out.println("Nhập tên muốn tìm kiếm :");
                    String name3 = sc.nextLine();
                    staffManagement.findIndexById(name3);
                    break;
                case 5:
                    staffManagement.filterFulltimeStaff();
                    break;
                case 6:
                    System.out.println("Nhập tên muốn thay đổi :");
                    String name2 = sc.nextLine();
                    ;
                    if (staffManagement.findIndexById(name2) == -1) {
                        System.out.println("Không tìm thấy tên trong ds ");
                    } else {
                        System.out.println("Nhập tên :");
                        String name4 = sc.nextLine();
                        System.out.println("Nhập type :");
                        String type4 = sc.nextLine();
                        System.out.println("Nhập tình trạng làm việc  :");
                        String status4 = sc.nextLine();
                        System.out.println("Nhập lương :");
                        String salary4 = sc.nextLine();
                        staffManagement.editByName(name4, type4, status4, salary4);
                        System.out.println("Thay đổi thành công ");
                        break;
                    }
                case 7:
                    FileStaff.writeToFile(staffManagement.staffList);
                    break;
                case 8:
                    FileStaff.readFromFile(staffManagement.staffList);
                    break;


            }
        }
    }

}
