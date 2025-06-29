import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterface {
    Atm atm = new Atm();
    Map<Double, String> ministmt = new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Availiable Balance: " + atm.getBalance());

    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount % 500 == 0) {
            if (withdrawAmount <= atm.getBalance()) {
                ministmt.put(withdrawAmount, "Amount Withdrawed");
                System.out.println("Withdraw cash...: " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient Balance!");
            }
        } else {
            System.out.println("Please enter the 500x amount to withdraw..");
        }

    }


    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount, "Amount deposited");
        System.out.println(depositAmount + "Deposited successfully!");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();

    }

    @Override
    public void viewMinistatement() {
        for (Map.Entry<Double, String> entry : ministmt.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
