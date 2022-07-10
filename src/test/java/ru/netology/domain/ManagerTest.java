package ru.netology.domain;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.manager.Manager;


public class ManagerTest {

    PostersName poster1 = new PostersName("Бладшот");
    PostersName poster2 = new PostersName("Вперед");
    PostersName poster3 = new PostersName("Отель <<Белград>>");
    PostersName poster4 = new PostersName("Джентельмены");
    PostersName poster5 = new PostersName("Человек-невидимка");
    PostersName poster6 = new PostersName("Тролли. Мировой тур");
    PostersName poster7 = new PostersName("Номер один");
    PostersName poster8 = new PostersName("Гарри Поттер");
    PostersName poster9 = new PostersName("Властелин колец");
    PostersName poster10 = new PostersName("Шерлок Холмс");
    PostersName poster11 = new PostersName("Аватар 2");


    @Test
    public void findAllTest() {
        Manager manager = new Manager();
        manager.newPoster(poster1);
        manager.newPoster(poster2);
        manager.newPoster(poster3);
        manager.newPoster(poster4);
        manager.newPoster(poster5);
        manager.newPoster(poster6);
        manager.newPoster(poster7);
        manager.newPoster(poster8);
        manager.newPoster(poster9);
        manager.newPoster(poster10);


        PostersName[] expected = {poster1, poster2, poster3, poster4, poster5, poster6, poster7, poster8, poster9, poster10};
        PostersName[] actual = manager.getPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {
        Manager manager = new Manager();

        manager.newPoster(poster1);
        manager.newPoster(poster2);
        manager.newPoster(poster3);
        manager.newPoster(poster4);
        manager.newPoster(poster5);
        manager.newPoster(poster6);
        manager.newPoster(poster7);
        manager.newPoster(poster8);
        manager.newPoster(poster9);
        manager.newPoster(poster10);

        PostersName[] expected = {poster10, poster9, poster8, poster7, poster6, poster5, poster4, poster3, poster2, poster1};
        PostersName[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastDefaultTest() {
        Manager manager = new Manager(5);
        manager.newPoster(poster1);
        manager.newPoster(poster2);
        manager.newPoster(poster3);
        manager.newPoster(poster4);
        manager.newPoster(poster5);
        manager.newPoster(poster6);
        manager.newPoster(poster7);
        manager.newPoster(poster8);
        manager.newPoster(poster9);
        manager.newPoster(poster10);
        manager.newPoster(poster11);

        PostersName[] expected = {poster11, poster10, poster9, poster8, poster7};
        PostersName[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFiveTest() {
        Manager manager = new Manager();
        manager.newPoster(poster1);
        manager.newPoster(poster2);
        manager.newPoster(poster3);
        manager.newPoster(poster4);
        manager.newPoster(poster5);
        manager.newPoster(poster6);
        manager.newPoster(poster7);
        manager.newPoster(poster8);
        manager.newPoster(poster9);
        manager.newPoster(poster10);
        manager.newPoster(poster11);

        PostersName[] expected = {poster11, poster10, poster9, poster8, poster7, poster6, poster5, poster4, poster3, poster2};
        PostersName[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
