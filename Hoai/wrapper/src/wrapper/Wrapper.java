/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wrapper;

/**
 *
 * @author Admin
 */
public class Wrapper {

    class Employee {

        String name;
        int hoursWorked;
        float hourlyRate;
        float tax;
        float grossPay;
        float netPay;

        public Employee(String name, int hoursWorked, float hourlyRate) {
            this.name = name;
            this.hoursWorked = hoursWorked;
            this.hourlyRate = hourlyRate;
        }

        public String getName() {
            return name;
        }

        public void calculatePay() {
            int payableHours;

            if (hoursWorked <= 40) {
                payableHours = hoursWorked;
            } else {
                payableHours = 40 + (hoursWorked - 40) * 3 / 2;
            }

//            grossPay = hoursWorked * hourlyRate; // CŨ
                grossPay = payableHours * hourlyRate;
            if (grossPay >= 200) {
//                tax = grossPay * 20 / 100; // CŨ
                tax = (grossPay - 200) * 20/100;
            }

            netPay = grossPay - tax;
            System.out.printf("%10s %10s %10s %10s %10s %10s%n",name, hoursWorked, hourlyRate ,grossPay, tax, netPay);

        }// end calculatePay()
    }

    public static void main(String[] args) {
        Wrapper wrapper = new Wrapper();
        Wrapper.Employee student_1 = wrapper.new Employee("ADAMS", 35, 5);
        Wrapper.Employee student_2 = wrapper.new Employee("BAKER", 40, 5);
        Wrapper.Employee student_3 = wrapper.new Employee("CAIRNS", 44, 5);
        Wrapper.Employee student_4 = wrapper.new Employee("DONALD", 20, 6);
        System.out.printf("%10s %10s %10s %10s %10s %10s%n","NAME","HOURS","RATE", "GROSS", "TAX", "NET");
        student_1.calculatePay();
        student_2.calculatePay();
        student_3.calculatePay();
        student_4.calculatePay();
    }
}
