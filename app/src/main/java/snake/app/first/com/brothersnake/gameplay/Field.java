package snake.app.first.com.brothersnake.gameplay;

import java.util.Collection;

import snake.app.first.com.brothersnake.gameplay.exceptions.DuplicateObjectException;
import snake.app.first.com.brothersnake.gameplay.exceptions.NotFoundObjectException;

/**
 * Игровое поле
 */
public interface Field {

    /**
     * @return ширина поля
     */
    int getWidth();

    /**
     * @return высота поля
     */
    int getHeight();

    /**
     * Проверить пустая ли клетка поля
     */
    boolean isEmptyField(int x, int y);

    /**
     * Добавить новый обьект на игровое поле
     */
    void addObject(FieldObject object, int x, int y) throws DuplicateObjectException;

    /**
     * Изменить метоположение существующего обьекта на поле
     */
    void changeObjectLocation(FieldObject object, int x, int y) throws NotFoundObjectException;

    /**
     * Очистить игровое поле
     */
    void clearField();

    /**
     * Получить все обьекты находящиеся на поле
     */
    Collection<FieldObject> getObject();

    /**
     * Удалить обьект с поля
     */
    void removeObject(FieldObject object) throws NotFoundObjectException;;
}
