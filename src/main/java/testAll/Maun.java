package testAll;

public class Maun {
    public static void main(String[] args) {
        Buttons buttons = new Buttons(new EventHandler() {
            private boolean isAction = true;
            @Override
            public void execute() {
                if (isAction){
                    System.out.println("вкл");
                isAction=false;
                }
                else {
                    System.out.println("выкл");
                    isAction =true;
                }
            }
        });

        buttons.click().click().click();

    }
}
interface EventHandler{
    void execute();

}
class ButtonClick implements EventHandler{
    @Override
    public void execute() {
        System.out.println("Кнопка нажата");
    }
}

class Buttons {
    public EventHandler eventHandler;

    public Buttons(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }
    Buttons click(){
        eventHandler.execute();
        return this;
    }
}
