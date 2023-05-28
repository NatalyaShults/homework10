package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void shouldFindAll() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");

        String[] actual = manager.findAll();
        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindIfOne() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie 2");

        String[] actual = manager.findAll();
        String[] expected = {"Movie 2"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindIfNone() {
        FilmsManager manager = new FilmsManager();

        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");

        String[] actual = manager.findLast();
        String[] expected = {"Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfMoreFive() {
        FilmsManager manager = new FilmsManager(6);

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");

        String[] actual = manager.findLast();
        String[] expected = {"Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfMoreFiveLimit() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");

        String[] actual = manager.findLast();
        String[] expected = {"Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfMoreSixLimit() {
        FilmsManager manager = new FilmsManager(6);

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");

        String[] actual = manager.findLast();
        String[] expected = {"Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfLessFive() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");

        String[] actual = manager.findLast();
        String[] expected = {"Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfOne() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie 1");

        String[] actual = manager.findLast();
        String[] expected = {"Movie 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

}

