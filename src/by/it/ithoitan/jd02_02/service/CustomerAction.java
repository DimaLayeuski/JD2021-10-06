package by.it.ithoitan.jd02_02.service;


import by.it.ithoitan.jd02_02.entity.Good;

public interface CustomerAction {
    void enteredStore();
    Good chooseGood();
    void goToQueue();
    void goOut();

}
