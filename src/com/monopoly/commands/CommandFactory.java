package com.monopoly.commands;

public class CommandFactory {
    public static ICommand getCommand(String input) {
        if (input.equalsIgnoreCase("jogar")) {
            return new JogarCommand();
        } else if (input.equalsIgnoreCase("sair")) {
            return new SairCommand();
        } else if (input.equalsIgnoreCase("status")) {
            return new StatusCommand();
        } else if (input.equalsIgnoreCase("pagar")) {
            return new PagarCommand();
        } else if (input.equalsIgnoreCase("carta")) {
            return new CartaCommand();
        }
        throw new IllegalArgumentException("Comando inválido: " + input);
    }
}
