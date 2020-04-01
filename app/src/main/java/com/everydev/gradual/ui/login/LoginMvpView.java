package com.everydev.gradual.ui.login;

import com.everydev.gradual.ui.base.MvpView;

public interface LoginMvpView extends MvpView {
    void onLoginSuccess();

    String getEmail();

    String getEdtPassword();

    void showInputError();

    void setEdtPassword(String userId);

    void setEmail(String password);
}
