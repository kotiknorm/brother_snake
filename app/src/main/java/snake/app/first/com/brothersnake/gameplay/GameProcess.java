package snake.app.first.com.brothersnake.gameplay;

import java.util.Collection;

import snake.app.first.com.brothersnake.gameplay.controllers.ObjectController;

/**
 * Класс в котором прртекает весь игровой процесс
 */
public class GameProcess {

    private Collection<ObjectController> mControllers;
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
     */
    public void next(){
        nextIterControllers();
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
