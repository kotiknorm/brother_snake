package snake.app.first.com.brothersnake.gameplay.objects;

import java.util.LinkedList;
import java.util.List;

/**
 * Пустой класс змейки
 */
public class Snake implements FieldObject {

    /**
     * Составные элементы змейки
     */
    private List<SnakeItem> mItems = new LinkedList<>();

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public void setX(int x) {

    }

    @Override
    public void setY(int y) {

    }
}
