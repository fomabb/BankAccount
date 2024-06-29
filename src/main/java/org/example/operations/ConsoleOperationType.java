package org.example.operations;

public enum ConsoleOperationType {
    /**
     * Создание нового пользователя
     */
    USER_CREAT,
    /**
     * Отображение списка всех пользователей
     */
    SHOW_ALL_USER,
    /**
     * Создание нового счёта для пользователя
     */
    ACCOUNT_CREAT,
    /**
     * Закрытие счёта
     */
    ACCOUNT_CLOSE,
    /**
     * Пополнение счёта
     */
    ACCOUNT_DEPOSIT,
    /**
     * Перевод средств между счетами
     */
    ACCOUNT_TRANSFER,
    /**
     * Снятие средств со счёта
     */
    ACCOUNT_WITHDRAW

}
