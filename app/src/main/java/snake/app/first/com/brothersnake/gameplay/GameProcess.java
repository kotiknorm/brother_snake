package snake.app.first.com.brothersnake.gameplay;

import java.util.Collection;

import snake.app.first.com.brothersnake.gameplay.collision.Collision;
import snake.app.first.com.brothersnake.gameplay.controllers.ObjectController;

/**
 * Поток
 * Класс в котором прртекает весь игровой процесс, изменение обьектов
 */
public class GameProcess {

    private Collection<ObjectController> mControllers;

    /**
     * Вопрос остающийся открытым - где обрабатывать коллизии
     * Создать для этого отделньый контроллер? как связать коллизию с экраном? анимация удара или разбития стены?
     */
    private Collection<Collision> mCollisions;


    private GameEngine mGameEngine;
    private GameConfig mGameConfig;

    /**
     * Создаешь игровое поле
     * Затем обьекты, из обьектов и игрового поля создаешь контроллеры для каждого
     * Внутри контроллера добавляешь обьект на игровое поле
     * Далее запускаешь игру и вызываешь next()
     */

    /**
     * Чтобы добавлять фрукты и всякие штуки в течении игры стоит сделать контроллер не только для обьектов но и общий игровой
     */

    /**
     * Конструтор, возможно на вход подаются обьекты
     */
    public GameProcess(){
        init();
    }

    /**
     * Инициализация игрового процесса
     */
    private void  init(){

    }

    /**
     * Следующая итерация
     * Возможно стоит разнести отрисовку и вычисление координат по разным потокам
     * Чтобы сделать их более независимыми и не нагружать поток отрисовки при вычислении новых координат
     * Но тогда нужно сделать обьекты готовыми работать в многопоточной среде
     * Имеется ввиду FieldObject так как они будут и в View и в Controller
     */
    public void next(){
        nextIterControllers();      // Второй поток
    }

    /**
     * Перебираем контроллеры и запускаем их передвижение
     */
    private synchronized void nextIterControllers(){
        for(ObjectController controller : mControllers){
            controller.next();
        }
    }


    /**
     * Добавить новый контроллер в игровой процесс
     * @param controller
     */
    public void addController(ObjectController controller){
        mControllers.add(controller);
    }


}
