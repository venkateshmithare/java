public class Venkatesh13 {
    public static void atmInfo(String bankName) {
        System.out.println("ATM Bank: " + bankName);
    }

    public static void atmInfo(String bankName, String location) {
        System.out.println("ATM Bank: " + bankName + " : Location: " + location);
    }

    public static void atmInfo(String bankName, int yearInstalled) {
        System.out.println("ATM Bank: " + bankName + " : Year Installed: " + yearInstalled);
    }

    public static void atmInfo(String bankName, String location, boolean hasDepositFunction) {
        System.out.println("ATM Bank: " + bankName + " : Location: " + location + " : Deposit Function: " + hasDepositFunction);
    }

    public static void atmInfo(String bankName, double withdrawalLimit) {
        System.out.println("ATM Bank: " + bankName + " : Withdrawal Limit: " + withdrawalLimit);
    }

    public static void atmInfo(String bankName, String location, double withdrawalLimit, boolean hasDepositFunction) {
        System.out.println("ATM Bank: " + bankName + " : Location: " + location + " : Withdrawal Limit: " + withdrawalLimit + " : Deposit Function: " + hasDepositFunction);
    }

    public static void atmInfo(String bankName, int numOfMachines, boolean supportsInternationalCards) {
        System.out.println("ATM Bank: " + bankName + " : Machines: " + numOfMachines + " : Supports International Cards: " + supportsInternationalCards);
    }

    public static void atmInfo(String bankName, String securityFeature) {
        System.out.println("ATM Bank: " + bankName + " : Security Feature: " + securityFeature);
    }

    public static void atmInfo(String bankName, boolean hasCashRecycling) {
        System.out.println("ATM Bank: " + bankName + " : Cash Recycling: " + hasCashRecycling);
    }

    public static void atmInfo(String bankName, String softwareVersion, boolean supportsUPI) {
        System.out.println("ATM Bank: " + bankName + " : Software: " + softwareVersion + " : UPI Supported: " + supportsUPI);
    }

    public static void atmInfo(String bankName, int numOfMachines, int numOfTransactionsPerDay) {
        System.out.println("ATM Bank: " + bankName + " : Machines: " + numOfMachines + " : Transactions/Day: " + numOfTransactionsPerDay);
    }

    public static void atmInfo(String bankName, String type, String maintenanceCompany) {
        System.out.println("ATM Bank: " + bankName + " : Type: " + type + " : Maintenance By: " + maintenanceCompany);
    }
    
    public static void main(String[] args) {
        atmInfo("Chase");
        atmInfo("Chase", "New York");
        atmInfo("Chase", 2015);
        atmInfo("Chase", "New York", true);
        atmInfo("Chase", 2000.00);
        atmInfo("Chase", "New York", 2000.00, true);
        atmInfo("Chase", 10, true);
        atmInfo("Chase", "Biometric Authentication");
        atmInfo("Chase", false);
        atmInfo("Chase", "v5.2.3", true);
        atmInfo("Chase", 10, 5000);
        atmInfo("Chase", "Cash Dispenser", "ABC Corp");
    }
}
