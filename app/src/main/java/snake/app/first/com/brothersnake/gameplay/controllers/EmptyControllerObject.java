package snake.app.first.com.brothersnake.gameplay.controllers;

import java.util.ArrayList;
import java.util.List;

import snake.app.first.com.brothersnake.gameplay.Field;
import snake.app.first.com.brothersnake.gameplay.objects.FieldObject;

/**
 * В текущем варианте движение по окружности, поворот при занятой клетке середи
 */
public class EmptyControllerObject implements ObjectController {

    private final Field mField;
    private final FieldObject mFieldObject;

    private List<SpeedType> list = new ArrayList<>();

    private SpeedType mSpeedType;

    /**
     * Тип движения, параметры - по какой координате на сколько двигаемся
     */
    private class SpeedType {
        public final int x;
        public final int y;

        public SpeedType(int speedX, int speedY){
            x = speedX;
            y = speedY;
        }
    }

    /**
     * 4 типа движения - вниз, налево, направо, вверх
     */
    {
        list.add(new SpeedType(1, 0));
        list.add(new SpeedType(0, -1));
        list.add(new SpeedType(-1, 0));
        list.add(new SpeedType(0, 1));
    }

    public EmptyControllerObject(Field field, FieldObject fieldObject) {
        mField = field;
        mFieldObject = fieldObject;
        mSpeedType = list.get(0);

        changeLocation(0, 0);
    }

    /**
     * Берем первыц тип движения, пытаемся идти с ним, если не получается берем следуюший тип и вызываем себя рекурсивно
     * Если нашли с которым можно пройти то идем с ним, до тех пор пока он не указывает в тупик
     */
    @Override
    public void next() {
        int currentX = mFieldObject.getX();
        int currentY = mFieldObject.getY();

        int newX = currentX + mSpeedType.x;
        int newY = currentY + mSpeedType.y;

        if (mField.isEmptyField(newX, newY)) {
            mFieldObject.setX(newX);
            mFieldObject.setY(newY);
        } else {
            int index = list.indexOf(mSpeedType);
            index++;
            index = index % list.size();
            mSpeedType = list.get(index);
            next();
        }

    }

    @Override
    public FieldObject getObject() {
        return mFieldObject;
    }

    /**
     * Задаем местоположение
     */
    private void changeLocation(int x, int y) {
        mField.addObject(mFieldObject, x, y);
        mFieldObject.setX(x);
        mFieldObject.setY(y);
    }
}

