package VII_Greedy.Easy;

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            if (bill == 5)
                five++;

            if (bill == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                } else return false;
            }

            if (bill == 20) {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) five -= 3;
                else return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] bills = {5, 5, 5, 10, 20};
        System.out.print("Queues of customers: ");
        for (int bill : bills) {
            System.out.print(bill + " ");
        }
        System.out.println();
        LemonadeChange solution = new LemonadeChange();
        boolean ans = solution.lemonadeChange(bills);
        if (ans)
            System.out.println("It is possible to provide change for all customers.");
        else
            System.out.println("It is not possible to provide change for all customers.");
    }
}