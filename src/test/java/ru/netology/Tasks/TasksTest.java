package ru.netology.Tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test
    public void simpleMatch () {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Позвонить");
        boolean expected = true;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void simpleNoMatch () {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Перезвонить");
        boolean expected = false;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void epicMatch () {
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Яйца");
        boolean expected = true;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void epicNoMatch () {
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Сыр");
        boolean expected = false;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void meetingTopicMatch () {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("версии");
        boolean expected = true;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void meetingProjectMatch () {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("НетоБанка");
        boolean expected = true;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void meetingNoMatch () {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("компьютер");
        boolean expected = false;

        Assertions.assertEquals(actual, expected);
    }
}
