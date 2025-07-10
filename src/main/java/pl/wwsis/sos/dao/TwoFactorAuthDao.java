package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.TwoFactorAuth;

public interface TwoFactorAuthDao {
    void save(TwoFactorAuth tfa);
    TwoFactorAuth findById(Integer tfaId);
    TwoFactorAuth findByUserId(Integer userId);
    void update(TwoFactorAuth tfa);
    void delete(TwoFactorAuth tfa);

    void enable(Integer userId);
    void disable(Integer userId);
    boolean verifyCode(Integer userId, String code);
}
