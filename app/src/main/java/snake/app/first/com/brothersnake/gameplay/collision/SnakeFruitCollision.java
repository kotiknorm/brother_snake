package snake.app.first.com.brothersnake.gameplay.collision;

import snake.app.first.com.brothersnake.gameplay.Field;
import snake.app.first.com.brothersnake.gameplay.exceptions.NotCollisionException;
import snake.app.first.com.brothersnake.gameplay.objects.Fruit;
import snake.app.first.com.brothersnake.gameplay.objects.Snake;

/**
 * Обработчик коллизий для змейки и фрукта
 */
public class SnakeFruitCollision extends AbstractCollision<Snake, Fruit> {

    public SnakeFruitCollision(Field field) {
        super(field);
    }

    /**
     * Здесь логика поглащения змейкой фрукта со всеми вытекающими
     */
    @Override
    public void onCollision(Snake snake, Fruit fruit) throws NotCollisionException {

    }
}
