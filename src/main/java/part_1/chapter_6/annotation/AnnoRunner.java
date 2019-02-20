package part_1.chapter_6.annotation;

import part_1.chapter_6.accountLogic.AccountOperationManager;

public class AnnoRunner {
    public static void main(String[] args) {
        AccountOperationManager account = new AccountOperationManagerImpl();
        AccountOperationManager securityAccount = SecurityFactory.createSecurityObject(account);
        securityAccount.depositInCash(10128336, 6);
        securityAccount.withDraw(64092376, 2);
        securityAccount.convert(200);
        securityAccount.transfer(64092376, 300);
    }
}
