class DemoGrossPay {
   
   public static void totalPay(double hoursWorked, double hourlyRate) {
      double TotalPayment = hoursWorked * hourlyRate;
      System.out.println(hoursWorked + "hours at $" + hourlyRate + "per hour is $" + TotalPayment);
   }
   
   public static void main(String[] a) {
      totalPay(50, 22.75);
      totalPay(150, 22.75);
      totalPay(170, 22.75);
   }
}
