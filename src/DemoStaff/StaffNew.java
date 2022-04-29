package DemoStaff;

public class StaffNew {
    private String name ;
    private boolean type ;
    private boolean status ;
    private int salary ;

    public StaffNew() {
    }

    public StaffNew(String name, boolean type, boolean status, int salary) {
        this.name = name;
        this.type = type;
        this.status = status;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getType(){
        if(isType()){
            return "Đang làm ";
        }return "Đã nghỉ ";
    }
    public String getStatus(){
        if(isStatus()){
            return "Full time ";
        }return "Part time ";
    }

    @Override
    public String toString() {
        return "StaffNew " +
                "Tên nhân viên : " + name +
                ", Trạng thái : " + getType() +
                ", Hoạt động : " + getStatus() +
                ", Lương : " + salary ;
    }
}
