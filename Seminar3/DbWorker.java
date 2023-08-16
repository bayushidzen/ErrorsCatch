package Seminar3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DbWorker extends CreateFile{
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private String[] user;
    private String lastname;
    private String surname;
    private String name;
    private LocalDate birthDate;

    private long phoneNumber;
    private String gender;


    public void setFile(String pathToFile, String nameOfFile) {
        this.file = Path.of(pathToFile+nameOfFile+".txt");
    }

    public Path getFile(){
        return this.file;
    }

    public void parseString(String userString) throws ErrorArray{
        try{
            this.user = userString.split(" ");
            if(this.user.length != 6){
                throw new ErrorArray("Введено неправильное количество данных!!!");
            }
        } catch (ErrorArray e){
        }

    }

    public void convert() throws DateTimeParseException,NumberFormatException {
        this.lastname = user[0];
        this.surname = user[1];
        this.name = user[2];
        this.birthDate = LocalDate.parse(user[3],formatter);
        this.phoneNumber = Long.parseLong(user[4]);
        this.gender = user[5];
    }

    public String[] getUser() {
        return user;
    }

    @Override
    protected void createDbFile(Path dbFile) throws Exception {
        if (Files.exists(dbFile) == false) {
            Files.createFile(dbFile);
            if (Files.isRegularFile(dbFile) == true) {
                System.out.println("Файл \"" + dbFile + "\" успешно создан!");
            }
            else{
                System.out.println("Файл \"" + dbFile + "\" НЕ создан!");
            }
        }
    }


    @Override
    public void addUser(Path pathToFile) throws IOException {
        String userString="";
        if(Files.size(pathToFile) == 0){
            userString = "<"+this.lastname+"><"+this.surname+"><"+this.name+"><"+this.birthDate+"><"+this.phoneNumber+"><"+this.gender+">";
        }else
            userString = "\n<"+this.lastname+"><"+this.surname+"><"+this.name+"><"+this.birthDate+"><"+this.phoneNumber+"><"+this.gender+">";

        Files.writeString(pathToFile, userString, StandardOpenOption.APPEND);
    }

}