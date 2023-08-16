package Seminar3;

import java.io.IOException;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        String pathToFile = "D:\\result\\";
        DbWorker users = new DbWorker();
        boolean WorkStatus = true;
        System.out.println("Проверьте, существует ли последовательность каталогов - " + pathToFile);
        System.out.println("Формат ввода данных: \u001B[4m \u001B[93m Иванов Иван Иванович \u001B[0m \u001B[92m \u001B[4m 01.01.1001 \u001B[0m \u001B[94m \u001B[4m 71234567890 \u001B[0m \u001B[0m");
        System.out.println("Команды \u001B[31m quit \u001B[0m или \u001B[31m exit \u001B[0m завершают работу программы");
        while(WorkStatus){
            try(Scanner input = new Scanner(System.in);){
                System.out.print("Введите данные пользователя: ");
                String cmd = input.nextLine();
                if(cmd.equals("exit") || cmd.equals("quit")){
                    System.out.println("Работа с программой завершена");
                    WorkStatus = false;
                    break;
                }
                users.parseString(cmd);                
            } catch (ErrorArray e){
                System.out.println(e.getMessage());
                continue;
            }
            try{
                users.convert();
            } catch (DateTimeParseException e){
                System.out.println("Неверный формат даты рождения.");
                System.out.println("Формат должен быть следующим: ДД.ММ.ГГГГ");
                System.out.println("Например: 01.01.1001");
                continue;
            } catch (NumberFormatException e){
                System.out.println("Неверный формат телефонного номера.");
                System.out.println("Формат должен быть следующим: 71234567890 или +71234567890");
                continue;
            }
            users.setFile(pathToFile, users.getUser()[0]);
            try {
                users.createDbFile(users.getFile());
            } catch (Exception e){
                System.out.println("Критическая ошибка!!! Программа завершает свою работу!");
                System.out.println("Проверьте, существует ли постедовательность каталогов -  " + pathToFile);
                System.out.println("где программа пытается создать файл.");
                System.out.println("Если такого каталога не существует, то пропишите правильный путь к каталогу");
                System.out.println("И после этого запустите программу снова");
                break;
            }

            try{
                users.addUser(users.getFile());
                System.out.print("Данные пользователя: ");
                System.out.println(Arrays.toString(users.getUser()));
                System.out.println("Записаны в файл: " + users.getFile());
            } catch (IOException e){
                System.out.println("Критическая ошибка!!! Программа завершает свою работу!");
                System.out.println("Проверьте наличие файла по указанному пути - " + users.getFile());
                System.out.println("И запустите программу снова.");
                break;
            }

        }
    }
}
