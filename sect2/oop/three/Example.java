// inner class/non-static nested class example
public class Example{
    String empName;
    int empId;
    Example(String empName, int empId){
        this.empName = empName;
        this.empId = empId;
    }
    private class Details{
        int empIdPin;
        String empSalary;
        Details(int empIdPin, String empSalary){
            this.empIdPin = empIdPin;
            this.empSalary = empSalary;
        }
        void getDetails(){
            System.out.println(empName);
            System.out.println(empId);
            System.out.println(empIdPin);
            System.out.println(empSalary);
        }
    }
    public static void main(String[] args){
        Example emp = new Example("John", 101);
        Example.Details det = emp.new Details(10202, "$5000");
        det.getDetails();
    }
}