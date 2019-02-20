package part_1.chapter_6.annotation;

import part_1.chapter_6.accountLogic.AccountOperationManager;

public class AccountOperationManagerImpl implements AccountOperationManager {
    @BankingAnnotation(securityLevel = SecurityLevelEnum.HIGH)
    @Override
    public double depositInCash(int accountNumber, int amount) {
        return 0;
    }

    @BankingAnnotation(securityLevel = SecurityLevelEnum.HIGH)
    @Override
    public boolean withDraw(int accountNumber, int amount) {
        return true;
    }

    @BankingAnnotation(securityLevel = SecurityLevelEnum.LOW)
    @Override
    public boolean convert(double amount) {
        return true;
    }

    @BankingAnnotation
    @Override
    public boolean transfer(int accountNumber, double amount) {
        return true;
    }
}
