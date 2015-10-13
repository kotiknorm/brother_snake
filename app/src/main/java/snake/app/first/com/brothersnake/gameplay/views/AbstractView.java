package snake.app.first.com.brothersnake.gameplay.views;

import snake.app.first.com.brothersnake.gameplay.Field;
import snake.app.first.com.brothersnake.gameplay.objects.FieldObject;

/**
 * Базовый класс обьекта который можно отрисовать
 */
public abstract class AbstractView<T extends FieldObject> implements View {

    private final T mObject;
    private final Field mField;

    public AbstractView(T object, Field field){
        mField = field;
        mObject = object;
    }

    public T getObject() {
        return mObject;
    }

    public Field getField() {
        return mField;
    }

    /**
     * еще в класс нужно передать место куда отрисовывать элементы,
     * здесь нужно более точно знать где будем рисовать их - канвас или что то еще
     */
}
