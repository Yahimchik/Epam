package by.yahimovich.task05treads.controller;

import by.yahimovich.task05treads.entity.user.User;

/**
 * Какие потоки мне нужны еще?
 * Поток ввода/выводы у меня есть
 * Поток пользователя тоже есть
 * Каждому пользователю свой поток менеджера
 * Синхронизация для каждого потока есть.
 * То есть, когда у меня запускается поток User
 * каждый такой поток вызывает поток менеджера.
 * В это время поток менеджера вызывает поток для чтения из файла
 * Зачем я поставил все эти блокировки?
 * В User потоке эти блокировки позволяют работать обоим пользователям
 * одновременно
 * Блокировки для менеджера. Нужны ли вообще?
 * В данный момент они не нужны, в принципе, потому что
 * во время создания потока вызывается обычный метод.
 * Но если я сделаю его потоком, надо будет сделать блокировки.
 * Надо подумать, какие блокировки мне еще нужны
 * И потоки...
 * Из условия задания: Для каждого пользователя
 * в отдельном потоке выполняется выбранная команды для работы
 * с массивом или матрицей
 * Состояние потока мне нужно только для пользователя,
 * потому что там надо > 2 состояний.
 * У пользователя могут быть состояния:
 * 1. Создан (online)
 * 2. Действует
 * 3. Ждет следующей команды
 * Или какие?
 * 1. Заполнить матрицу
 * 2. Заполнить массив
 * 3. Выйти.
 * Может так?
 */

public class Main {
    public static void main(String[] args) {

        Thread[] threads = new Thread[2];

        for (int i = 0; i < 2; ++i) {
            threads[i] = new Thread(new User(), "User " + (i + 1) + " online");
            threads[i].start();
        }
    }
}
