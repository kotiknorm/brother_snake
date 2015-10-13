package snake.app.first.com.brothersnake.gameplay.collision;

import snake.app.first.com.brothersnake.gameplay.objects.FieldObject;
import snake.app.first.com.brothersnake.gameplay.exceptions.NotCollisionException;

/**
 * Обработчик ударений обьектов
 */
public interface Collision<T extends FieldObject, E extends FieldObject> {

    void onCollision(T firstObject, E secondObject) throws NotCollisionException;
}
