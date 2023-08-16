package Seminar3;

import java.io.IOException;
import java.nio.file.Path;

/**
 * Класс для создания файлов базы данных и работы с данными
 */
abstract class CreateFile {
    protected  Path file;


    /**
     * Метод для создания файлов базы данных по указанному пути
     * @param dbFile
     * @throws Exception
     */
    abstract void createDbFile(Path dbFile) throws Exception;

    /**
     * addProduct - добавляет игрушку в файл csv в формате: id;name;count;percent
     * @param pathToFile
     * @throws IOException
     */
    abstract void addUser(Path pathToFile) throws IOException;


}