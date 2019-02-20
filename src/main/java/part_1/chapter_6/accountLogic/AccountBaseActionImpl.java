package part_1.chapter_6.accountLogic;

public class AccountBaseActionImpl implements AccountBaseAction {
    @Override
    public boolean openAccount() {
        return false;
    }

    @Override
    public boolean closeAccount() {
        return false;
    }

    @Override
    public void blocking() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void unBlocking() {
        throw new UnsupportedOperationException();
    }
}
