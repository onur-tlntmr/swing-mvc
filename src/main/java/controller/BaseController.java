package controller;

import dal.IUserDAO;
import view.BaseView;

public abstract class BaseController {

    protected IUserDAO baseDAO;
    protected BaseView baseView;

    public BaseController(IUserDAO baseDAO, BaseView baseView){

     this.baseDAO = baseDAO;
     this.baseView = baseView;

    }

}
