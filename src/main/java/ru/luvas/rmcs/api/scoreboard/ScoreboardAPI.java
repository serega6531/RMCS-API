package ru.luvas.rmcs.api.scoreboard;

import org.bukkit.entity.Player;

/**
 *
 * @author 0xC0deBabe
 */
 public interface ScoreboardAPI {
    
    /**
     * Обнуляет все скорборды сервера и подготавливает к работе ScoreboardAPI.
     * Нужно использовать единожды, после загрузки сервера.
     */
     void prepare();
    
    /**
     * Очищает кеш, связанный с указанным игроком. Не нужно вызывать после prepare().
     * @param p игрок.
     */
     void invalidate(Player p);

    /**
     * Изменить название скорборда.
     * @param name новое название скорборда.
     */
     void setDisplayName(String name);
    
    /**
     * Изменить название скорборда на анимированное.
     * @param name новое название скорборда.
     * @param gamma цветовая гамма для анимации.
     */
     void setDisplayName(String name, AnimationGamma gamma);
    
    /**
     * Добавить новую строчку, видимую всем, в скорборд с указанным номером и текстом.
     * @param id номер строки (score).
     * @param name текст строки.
     */
     void addGlobalScore(int id, String name);
    
    /**
     * Добавить новую строчку, видимую всем, в скорборд с указанным номером и отформатированным текстом (String.format).
     * @param id номер строки (score).
     * @param name текст строки.
     * @param args аргументы для форматирования текста.
     */
     void addGlobalScore(int id, String name, Object... args);
    
    /**
     * Удалить видимые всем строчки из скорборда с указанным номером строки.
     * @param id номер строки (score).
     */
     void removeGlobalScores(int id);
    
    /**
     * Удалить видимую всем строчку из скорборда с указанным номером строки и текстом.
     * @param id номер строки (score).
     * @param name текст строки.
     */
     void removeGlobalScore(int id, String name);
    
    /**
     * Удалить видимую всем строчку из скорборда с указанным номером строки и отформатированным текстом.
     * @param id номер строки (score).
     * @param name текст строки.
     * @param args аргументы для форматирования текста.
     */
     void removeGlobalScore(int id, String name, Object... args);
    
    /**
     * Добавить новую строчку в скорборд, которая будет видна лишь одному игроку.
     * Крайне не рекомендуется использовать несколько строк, видимых лишь отдельным игрокам, с одинаковыми номерами строки.
     * @param p игрок.
     * @param id номер строки (score).
     * @param name текст строки.
     */
     void addScore(Player p, int id, String name);
    
    /**
     * Добавить новую отформатированную строчку в скорборд, которая будет видна лишь одному игроку.
     * Крайне не рекомендуется использовать несколько строк, видимых лишь отдельным игрокам, с одинаковыми номерами строки.
     * @param p игрок.
     * @param id номер строки (score).
     * @param name текст строки.
     * @param args аргументы для форматирования текста.
     */
     void addScore(Player p, int id, String name, Object... args);
    
    /**
     * Удалить видимую определенному игроку строчку из скорборда с указанным номером.
     * @param p игрок.
     * @param id номер строки (score).
     */
     void removeScore(Player p, int id);
    
    /**
     * Обновляет текст строчки, видимой определенному игроку, у которой переданный номер строки, на новый.
     * @param p игрок.
     * @param id номер строки (score).
     * @param name новый текст строки.
     */
     void updateScore(Player p, int id, String name);
    
    /**
     * Обновляет текст строчки, видимой определенному игроку, у которой переданный номер строки, на новый отформатированный.
     * @param p игрок.
     * @param id номер строки (score).
     * @param name новый текст строки.
     * @param args аргументы для форматирования нового текста строки.
     */
     void updateScore(Player p, int id, String name, Object... args);
    
}
