package superkeyword;

class CheckDivisibility extends AddNumbers {
    CheckDivisibility(int num1, int num2) {
        super(num1, num2); 
    }

    boolean checkDivisibility() {
        int sum = super.add(); 
        return sum % 10 == 0;
    }



    public static void main(String[] args) {
        CheckDivisibility check = new CheckDivisibility(10,  20);
        int sum = check.super.add();
        System.out.println("Addition Result: " + sum);
        System.out.println("Is the result divisible by 10? " + check.checkDivisibility());
    }
