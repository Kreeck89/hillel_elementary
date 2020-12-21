package lesson23;

public class ThirdActionImpl implements Action, SecondAction {

    @Override
    public void print(String string) {
        //init logic
    }

    @Override
    public int getLength(String string) {
        return string.length() * 543;
    }
}
