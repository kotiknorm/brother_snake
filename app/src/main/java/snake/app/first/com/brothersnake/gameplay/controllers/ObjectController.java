package snake.app.first.com.brothersnake.gameplay.controllers;

import snake.app.first.com.brothersnake.gameplay.FieldObject;

/**
 * Контроллер который управляет обьектом на поле
 */
public interface ObjectController {

    /**
     * Следующий сдвиг обьекта
     */
    void next();

    /**
     * Вернуть обьект которым управляет контроллер
     */
    FieldObject getObject();

    /**
     * Для примера чтобы управлять змейкой тапами на экран - нужно создать контроллер который ловит прикосновения и на вызов next() говорит обьекту что делать
     */

}
