package BotHomeWOrk;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;

public class Bot {
    private HashMap<String, Method> commands;

    public Bot() {
        commands = new HashMap<>();

        Class botCommandsClass = new BotCommands().getClass();
        for (Method m : botCommandsClass.getDeclaredMethods()) {
            if (!m.isAnnotationPresent(Command.class))
                continue;

            Command cmd = m.getAnnotation(Command.class);

            //if a method is still in progress, we don't include it in the map
            if (cmd.inProgress())
                continue;

            for (String name : cmd.possibleNames())
                commands.put(name, m);
        }
    }


    public String commandProcessor(String input) throws InputMismatchException {
        if (input.isEmpty())
            throw new InputMismatchException("Wrong input");

        String[] strings = input.split(" ");
        String command = strings[0].toLowerCase();
        String[] args = Arrays.copyOfRange(strings, 1, strings.length);

        Method m = commands.get(command);

        if (m == null)
            throw new InputMismatchException("There is no such method");

        try {
            return (String) m.invoke(new BotCommands(), (Object) args);
        } catch (Exception e) {
            System.out.println("Something went wrong while calling the method: " + m.getName());
        }
        return "Something went wrong while processing the input command";
    }


}