package view;

public abstract class BaseView {

    protected Controller c; //Es protected para que baje a la vista

    public void setController(Controller c){
        this.c = c;
    }

    public abstract void init();

    public abstract void showMenuPrincipal();

    public abstract void showError(String msg);

    public abstract void showMsg(String msg);

    protected abstract void setController(controller.Controller controller);


}
