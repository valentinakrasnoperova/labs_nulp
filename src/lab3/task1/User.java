package lab3.task1;

public class User {
    private String firstName;
    private String surname;
    private int age;
    private Address address;

    public User(){
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public  void setSurname(String surname){
        this.surname = surname;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    public void validate(){
        if(!firstName.matches("^[a-zA-Zа-яА-Я]{2,50}")){
            throw new CustomException(ErrorCode.ERROR_400,"Invalid name!");
        }
        if(!surname.matches("^[a-zA-Zа-яА-Я]{2,50}")){
            throw new CustomException(ErrorCode.ERROR_400,"Invalid surname!");
        }
        if(age < 0){
            throw new CustomException(ErrorCode.ERROR_400,"Invalid age!");
        }
        if(!address.getCountry().matches("^[a-zA-Zа-яА-Я]{2,50}")){
            throw new CustomException(ErrorCode.ERROR_500,"Invalid country!");
        }
        if(!address.getCity().matches("^[a-zA-Zа-яА-Я]{2,50}")){
            throw new CustomException(ErrorCode.ERROR_500,"Invalid city!");
        }
        if(!address.getStreet().matches("^[a-zA-Zа-яА-Я]{2,50}")){
            throw new CustomException(ErrorCode.ERROR_500,"Invalid street!");
        }

    }
}