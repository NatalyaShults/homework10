package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void ShouldFindAll() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");

        String[] actual = manager.findAll();
        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindIfOne() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie 2");

        String[] actual = manager.findAll();
        String[] expected = {"Movie 2"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindIfNone() {
        FilmsManager manager = new FilmsManager();

        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLast() {
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
    public void ShouldFindLastIfMoreFive() {
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
    public void ShouldFindLastIfMoreFiveLimit() {
        FilmsManager manager = new FilmsManager();

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
    public void ShouldFindLastIfMoreSixLimit() {
        FilmsManager manager = new FilmsManager(6);

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");

        String[] actual = manager.findLast();
        String[] expected = {"Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastIfLessFive() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");

        String[] actual = manager.findLast();
        String[] expected = {"Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastIfOne() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie 1");

        String[] actual = manager.findLast();
        String[] expected = {"Movie 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

}

