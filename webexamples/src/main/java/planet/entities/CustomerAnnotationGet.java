package planet.entities;

import javax.persistence.*;

@Entity
@Access(AccessType.FIELD)
public class CustomerAnnotationGet {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    @Column(name = "phone_number", length = 15)
    private String phoneNumber;
    // Конструкторы
    @Id @GeneratedValue
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "first_name", nullable = false, length = 50)
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Column(name = "last_name", nullable = false, length = 50)
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Access(AccessType.PROPERTY)
    @Column(name = "phone_number", length = 555)
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    В примере, показанном в листинге тип доступа явным образом определя-
//    ется как FIELD на уровне сущности. Это говорит интерфейсу PersistenceManager
//    о том, что ему следует обрабатывать только аннотации, которыми снабжены атри-
//    буты. Атрибут phoneNumber снабжен аннотацией @Column , ограничивающей значение
//    его length величиной 15 . Читая этот код, вы ожидаете, что в базе данных в итоге
//    будет VARCHAR(15) , однако этого не случится. Метод-геттер показывает, что тип
//    доступа для метода getPhoneNumber() был изменен явным образом, поэтому длина
//    равна значению length атрибута phoneNumber (до 555 ). В данном случае сущность
//    AccessType.FIELD перезаписывается AccessType.PROPERTY . Тогда в базе данных у вас
//    окажется VARCHAR(555) .


}
