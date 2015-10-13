package snake.app.first.com.brothersnake.gameplay.collision;

import snake.app.first.com.brothersnake.gameplay.Field;
import snake.app.first.com.brothersnake.gameplay.objects.FieldObject;

/**
 * Абстрактный класс обработки коллизий, для нашей игры
 * Использует игровое поле и другие менеджры, необходимые ему
 */
public abstract class AbstractCollision<T extends FieldObject, E extends FieldObject> implements Collision<T, E> {

    private final Field mField;

    public AbstractCollision(Field field){
        mField = field;
    }

    public Field getField() {
        return mField;
    }


}
