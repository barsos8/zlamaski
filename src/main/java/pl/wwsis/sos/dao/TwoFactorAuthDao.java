package pl.wwsis.sos.dao;

public interface TwoFactorAuthDao {

    void enable();
    void disable();
    boolean verify(String code);
}
