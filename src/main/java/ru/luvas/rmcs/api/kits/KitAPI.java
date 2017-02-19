package ru.luvas.rmcs.api.kits;

import java.util.Map;

/**
 * Created by RINES on 08.02.17.
 */
public interface KitAPI {

    /**
     * Проверка, включен ли модуль наборов на данном игровом сервере.
     * @return true, если модуль наборов включен на данном игровом сервере, false иначе.
     */
    boolean isEnabled();

    /**
     * Получение всех зарегистрированных наборов. Изменение возвращаемого мепа не повлечет никаких изменений, так как
     * он является лишь копией оригинального.
     * @return меп, ключами в котором являются названия наборов (все в нижнем регистре), а значениями - сами наборы.
     */
    Map<String, Kit> getKits();

    /**
     * Метод, позволяющий получить набор по его названию вне зависимости от регистра.
     * @param name название набора (регистр неважен).
     * @return null, если набора с указанным названием не существует, и сам набор в противном случае.
     */
    Kit getKit(String name);

}