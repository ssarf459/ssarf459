public class sum_of_multiples {
    public static void sum_of_multiples(int number){
        int sum_of_multiples = 0;
        for (int i = 0; i < number; i++) {
            if (i%3 == 0 || i%5 == 0) {
                sum_of_multiples += i;
            }
        }
        System.out.println("Sum of the multiples is "+sum_of_multiples);
    }
    
    public static void main(String[] args){
        sum_of_multiples obj = new sum_of_multiples();
        obj.sum_of_multiples(1000);
    }
}
