package snake.app.first.com.brothersnake.gameplay;

import java.util.Collection;

import snake.app.first.com.brothersnake.gameplay.views.View;

/**
 * Поток для отрисовки обьектов
 */
public class ViewProcess {

    private Collection<View> mViews;


    /**
     * Обновляет все элементы на экрвне
     */
    private synchronized void nextDraw(){
        for(View view : mViews){
            view.onDraw();
        }
    }

    /**
     * Добавить новый вью
     * @param view
     */
    public void addView(View view){
        mViews.add(view);
    }

    public void next(){
        nextDraw();                 // Первый поток UI-Thread
    }
}
