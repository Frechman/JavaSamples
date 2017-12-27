package ru.frechman.exercises.stepik;

public class m2_4_10 {

    public static void main(String[] args) {

    }

    private String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder printRoleText = new StringBuilder();

        for (int i = 0; i < roles.length; i++) {  //перебор всех ролей

            printRoleText.append(roles[i].concat(":")); // добавляем текст роли
            printRoleText.append('\n'); // добавляем отступ после названия роли

            for (int j = 0; j < textLines.length; j++) {   // перебирает текст
                if (textLines[j].startsWith(roles[i].concat(":"))) { //метод statsWith проверяет начинает ли текст с названия роли

                    printRoleText.append(j + 1);
                    // добавляем подстроку текста, вырезав название роли
                    printRoleText.append(") ".concat(textLines[j].substring(roles[i].length() + 2, textLines[j].length())));
                    printRoleText.append('\n');

                }
            }
            printRoleText.append('\n');
        }
        return printRoleText.toString();
    }
}
