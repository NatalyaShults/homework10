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
    public void shouldFindLastIfMoreLimit() {
        FilmsManager manager = new FilmsManager(5);

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");

        String[] actual = manager.findLast();
        String[] expected = {"Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfLessLimit() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");

        String[] actual = manager.findLast();
        String[] expected = {"Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected, actual);
    }
}
