package snake.app.first.com.brothersnake.gameplay.objects;

/**
 * обьект который может находиться на игровом поле
 */
public interface FieldObject {

    /**
     * @return координату х обьекта
     */
    int getX();

    /**
     * @return координату y обьекта
     */
    int getY();

    /**
     * @param x новая координата
     */
    void setX(int x);

    /**
     * @param x новая координата
     */
    void setY(int y);
}
